package org.apache.jsp.card.vertical_005fcard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.frontend.taglib.servlet.taglib.ManagementBarFilterItem;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.dao.search.ResultRow;
import com.liferay.portal.kernel.dao.search.RowChecker;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.portlet.PortletURLUtil;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.taglib.aui.AUIUtil;
import com.liferay.taglib.util.TagResourceBundleUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;
import javax.portlet.PortletURL;
import javax.servlet.ServletContext;

public final class page_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(13);
    _jspx_dependants.add("/card/vertical_card/init.jsp");
    _jspx_dependants.add("/card/init.jsp");
    _jspx_dependants.add("/init.jsp");
    _jspx_dependants.add("/META-INF/c.tld");
    _jspx_dependants.add("/META-INF/liferay-portlet_2_0.tld");
    _jspx_dependants.add("/META-INF/liferay-aui.tld");
    _jspx_dependants.add("/META-INF/liferay-clay.tld");
    _jspx_dependants.add("/META-INF/liferay-frontend.tld");
    _jspx_dependants.add("/META-INF/liferay-theme.tld");
    _jspx_dependants.add("/META-INF/liferay-ui.tld");
    _jspx_dependants.add("/META-INF/liferay-util.tld");
    _jspx_dependants.add("/card/vertical_card/start.jspf");
    _jspx_dependants.add("/card/vertical_card/end.jspf");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_aui_a_title_onClick_href;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_liferay$1theme_defineObjects_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_aui_a_href;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_liferay$1util_buffer_var;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_liferay$1util_include_servletContext_page_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_aui_input_wrappedField_value_useNamespace_type_title_name_label_id_disabled_data_cssClass_checked_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_portlet_defineObjects_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_aui_a_title_onClick_href = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_liferay$1theme_defineObjects_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_aui_a_href = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_liferay$1util_buffer_var = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_liferay$1util_include_servletContext_page_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_aui_input_wrappedField_value_useNamespace_type_title_name_label_id_disabled_data_cssClass_checked_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_portlet_defineObjects_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_aui_a_title_onClick_href.release();
    _jspx_tagPool_liferay$1theme_defineObjects_nobody.release();
    _jspx_tagPool_aui_a_href.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_liferay$1util_buffer_var.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_liferay$1util_include_servletContext_page_nobody.release();
    _jspx_tagPool_aui_input_wrappedField_value_useNamespace_type_title_name_label_id_disabled_data_cssClass_checked_nobody.release();
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
      out.write('\n');
      out.write('\n');
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
      out.write("\n");
      out.write("\n");
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

PortletRequest portletRequest = (PortletRequest)request.getAttribute(JavaConstants.JAVAX_PORTLET_REQUEST);

PortletResponse portletResponse = (PortletResponse)request.getAttribute(JavaConstants.JAVAX_PORTLET_RESPONSE);

String namespace = AUIUtil.getNamespace(portletRequest, portletResponse);

if (Validator.isNull(namespace)) {
	namespace = AUIUtil.getNamespace(request);
}

String currentURL = null;

if ((portletRequest != null) && (portletResponse != null)) {
	PortletURL currentURLObj = PortletURLUtil.getCurrent(PortalUtil.getLiferayPortletRequest(portletRequest), PortalUtil.getLiferayPortletResponse(portletResponse));

	currentURL = currentURLObj.toString();
}
else {
	currentURL = PortalUtil.getCurrentURL(request);
}

ResourceBundle resourceBundle = TagResourceBundleUtil.getResourceBundle(request, locale);

      out.write('\n');
      out.write('\n');

