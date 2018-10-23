package com.liferay.training.message.bus.listener;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageBus;
import com.liferay.portal.kernel.messaging.MessageListener;
import com.liferay.portal.kernel.messaging.MessageListenerException;
import com.liferay.training.message.bus.constants.TrainingDestinationNames;

import java.util.Map;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;

/**
 * Message Bus listener component
 * 
 * @author liferay
 *
 */
@Component(
    immediate = true, 
    property = {
    	"destination.name=" + TrainingDestinationNames.TRAINING_RESPONSE_DESTINATION
    },
    service = MessageListener.class
)
public class MessageBusResponseListener implements MessageListener {

	@Activate
	@Modified
	protected void activate(Map<String, Object> properties) {

		_log.info("Response listener component activated.");
	}

	
	@Override
	public void receive(Message message)
		throws MessageListenerException {

		String payload = (String) message.getPayload();

		_log.info("Received response: " + payload);
		
		_log.info("Current thread ID: " + Thread.currentThread().getId());
	}

	@Reference
	private volatile MessageBus _messageBus;

	private static final Log _log =
		LogFactoryUtil.getLog(MessageBusResponseListener.class);

}
