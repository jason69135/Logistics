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
	<a style="float:right" href="LoginAction.action">退出</a>
管理员:<a href="#">jason</a>
<jsp:include page="navi.jsp"></jsp:include>
	<div id="left" style="margin-top: 100px; margin-left: 100px;">
	<h3>订单审核</h3>
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
			<th>损坏状态</th>
			<th>操作</th>
			<td></td>
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
			<td><a href="#">损坏</a>/<a href="#">未损坏</a></td>
			<td><a href="#">签收</a>/<a href="#">不批准</a></td>
			<td><input type="checkbox"></td>
		</tr>
		<tr>
			<td>1002</td>
			<td>杨帆</td>
			<td>交大配送点</td>
			<td>原野</td>
			<td>贸大配送点</td>
			<td>30</td>
			<td>是</td>
			<td>3</td>
			<td><a href="#">损坏</a>/<a href="#">未损坏</a></td>
			<td><a href="#">签收</a>/<a href="#">不批准</a></td>
			<td><input type="checkbox"></td>
		</tr>
	</table>
	<input type="checkbox"/>全选
	</div>
</body>
</html>