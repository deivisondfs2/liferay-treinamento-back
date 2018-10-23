
package com.liferay.training.mvc.command.override;

import com.liferay.blogs.constants.BlogsPortletKeys;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ParamUtil;

import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;

@Component(
	immediate=true,
    property = { 
        "javax.portlet.name=" + BlogsPortletKeys.BLOGS_ADMIN, 
        "mvc.command.name=/blogs/edit_entry",
        "service.ranking:Integer=100" 
    }, 
    service = MVCActionCommand.class
)
public class CustomEditEntryMVCActionCommand extends BaseMVCActionCommand {


	@Activate
	@Modified
	protected void activate(Map<String, Object> properties) {
		System.out.println("Module activated.");
	}
	
    @Override
    protected void doProcessAction
        (ActionRequest actionRequest, ActionResponse actionResponse) 
        throws Exception {

        String cmd = ParamUtil.getString(actionRequest, Constants.CMD);

        if (cmd.equals(Constants.DELETE)) {
            System.out.println("Deleting a Blog Entry");
        }

        mvcActionCommand.processAction(actionRequest, actionResponse);
    }

    @Reference(
        target = "(component.name=com.liferay.blogs.web.internal.portlet.action.EditEntryMVCActionCommand)")
    protected MVCActionCommand mvcActionCommand;
}