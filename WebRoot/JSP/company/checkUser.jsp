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
	<h2>��ѯ�û�</h2>
		�����û�����<input type="text" />  <input type="button" value="��ѯ">
		<p>
		<h3>������Ϣ</h3>
		�û���<input type="text" value="jason69135">
			����<input type="text" value="�">
			�ֻ�<input type="text" value="15210584319"> 
			������ַ<input type="text" value="������-�������͵�"> 
	<p>
	</div>
</body>
</html>
