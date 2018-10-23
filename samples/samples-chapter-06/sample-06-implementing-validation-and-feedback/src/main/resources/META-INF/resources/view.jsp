<%@ include file="/init.jsp" %>


<%-- Alloy UI Validation Example --%>

<portlet:actionURL name="processForm" var="formURL" />

<aui:form action="${formURL}"> 
	<aui:input name="title" >
		<aui:validator name="required" errorMessage="please-enter-the-title"/>
	</aui:input>	
	
	<aui:button type="submit" value="submit" />
</aui:form>

<%-- Twitter Bootstrap Validation Example --%>

<form data-toggle="validator" role="form">
 	<div class="form-group">
 		<label for="inputName" class="control-label">Name</label>
		<input type="text" class="form-control" id="inputName" placeholder="Your Name" required>
	</div>
	<div class="form-group">
		<button type="submit" class="btn btn-primary">Submit</button>
	</div>
</form>  
