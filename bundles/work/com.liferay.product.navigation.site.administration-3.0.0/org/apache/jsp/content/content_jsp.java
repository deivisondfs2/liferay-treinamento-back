package org.apache.jsp.content;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.application.list.PanelApp;
import com.liferay.application.list.PanelAppRegistry;
import com.liferay.application.list.PanelCategory;
import com.liferay.application.list.constants.ApplicationListWebKeys;
import com.liferay.application.list.constants.PanelCategoryKeys;
import com.liferay.application.list.display.context.logic.PanelCategoryHelper;
import com.liferay.exportimport.kernel.exception.RemoteExportException;
import com.liferay.item.selector.ItemSelector;
import com.liferay.item.selector.ItemSelectorReturnType;
import com.liferay.item.selector.criteria.URLItemSelectorReturnType;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.Layout;
import com.liferay.portal.kernel.portlet.RequestBackedPortletURLFactoryUtil;
import com.liferay.portal.kernel.service.LayoutLocalServiceUtil;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.product.navigation.site.administration.internal.constants.SiteAdministrationWebKeys;
import com.liferay.product.navigation.site.administration.internal.display.context.SiteAdministrationPanelCategoryDisplayContext;
import com.liferay.site.item.selector.criterion.SiteItemSelectorCriterion;
import com.liferay.taglib.aui.AUIUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;

