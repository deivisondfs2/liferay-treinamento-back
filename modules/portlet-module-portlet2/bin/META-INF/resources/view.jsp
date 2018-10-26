<%@ include file="/init.jsp" %>

<%
	
	String cssStyle = "";

	String backgroundColor = request.getParameter("backgroundColor");
	
	if(backgroundColor != null && !backgroundColor.isEmpty()){
		cssStyle = "background-color: " + backgroundColor + ";";
	}

%>

<p style="<%= cssStyle %>">
	<b><liferay-ui:message key="portletmodule.caption"/></b>
</p>

<portlet:renderURL var="viewRedURL">
	<portlet:param name="backgroundColor" value="red"/>
</portlet:renderURL>

<portlet:renderURL var="viewYellowURL">
	<portlet:param name="backgroundColor" value="yellow"/>
</portlet:renderURL>

<div class="btn-group">

	<a class="btn btn-default" href="<%= viewRedURL %>">Set Red</a>
	<a class="btn btn-default" href="<%= viewYellowURL %>">Set Yellow</a>
	
</div>

<portlet:actionURL name="handleForm" var="actionURL" />

<aui:form action="<%= actionURL %>" style="margin-top: 2rem;">

	<aui:select name="backgroundColor" >
		
		<aui:option label="aqua" />
		<aui:option label="gray" />
		<aui:option label="lime" />
		<aui:option label="oliver" />
		<aui:option label="silver" />
		
	</aui:select>
	
	<aui:button-row>
		<aui:button type="submit" value="send" />
	</aui:button-row>
	
</aui:form>
	