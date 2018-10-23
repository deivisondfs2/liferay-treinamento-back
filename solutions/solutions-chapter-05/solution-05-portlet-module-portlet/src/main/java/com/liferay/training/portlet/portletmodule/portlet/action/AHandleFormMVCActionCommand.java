package com.liferay.training.portlet.portletmodule.portlet.action;

import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.training.portlet.portletmodule.constants.PortletModulePortletKeys;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author christian.berndt@liferay.com
 */
@Component(
	immediate = true,
	property = {
		"javax.portlet.name=" + PortletModulePortletKeys.PortletModule,
		"mvc.command.name=handleForm"
	},
	service = MVCActionCommand.class
)
public class AHandleFormMVCActionCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		
		System.out.println("HandleFormMVCActionCommand.doProcessAction()");
		System.out.println("namespace = " + actionResponse.getNamespace());

		String backgroundColor = actionRequest.getParameter("backgroundColor");

		System.out.println("backgroundColor = " + backgroundColor);

		//
		// Your application logic for handling the form data goes here
		// e.g. storing data to some backend database.
		//

		//
		// There is no need to copy the render action request parameters to 
		// the render phase, since this is the default behaviour of the 
		// MVCPortlet. You can suppress this behaviour by setting the 
		// "javax.portlet.init-param.copy-request-parameters=false" 
		// in your portlet module's Portlet Component configuration (NOT HERE
		// in the MVCActionCommand Component configuration!)
		//
	
	}

}