public final class content_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/init.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_liferay$1ui_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_liferay$1theme_defineObjects_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_liferay$1application$1list_panel$1category_showBody_panelCategory;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_liferay$1application$1list_panel$1category$1body_panelCategory_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_liferay$1frontend_defineObjects_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_aui_icon_markupView_image_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_portlet_defineObjects_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_liferay$1ui_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_liferay$1theme_defineObjects_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_liferay$1application$1list_panel$1category_showBody_panelCategory = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_liferay$1application$1list_panel$1category$1body_panelCategory_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_liferay$1frontend_defineObjects_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_aui_icon_markupView_image_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_portlet_defineObjects_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_liferay$1ui_message_key_nobody.release();
    _jspx_tagPool_liferay$1theme_defineObjects_nobody.release();
    _jspx_tagPool_liferay$1application$1list_panel$1category_showBody_panelCategory.release();
    _jspx_tagPool_liferay$1application$1list_panel$1category$1body_panelCategory_nobody.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_liferay$1frontend_defineObjects_nobody.release();
    _jspx_tagPool_aui_icon_markupView_image_nobody.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_portlet_defineObjects_nobody.release();
    _jspx_tagPool_c_when_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      //  liferay-frontend:defineObjects
      com.liferay.frontend.taglib.servlet.taglib.DefineObjectsTag _jspx_th_liferay$1frontend_defineObjects_0 = (com.liferay.frontend.taglib.servlet.taglib.DefineObjectsTag) _jspx_tagPool_liferay$1frontend_defineObjects_nobody.get(com.liferay.frontend.taglib.servlet.taglib.DefineObjectsTag.class);
      _jspx_th_liferay$1frontend_defineObjects_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1frontend_defineObjects_0.setParent(null);
      int _jspx_eval_liferay$1frontend_defineObjects_0 = _jspx_th_liferay$1frontend_defineObjects_0.doStartTag();
      if (_jspx_th_liferay$1frontend_defineObjects_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_liferay$1frontend_defineObjects_nobody.reuse(_jspx_th_liferay$1frontend_defineObjects_0);
        return;
      }
      _jspx_tagPool_liferay$1frontend_defineObjects_nobody.reuse(_jspx_th_liferay$1frontend_defineObjects_0);
      java.lang.String currentURL = null;
      javax.portlet.PortletURL currentURLObj = null;
      java.util.ResourceBundle resourceBundle = null;
      javax.portlet.WindowState windowState = null;
      currentURL = (java.lang.String) _jspx_page_context.findAttribute("currentURL");
      currentURLObj = (javax.portlet.PortletURL) _jspx_page_context.findAttribute("currentURLObj");
      resourceBundle = (java.util.ResourceBundle) _jspx_page_context.findAttribute("resourceBundle");
      windowState = (javax.portlet.WindowState) _jspx_page_context.findAttribute("windowState");
      out.write('\n');
      out.write('\n');
      //  liferay-theme:defineObjects
      com.liferay.taglib.theme.DefineObjectsTag _jspx_th_liferay$1theme_defineObjects_0 = (com.liferay.taglib.theme.DefineObjectsTag) _jspx_tagPool_liferay$1theme_defineObjects_nobody.get(com.liferay.taglib.theme.DefineObjectsTag.class);
      _jspx_th_liferay$1theme_defineObjects_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1theme_defineObjects_0.setParent(null);
      int _jspx_eval_liferay$1theme_defineObjects_0 = _jspx_th_liferay$1theme_defineObjects_0.doStartTag();
      if (_jspx_th_liferay$1theme_defineObjects_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_liferay$1theme_defineObjects_nobody.reuse(_jspx_th_liferay$1theme_defineObjects_0);
        return;
      }
      _jspx_tagPool_liferay$1theme_defineObjects_nobody.reuse(_jspx_th_liferay$1theme_defineObjects_0);
      com.liferay.portal.kernel.theme.ThemeDisplay themeDisplay = null;
      com.liferay.portal.kernel.model.Company company = null;
      com.liferay.portal.kernel.model.Account account = null;
      com.liferay.portal.kernel.model.User user = null;
      com.liferay.portal.kernel.model.User realUser = null;
      com.liferay.portal.kernel.model.Contact contact = null;
      com.liferay.portal.kernel.model.Layout layout = null;
      java.util.List layouts = null;
      java.lang.Long plid = null;
      com.liferay.portal.kernel.model.LayoutTypePortlet layoutTypePortlet = null;
      java.lang.Long scopeGroupId = null;
      com.liferay.portal.kernel.security.permission.PermissionChecker permissionChecker = null;
      java.util.Locale locale = null;
      java.util.TimeZone timeZone = null;
      com.liferay.portal.kernel.model.Theme theme = null;
      com.liferay.portal.kernel.model.ColorScheme colorScheme = null;
      com.liferay.portal.kernel.theme.PortletDisplay portletDisplay = null;
      java.lang.Long portletGroupId = null;
      themeDisplay = (com.liferay.portal.kernel.theme.ThemeDisplay) _jspx_page_context.findAttribute("themeDisplay");
      company = (com.liferay.portal.kernel.model.Company) _jspx_page_context.findAttribute("company");
      account = (com.liferay.portal.kernel.model.Account) _jspx_page_context.findAttribute("account");
      user = (com.liferay.portal.kernel.model.User) _jspx_page_context.findAttribute("user");
      realUser = (com.liferay.portal.kernel.model.User) _jspx_page_context.findAttribute("realUser");
      contact = (com.liferay.portal.kernel.model.Contact) _jspx_page_context.findAttribute("contact");
      layout = (com.liferay.portal.kernel.model.Layout) _jspx_page_context.findAttribute("layout");
      layouts = (java.util.List) _jspx_page_context.findAttribute("layouts");
      plid = (java.lang.Long) _jspx_page_context.findAttribute("plid");
      layoutTypePortlet = (com.liferay.portal.kernel.model.LayoutTypePortlet) _jspx_page_context.findAttribute("layoutTypePortlet");
      scopeGroupId = (java.lang.Long) _jspx_page_context.findAttribute("scopeGroupId");
      permissionChecker = (com.liferay.portal.kernel.security.permission.PermissionChecker) _jspx_page_context.findAttribute("permissionChecker");
      locale = (java.util.Locale) _jspx_page_context.findAttribute("locale");
      timeZone = (java.util.TimeZone) _jspx_page_context.findAttribute("timeZone");
      theme = (com.liferay.portal.kernel.model.Theme) _jspx_page_context.findAttribute("theme");
      colorScheme = (com.liferay.portal.kernel.model.ColorScheme) _jspx_page_context.findAttribute("colorScheme");
      portletDisplay = (com.liferay.portal.kernel.theme.PortletDisplay) _jspx_page_context.findAttribute("portletDisplay");
      portletGroupId = (java.lang.Long) _jspx_page_context.findAttribute("portletGroupId");
      out.write('\n');
      out.write('\n');
      //  portlet:defineObjects
      com.liferay.taglib.portlet.DefineObjectsTag _jspx_th_portlet_defineObjects_0 = (com.liferay.taglib.portlet.DefineObjectsTag) _jspx_tagPool_portlet_defineObjects_nobody.get(com.liferay.taglib.portlet.DefineObjectsTag.class);
      _jspx_th_portlet_defineObjects_0.setPageContext(_jspx_page_context);
      _jspx_th_portlet_defineObjects_0.setParent(null);
      int _jspx_eval_portlet_defineObjects_0 = _jspx_th_portlet_defineObjects_0.doStartTag();
      if (_jspx_th_portlet_defineObjects_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_portlet_defineObjects_nobody.reuse(_jspx_th_portlet_defineObjects_0);
        return;
      }
      _jspx_tagPool_portlet_defineObjects_nobody.reuse(_jspx_th_portlet_defineObjects_0);
      javax.portlet.ActionRequest actionRequest = null;
      javax.portlet.ActionResponse actionResponse = null;
      javax.portlet.EventRequest eventRequest = null;
      javax.portlet.EventResponse eventResponse = null;
      com.liferay.portal.kernel.portlet.LiferayPortletRequest liferayPortletRequest = null;
      com.liferay.portal.kernel.portlet.LiferayPortletResponse liferayPortletResponse = null;
      javax.portlet.PortletConfig portletConfig = null;
      java.lang.String portletName = null;
      javax.portlet.PortletPreferences portletPreferences = null;
      java.util.Map portletPreferencesValues = null;
      javax.portlet.PortletSession portletSession = null;
      java.util.Map portletSessionScope = null;
      javax.portlet.RenderRequest renderRequest = null;
      javax.portlet.RenderResponse renderResponse = null;
      javax.portlet.ResourceRequest resourceRequest = null;
      javax.portlet.ResourceResponse resourceResponse = null;
      actionRequest = (javax.portlet.ActionRequest) _jspx_page_context.findAttribute("actionRequest");
      actionResponse = (javax.portlet.ActionResponse) _jspx_page_context.findAttribute("actionResponse");
      eventRequest = (javax.portlet.EventRequest) _jspx_page_context.findAttribute("eventRequest");
      eventResponse = (javax.portlet.EventResponse) _jspx_page_context.findAttribute("eventResponse");
      liferayPortletRequest = (com.liferay.portal.kernel.portlet.LiferayPortletRequest) _jspx_page_context.findAttribute("liferayPortletRequest");
      liferayPortletResponse = (com.liferay.portal.kernel.portlet.LiferayPortletResponse) _jspx_page_context.findAttribute("liferayPortletResponse");
      portletConfig = (javax.portlet.PortletConfig) _jspx_page_context.findAttribute("portletConfig");
      portletName = (java.lang.String) _jspx_page_context.findAttribute("portletName");
      portletPreferences = (javax.portlet.PortletPreferences) _jspx_page_context.findAttribute("portletPreferences");
      portletPreferencesValues = (java.util.Map) _jspx_page_context.findAttribute("portletPreferencesValues");
      portletSession = (javax.portlet.PortletSession) _jspx_page_context.findAttribute("portletSession");
      portletSessionScope = (java.util.Map) _jspx_page_context.findAttribute("portletSessionScope");
      renderRequest = (javax.portlet.RenderRequest) _jspx_page_context.findAttribute("renderRequest");
      renderResponse = (javax.portlet.RenderResponse) _jspx_page_context.findAttribute("renderResponse");
      resourceRequest = (javax.portlet.ResourceRequest) _jspx_page_context.findAttribute("resourceRequest");
      resourceResponse = (javax.portlet.ResourceResponse) _jspx_page_context.findAttribute("resourceResponse");
      out.write('\n');
      out.write('\n');