String actionJsp = (String)request.getAttribute("liferay-frontend:card:actionJsp");
ServletContext actionJspServletContext = (ServletContext)request.getAttribute("liferay-frontend:card:actionJspServletContext");
boolean checkboxChecked = GetterUtil.getBoolean(request.getAttribute("liferay-frontend:card:checkboxChecked"));
String checkboxCSSClass = (String)request.getAttribute("liferay-frontend:card:checkboxCSSClass");
Map<String, Object> checkboxData = (Map<String, Object>)request.getAttribute("liferay-frontend:card:checkboxData");
boolean checkboxDisabled = GetterUtil.getBoolean(request.getAttribute("liferay-frontend:card:checkboxDisabled"));
String checkboxId = (String)request.getAttribute("liferay-frontend:card:checkboxId");
String checkboxName = (String)request.getAttribute("liferay-frontend:card:checkboxName");
String checkboxValue = (String)request.getAttribute("liferay-frontend:card:checkboxValue");
String cssClass = (String)request.getAttribute("liferay-frontend:card:cssClass");
Map<String, Object> data = (Map<String, Object>)request.getAttribute("liferay-frontend:card:data");
String imageCSSClass = (String)request.getAttribute("liferay-frontend:card:imageCSSClass");
String imageUrl = (String)request.getAttribute("liferay-frontend:card:imageUrl");
ResultRow resultRow = (ResultRow)request.getAttribute("liferay-frontend:card:resultRow");
RowChecker rowChecker = (RowChecker)request.getAttribute("liferay-frontend:card:rowChecker");
boolean showCheckbox = GetterUtil.getBoolean(request.getAttribute("liferay-frontend:card:showCheckbox"));
String url = (String)request.getAttribute("liferay-frontend:card:url");

      out.write('\n');
      out.write('\n');

boolean backgroundImage = GetterUtil.getBoolean(request.getAttribute("liferay-frontend:card:backgroundImage"));
String footer = (String)request.getAttribute("liferay-frontend:card:footer");
String header = (String)request.getAttribute("liferay-frontend:card:header");
String onClick = (String)request.getAttribute("liferay-frontend:card:onClick");
String stickerBottom = GetterUtil.getString(request.getAttribute("liferay-frontend:card:stickerBottom"));
String subtitle = (String)request.getAttribute("liferay-frontend:card:subtitle");
String title = (String)request.getAttribute("liferay-frontend:card:title");

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"taglib-vertical-card ");
      out.print( Validator.isNotNull(cssClass) ? cssClass : StringPool.BLANK );
      out.write(' ');
      out.print( showCheckbox ? "selectable" : StringPool.BLANK );
      out.write('"');
      out.write(' ');
      out.print( AUIUtil.buildData(data) );
      out.write(">\n");
      out.write("\t");
      out.write("\n");
      out.write("\t\t");
