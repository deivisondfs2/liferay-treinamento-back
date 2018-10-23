
package com.liferay.training.message.bus.portlet;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageBus;
import com.liferay.portal.kernel.messaging.sender.SingleDestinationMessageSender;
import com.liferay.portal.kernel.messaging.sender.SingleDestinationMessageSenderFactory;
import com.liferay.portal.kernel.messaging.sender.SingleDestinationSynchronousMessageSender;
import com.liferay.portal.kernel.messaging.sender.SynchronousMessageSender;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.training.message.bus.constants.MessageBusPortletKeys;
import com.liferay.training.message.bus.constants.TrainingDestinationNames;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * Message sender portlet. (Please check that logging level is set to info)
 * 
 * @author liferay
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Message Bus Sender Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + MessageBusPortletKeys.SENDER_PORTLET,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class MessageBusSenderPortlet extends MVCPortlet {

	@ProcessAction(name = "sendMessage")
	public void sendMessage(
		ActionRequest actionRequest, ActionResponse actionResponse)
		throws IOException, PortletException {

		_log.info("Processing sendmessage.");
		_log.info("Current thread ID: " + Thread.currentThread().getId());

		String messageText =
			ParamUtil.getString(actionRequest, "messageText", "empty message");
		String messageType = ParamUtil.getString(actionRequest, "messageType");

		try {
			if ("async".equals(messageType)) {
				sendAsyncMesssage(messageText);
			}
			else if ("sync".equals(messageType)) {
				sendSyncMessage(messageText);
			}
			else {
				sendDirectMessage(messageText);
			}
		}
		catch (Exception e) {
			throw new PortletException(e.getMessage());
		}
	}

	protected void sendAsyncMesssage(String messageText) {

		Message message = new Message();

		message.setDestinationName(
			TrainingDestinationNames.TRAINING_DESTINATION);
		message.setPayload(messageText);
		message.setResponseDestinationName(
			TrainingDestinationNames.TRAINING_RESPONSE_DESTINATION);
		message.setResponseId("abcd");

		_log.info("Sending async message: " + messageText);

		SingleDestinationMessageSender messageSender =
			_messageSenderFactory.createSingleDestinationMessageSender(
				TrainingDestinationNames.TRAINING_DESTINATION);

		messageSender.send(message);
	}

	protected void sendDirectMessage(String messageText) {

		Message message = new Message();

		message.setDestinationName(
			TrainingDestinationNames.TRAINING_DESTINATION);
		message.setPayload(messageText);
		message.setResponseDestinationName(
			TrainingDestinationNames.TRAINING_RESPONSE_DESTINATION);
		message.setResponseId("abcd");

		_log.info("Sending direct message: " + messageText);
		_log.info(message.getResponseDestinationName());

		_messageBus.sendMessage(message.getDestinationName(), message);
	}

	protected void sendSyncMessage(String messageText)
		throws Exception {

		Message message = new Message();

		message.setPayload(messageText);
		message.setResponseDestinationName(
			TrainingDestinationNames.TRAINING_RESPONSE_DESTINATION);
		message.setResponseId("abcd");

		_log.info("Sending sync message: " + messageText);

		SingleDestinationSynchronousMessageSender messageSender =
			_messageSenderFactory.createSingleDestinationSynchronousMessageSender(
				TrainingDestinationNames.TRAINING_DESTINATION,
				SynchronousMessageSender.Mode.DEFAULT);

		Object response = messageSender.send(message, 10000);

		_log.info("Original sender received a response " + response);
	}

	private static final Log _log =
		LogFactoryUtil.getLog(MessageBusSenderPortlet.class);

	@Reference
	private MessageBus _messageBus;

	@Reference
	private SingleDestinationMessageSenderFactory _messageSenderFactory;

}