PanelCategory panelCategory = (PanelCategory)request.getAttribute(ApplicationListWebKeys.PANEL_CATEGORY);
PanelCategoryHelper panelCategoryHelper = (PanelCategoryHelper)request.getAttribute(ApplicationListWebKeys.PANEL_CATEGORY_HELPER);

      out.write('\n');
      out.write('\n');
      //  liferay-application-list:panel-category
      com.liferay.application.list.taglib.servlet.taglib.PanelCategoryTag _jspx_th_liferay$1application$1list_panel$1category_0 = (com.liferay.application.list.taglib.servlet.taglib.PanelCategoryTag) _jspx_tagPool_liferay$1application$1list_panel$1category_showBody_panelCategory.get(com.liferay.application.list.taglib.servlet.taglib.PanelCategoryTag.class);
      _jspx_th_liferay$1application$1list_panel$1category_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1application$1list_panel$1category_0.setParent(null);
      _jspx_th_liferay$1application$1list_panel$1category_0.setPanelCategory( panelCategory );
      _jspx_th_liferay$1application$1list_panel$1category_0.setShowBody( false );
      int _jspx_eval_liferay$1application$1list_panel$1category_0 = _jspx_th_liferay$1application$1list_panel$1category_0.doStartTag();
      if (_jspx_eval_liferay$1application$1list_panel$1category_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\n");
        out.write("\t");

	Group curSite = themeDisplay.getSiteGroup();

	List<Layout> scopeLayouts = LayoutLocalServiceUtil.getScopeGroupLayouts(curSite.getGroupId());
	
        out.write("\n");
        out.write("\n");
        out.write("\t");
        out.write("\n");
        out.write("\t\t");
if (
 scopeLayouts.isEmpty() ) {
        out.write("\n");
        out.write("\t\t\t");
        //  liferay-application-list:panel-category-body
        com.liferay.application.list.taglib.servlet.taglib.PanelCategoryBodyTag _jspx_th_liferay$1application$1list_panel$1category$1body_0 = (com.liferay.application.list.taglib.servlet.taglib.PanelCategoryBodyTag) _jspx_tagPool_liferay$1application$1list_panel$1category$1body_panelCategory_nobody.get(com.liferay.application.list.taglib.servlet.taglib.PanelCategoryBodyTag.class);
        _jspx_th_liferay$1application$1list_panel$1category$1body_0.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1application$1list_panel$1category$1body_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1application$1list_panel$1category_0);
        _jspx_th_liferay$1application$1list_panel$1category$1body_0.setPanelCategory( panelCategory );
        int _jspx_eval_liferay$1application$1list_panel$1category$1body_0 = _jspx_th_liferay$1application$1list_panel$1category$1body_0.doStartTag();
        if (_jspx_th_liferay$1application$1list_panel$1category$1body_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          _jspx_tagPool_liferay$1application$1list_panel$1category$1body_panelCategory_nobody.reuse(_jspx_th_liferay$1application$1list_panel$1category$1body_0);
          return;
        }
        _jspx_tagPool_liferay$1application$1list_panel$1category$1body_panelCategory_nobody.reuse(_jspx_th_liferay$1application$1list_panel$1category$1body_0);
        out.write("\n");
        out.write("\t\t");
        out.write("\n");
        out.write("\t\t");
}
else {
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t");

			PanelAppRegistry panelAppRegistry = (PanelAppRegistry)request.getAttribute(ApplicationListWebKeys.PANEL_APP_REGISTRY);

			List<PanelApp> panelApps = panelAppRegistry.getPanelApps(panelCategory, themeDisplay.getPermissionChecker(), themeDisplay.getScopeGroup());
			
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t");
if (
 !panelApps.isEmpty() ) {
        out.write("\n");
        out.write("\t\t\t\t<ul class=\"nav nav-equal-height nav-nested\">\n");
        out.write("\t\t\t\t\t<li>\n");
        out.write("\t\t\t\t\t\t<div class=\"scope-selector\">\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t\t");

							Group curScopeGroup = themeDisplay.getScopeGroup();
							
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t\t<span class=\"scope-name\">\n");
        out.write("\t\t\t\t\t\t\t\t");
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t");
if (
 curScopeGroup.isLayout() ) {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        out.print( curScopeGroup.getDescriptiveName(locale) );
        out.write(' ');
        out.write('(');
        if (_jspx_meth_liferay$1ui_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1application$1list_panel$1category_0, _jspx_page_context))
          return;
        out.write(")\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t");
}
else {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_liferay$1ui_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1application$1list_panel$1category_0, _jspx_page_context))
          return;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t");
}
        out.write("\n");
        out.write("\t\t\t\t\t\t\t</span>\n");
        out.write("\t\t\t\t\t\t\t<span class=\"nav-equal-height-heading-field\">\n");
        out.write("\t\t\t\t\t\t\t\t<div class=\"dropdown\">\n");
        out.write("\t\t\t\t\t\t\t\t\t<a aria-expanded=\"false\" class=\"dropdown-toggle icon-monospaced\" data-toggle=\"dropdown\" href=\"javascript:;\">\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_aui_icon_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1application$1list_panel$1category_0, _jspx_page_context))
          return;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t</a>\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t");

									Map<String, Object> data = new HashMap<String, Object>();

									String portletId = themeDisplay.getPpid();

									if (Validator.isNull(portletId) || !panelCategoryHelper.containsPortlet(portletId, PanelCategoryKeys.SITE_ADMINISTRATION_CONTENT, permissionChecker, curSite)) {
										portletId = panelCategoryHelper.getFirstPortletId(PanelCategoryKeys.SITE_ADMINISTRATION_CONTENT, permissionChecker, curSite);
									}

									PortletURL portletURL = PortalUtil.getControlPanelPortletURL(request, curSite, portletId, 0, 0, PortletRequest.RENDER_PHASE);
									
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu dropdown-menu-center\">\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"");
        out.print( (curScopeGroup.getGroupId() == curSite.getGroupId()) ? "active" : StringPool.BLANK );
        out.write("\">\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<a class=\"truncate-text\" href=\"");
        out.print( portletURL.toString() );
        out.write("\">\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_liferay$1ui_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1application$1list_panel$1category_0, _jspx_page_context))
          return;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t</a>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t</li>\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");

										for (Layout curScopeLayout : scopeLayouts) {
											Group scopeGroup = curScopeLayout.getScopeGroup();

											if (Validator.isNull(portletId) || !panelCategoryHelper.containsPortlet(portletId, PanelCategoryKeys.SITE_ADMINISTRATION_CONTENT, permissionChecker, scopeGroup)) {
												portletId = panelCategoryHelper.getFirstPortletId(PanelCategoryKeys.SITE_ADMINISTRATION_CONTENT, permissionChecker, scopeGroup);
											}

											portletURL = PortalUtil.getControlPanelPortletURL(request, scopeGroup, portletId, 0, 0, PortletRequest.RENDER_PHASE);
										
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<li class=\"");
        out.print( (curScopeGroup.getGroupId() == scopeGroup.getGroupId()) ? "active" : StringPool.BLANK );
        out.write("\">\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a class=\"truncate-text\" href=\"");
        out.print( portletURL.toString() );
        out.write("\">\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
        //  liferay-ui:message
        com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_3 = (com.liferay.taglib.ui.MessageTag) _jspx_tagPool_liferay$1ui_message_key_nobody.get(com.liferay.taglib.ui.MessageTag.class);
        _jspx_th_liferay$1ui_message_3.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1ui_message_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1application$1list_panel$1category_0);
        _jspx_th_liferay$1ui_message_3.setKey( HtmlUtil.escape(curScopeLayout.getName(locale)) );
        int _jspx_eval_liferay$1ui_message_3 = _jspx_th_liferay$1ui_message_3.doStartTag();
        if (_jspx_th_liferay$1ui_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          _jspx_tagPool_liferay$1ui_message_key_nobody.reuse(_jspx_th_liferay$1ui_message_3);
          return;
        }
        _jspx_tagPool_liferay$1ui_message_key_nobody.reuse(_jspx_th_liferay$1ui_message_3);
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t</a>\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t</li>\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");

										}
										
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
        out.write("\t\t\t\t\t\t\t</div>\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        //  liferay-application-list:panel-category-body
        com.liferay.application.list.taglib.servlet.taglib.PanelCategoryBodyTag _jspx_th_liferay$1application$1list_panel$1category$1body_1 = (com.liferay.application.list.taglib.servlet.taglib.PanelCategoryBodyTag) _jspx_tagPool_liferay$1application$1list_panel$1category$1body_panelCategory_nobody.get(com.liferay.application.list.taglib.servlet.taglib.PanelCategoryBodyTag.class);
        _jspx_th_liferay$1application$1list_panel$1category$1body_1.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1application$1list_panel$1category$1body_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1application$1list_panel$1category_0);
        _jspx_th_liferay$1application$1list_panel$1category$1body_1.setPanelCategory( panelCategory );
        int _jspx_eval_liferay$1application$1list_panel$1category$1body_1 = _jspx_th_liferay$1application$1list_panel$1category$1body_1.doStartTag();
        if (_jspx_th_liferay$1application$1list_panel$1category$1body_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          _jspx_tagPool_liferay$1application$1list_panel$1category$1body_panelCategory_nobody.reuse(_jspx_th_liferay$1application$1list_panel$1category$1body_1);
          return;
        }
        _jspx_tagPool_liferay$1application$1list_panel$1category$1body_panelCategory_nobody.reuse(_jspx_th_liferay$1application$1list_panel$1category$1body_1);
        out.write("\n");
        out.write("\t\t\t\t\t</li>\n");
        out.write("\t\t\t\t</ul>\n");
        out.write("\t\t\t");
}
        out.write("\n");
        out.write("\t\t");
        out.write('\n');
        out.write('	');
}
        out.write('\n');
      }
      if (_jspx_th_liferay$1application$1list_panel$1category_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_liferay$1application$1list_panel$1category_showBody_panelCategory.reuse(_jspx_th_liferay$1application$1list_panel$1category_0);
        return;
      }
      _jspx_tagPool_liferay$1application$1list_panel$1category_showBody_panelCategory.reuse(_jspx_th_liferay$1application$1list_panel$1category_0);
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_liferay$1ui_message_0(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1application$1list_panel$1category_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_0 = (com.liferay.taglib.ui.MessageTag) _jspx_tagPool_liferay$1ui_message_key_nobody.get(com.liferay.taglib.ui.MessageTag.class);
    _jspx_th_liferay$1ui_message_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1application$1list_panel$1category_0);
    _jspx_th_liferay$1ui_message_0.setKey("scope");
    int _jspx_eval_liferay$1ui_message_0 = _jspx_th_liferay$1ui_message_0.doStartTag();
    if (_jspx_th_liferay$1ui_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_liferay$1ui_message_key_nobody.reuse(_jspx_th_liferay$1ui_message_0);
      return true;
    }
    _jspx_tagPool_liferay$1ui_message_key_nobody.reuse(_jspx_th_liferay$1ui_message_0);
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_1(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1application$1list_panel$1category_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_1 = (com.liferay.taglib.ui.MessageTag) _jspx_tagPool_liferay$1ui_message_key_nobody.get(com.liferay.taglib.ui.MessageTag.class);
    _jspx_th_liferay$1ui_message_1.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1application$1list_panel$1category_0);
    _jspx_th_liferay$1ui_message_1.setKey("default-scope");
    int _jspx_eval_liferay$1ui_message_1 = _jspx_th_liferay$1ui_message_1.doStartTag();
    if (_jspx_th_liferay$1ui_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_liferay$1ui_message_key_nobody.reuse(_jspx_th_liferay$1ui_message_1);
      return true;
    }
    _jspx_tagPool_liferay$1ui_message_key_nobody.reuse(_jspx_th_liferay$1ui_message_1);
    return false;
  }

  private boolean _jspx_meth_aui_icon_0(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1application$1list_panel$1category_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:icon
    com.liferay.taglib.aui.IconTag _jspx_th_aui_icon_0 = (com.liferay.taglib.aui.IconTag) _jspx_tagPool_aui_icon_markupView_image_nobody.get(com.liferay.taglib.aui.IconTag.class);
    _jspx_th_aui_icon_0.setPageContext(_jspx_page_context);
    _jspx_th_aui_icon_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1application$1list_panel$1category_0);
    _jspx_th_aui_icon_0.setImage("cog");
    _jspx_th_aui_icon_0.setMarkupView("lexicon");
    int _jspx_eval_aui_icon_0 = _jspx_th_aui_icon_0.doStartTag();
    if (_jspx_th_aui_icon_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_aui_icon_markupView_image_nobody.reuse(_jspx_th_aui_icon_0);
      return true;
    }
    _jspx_tagPool_aui_icon_markupView_image_nobody.reuse(_jspx_th_aui_icon_0);
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_2(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1application$1list_panel$1category_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_2 = (com.liferay.taglib.ui.MessageTag) _jspx_tagPool_liferay$1ui_message_key_nobody.get(com.liferay.taglib.ui.MessageTag.class);
    _jspx_th_liferay$1ui_message_2.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1application$1list_panel$1category_0);
    _jspx_th_liferay$1ui_message_2.setKey("default-scope");
    int _jspx_eval_liferay$1ui_message_2 = _jspx_th_liferay$1ui_message_2.doStartTag();
    if (_jspx_th_liferay$1ui_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_liferay$1ui_message_key_nobody.reuse(_jspx_th_liferay$1ui_message_2);
      return true;
    }
    _jspx_tagPool_liferay$1ui_message_key_nobody.reuse(_jspx_th_liferay$1ui_message_2);
    return false;
  }
}
