<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>My JSP 'success.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

</head>

<body>
	<a href="#">�ղ���ҳ</a> ����,<%=session.getAttribute("token")%><a href="LoginOutAction.action">ע��</a>
	<jsp:include page="navi.jsp"></jsp:include>
	<div id="left" style="margin-top: 100px; margin-left: 100px;">
	<h2>��ѯ����</h2>
		���붩����ţ�<input type="text" />  <input type="button" value="��ѯ">
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
			<th>���״̬</th>
		</tr>
		<tr>
			<td>1001</td>
			<td>�</td>
			<td>�������͵�</td>
			<td>���Ʒ�</td>
			<td>���������͵�</td>
			<td>40</td>
			<td>��</td>
			<td>1</td>
			<td>δ���</td>
		</tr>
		</table>
		</div>
	<p>
</body>
</html>
