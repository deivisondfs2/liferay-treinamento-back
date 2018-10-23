package com.liferay.training.gradebook.configuration;

import com.liferay.portal.configuration.metatype.annotations.ExtendedObjectClassDefinition;

import aQute.bnd.annotation.metatype.Meta;

/**
 * Configuration interface for Gradebook service. 
 * 
 * An user interface for this interface is automatically created 
 * in Control Panel -> System settings.
 * 
 * @see <a
 *      href="https://dev.liferay.com/es/develop/tutorials/-/knowledge_base/7-1/making-applications-configurable">Tutorial
 *      on making configurable applications at Liferay Developer Network</a>
 * @author liferay
 */
@ExtendedObjectClassDefinition(
	category = "Gradebook", 
	scope = ExtendedObjectClassDefinition.Scope.SYSTEM
)
@Meta.OCD(
	id = "com.liferay.training.gradebook.configuration.GradebookSystemServiceConfiguration",
	localization = "content/Language",
	name = "gradebook-service-configuration-name"
)
public interface GradebookSystemServiceConfiguration {

}
