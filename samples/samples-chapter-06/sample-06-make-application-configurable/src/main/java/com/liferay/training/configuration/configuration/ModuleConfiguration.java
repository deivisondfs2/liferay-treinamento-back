package com.liferay.training.configuration.configuration;

import aQute.bnd.annotation.metatype.Meta;

@Meta.OCD(
	id = "com.liferay.training.configuration.MóduleConfiguration",
	localization = "content/Language",
	name = "configuration-api-example-portlet"
)
public interface ModuleConfiguration {

	@Meta.AD(
		deflt = "false", 
		description = "show-hello-description",
	    name = "show-hello-name",
		required = false
	)
	public boolean showHello();	

}
