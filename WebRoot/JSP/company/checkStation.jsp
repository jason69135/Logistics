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
<h2>�����ѯ</h2>
	<li>���������͵�
		<ul class="sub_menu">
			<li>�������͵�</li>
			<li>�в����͵�</li>
		</ul>
	</li>
	<p></p>
	<li>���������͵�
		<ul class="sub_menu">
			<li>ó�����͵�</li>
			<li>���������͵�</li>
		</ul>
	</li>
	</div>
</body>
</html>