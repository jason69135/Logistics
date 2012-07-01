<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>

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
<title>My JSP 'index.jsp' starting page</title>
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
	<a href="LoginAction.action">µÇÂ½</a>
	<form method="POST">
		¹ÜÀíÔ±µÇê‘ <input type="text" name="username" /> <input type="password"
			name="password" /> <input type="submit" value="µÇÂ½" onclick=window.open("JSP/company/login.jsp")>
	</form>
</body>
</html>