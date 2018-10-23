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

package com.liferay.training.events.model.listener;

import com.liferay.mail.kernel.model.MailMessage;
import com.liferay.mail.kernel.service.MailService;
import com.liferay.portal.kernel.exception.ModelListenerException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.ModelListener;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.RoleService;
import com.liferay.portal.kernel.service.UserService;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.UnsupportedEncodingException;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * An example of model listener. Catch event and send a notification mail when a
 * user is associated with a role. Use a mail catcher like fakeSMTP to catch the
 * notification mail.
 *
 * @author liferay
 */
@Component(
	immediate = true,
	service = ModelListener.class
)
public class UserModelListener extends BaseModelListener<User> {

	@Override
	public void onAfterAddAssociation(
		Object classPK, String associationClassName, Object associationClassPK)
		throws ModelListenerException {

		try {

			User user =
				_userService.getUserById(Long.parseLong(classPK.toString()));

			if (associationClassName.equalsIgnoreCase(
				"com.liferay.portal.kernel.model.Role")) {

				Role role = _roleService.getRole(
					Long.parseLong(associationClassPK.toString()));

				MailMessage message = new MailMessage();

				StringBundler sb = new StringBundler();
				sb.append("User ").append(user.getScreenName()).append(
					" was added to role ").append(role.getName());

				message.setSubject(sb.toString());
				message.setBody(sb.toString());

				message.setTo(getToAddress());
				message.setFrom(getFromAddress());

				_mailService.sendEmail(message);

			}
		}
		catch (PortalException e) {

			_log.error(e, e);
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
		LogFactoryUtil.getLog(UserModelListener.class);

	private static final String TO_ADDRESS = "dummy@liferay.com";

	private static final String FROM_ADDRESS = "test@liferay.com";

	@Reference
	private MailService _mailService;

	@Reference
	private RoleService _roleService;

	@Reference
	private UserService _userService;
}
