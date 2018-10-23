<%@page import="com.liferay.frontend.taglib.chart.model.point.bar.BarChartConfig"%>
<%@ include file="/init.jsp" %>

<%-- Clay example --%>

<clay:stripe
    message="This is a success message."
    style="success"
    title="Success"
/>

<br />	

<%-- Chart example --%>


<chart:bar
	config="<%= barChartConfig %>"
	id="bar"
/>


<%-- liferay-ui tag example --%>

<liferay-ui:user-display
        markupView="lexicon"
        showUserDetails="true"
        showUserName="true"
        userId="<%= themeDisplay.getRealUserId() %>"
        userName="<%= themeDisplay.getRealUser().getFullName() %>"
/>
	
<br />	
	
<%-- Standard JSTL example --%> 

	<c:choose>
	    <c:when test="${themeDisplay.isSignedIn()}">
			<p>You appear to be signed in. Your groups: </p>
			<ul>
				<c:forEach items="${themeDisplay.getUser().getGroups()}" var="group">
					<li><c:out value = "${group.getName(locale)}"/></li>
				</c:forEach>
			</ul>
	    </c:when>    
	    <c:otherwise>
			<p>You are not signed in.
	    </c:otherwise>
	</c:choose>

