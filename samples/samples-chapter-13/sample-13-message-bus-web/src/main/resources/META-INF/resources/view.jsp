<%@ include file="/init.jsp"%>

<portlet:actionURL name="sendMessage" var="messagebusActionURL" />

<aui:form name="fm" action="${messagebusActionURL}">

	<aui:fieldset-group markupView="lexicon">

		<aui:fieldset>
			
			<aui:select name="messageType">
				<aui:option value="direct" selected="true"><liferay-ui:message key="direct-message" /></aui:option>
				<aui:option value="async"><liferay-ui:message key="async-message" /></aui:option>
				<aui:option value="sync"><liferay-ui:message key="sync-message" /></aui:option>
			</aui:select>	

			<aui:input label="message" name="messageText">
				<aui:validator name="required" />
			</aui:input>

		</aui:fieldset>

	</aui:fieldset-group>

	<aui:button cssClass="btn-lg" type="submit" />

</aui:form>