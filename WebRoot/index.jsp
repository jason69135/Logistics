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
	<a href="#">�ղ���ҳ</a>
	<a href="LoginAction.action">��½</a>
	<a href="RegisterAction.action">ע��</a>
	<ul>
		<li>��ҳ</li>
		<li>�ҵ�����</li>
		<li>��������</li>
		<li>׷�����ջ�</li>
		<li>ҵ�����</li>
		<li>����**</li>
	</ul>
	<form action="LoginAction.action" method="POST">
		����ҵ�**
		<input type="text" name="visitor.username"/>
		<input type="password" name="visitor.password"/>
		<input type="button" value="��½">
	</form>
	����һվʽ����,����<a href="RegisterAction.action">ע��</a>
	<a href="OrderBillAction.action">�����µ�</a>
	<ul>
		<li><a href="ManageBillAction.action">��������</a></li>
		<li><a href="PayBillAction.action">��Ҫ֧��</a></li>
		<li><a href="#">��Ҫ֧��</a></li>
		<li><a href="ArgueAction.action">��������</a></li>
	</ul>
	<form action="TrackGoodsAction.action" method="POST">
		����׷��
		�������˵���<input type="text" name="order.number">
		<input type="button" value="��ѯ">
	</form>
	<form action="#" method="POST">
		�����ѯ
		���������ڳ���<input type="text" name="site.city">
		<input type="button" value="��ѯ">
	</form>
	<form action="#" method="POST">
		����׷��
		��������<input type="text" name="srcCity">
		�ջ�����<input type="text" name="tarCity">
		<input type="button" value="��ѯ">
	</form>
</body>
</html>