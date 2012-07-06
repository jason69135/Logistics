<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="beans.Siteadmin"%>
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

		<title>My JSP 'companyadmin.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">

	</head>

	<body>
		<s:form action="" method="POST">
			<s:textfield label="订单编号" name="orderno"></s:textfield>
			<s:submit id="Submit" value="查询管理员"></s:submit>
		</s:form>
		<s:form action="" method="POST">
			<s:textfield label="用户姓名" name="cusname"></s:textfield>
			<s:submit id="Submit" value="添加管理员"></s:submit>
		</s:form>
		<s:form action="" method="POST">
			<s:textfield label="用户姓名" name="cusname"></s:textfield>
			<s:submit id="Submit" value="删除管理员"></s:submit>
		</s:form>
		管理员信息：
		<br>
		<%
			List<Siteadmin> list = (List) session.getAttribute("siteadminlist");
			for (int i = 0; i < list.size(); i++) {
				out.println("id:" + list.get(i).getId());
				out.println("<br>");
				out.println("一级管理员姓名:" + list.get(i).getUsername());
				out.println("<br>");
				out.println("密码" + list.get(i).getPassword());
				out.println("<br>");
				out.println("权限:" + list.get(i).getRight());
				out.println("<br>");
				out.println("所属一级站点:" + list.get(i).getSiteid());
				out.println("<br>");
			}
		%>
	</body>
</html>
