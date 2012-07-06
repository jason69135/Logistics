<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page import="beans.Route"%>
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

		<title>My JSP 'companyroute.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

	</head>

	<body>
		<s:form action="" method="POST">
			<s:textfield label="订单编号" name="orderno"></s:textfield>
			<s:submit id="Submit" value="添加路线"></s:submit>
		</s:form>
		<s:form action="" method="POST">
			<s:textfield label="用户姓名" name="cusname"></s:textfield>
			<s:submit id="Submit" value="删除路线"></s:submit>
		</s:form>
		<s:form action="" method="POST">
			<s:textfield label="用户姓名" name="cusname"></s:textfield>
			<s:submit id="Submit" value="查询路线"></s:submit>
		</s:form>
		全部班次：
		<br>
		<%
			List<Route> list = (List) session.getAttribute("routelist");
			for (int i = 0; i < list.size(); i++) {
				out.println("路径 id:" + list.get(i).getId());
				out.println("<br>");
				out.println("起始id:" + list.get(i).getStartsiteid());
				out.println("<br>");
				out.println("目的id:" + list.get(i).getFinishsiteid());
				out.println("<br>");
				out.println("经过id:" + list.get(i).getPass());
				out.println("<br>");
			}
		%>
	</body>
</html>
