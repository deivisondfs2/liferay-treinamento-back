package com.liferay.training.css.portlet;

import com.liferay.training.css.constants.CssAndJavascriptExamplePortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

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
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.header-portlet-javascript=/js/main1.js",
		"com.liferay.portlet.header-portlet-javascript=/js/main2.js",
		"javax.portlet.display-name=adding-css-and-javascript Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + CssAndJavascriptExamplePortletKeys.CssAndJavascriptExample,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class CssAndJavascriptExamplePortlet extends MVCPortlet {
}