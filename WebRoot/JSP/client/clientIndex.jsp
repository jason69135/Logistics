<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
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
<body>&nbsp;&nbsp;&nbsp; <a href="#">�ղ���ҳ</a>
	<a href="LoginAction.action">��½</a>/������
	<a href="RegisterAction.action">ע��</a>/������
	<jsp:include page="navi.jsp"></jsp:include>
	<div id="content">
	<div id="left" style="margin-top: 100px;margin-left: 100px;">
	<form method="POST">
		��¼ �ҵ��˻� <input type="text" name="username" /> <input type="password"
			name="password" /> <input type="submit" value="��½" onclick=window.open("login.jsp")>
			��ס����   �������룿
	</form>
	����һվʽ����,����
	<a href="RegisterAction.action">ע��</a>
	<p>
	<p>
	<h3><a href="OrderBillAction.action">�����µ�</a></h3>
	<ul>
		<li><h3><a href="ManageBillAction.action">��������</a></h3>
		</li>
		<li><h3><a href="PayBillAction.action">��Ҫ֧��</a></h3>
		</li>
		<li><h3><a href="ArgueAction.action">��������</a></h3>
		</li>
	</ul>
	</div>
	<p>
	<div id="right" style="margin-top: -140px;margin-left: 700px;">
	<form action="#" method="POST">
		<h3>�����ѯ ������������</h3><input type="text" name="site.city"> <input
			type="button" value="��ѯ">
		<h3>�����ѯ ���������ڷ����</h3><input type="text" name="site.city"> <input
			type="button" value="��ѯ">
	</form>
	<form action="#" method="POST">
		<h3>�˷Ѳ�ѯ</h3> ��������<input type="text" name="srcCity"> �ջ�����<input
			type="text" name="tarCity"> <input type="button" value="��ѯ">
	</form>
	</div>
	</div>
</body>
</html>