if (
 (rowChecker != null) && (resultRow != null) ) {
      out.write("\n");
      out.write("\t\t\t");
      //  liferay-util:buffer
      com.liferay.taglib.util.BufferTag _jspx_th_liferay$1util_buffer_0 = (com.liferay.taglib.util.BufferTag) _jspx_tagPool_liferay$1util_buffer_var.get(com.liferay.taglib.util.BufferTag.class);
      _jspx_th_liferay$1util_buffer_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1util_buffer_0.setParent(null);
      _jspx_th_liferay$1util_buffer_0.setVar("checkboxInput");
      int _jspx_eval_liferay$1util_buffer_0 = _jspx_th_liferay$1util_buffer_0.doStartTag();
      if (_jspx_eval_liferay$1util_buffer_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_liferay$1util_buffer_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_liferay$1util_buffer_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_liferay$1util_buffer_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("\t\t\t\t");
          out.print( rowChecker.getRowCheckBox(request, rowChecker.isChecked(resultRow.getObject()), rowChecker.isDisabled(resultRow.getObject()), resultRow.getPrimaryKey()) );
          out.write("\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_liferay$1util_buffer_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_liferay$1util_buffer_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_liferay$1util_buffer_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_liferay$1util_buffer_var.reuse(_jspx_th_liferay$1util_buffer_0);
        return;
      }
      _jspx_tagPool_liferay$1util_buffer_var.reuse(_jspx_th_liferay$1util_buffer_0);
      java.lang.String checkboxInput = null;
      checkboxInput = (java.lang.String) _jspx_page_context.findAttribute("checkboxInput");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t");
if (
 Validator.isNotNull(checkboxInput) ) {
      out.write("\n");
      out.write("\t\t\t\t<div class=\"checkbox checkbox-card checkbox-top-left\">\n");
      out.write("\t\t\t\t\t<label>\n");
      out.write("\t\t\t\t\t\t");
      out.print( checkboxInput );
      out.write("\n");
      out.write("\t\t\t\t\t</label>\n");
      out.write("\t\t\t");
}
      out.write("\n");
      out.write("\t\t");
      out.write("\n");
      out.write("\t\t");
}
else if (
 showCheckbox ) {
      out.write("\n");
      out.write("\t\t\t<div class=\"checkbox checkbox-card checkbox-top-left\">\n");
      out.write("\t\t\t\t<label>\n");
      out.write("\t\t\t\t\t");
      //  aui:input
      com.liferay.taglib.aui.InputTag _jspx_th_aui_input_0 = (com.liferay.taglib.aui.InputTag) _jspx_tagPool_aui_input_wrappedField_value_useNamespace_type_title_name_label_id_disabled_data_cssClass_checked_nobody.get(com.liferay.taglib.aui.InputTag.class);
      _jspx_th_aui_input_0.setPageContext(_jspx_page_context);
      _jspx_th_aui_input_0.setParent(null);
      _jspx_th_aui_input_0.setChecked( checkboxChecked );
      _jspx_th_aui_input_0.setCssClass( checkboxCSSClass );
      _jspx_th_aui_input_0.setData( checkboxData );
      _jspx_th_aui_input_0.setDisabled( checkboxDisabled );
      _jspx_th_aui_input_0.setId( checkboxId );
      _jspx_th_aui_input_0.setLabel("");
      _jspx_th_aui_input_0.setName( checkboxName );
      _jspx_th_aui_input_0.setTitle( LanguageUtil.format(request, "select-x", new Object[] {HtmlUtil.escape(title)}) );
      _jspx_th_aui_input_0.setType("checkbox");
      _jspx_th_aui_input_0.setUseNamespace( false );
      _jspx_th_aui_input_0.setValue( checkboxValue );
      _jspx_th_aui_input_0.setWrappedField( true );
      int _jspx_eval_aui_input_0 = _jspx_th_aui_input_0.doStartTag();
      if (_jspx_th_aui_input_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_aui_input_wrappedField_value_useNamespace_type_title_name_label_id_disabled_data_cssClass_checked_nobody.reuse(_jspx_th_aui_input_0);
        return;
      }
      _jspx_tagPool_aui_input_wrappedField_value_useNamespace_type_title_name_label_id_disabled_data_cssClass_checked_nobody.reuse(_jspx_th_aui_input_0);
      out.write("\n");
      out.write("\t\t\t\t</label>\n");
      out.write("\t\t");
      out.write('\n');
      out.write('	');
}
      out.write("\n");
      out.write("\n");
      out.write("\t\t<div class=\"card\">");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"aspect-ratio ");
      out.print( imageCSSClass );
      out.write(' ');
      out.print( backgroundImage ? "aspect-ratio-bg-center aspect-ratio-bg-cover" : StringPool.BLANK );
      out.write("\" style=\"");
      out.print( backgroundImage ? "background-image: url('" + imageUrl + "')" : StringPool.BLANK );
      out.write("\">\n");
      out.write("\t");
      //  aui:a
      com.liferay.taglib.aui.ATag _jspx_th_aui_a_0 = (com.liferay.taglib.aui.ATag) _jspx_tagPool_aui_a_href.get(com.liferay.taglib.aui.ATag.class);
      _jspx_th_aui_a_0.setPageContext(_jspx_page_context);
      _jspx_th_aui_a_0.setParent(null);
      _jspx_th_aui_a_0.setHref( url );
      int _jspx_eval_aui_a_0 = _jspx_th_aui_a_0.doStartTag();
      if (_jspx_eval_aui_a_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t\t<img alt=\"\" class=\"");
        out.print( backgroundImage ? " sr-only" : StringPool.BLANK );
        out.write("\" src=\"");
        out.print( imageUrl );
        out.write("\" />\n");
        out.write("\t");
      }
      if (_jspx_th_aui_a_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_aui_a_href.reuse(_jspx_th_aui_a_0);
        return;
      }
      _jspx_tagPool_aui_a_href.reuse(_jspx_th_aui_a_0);
      out.write("\n");
      out.write("\n");
      out.write("\t");
