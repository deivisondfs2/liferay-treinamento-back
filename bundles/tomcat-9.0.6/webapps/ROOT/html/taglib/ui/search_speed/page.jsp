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

<%@ include file="/html/taglib/init.jsp" %>

<%
SearchContainer searchContainer = (SearchContainer)request.getAttribute("liferay-ui:search:searchContainer");
Hits hits = (Hits)request.getAttribute("liferay-ui:search:hits");

searchContainer.setTotal(hits.getLength());

NumberFormat doubleFormat = NumberFormat.getInstance(locale);
doubleFormat.setMaximumFractionDigits(2);

NumberFormat integerFormat = NumberFormat.getInstance(locale);
integerFormat.setMaximumFractionDigits(0);
%>

<liferay-ui:message arguments='<%= new Object[] {"<strong>" + ((searchContainer.getResultEnd() > 0) ? searchContainer.getStart() + 1 : 0)+ "</strong> - <strong>" + searchContainer.getResultEnd() + "</strong>", "<strong>" + integerFormat.format(searchContainer.getTotal()) + "</strong>"} %>' key="results-of" translateArguments="<%= false %>" />

<liferay-ui:message arguments='<%= new Object[] {"<strong>" + doubleFormat.format(hits.getSearchTime()) + "</strong>"} %>' key="search-took-x-seconds" translateArguments="<%= false %>" />