<%@ taglib prefix="s" uri="/struts-tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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

		<title>My JSP 'userlogin.jsp' starting page</title>

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
		<s:form action="UserLoginAction.action" method="POST">
			<s:textfield label="用户名" name="customer.username"></s:textfield>
			<s:password label="密码" name="customer.password"></s:password>
			<s:submit id="Submit" value="登陆"></s:submit>
		</s:form>
		
		<s:form action="UserRegisterAction.action" method="POST">
			<s:textfield label="用户名" name="customer.username"></s:textfield>
			<s:password label="密码" name="customer.password"></s:password>
			<s:submit id="Submit" value="登陆"></s:submit>
		</s:form>
	</body>
</html>