if (
 Validator.isNotNull(stickerBottom) ) {
      out.write("\n");
      out.write("\t\t");
      out.print( stickerBottom );
      out.write('\n');
      out.write('	');
}
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t");
if (
 Validator.isNotNull(actionJsp) || Validator.isNotNull(footer) || Validator.isNotNull(header) || Validator.isNotNull(subtitle) || Validator.isNotNull(title) ) {
      out.write("\n");
      out.write("\t\t\t\t<div class=\"card-row card-row-layout-fixed card-row-padded card-row-valign-top taglib-vertical-card-footer\">\n");
      out.write("\t\t\t\t\t<div class=\"card-col-content lfr-card-details-column\">\n");
      out.write("\t\t\t\t\t\t");
if (
 Validator.isNotNull(header) ) {
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<span class=\"lfr-card-modified-by-text truncate-text\">\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.print( header );
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t");
}
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t");
if (
 Validator.isNotNull(title) ) {
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<span class=\"lfr-card-title-text truncate-text\">\n");
      out.write("\t\t\t\t\t\t\t\t");
      //  aui:a
      com.liferay.taglib.aui.ATag _jspx_th_aui_a_1 = (com.liferay.taglib.aui.ATag) _jspx_tagPool_aui_a_title_onClick_href.get(com.liferay.taglib.aui.ATag.class);
      _jspx_th_aui_a_1.setPageContext(_jspx_page_context);
      _jspx_th_aui_a_1.setParent(null);
      _jspx_th_aui_a_1.setHref( url );
      _jspx_th_aui_a_1.setOnClick( onClick );
      _jspx_th_aui_a_1.setTitle( HtmlUtil.escape(title) );
      int _jspx_eval_aui_a_1 = _jspx_th_aui_a_1.doStartTag();
      if (_jspx_eval_aui_a_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        out.print( HtmlUtil.escape(title) );
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t");
      }
      if (_jspx_th_aui_a_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_aui_a_title_onClick_href.reuse(_jspx_th_aui_a_1);
        return;
      }
      _jspx_tagPool_aui_a_title_onClick_href.reuse(_jspx_th_aui_a_1);
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t");
}
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t");
if (
 Validator.isNotNull(subtitle) ) {
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<span class=\"lfr-card-subtitle-text truncate-text\" title=\"");
      out.print( HtmlUtil.escape(subtitle) );
      out.write("\">\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.print( HtmlUtil.escape(subtitle) );
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t");
}
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t");
if (
 Validator.isNotNull(footer) ) {
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<span class=\"lfr-card-workflow-text truncate-text\">\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.print( footer );
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t");
}
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t");
      //  liferay-util:buffer
      com.liferay.taglib.util.BufferTag _jspx_th_liferay$1util_buffer_1 = (com.liferay.taglib.util.BufferTag) _jspx_tagPool_liferay$1util_buffer_var.get(com.liferay.taglib.util.BufferTag.class);
      _jspx_th_liferay$1util_buffer_1.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1util_buffer_1.setParent(null);
      _jspx_th_liferay$1util_buffer_1.setVar("actionJspBuffer");
      int _jspx_eval_liferay$1util_buffer_1 = _jspx_th_liferay$1util_buffer_1.doStartTag();
      if (_jspx_eval_liferay$1util_buffer_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_liferay$1util_buffer_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_liferay$1util_buffer_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_liferay$1util_buffer_1.doInitBody();
        }
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t");
          //  liferay-util:include
          com.liferay.taglib.util.IncludeTag _jspx_th_liferay$1util_include_0 = (com.liferay.taglib.util.IncludeTag) _jspx_tagPool_liferay$1util_include_servletContext_page_nobody.get(com.liferay.taglib.util.IncludeTag.class);
          _jspx_th_liferay$1util_include_0.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1util_include_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1util_buffer_1);
          _jspx_th_liferay$1util_include_0.setPage( actionJsp );
          _jspx_th_liferay$1util_include_0.setServletContext( actionJspServletContext );
          int _jspx_eval_liferay$1util_include_0 = _jspx_th_liferay$1util_include_0.doStartTag();
          if (_jspx_th_liferay$1util_include_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_liferay$1util_include_servletContext_page_nobody.reuse(_jspx_th_liferay$1util_include_0);
            return;
          }
          _jspx_tagPool_liferay$1util_include_servletContext_page_nobody.reuse(_jspx_th_liferay$1util_include_0);
          out.write("\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_liferay$1util_buffer_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_liferay$1util_buffer_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_liferay$1util_buffer_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_liferay$1util_buffer_var.reuse(_jspx_th_liferay$1util_buffer_1);
        return;
      }
      _jspx_tagPool_liferay$1util_buffer_var.reuse(_jspx_th_liferay$1util_buffer_1);
      java.lang.String actionJspBuffer = null;
      actionJspBuffer = (java.lang.String) _jspx_page_context.findAttribute("actionJspBuffer");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t");
