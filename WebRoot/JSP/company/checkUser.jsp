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
	<a href="#">收藏网页</a> 您好,<%=session.getAttribute("token")%><a href="LoginOutAction.action">注销</a>
	<jsp:include page="navi.jsp"></jsp:include>
	<div id="left" style="margin-top: 100px; margin-left: 100px;">
	<h2>查询用户</h2>
		输入用户名：<input type="text" />  <input type="button" value="查询">
		<p>
		<h3>基本信息</h3>
		用户名<input type="text" value="jason69135">
			姓名<input type="text" value="杨帆">
			手机<input type="text" value="15210584319"> 
			发货地址<input type="text" value="海淀区-交大配送点"> 
	<p>
	</div>
</body>
</html>
