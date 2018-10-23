/**
 * Copyright 2000-present Liferay, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.liferay.training.events.lifecycle.event.listener;

import com.liferay.mail.kernel.model.MailMessage;
import com.liferay.mail.kernel.service.MailService;
import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.LifecycleAction;
import com.liferay.portal.kernel.events.LifecycleEvent;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.io.UnsupportedEncodingException;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
	immediate = true,
	property = {
		"key=global.startup.events",
		"service.ranking:Integer=100"
	},
	service = LifecycleAction.class
)
public class PortalStartupListener implements LifecycleAction {

	@Override
	public void processLifecycleEvent(LifecycleEvent lifecycleEvent)
		throws ActionException {

		try {
			MailMessage message = new MailMessage();

			message.setSubject("Platform Event was Invoked");
			message.setBody("The portal was rebooted.");

			message.setTo(getToAddress());
			message.setFrom(getFromAddress());

			_mailService.sendEmail(message);

		}
		catch (AddressException e) {

			_log.error(e, e);
		}
		catch (UnsupportedEncodingException e) {

			_log.error(e, e);
		}
	}

	private InternetAddress getToAddress()
		throws UnsupportedEncodingException, AddressException {

		InternetAddress toAddress = new InternetAddress(TO_ADDRESS);
		toAddress.setPersonal("Dummy Recipient");

		return toAddress;
	}

	private InternetAddress getFromAddress()
			throws UnsupportedEncodingException, AddressException{

			InternetAddress fromAddress = new InternetAddress(FROM_ADDRESS);
			fromAddress.setPersonal("Liferay Administrator");

			return fromAddress;

		}

	private static final Log _log =
		LogFactoryUtil.getLog(PortalStartupListener.class);

	private static final String TO_ADDRESS = "test@liferay.com";

	private static final String FROM_ADDRESS = "test@liferay.com";

	@Reference
	private MailService _mailService;
}
