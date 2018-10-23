/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.training.gradebook.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.training.gradebook.model.Assignment;
import com.liferay.training.gradebook.service.base.AssignmentLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * The implementation of the assignment local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.liferay.training.gradebook.service.AssignmentLocalService}
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssignmentLocalServiceBaseImpl
 * @see com.liferay.training.gradebook.service.AssignmentLocalServiceUtil
 */
public class AssignmentLocalServiceImpl extends AssignmentLocalServiceBaseImpl {

	public Assignment addAssignment(long groupId, Map<Locale, String> titleMap, String description, Date dueDate,
			ServiceContext serviceContext) throws PortalException {

		// Get group and same time validate that it exists.

		Group group = groupPersistence.findByPrimaryKey(groupId);

		long userId = serviceContext.getUserId();

		User user = userLocalService.getUser(userId);

		// Generate primary key for the assignment.

		long assignmentId =
			counterLocalService.increment(Assignment.class.getName());

		// Create assigment.

		Assignment assignment = createAssignment(assignmentId);
		// Populate all assignment object fields

		assignment.setCompanyId(group.getCompanyId());
		assignment.setGroupId(groupId);
		assignment.setUserId(userId);
		assignment.setTitleMap(titleMap);
		assignment.setDueDate(dueDate);
		assignment.setDescription(description);
		assignment.setUserName(user.getScreenName());
		
		assignment.setCreateDate(serviceContext.getCreateDate(new Date()));
		assignment.setModifiedDate(serviceContext.getModifiedDate(new Date()));

		// Persist assignment.

		assignment = super.addAssignment(assignment);

		// Add permission resources.
				
		return assignment;
	}

	/**
	 * Notice: we can "silence" generated, unwanted signatures simply by making an override.
	 */
	@Override
	public Assignment addAssignment(Assignment assignment) {
		throw new UnsupportedOperationException("Not supported.");
	}

	public Assignment deleteAssignment(long assignmentId)
		throws PortalException {

		Assignment assignment = getAssignment(assignmentId);

		return deleteAssignment(assignment);
	}

	public Assignment deleteAssignment(Assignment assignment) {
		
		return super.deleteAssignment(assignment);
	}
	public List<Assignment> getAssignmentsByGroupId(long groupId) {

		return assignmentPersistence.findByGroupId(groupId);
	}

	public List<Assignment> getAssignmentsByGroupId(
		long groupId, int start, int end) {

		return assignmentPersistence.findByGroupId(groupId, start, end);
	}	
	
	public Assignment updateAssignment(long assignmentId, Map<Locale, String> titleMap, String description,
			Date dueDate, ServiceContext serviceContext) throws PortalException {

		// Get Assignment

		Assignment assignment = getAssignment(assignmentId);

		// Update the changes to assignment

		assignment.setModifiedDate(new Date());
		assignment.setTitleMap(titleMap);
		assignment.setDueDate(dueDate);
		assignment.setDescription(description);

		assignment = super.updateAssignment(assignment);

		/***** [PLACEHOLDER FOR UPDATING ASSET *****/

		return assignment;
	}

	/**
	 * We can "silence" generated, unwanted signatures simply by making an override.
	 */
	@Override
	public Assignment updateAssignment(Assignment assignment) {
		throw new UnsupportedOperationException(
				"Not supported.");
	}
}