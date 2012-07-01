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
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
-->
</head>
<body>&nbsp;&nbsp;&nbsp; <a href="#">收藏网页</a>
	<a href="LoginAction.action">登陆</a>/在右面
	<a href="RegisterAction.action">注册</a>/在右面
	<jsp:include page="navi.jsp"></jsp:include>
	<div id="content">
	<div id="left" style="margin-top: 100px;margin-left: 100px;">
	<form method="POST">
		登录 我的账户 <input type="text" name="username" /> <input type="password"
			name="password" /> <input type="submit" value="登陆" onclick=window.open("login.jsp")>
			记住密码   忘记密码？
	</form>
	享受一站式服务,请先
	<a href="RegisterAction.action">注册</a>
	<p>
	<p>
	<h3><a href="OrderBillAction.action">网上下单</a></h3>
	<ul>
		<li><h3><a href="ManageBillAction.action">订单管理</a></h3>
		</li>
		<li><h3><a href="PayBillAction.action">我要支付</a></h3>
		</li>
		<li><h3><a href="ArgueAction.action">在线理赔</a></h3>
		</li>
	</ul>
	</div>
	<p>
	<div id="right" style="margin-top: -140px;margin-left: 700px;">
	<form action="#" method="POST">
		<h3>网点查询 请输入所在区</h3><input type="text" name="site.city"> <input
			type="button" value="查询">
		<h3>网点查询 请输入所在分配点</h3><input type="text" name="site.city"> <input
			type="button" value="查询">
	</form>
	<form action="#" method="POST">
		<h3>运费查询</h3> 发货城市<input type="text" name="srcCity"> 收货城市<input
			type="text" name="tarCity"> <input type="button" value="查询">
	</form>
	</div>
	</div>
</body>
</html>