package com.liferay.training.gradebook.web.portlet.action;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.theme.PortletDisplay;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.DateFormatFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.training.gradebook.model.Assignment;
import com.liferay.training.gradebook.model.Submission;
import com.liferay.training.gradebook.service.AssignmentService;
import com.liferay.training.gradebook.service.SubmissionLocalService;
import com.liferay.training.gradebook.service.permission.AssignmentPermissionChecker;
import com.liferay.training.gradebook.web.constants.GradebookPortletKeys;

import java.text.DateFormat;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, 
			property = { 
					"javax.portlet.name=" + GradebookPortletKeys.GRADEBOOK,
					"mvc.command.name=/gradebook/submission/view" }, 
			service = MVCRenderCommand.class

		)
public class ViewSubmissionMVCRenderCommand implements MVCRenderCommand {

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {


		try {
			long submissionId = ParamUtil.getLong(renderRequest, "submissionId", 0);

			Submission submission = _submissionLocalService.fetchSubmission(submissionId);

			long assignmentId = submission.getAssignmentId();

			Assignment assignment = _assignmentService.getAssignment(assignmentId);
			
			DateFormat dateFormat = DateFormatFactoryUtil.getSimpleDateFormat("EEEE, MMMM dd, yyyy", renderRequest.getLocale());
			
			renderRequest.setAttribute("assignment", assignment);
			renderRequest.setAttribute("submission", submission);
			renderRequest.setAttribute("submissionClass", Submission.class);
			renderRequest.setAttribute("assignmentPermissionChecker", _assignmentPermissionChecker);
			renderRequest.setAttribute("student", _userLocalService.getUser(submission.getStudentId()).getFullName());
			renderRequest.setAttribute("dueDate", dateFormat.format(assignment.getDueDate()));
			
			ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
			
			PortletDisplay portletDisplay = themeDisplay.getPortletDisplay();
			
			String redirect = renderRequest.getParameter("redirect");
			
			portletDisplay.setShowBackIcon(true);
			portletDisplay.setURLBack(redirect);
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "/submission/view_submission.jsp";
		
	}

	@Reference
	protected AssignmentPermissionChecker _assignmentPermissionChecker;

	@Reference
	private AssignmentService _assignmentService;

	@Reference
	private SubmissionLocalService _submissionLocalService;

	@Reference
	private UserLocalService _userLocalService;

}
