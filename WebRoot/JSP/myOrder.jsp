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
	<ul id="menu">
		<li class="menu"><a href="#">��ҳ</a></li>
		<li class="menu"><a href="#">�ҵ�����</a>
			<ul>
				<li><a href="#">�ҵĶ���</a></li>
				<li><a href="#">�ҵ��˵�</a></li>
				<li><a href="#">��ϵ�˹���</a></li>
				<li><a href="#">��������</a></li>
				<li><a href="#">վ����Ϣ</a></li>
				<li><a href="#">������������</a></li>
			</ul>
		</li>
		<li class="menu"><a href="#">��������</a>
			<ul>
				<li><a href="#">�����µ�</a></li>
				<li><a href="#">�۸��ѯ</a></li>
				<li><a href="#">վ���ѯ</a></li>
			</ul>
		</li>
		<li class="menu"><a href="#">׷�����ջ�</a>
			<ul>
				<li><a href="#">����׷��</a></li>
				<li><a href="#">�ҵ��ջ���</a></li>
			</ul>
		</li>
	</ul>
	�˻���Ϣ
	<a href="#">ˢ��</a> ����,<%=session.getAttribute("username")%><a href="#">ע��</a>
	<ul>
		<li>�����ж���<a href="#"><%=session.getAttribute("transOrder")%></a>
		</li>
		<li>�������<a href="#"><%=session.getAttribute("toPayOrder")%></a>
		</li>
		<li>δ��վ����<a href="#"><%=session.getAttribute("siteMessage")%></a>
		</li>
	</ul>
	<a href="OrderBillAction.action">��Ҫ�µ�</a>
	<ul id="menu">
		<li class="menu">�ҵĶ���
			<ul>
				<li><a href="#">��������</a></li>
			</ul>
		</li>
		<li class="menu">�ҵ��˵�
			<ul>
				<li><a href="#">��Ҫ֧��</a></li>
				<li><a href="#">�����˵�</a></li>
				<li><a href="#">���ջ���</a></li>
			</ul>
		</li>
		<li class="menu"><a href="#">��ϵ�˹���</a></li>
		<li class="menu"><a href="#">��������</a></li>
		<li class="menu"><a href="#">վ����Ϣ</a></li>
		<li class="menu"><a href="#">������������</a></li>
	</ul>
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
