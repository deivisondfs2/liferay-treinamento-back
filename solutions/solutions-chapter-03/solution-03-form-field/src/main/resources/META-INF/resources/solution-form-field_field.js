AUI.add(
	'solution-form-field-form-field',
	function(A) {
		var TrainingFormFieldField = A.Component.create(
			{
				ATTRS: {
					type: {
						value: 'solution-form-field-form-field'
					}
				},

				EXTENDS: Liferay.DDM.Renderer.Field,

				NAME: 'solution-form-field-form-field'

			}
		);

		Liferay.namespace('DDM.Field').TrainingFormField = TrainingFormFieldField;
	},
	'',
	{
		requires: ['liferay-ddm-form-renderer-field']
	}
);