
package com.liferay.training.configuration.portlet;

import com.liferay.portal.configuration.metatype.bnd.util.ConfigurableUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.training.configuration.configuration.ModuleConfiguration;
import com.liferay.training.configuration.constants.ConfigurationExamplePortletKeys;

import java.io.IOException;
import java.util.Map;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;


/**
 * @author liferay
 */
@Component(
	configurationPid = "com.liferay.training.configuration.MóduleConfiguration", 
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Make-application-configurable Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + ConfigurationExamplePortletKeys.CONFIGURATION_EXAMPLE,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class ConfigurationExamplePortlet extends MVCPortlet {

	
	@Override
	public void render(
		RenderRequest renderRequest, RenderResponse renderResponse)
		throws IOException, PortletException {
	
		renderRequest.setAttribute("showHello", _moduleConfiguration.showHello());
		
		super.render(renderRequest, renderResponse);
	}
	
	
	@Activate
	@Modified
	protected void activate(Map<String, Object> properties) {

		_moduleConfiguration = ConfigurableUtil.createConfigurable(
			ModuleConfiguration.class, properties);
	}

	private volatile ModuleConfiguration _moduleConfiguration;
}