if (
 Validator.isNotNull(actionJspBuffer) ) {
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"card-col-field lfr-card-actions-column\">\n");
      out.write("\t\t\t\t\t\t\t");
      out.print( actionJspBuffer );
      out.write("\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t");
}
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t");
}
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t");
      out.write("\n");
      out.write("\t\t");
if (
 (rowChecker != null) && (resultRow != null) ) {
      out.write("\n");
      out.write("\t\t\t");
      //  liferay-util:buffer
      com.liferay.taglib.util.BufferTag _jspx_th_liferay$1util_buffer_2 = (com.liferay.taglib.util.BufferTag) _jspx_tagPool_liferay$1util_buffer_var.get(com.liferay.taglib.util.BufferTag.class);
      _jspx_th_liferay$1util_buffer_2.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1util_buffer_2.setParent(null);
      _jspx_th_liferay$1util_buffer_2.setVar("checkboxInput");
      int _jspx_eval_liferay$1util_buffer_2 = _jspx_th_liferay$1util_buffer_2.doStartTag();
      if (_jspx_eval_liferay$1util_buffer_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_liferay$1util_buffer_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_liferay$1util_buffer_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_liferay$1util_buffer_2.doInitBody();
        }
        do {
          out.write("\n");
          out.write("\t\t\t\t");
          out.print( rowChecker.getRowCheckBox(request, rowChecker.isChecked(resultRow.getObject()), rowChecker.isDisabled(resultRow.getObject()), resultRow.getPrimaryKey()) );
          out.write("\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_liferay$1util_buffer_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_liferay$1util_buffer_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_liferay$1util_buffer_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_liferay$1util_buffer_var.reuse(_jspx_th_liferay$1util_buffer_2);
        return;
      }
      _jspx_tagPool_liferay$1util_buffer_var.reuse(_jspx_th_liferay$1util_buffer_2);
      java.lang.String checkboxInput = null;
      checkboxInput = (java.lang.String) _jspx_page_context.findAttribute("checkboxInput");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t");
if (
 Validator.isNotNull(checkboxInput) ) {
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t");
}
      out.write("\n");
      out.write("\t\t");
      out.write("\n");
      out.write("\t\t");
}
else if (
 showCheckbox ) {
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t");
      out.write('\n');
      out.write('	');
}
      out.write("\n");
      out.write("</div>");
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
}
