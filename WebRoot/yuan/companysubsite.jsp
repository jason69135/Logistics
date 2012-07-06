<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page import="beans.Site"%>
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

		<title>My JSP 'companysite.jsp' starting page</title>

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
			<s:submit id="Submit" value="查询班次"></s:submit>
		</s:form>
		<s:form action="" method="POST">
			<s:textfield label="用户姓名" name="cusname"></s:textfield>
			<s:submit id="Submit" value="添加班次"></s:submit>
		</s:form>
		<s:form action="" method="POST">
			<s:textfield label="用户姓名" name="cusname"></s:textfield>
			<s:submit id="Submit" value="删除班次"></s:submit>
			</s:form>
		站点信息：
		<br>
		<%
			List<Site> list = (List) session.getAttribute("sitelist");
			for (int i = 0; i < list.size(); i++) {
				out.println("id号:" + list.get(i).getId());
				out.println("<br>");
				out.println("二级站点名称:" + list.get(i).getSitename());
				out.println("<br>");
			}
		%>
	</body>
</html>
