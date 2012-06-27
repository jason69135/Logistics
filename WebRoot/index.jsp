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
<title>My JSP 'index.jsp' starting page</title>
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
	<a href="#">收藏网页</a>
	<a href="LoginAction.action">登陆</a>
	<a href="RegisterAction.action">注册</a>
	<jsp:include page="html/navi.html" flush="true" />
	<form action="LoginAction.action" method="POST">
		登陸我的** <input type="text" name="username" /> <input type="password"
			name="password" /> <input type="submit" value="登陆">
	</form>
	享受一站式服务,请先
	<a href="RegisterAction.action">注册</a>
	<a href="OrderBillAction.action">网上下单</a>
	<ul>
		<li><a href="ManageBillAction.action">订单管理</a>
		</li>
		<li><a href="PayBillAction.action">我要支付</a>
		</li>
		<li><a href="#">我要支付</a>
		</li>
		<li><a href="ArgueAction.action">在线理赔</a>
		</li>
	</ul>
	<form action="TrackGoodsAction.action" method="POST">
		货物追踪 请输入运单号<input type="text" name="order.number"> <input
			type="button" value="查询">
	</form>
	<form action="#" method="POST">
		网点查询 请输入所在城市<input type="text" name="site.city"> <input
			type="button" value="查询">
	</form>
	<form action="#" method="POST">
		货物追踪 发货城市<input type="text" name="srcCity"> 收货城市<input
			type="text" name="tarCity"> <input type="button" value="查询">
	</form>
</body>
</html>