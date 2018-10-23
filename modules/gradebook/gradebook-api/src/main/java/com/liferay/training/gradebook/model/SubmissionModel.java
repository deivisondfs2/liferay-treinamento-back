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

package com.liferay.training.gradebook.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Submission service. Represents a row in the &quot;Gradebook_Submission&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.training.gradebook.model.impl.SubmissionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.training.gradebook.model.impl.SubmissionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Submission
 * @see com.liferay.training.gradebook.model.impl.SubmissionImpl
 * @see com.liferay.training.gradebook.model.impl.SubmissionModelImpl
 * @generated
 */
@ProviderType
public interface SubmissionModel extends BaseModel<Submission>, GroupedModel,
	ShardedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a submission model instance should use the {@link Submission} interface instead.
	 */

	/**
	 * Returns the primary key of this submission.
	 *
	 * @return the primary key of this submission
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this submission.
	 *
	 * @param primaryKey the primary key of this submission
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the submission ID of this submission.
	 *
	 * @return the submission ID of this submission
	 */
	public long getSubmissionId();

	/**
	 * Sets the submission ID of this submission.
	 *
	 * @param submissionId the submission ID of this submission
	 */
	public void setSubmissionId(long submissionId);

	/**
	 * Returns the company ID of this submission.
	 *
	 * @return the company ID of this submission
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this submission.
	 *
	 * @param companyId the company ID of this submission
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this submission.
	 *
	 * @return the group ID of this submission
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this submission.
	 *
	 * @param groupId the group ID of this submission
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the user ID of this submission.
	 *
	 * @return the user ID of this submission
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this submission.
	 *
	 * @param userId the user ID of this submission
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this submission.
	 *
	 * @return the user uuid of this submission
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this submission.
	 *
	 * @param userUuid the user uuid of this submission
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this submission.
	 *
	 * @return the user name of this submission
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this submission.
	 *
	 * @param userName the user name of this submission
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this submission.
	 *
	 * @return the create date of this submission
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this submission.
	 *
	 * @param createDate the create date of this submission
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this submission.
	 *
	 * @return the modified date of this submission
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this submission.
	 *
	 * @param modifiedDate the modified date of this submission
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the student ID of this submission.
	 *
	 * @return the student ID of this submission
	 */
	public long getStudentId();

	/**
	 * Sets the student ID of this submission.
	 *
	 * @param studentId the student ID of this submission
	 */
	public void setStudentId(long studentId);

	/**
	 * Returns the submit date of this submission.
	 *
	 * @return the submit date of this submission
	 */
	public Date getSubmitDate();

	/**
	 * Sets the submit date of this submission.
	 *
	 * @param submitDate the submit date of this submission
	 */
	public void setSubmitDate(Date submitDate);

	/**
	 * Returns the submission text of this submission.
	 *
	 * @return the submission text of this submission
	 */
	@AutoEscape
	public String getSubmissionText();

	/**
	 * Sets the submission text of this submission.
	 *
	 * @param submissionText the submission text of this submission
	 */
	public void setSubmissionText(String submissionText);

	/**
	 * Returns the comment of this submission.
	 *
	 * @return the comment of this submission
	 */
	@AutoEscape
	public String getComment();

	/**
	 * Sets the comment of this submission.
	 *
	 * @param comment the comment of this submission
	 */
	public void setComment(String comment);

	/**
	 * Returns the grade of this submission.
	 *
	 * @return the grade of this submission
	 */
	public int getGrade();

	/**
	 * Sets the grade of this submission.
	 *
	 * @param grade the grade of this submission
	 */
	public void setGrade(int grade);

	/**
	 * Returns the assignment ID of this submission.
	 *
	 * @return the assignment ID of this submission
	 */
	public long getAssignmentId();

	/**
	 * Sets the assignment ID of this submission.
	 *
	 * @param assignmentId the assignment ID of this submission
	 */
	public void setAssignmentId(long assignmentId);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Submission submission);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Submission> toCacheModel();

	@Override
	public Submission toEscapedModel();

	@Override
	public Submission toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}