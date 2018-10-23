;(function() {
	AUI().applyConfig(
		{
			groups: {
				'solution-form-field-group': {
					base: MODULE_PATH + '/',
					combine: Liferay.AUI.getCombine(),
					filter: Liferay.AUI.getFilterConfig(),
					modules: {
						'solution-form-field-form-field': {
							condition: {
								trigger: 'liferay-ddm-form-renderer'
							},
							path: 'solution-form-field_field.js',
							requires: [
								'liferay-ddm-form-renderer-field'
							]
						},
						'solution-form-field-form-field-template': {
							condition: {
								trigger: 'liferay-ddm-form-renderer'
							},
							path: 'solution-form-field.soy.js',
							requires: [
								'soyutils'
							]
						}
					},
					root: MODULE_PATH + '/'
				}
			}
		}
	);
})();