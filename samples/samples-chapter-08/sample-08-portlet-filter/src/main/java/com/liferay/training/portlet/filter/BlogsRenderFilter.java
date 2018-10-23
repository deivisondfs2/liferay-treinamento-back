package com.liferay.training.portlet.filter;

import com.liferay.portal.kernel.util.PortletKeys;

import java.io.IOException;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.filter.FilterChain;
import javax.portlet.filter.FilterConfig;
import javax.portlet.filter.PortletFilter;
import javax.portlet.filter.RenderFilter;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.FieldOption;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicyOption;
import org.osgi.service.component.annotations.ReferenceScope;

@Component(
    immediate = true,
    property = {
         "javax.portlet.name=" + PortletKeys.BLOGS
    },
    service = PortletFilter.class
)
public class BlogsRenderFilter implements RenderFilter  {

	@Override
	public void init(FilterConfig filterConfig)
		throws PortletException {

		// TODO Auto-generated method stub
		
	}

	@Override
	public void destroy() {

		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(
		RenderRequest request, RenderResponse response, FilterChain chain)
		throws IOException, PortletException {

		// TODO Auto-generated method stub
		
	}
	
	@Reference(
		bind="",
		cardinality=ReferenceCardinality.MANDATORY,
		field="",
		fieldOption=FieldOption.UPDATE,
		name="",
		scope=ReferenceScope.BUNDLE
		)
	private Portlet asdasd;

}
