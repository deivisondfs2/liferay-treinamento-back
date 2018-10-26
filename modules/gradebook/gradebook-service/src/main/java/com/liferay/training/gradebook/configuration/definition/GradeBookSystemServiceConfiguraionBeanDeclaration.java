package com.liferay.training.gradebook.configuration.definition;

import com.liferay.portal.kernel.settings.definition.ConfigurationBeanDeclaration;
import com.liferay.training.gradebook.configuration.GradebookSystemServiceConfiguration;

import org.osgi.service.component.annotations.Component;

@Component
public class GradeBookSystemServiceConfiguraionBeanDeclaration implements ConfigurationBeanDeclaration {

	@Override
	public Class<?> getConfigurationBeanClass() {
		// TODO Auto-generated method stub
		return GradebookSystemServiceConfiguration.class;
	}

	
	
}
