package com.liferay.training.strutsactionoverride;

import com.liferay.portal.kernel.struts.BaseStrutsAction;
import com.liferay.portal.kernel.struts.StrutsAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;

@Component(
	immediate = true,
	property = {
			"path=/portal/logout"
	},
	service = StrutsAction.class
)
public class LogoutActionOverride extends BaseStrutsAction {

	@Override
	public String execute(StrutsAction originalStrutsAction, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Override the Portal Logout Action!!!");
		
		originalStrutsAction.execute(request, response);
		response.sendRedirect("https://university.liferay.com");
		
		return null;
		
		//return super.execute(originalStrutsAction, request, response);
	}

}
