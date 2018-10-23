package com.liferay.training.taglibraries.portlet;

import com.liferay.frontend.taglib.chart.model.MultiValueColumn;
import com.liferay.frontend.taglib.chart.model.point.bar.BarChartConfig;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.training.taglibraries.constants.TagLibExamplePortletKeys;

import java.io.IOException;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.PortletRequest;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author liferay
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=tag-libraries Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + TagLibExamplePortletKeys.TAGLIB_EXAMPLE,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class TagLibExamplePortlet extends MVCPortlet {

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {

			renderRequest.setAttribute("chartSample", getBarChartConfig());

			super.doView(renderRequest, renderResponse);
	}
	
	private BarChartConfig getBarChartConfig() {
		
		BarChartConfig barChartConfig = new BarChartConfig();
		
		barChartConfig.addColumns(
			new MultiValueColumn("data1", 100, 20, 30),
			new MultiValueColumn("data2", 20, 70, 100));
		
		return barChartConfig;
	}
}
