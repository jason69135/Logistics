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
	<h2>查询订单</h2>
		输入订单编号：<input type="text" />  <input type="button" value="查询">
		<table border="1">
		<tr>
			<th>订单号</th>
			<th>发货人</th>
			<th>发货配送点</th>
			<th>收货人</th>
			<th>应到配送点</th>
			<th>运费(元)</th>
			<th>是否加急</th>
			<th>班次</th>
			<th>审核状态</th>
		</tr>
		<tr>
			<td>1001</td>
			<td>杨帆</td>
			<td>交大配送点</td>
			<td>过云峰</td>
			<td>三里屯配送点</td>
			<td>40</td>
			<td>否</td>
			<td>1</td>
			<td>未审核</td>
		</tr>
		</table>
		</div>
	<p>
</body>
</html>
