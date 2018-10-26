
package com.liferay.training.gradebook.web.asset;

import com.liferay.asset.kernel.model.AssetRenderer;
import com.liferay.asset.kernel.model.AssetRendererFactory;
import com.liferay.asset.kernel.model.BaseAssetRendererFactory;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.LiferayPortletRequest;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;
import com.liferay.portal.kernel.portlet.PortletURLFactory;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.util.Html;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.training.gradebook.model.Assignment;
import com.liferay.training.gradebook.service.AssignmentLocalService;
import com.liferay.training.gradebook.service.permission.AssignmentPermissionChecker;
import com.liferay.training.gradebook.web.constants.GradebookPortletKeys;
import com.liferay.training.gradebook.web.constants.MVCCommandNames;

import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;
import javax.servlet.ServletContext;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * Asset renderer factory component for assignments.
 * 
 * @author liferay
 */
@Component(
	immediate = true,
	property = {
		"javax.portlet.name=" + GradebookPortletKeys.GRADEBOOK
	}, 
	service = AssetRendererFactory.class
)
public class AssignmentAssetRendererFactory
	extends BaseAssetRendererFactory<Assignment> {

	public AssignmentAssetRendererFactory() {

		setClassName(CLASS_NAME);
		setLinkable(true);
		setPortletId(GradebookPortletKeys.GRADEBOOK);
		setSearchable(true);
	}

	@Override
	public AssetRenderer<Assignment> getAssetRenderer(long classPK, int type)
		throws PortalException {

		Assignment assignment = _assignmentLocalService.getAssignment(classPK);

		AssignmentAssetRenderer assignmentAssetRenderer =
			new AssignmentAssetRenderer(assignment, this);

		assignmentAssetRenderer.setAssetRendererType(type);
		return assignmentAssetRenderer;
	}

	@Override
	public String getType() {

		return TYPE;
	}

	@Override
	public PortletURL getURLAdd(
		LiferayPortletRequest liferayPortletRequest,
		LiferayPortletResponse liferayPortletResponse, long classTypeId) {

		PortletURL portletURL = null;

		long refererGroupId = 0;
		long refererPlid = 0;

		portletURL = _portal.getControlPanelPortletURL(
			liferayPortletRequest, getGroup(liferayPortletRequest),
			GradebookPortletKeys.GRADEBOOK, refererGroupId, refererPlid,
			PortletRequest.RENDER_PHASE);

		portletURL.setParameter(
			"mvcRenderCommandName", MVCCommandNames.EDIT_ASSIGNMENT);
		portletURL.setParameter("showback", Boolean.FALSE.toString());

		return portletURL;
	}

	public AssignmentLocalService getAssignmentLocalService() {

		return _assignmentLocalService;
	}

	public Portal getPortal() {

		return _portal;
	}

	public AssignmentPermissionChecker assignmentPermissionChecker() {

		return _assignmentPermissionChecker;
	}

	public Html getHtml() {

		return _html;
	}

	public PortletURLFactory getPortletURLFactory() {

		return _portletURLFactory;
	}

	@Override
	public boolean hasAddPermission(
		PermissionChecker permissionChecker, long groupId, long classTypeId)
		throws Exception {

		return _assignmentPermissionChecker.containsTopLevel(
			permissionChecker, groupId,
			AssignmentPermissionChecker.ADD_ASSIGNMENT);
	}

	@Override
	public boolean hasPermission(
		PermissionChecker permissionChecker, long classPK, String actionId)
		throws Exception {

		Assignment assignment = _assignmentLocalService.getAssignment(classPK);

		return _assignmentPermissionChecker.contains(
			permissionChecker, assignment.getGroupId(),
			assignment.getAssignmentId(), actionId);
	}

	@Reference(target = "(osgi.web.symbolicname=com.liferay.training.gradebook.web)")
	private ServletContext _servletContext;

	@Reference
	private AssignmentLocalService _assignmentLocalService;

	@Reference
	private Portal _portal;

	@Reference
	private Html _html;

	@Reference
	private PortletURLFactory _portletURLFactory;

	@Reference
	private AssignmentPermissionChecker _assignmentPermissionChecker;

	public static final String CLASS_NAME = Assignment.class.getName();
	public static final String TYPE = "assignment";

}
