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
</head>
<body>
	<a style="float:right" href="LoginAction.action">�˳�</a>
����Ա:<a href="#">jason</a>
<jsp:include page="navi.jsp"></jsp:include>
	<div id="left" style="margin-top: 100px; margin-left: 100px;">
	<h3>�������</h3>
	<table border="1">
		<tr>
			<th>������</th>
			<th>������</th>
			<th>�������͵�</th>
			<th>�ջ���</th>
			<th>Ӧ�����͵�</th>
			<th>�˷�(Ԫ)</th>
			<th>�Ƿ�Ӽ�</th>
			<th>���</th>
		</tr>
		<tr>
			<td>1002</td>
			<td>���Ʒ�</td>
			<td>ó�����͵�</td>
			<td>ԭҰ</td>
			<td>�������͵�</td>
			<td>30</td>
			<td>��</td>
			<td>3</td>
			<td><input type="checkbox"/></td>
		</tr>
		<tr>
			<td>1009</td>
			<td>���ĳ�</td>
			<td>���������͵�</td>
			<td>ԭҰ</td>
			<td>�������͵�</td>
			<td>35</td>
			<td>��</td>
			<td>1</td>
			<td><input type="checkbox"/></td>
		</tr>
	</table>
	</div>
</body>
</html>