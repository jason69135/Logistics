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
	<form action="LoginAction.action" method="post">
		�û��� <input type="text" name="visitor.username" /> ���� <input
			type="text" name="visitor.password" /> <input type="submit"
			value="��½" />
	</form>
	<form action="RegisterAction.action" method="post">
		�û��� <input type="text" name="visitor.username" /> ���� <input
			type="text" name="visitor.password" /> �ظ����� <input type="text"
			name="passwordAgain" />����<input type="text" name="visitor.email" /><input
			type="submit" value="ע��" />
	</form>
</body>
</html>