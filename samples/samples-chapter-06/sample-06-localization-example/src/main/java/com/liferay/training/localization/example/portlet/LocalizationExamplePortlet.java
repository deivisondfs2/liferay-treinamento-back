package com.liferay.training.localization.example.portlet;

import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.PortletRequest;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.servlet.http.HttpServletRequest;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.language.Language;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.ResourceBundleLoader;
import com.liferay.portal.kernel.util.ResourceBundleUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.training.localization.example.constants.LocalizationExamplePortletKeys;

/**
 * @author Sampsa Sohlman
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.training",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=localization-example Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + LocalizationExamplePortletKeys.LocalizationExample,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class LocalizationExamplePortlet extends MVCPortlet {
	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		// TODO Auto-generated method stub
		
		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		Locale locale = themeDisplay.getLocale();
		
		renderRequest.setAttribute("ExampleWebJavaTranslation", getResourceBundleLocalization("example-web.java.translation", locale));
		renderRequest.setAttribute("LocalizationExampleCaptionWithParams", getResourceBundleLocalization("localization-example.caption-with-params", locale,  "A", "B", "C"));
		renderRequest.setAttribute("SquareCentimeter", getLanguageLocalization("square-centimeter", locale));
		renderRequest.setAttribute("SquareKilometer", getLanguageLocalization("square-kilometer", locale));
		renderRequest.setAttribute("chooseAColorThemeOrCreateYourOwnCustomTheme", getLanguageLocalization("choose-a-color-theme-or-create-your-own-custom-theme", locale, "A","B"));
		renderRequest.setAttribute("LanguageUtilSquareCentimeter", _language.format(locale, "square-centimeter", new String[] {}));
		
		super.doView(renderRequest, renderResponse);
	}
	

	/**
	 *  Localization from ResourceBundle only with parameters
	 * 
	 * @param key
	 * @param locale
	 * @param translation parameters
	 * @return translated value for locale
	 */
	private String getResourceBundleLocalization(String key, Locale locale, Object...objects) {
		ResourceBundle resourceBundle =
				_resourceBundleLoader.loadResourceBundle(locale);
				
		return ResourceBundleUtil.getString(resourceBundle, key, objects);
	}
	
	/**
	 * Localization from ResourceBundle and if not found then look into portal
	 * 
	 * @param portletRequest
	 * @param key
	 * @param locale
	 * @return translated value for locale
	 */
	private String getLanguageLocalization(String key, Locale locale, Object...objects)  {
		ResourceBundle resourceBundle =
				_resourceBundleLoader.loadResourceBundle(locale);
		
		String value = ResourceBundleUtil.getString(resourceBundle, key, objects);
		
		if ( value==null ) {
			return _language.format(locale, key, objects);
		}
		else {
			return value;
		}
	}	
	
	@Reference(
			target = "(bundle.symbolic.name=com.liferay.training.localization.example)",
			unbind = "-"
	)
	private ResourceBundleLoader _resourceBundleLoader;
	
	@Reference
	private Language _language;
}