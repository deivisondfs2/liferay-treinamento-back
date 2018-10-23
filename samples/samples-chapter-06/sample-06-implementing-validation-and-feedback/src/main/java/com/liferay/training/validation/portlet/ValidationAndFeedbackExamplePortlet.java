package com.liferay.training.validation.portlet;

import com.liferay.training.validation.constants.ValidationAndFeedbackExamplePortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.SessionErrors;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author liferay
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=implementing-validation-and-feedback Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + ValidationAndFeedbackExamplePortletKeys.ValidationAndFeedbackExample,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class ValidationAndFeedbackExamplePortlet extends MVCPortlet {

}