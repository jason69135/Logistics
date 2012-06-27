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
	<ul id="menu">
		<li class="menu"><a href="#">首页</a></li>
		<li class="menu"><a href="#">我的配送</a>
			<ul>
				<li><a href="#">我的订单</a></li>
				<li><a href="#">我的账单</a></li>
				<li><a href="#">联系人管理</a></li>
				<li><a href="#">在线理赔</a></li>
				<li><a href="#">站内信息</a></li>
				<li><a href="#">个人资料设置</a></li>
			</ul>
		</li>
		<li class="menu"><a href="#">网上托运</a>
			<ul>
				<li><a href="#">网上下单</a></li>
				<li><a href="#">价格查询</a></li>
				<li><a href="#">站点查询</a></li>
			</ul>
		</li>
		<li class="menu"><a href="#">追踪与收货</a>
			<ul>
				<li><a href="#">货物追踪</a></li>
				<li><a href="#">我的收货单</a></li>
			</ul>
		</li>
	</ul>
	账户信息
	<a href="#">刷新</a> 您好,<%=session.getAttribute("username")%><a href="#">注销</a>
	<ul>
		<li>运输中订单<a href="#"><%=session.getAttribute("transOrder")%></a>
		</li>
		<li>代付款订单<a href="#"><%=session.getAttribute("toPayOrder")%></a>
		</li>
		<li>未读站内信<a href="#"><%=session.getAttribute("siteMessage")%></a>
		</li>
	</ul>
	<a href="OrderBillAction.action">我要下单</a>
	<ul id="menu">
		<li class="menu">我的订单
			<ul>
				<li><a href="#">订单管理</a></li>
			</ul>
		</li>
		<li class="menu">我的账单
			<ul>
				<li><a href="#">我要支付</a></li>
				<li><a href="#">已有账单</a></li>
				<li><a href="#">代收货款</a></li>
			</ul>
		</li>
		<li class="menu"><a href="#">联系人管理</a></li>
		<li class="menu"><a href="#">在线理赔</a></li>
		<li class="menu"><a href="#">站内消息</a></li>
		<li class="menu"><a href="#">个人资料设置</a></li>
	</ul>
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
