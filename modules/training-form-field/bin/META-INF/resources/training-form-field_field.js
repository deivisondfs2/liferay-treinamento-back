AUI.add(
	'training-form-field-form-field',
	function(A) {
		var TraningFormFieldField = A.Component.create(
			{
				ATTRS: {
					type: {
						value: 'training-form-field-form-field'
					}
				},

				EXTENDS: Liferay.DDM.Renderer.Field,

				NAME: 'training-form-field-form-field'

			}
		);

		Liferay.namespace('DDM.Field').TraningFormField = TraningFormFieldField;
	},
	'',
	{
		requires: ['liferay-ddm-form-renderer-field']
	}
);