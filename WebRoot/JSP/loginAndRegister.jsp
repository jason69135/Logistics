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

<title>My JSP 'success.jsp' starting page</title>

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
	<a href="#">�ղ���ҳ</a>
	<a href="LoginAction.action">��½</a>
	<a href="RegisterAction.action">ע��</a>
	<jsp:include page="../html/navi.html" flush="true" />
	<h2>���¼��ע��</h2>ֻ��15��
	ע��
	<form action="RegisterAction.action" method="POST">
		�û�����<input type="text" name="username"/>
		�����ַ��<input type="text" name="email"/>
		���룺<input type="text" name="password"/>
		ȷ�����룺<input type="text" name="againPass"/>
		��֤��<input type="text" name="valid"/>
		<input type="submit" value="ע��"> 
	</form>
	��½
	<form action="LoginAction.action" method="POST">
		�û�����<input type="text" name="username"/>
		���룺<input type="text" name="password"/>
		<input type="submit" value="��½"> 
	</form>
</body>
</html>
