<%--
/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */
--%>

<%@ include file="/html/portal/init.jsp" %>

<%
String currentURL = PortalUtil.getCurrentURL(request);

String referer = ParamUtil.getString(request, WebKeys.REFERER, currentURL);

if (referer.equals(themeDisplay.getPathMain() + "/portal/update_reminder_query")) {
	referer = themeDisplay.getPathMain() + "?doAsUserId=" + themeDisplay.getDoAsUserId();
}
%>

<div class="sheet sheet-lg">
	<div class="sheet-header">
		<div class="autofit-padded-no-gutters-x autofit-row">
			<div class="autofit-col autofit-col-expand">
				<h2 class="sheet-title">
					<liferay-ui:message key="password-reminder" />
				</h2>
			</div>

			<div class="autofit-col">
				<%@ include file="/html/portal/select_language.jspf" %>
			</div>
		</div>
	</div>

	<div class="sheet-text">
		<aui:form action='<%= themeDisplay.getPathMain() + "/portal/update_reminder_query" %>' autocomplete='<%= PropsValues.COMPANY_SECURITY_PASSWORD_REMINDER_QUERY_FORM_AUTOCOMPLETE ? "on" : "off" %>' cssClass="update-reminder-query" method="post" name="fm">
			<aui:input name="p_auth" type="hidden" value="<%= AuthTokenUtil.getToken(request) %>" />
			<aui:input name="doAsUserId" type="hidden" value="<%= themeDisplay.getDoAsUserId() %>" />
			<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= Constants.UPDATE %>" />
			<aui:input name="<%= WebKeys.REFERER %>" type="hidden" value="<%= referer %>" />

			<c:if test="<%= SessionErrors.contains(request, UserReminderQueryException.class.getName()) %>">
				<div class="alert alert-danger">
					<liferay-ui:message key="reminder-query-and-answer-cannot-be-empty" />
				</div>
			</c:if>

			<aui:fieldset>
				<%@ include file="/html/portal/update_reminder_query_question.jspf" %>

				<c:if test="<%= PropsValues.USERS_REMINDER_QUERIES_CUSTOM_QUESTION_ENABLED %>">
					<div class="hide" id="customQuestionContainer">
						<aui:input autoFocus="<%= true %>" bean="<%= user %>" cssClass="reminder-query-custom" fieldParam="reminderQueryCustomQuestion" label="" model="<%= User.class %>" name="reminderQueryQuestion" />
					</div>
				</c:if>

				<aui:input autocomplete="off" cssClass="reminder-query-answer" label="answer" maxlength="<%= ModelHintsConstants.TEXT_MAX_LENGTH %>" name="reminderQueryAnswer" showRequiredLabel="<%= false %>" size="50" type="text" value="<%= user.getReminderQueryAnswer() %>">
					<aui:validator name="required" />
				</aui:input>
			</aui:fieldset>

			<aui:button-row>
				<aui:button type="submit" />
			</aui:button-row>
		</aui:form>
	</div>
</div>

<aui:script sandbox="<%= true %>">
	var customQuestionContainer = $('#customQuestionContainer');
	var reminderQueryQuestion = $('#reminderQueryQuestion');

	customQuestionContainer.toggleClass('hide', reminderQueryQuestion.val() != '<%= UsersAdmin.CUSTOM_QUESTION %>');

	reminderQueryQuestion.on(
		'change',
		function(event) {
			if (reminderQueryQuestion.val() == '<%= UsersAdmin.CUSTOM_QUESTION %>') {
				<c:if test="<%= PropsValues.USERS_REMINDER_QUERIES_CUSTOM_QUESTION_ENABLED %>">
					customQuestionContainer.removeClass('hide');

					Liferay.Util.focusFormField('#reminderQueryCustomQuestion');
				</c:if>
			}
			else {
				customQuestionContainer.addClass('hide');

				Liferay.Util.focusFormField('#reminderQueryAnswer');
			}
		}
	);
</aui:script>