import Component from 'metal-component';
import Soy from 'metal-soy';

import templates from './training-form-field.soy';

/**
 * TraningFormField Component
 */
class TraningFormField extends Component {}

// Register component
Soy.register(TraningFormField, templates, 'render');

if (!window.DDMTraningFormField) {
	window.DDMTraningFormField = {

	};
}

window.DDMTraningFormField.render = TraningFormField;

export default TraningFormField;