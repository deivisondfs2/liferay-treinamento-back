/**
 * Copyright 2000-present Liferay, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.liferay.training.portlet.portletmodule.action;

import org.osgi.service.component.annotations.Component;
import javax.portlet.Portlet;
import com.liferay.util.bridges.freemarker.FreeMarkerPortlet;

@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.security-role-ref=power-user,user",
		"javax.portlet.display-name=HandleFormMVC Portlet",
		"javax.portlet.init-param.view-template=/handleformmvc/view.ftl",
		"com.liferay.portlet.css-class-wrapper=portlet-handleformmvc"
	},
	service = Portlet.class
)
public class HandleFormMVCPortlet extends FreeMarkerPortlet {
}