<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'usermain.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">

	</head>

	<body>
		欢迎：总公司管理员
		<br>
		<input type="button" value="信息查询"
			onclick="window.location='companycheck.jsp'" />
		<br>
		<br>
		<s:form action="SearchAllNumberAction.action" method="POST">
			<s:submit id="Submit" value="班次管理"></s:submit>
		</s:form>
		<br>
		<br>
		<s:form action="SearchAllSubsiteAction.action" method="POST">
			<s:submit id="Submit" value="配送点管理"></s:submit>
		</s:form>
		<br>
		<br>
		<s:form action="SearchAllSiteAdminAction" method="POST">
			<s:submit id="Submit" value="管理员管理"></s:submit>
		</s:form>
		<s:form action="SearchAllRouteAction" method="POST">
			<s:submit id="Submit" value="线路管理"></s:submit>
		</s:form>
		<br>
		<br>
	</body>
</html>
