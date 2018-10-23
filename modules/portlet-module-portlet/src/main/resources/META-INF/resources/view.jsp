<%@ include file="/init.jsp" %>

<%
	String cssStyle = "";

	String backgroundColor = request.getParameter("backgroundColor");
	
	if(backgroundColor != null && !backgroundColor.isEmpty()){
		cssStyle = "background-color: " + backgroundColor + ";";
	}
	
%>


<p style="<%= cssStyle %>;">
	<b><liferay-ui:message key="portletmodule.caption"/></b>
</p>

<portlet:renderURL var="viewRedUrl">

	<portlet:param name="backgroundColor" value="red" />

</portlet:renderURL>

<portlet:renderURL var="viewYellowUrl">

	<portlet:param name="backgroundColor" value="yellow" />

</portlet:renderURL>

<div class="btn-group">
	<a class="btn btn-default" href="<%= viewRedUrl %>">Set Red</a>
	<a class="btn btn-default" href="<%= viewYellowUrl %>">Set Yellow</a>
</div>

<portlet:actionURL name="handleForm" var="actionURL" />

<aui:form action="<%= actionURL %>" style="margin-top: 2rem;">

	<aui:select label="label" name="backgroundColor" >
		
		<aui:option label="aqua" />
		<aui:option label="gray" />
		<aui:option label="lime" />
		<aui:option label="oliver" />
		<aui:option label="silver" />
		
		
	</aui:select>
	
	<aui:button type="submit" value="send" />

</aui:form>
