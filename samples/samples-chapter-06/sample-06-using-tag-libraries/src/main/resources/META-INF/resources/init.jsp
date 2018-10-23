<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<!-- Clay -->

<%@ taglib prefix="clay" uri="http://liferay.com/tld/clay" %>

<!-- Chart -->

<%@ page import="com.liferay.frontend.taglib.chart.model.point.bar.BarChartConfig" %>

<%@ taglib prefix="chart" uri="http://liferay.com/tld/chart" %>

<%
	BarChartConfig barChartConfig = (BarChartConfig)request.getAttribute("chartSample");
%>

<liferay-theme:defineObjects />


