package com.liferay.training.form.field.form.field;

import com.liferay.dynamic.data.mapping.form.field.type.BaseDDMFormFieldType;
import com.liferay.dynamic.data.mapping.form.field.type.DDMFormFieldType;

import org.osgi.service.component.annotations.Component;

/**
 * @author liferay
 */
@Component(
	immediate = true,
	property = {
		"ddm.form.field.type.display.order:Integer=9",
		"ddm.form.field.type.icon=text",
		"ddm.form.field.type.js.class.name=Liferay.DDM.Field.TrainingFormField",
		"ddm.form.field.type.js.module=solution-form-field-form-field",
		"ddm.form.field.type.label=solution-form-field-label",
		"ddm.form.field.type.name=TrainingFormField"
	},
	service = DDMFormFieldType.class
)
public class TrainingFormFieldDDMFormFieldType extends BaseDDMFormFieldType {

	@Override
	public String getName() {
		return "TrainingFormField";
	}

}