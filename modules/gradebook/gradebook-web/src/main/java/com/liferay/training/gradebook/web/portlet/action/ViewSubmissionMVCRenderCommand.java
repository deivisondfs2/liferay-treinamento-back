package com.liferay.training.gradebook.web.portlet.action;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.training.gradebook.web.constants.GradebookPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
				"javax.portlet.name=" + GradebookPortletKeys.GRADEBOOK,
				"mvc.command.name=/gradebook/submission/view"
			},
		service = MVCRenderCommand.class
		
		)
public class ViewSubmissionMVCRenderCommand implements MVCRenderCommand {

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		// TODO Auto-generated method stub
		return "/submission/view_submission.jsp";
	}

}
