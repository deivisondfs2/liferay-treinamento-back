package com.liferay.training.portlet.jrs256;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletConfig;
import javax.portlet.PortletContext;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.PortletSession;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

public class JSR286Portlet implements Portlet {

	@Override
	public void init(PortletConfig config) throws PortletException {
		System.out.println("JSR286 - INIT");
		
	}

	@Override
	public void processAction(ActionRequest request, ActionResponse response) throws PortletException, IOException {
		System.out.println("JSR286 - processAction");
	}

	@Override
	public void render(RenderRequest request, RenderResponse response) throws PortletException, IOException {
		System.out.println("JSR286 - Render");
		
		//PrintWriter printWriter = response.getWriter();
		//printWriter.write("Output from the JSR286 - render() method");
		
		String path = "/view.jsp";
		
		PortletSession portletSession = request.getPortletSession();
		PortletContext portletContext = portletSession.getPortletContext();
		PortletRequestDispatcher portletRequestDispatcher = portletContext.getRequestDispatcher(path);
		
		
		if(portletRequestDispatcher == null) {
			System.err.println(path + " not included ");
		}else {
			portletRequestDispatcher.include(request, response);
		}
		
	}

	@Override
	public void destroy() {
		System.out.println("JSR286 - Destroy");
	}

}
