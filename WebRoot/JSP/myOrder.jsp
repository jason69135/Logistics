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
	<a href="#">�ղ���ҳ</a> ����,<%=session.getAttribute("token")%><a
		href="LoginOutAction.action">ע��</a>
	<jsp:include page="navi.jsp"></jsp:include>
	<jsp:include page="include/sidebar.jsp"></jsp:include>
	<h2>��������</h2>
	<a href="#">����֧��</a>
	<a href="#">��������</a>
	<a href="#">�˵���¼</a>
	<a href="#">��Ҫ����</a>
	<a href="#">�޸�����</a>
	<h2>���¶������</h2>
	<table border="1">
		<tr>
			<th>������</th>
			<th>�˵���</th>
			<th>�ջ���</th>
			<th>��������</th>
			<th>�µ�����</th>
			<th>����״̬</th>
			<th>�˷�(Ԫ)</th>
			<th>֧����ʽ</th>
			<th>����</th>
		</tr>
		<tr>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
	</table>
</body>
</html>
