<%@ include file="/init.jsp" %>

<h1>With &lt;liferay-ui:message /&gt; tag lib</h1>
<ul>
	<li><b>&lt;liferay-ui:message key="localization-example.caption"/&gt;:</b> <liferay-ui:message key="localization-example.caption" /> </li>
	<li><b>&lt;liferay-ui:message key="localization-example.caption-with-params" arguments="&lt;%= new String[] {"A", "B", "C"} %&gt;"/&gt;:</b> <liferay-ui:message key="localization-example.caption-with-params" arguments="<%= new String[] {"A", "B", "C"} %>" /> </li>
	<li><b>&lt;liferay-ui:message key="square-centimeter"/&gt;:</b> <liferay-ui:message key="square-centimeter" /> </li>
	<li><b>&lt;liferay-ui:message key="square-kilometer"/&gt;:</b> <liferay-ui:message key="square-kilometer" /> </li>	
	<li><b>&lt;liferay-ui:message key="choose-a-color-theme-or-create-your-own-custom-theme" arguments="&lt;%= new String[] {"A", "B"} %&gt;" /&gt;:</b> <liferay-ui:message key="choose-a-color-theme-or-create-your-own-custom-theme" arguments="<%= new String[] {"A", "B"} %>"/> </li>		
</ul>
<h1>With Java</h1>
<ul>
	<li><b>getResourceBundleLocalization("example-web.java.translation", locale) :</b> ${ExampleWebJavaTranslation}</b>
	<li><b>getResourceBundleLocalization("localization-example.caption-with-params", locale,  "A", "B", "C") :</b> ${LocalizationExampleCaptionWithParams}</b>
	<li><b>getLanguageLocalization(renderRequest, "square-centimeter", locale) :</b> ${SquareCentimeter}</li>
	<li><b>getLanguageLocalization(renderRequest, "square-kilometer", locale) :</b> ${SquareKilometer}</li>
	<li><b> _language.format(locale, "square-centimeter", new String[] {}) :</b> ${LanguageUtilSquareCentimeter}</li>
</ul>


<h1>With JavaScript</h1>
<ul>
	<li><b>&lt;script&gt;document.write(Liferay.Language.get('square-centimeter'));&lt;/script&gt; : </b><script>document.write(Liferay.Language.get('square-centimeter'));</script></li>
	<li><b>&lt;script&gt;document.write(Liferay.Language.get('choose-a-color-theme-or-create-your-own-custom-theme', ['A','B']));&lt;/script&gt; : </b><script>document.write(Liferay.Language.get('choose-a-color-theme-or-create-your-own-custom-theme', ['A','B']));</script></li>
</ul>