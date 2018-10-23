<%@ include file="/init.jsp" %>

<%
	
	String cssStyle = "";

	String backgroundColor = request.getParameter("backgroundColor");
	
	if(backgroundColor != null && !backgroundColor.isEmpty()){
		cssStyle = "background-color:" + backgroundColor + ";";
	}
%>

<p class="caption" style="<%= cssStyle %>">
	<liferay-ui:message key="jrs-286-portlet.caption" />
</p>

<portlet:renderURL var="viewRedURL">
	<portlet:param name="backgroundColor" value="red"/>
</portlet:renderURL>

<portlet:renderURL var="viewYellowURL">
	<portlet:param name="backgroundColor" value="yellow"/>
</portlet:renderURL>

<div class="btn-group">
	<a class="btn btn-default" href="<%=viewRedURL%>"> Set red</a>
	<a class="btn btn-default" href="<%=viewYellowURL%>"> Set yellow</a>
</div>