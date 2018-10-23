
package com.liferay.training.message.bus.listener;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageBus;
import com.liferay.portal.kernel.messaging.MessageListener;
import com.liferay.portal.kernel.messaging.MessageListenerException;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.training.message.bus.constants.TrainingDestinationNames;

import java.util.Map;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;

/**
 * Message Bus listener component.
 * 
 * @author liferay
 *
 */
@Component(
    immediate = true, 
    property = {
    	"destination.name=" + TrainingDestinationNames.TRAINING_DESTINATION
    },
    service = MessageListener.class
)
public class MessageBusListener implements MessageListener {

	@Activate
	@Modified
	protected void activate(Map<String, Object> properties) {

		_log.info("Message bus listener component activated.");
	}

	
	@Override
	public void receive(Message message)
		throws MessageListenerException {

		String payload = (String) message.getPayload();

		_log.info("Received message from message bus: " + payload);
		
		_log.info("Current thread ID: " + Thread.currentThread().getId());

		String responseDestinationName = message.getResponseDestinationName();

		if (Validator.isNotNull(responseDestinationName)) {

			String responsePayload = "Response to " + payload;

			_log.info("Sending response.");

			Message responseMessage = new Message();
			
			responseMessage.setDestinationName(responseDestinationName);
			responseMessage.setPayload(responsePayload);
			responseMessage.setResponseId(message.getResponseId());

			_messageBus.sendMessage(
				message.getResponseDestinationName(), responseMessage);
		}
	}

	@Reference
	private volatile MessageBus _messageBus;

	private static final Log _log =
		LogFactoryUtil.getLog(MessageBusListener.class);

}
