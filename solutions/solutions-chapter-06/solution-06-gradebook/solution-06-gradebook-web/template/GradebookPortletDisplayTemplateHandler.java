package com.liferay.training.gradebook.portlet.template;

import com.liferay.asset.kernel.model.AssetEntry;
import com.liferay.portal.kernel.portletdisplaytemplate.BasePortletDisplayTemplateHandler;
import com.liferay.portal.kernel.template.TemplateVariableGroup;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.training.gradebook.model.Assignment;
import com.liferay.training.gradebook.portlet.constants.GradebookPortletKeys;

import java.util.Locale;
import java.util.Map;

public class GradebookPortletDisplayTemplateHandler extends BasePortletDisplayTemplateHandler {

	@Override
	public String getClassName() {
		return Assignment.class.getName();
	}

	@Override
	public String getName(Locale locale) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, TemplateVariableGroup> getTemplateVariableGroups(
			long classPK, String language, Locale locale)
		throws Exception {

		Map<String, TemplateVariableGroup> templateVariableGroups =
			super.getTemplateVariableGroups(classPK, language, locale);

		TemplateVariableGroup fieldsTemplateVariableGroup =
			templateVariableGroups.get("fields");

		fieldsTemplateVariableGroup.empty();

		fieldsTemplateVariableGroup.addVariable(
			"asset-entry", AssetEntry.class, "assetEntry");
		fieldsTemplateVariableGroup.addVariable(
			"wiki-page", Assignment.class, PortletDisplayTemplateConstants.ENTRY);
		fieldsTemplateVariableGroup.addVariable(
			"wiki-page-content", String.class, "formattedContent");

		String[] restrictedVariables = getRestrictedVariables(language);

		TemplateVariableGroup wikiServicesTemplateVariableGroup =
			new TemplateVariableGroup("wiki-services", restrictedVariables);

		wikiServicesTemplateVariableGroup.setAutocompleteEnabled(false);

		wikiServicesTemplateVariableGroup.addServiceLocatorVariables(
			WikiPageLocalService.class, WikiPageService.class,
			WikiNodeLocalService.class, WikiNodeService.class);

		templateVariableGroups.put(
			wikiServicesTemplateVariableGroup.getLabel(),
			wikiServicesTemplateVariableGroup);

		return templateVariableGroups;
	}
	
	@Override
	public String getResourceName() {
		return GradebookPortletKeys.PORTLET_NAME;

	}
	
	@Override
	protected String getTemplatesConfigPath() {
		return StringUtil.replace(this.getClassName(),".","/").concat("/dependencies/portlet-display-templates.xml");
	}

}
