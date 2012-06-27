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
	<a href="#">收藏网页</a> 您好,<%=session.getAttribute("token")%><a
		href="LoginOutAction.action">注销</a>
	<jsp:include page="navi.jsp"></jsp:include>
	<jsp:include page="include/sidebar.jsp"></jsp:include>
	<h2>物流服务</h2>
	<a href="#">在线支付</a>
	<a href="#">订单管理</a>
	<a href="#">账单记录</a>
	<a href="#">我要理赔</a>
	<a href="#">修改密码</a>
	<h2>最新订单情况</h2>
	<table border="1">
		<tr>
			<th>订单号</th>
			<th>运单号</th>
			<th>收货人</th>
			<th>货物名称</th>
			<th>下单日期</th>
			<th>物流状态</th>
			<th>运费(元)</th>
			<th>支付方式</th>
			<th>操作</th>
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
