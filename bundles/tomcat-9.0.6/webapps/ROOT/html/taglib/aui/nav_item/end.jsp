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

<%@ include file="/html/taglib/aui/nav_item/init.jsp" %>

<%
Object bodyContent = request.getAttribute("aui:nav-item:bodyContent");

String bodyContentString = StringPool.BLANK;

if (bodyContent != null) {
	bodyContentString = bodyContent.toString();
}

if (Validator.isNull(title)) {
	title = HtmlUtil.stripHtml(LanguageUtil.get(resourceBundle, label));
}
%>

<c:if test="<%= !dropdown || Validator.isNotNull(bodyContentString.trim()) %>">
	<li class="<%= cssClass %><%= selected ? " active " : StringPool.SPACE %><%= state %>" id="<%= id %>" role="presentation" <%= AUIUtil.buildData(data) %> <%= InlineUtil.buildDynamicAttributes(dynamicAttributes) %>>
		<c:if test="<%= Validator.isNotNull(iconCssClass) || Validator.isNotNull(label) %>">
			<c:if test="<%= Validator.isNotNull(href) %>">
				<a <%= Validator.isNotNull(ariaLabel) ? "aria-label=\"" + ariaLabel + "\"" : StringPool.BLANK %> class="<%= anchorCssClass %>" <%= AUIUtil.buildData(anchorData) %> href="<%= HtmlUtil.escapeAttribute(href) %>" id="<%= anchorId %>" role="<%= Validator.isNull(ariaRole) ? "menuitem" : ariaRole %>" <%= Validator.isNotNull(target) ? "target=\"" + target + "\"" : StringPool.BLANK %> title="<liferay-ui:message key="<%= title %>" />">

				<c:if test="<%= useDialog %>">
					<aui:script>
						Liferay.delegateClick('<%= anchorId %>', Liferay.Util.openInDialog);
					</aui:script>
				</c:if>
			</c:if>
					<c:choose>
						<c:when test="<%= Validator.isNotNull(iconCssClass) %>">
							<i class="nav-item-icon <%= iconCssClass %>"></i>
						</c:when>
						<c:when test="<%= Validator.isNotNull(iconSrc) %>">
							<i class="nav-item-icon"><img src="<%= iconSrc %>" /></i>
						</c:when>
					</c:choose>

					<span class="nav-item-label">
						<liferay-ui:message key="<%= label %>" localizeKey="<%= localizeLabel %>" />
					</span>

					<c:if test="<%= dropdown %>">
						<i class="icon-caret-down"></i>
					</c:if>
			<c:if test="<%= Validator.isNotNull(href) %>">
				<c:if test="<%= !useDialog && AUIUtil.isOpensNewWindow(target) %>">
					<span class="opens-new-window-accessible"><liferay-ui:message key="opens-new-window" /></span>
				</c:if>

				</a>
			</c:if>
		</c:if>

		<c:if test="<%= dropdown %>">
			<aui:script use="aui-base,event-move,event-outside,liferay-menu-toggle,liferay-store">
				new Liferay.MenuToggle(
					{
						content: '#<%= id %>',
						maxDisplayItems: <%= PropsValues.MENU_MAX_DISPLAY_ITEMS %>,
						'strings.placeholder': '<liferay-ui:message key="search" />',
						toggle: <%= toggle %>,
						toggleTouch: <%= toggleTouch %>,
						trigger: '#<%= id %> a'
					}
				);
			</aui:script>

			<c:if test="<%= wrapDropDownMenu %>">
				<ul class="dropdown-menu">
			</c:if>
		</c:if>

		<c:if test="<%= Validator.isNotNull(bodyContentString) %>">
			<%= bodyContentString %>
		</c:if>

		<c:if test="<%= dropdown && wrapDropDownMenu %>">
			</ul>
		</c:if>
	</li>
</c:if>