<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="../../css/style.css" type="text/css"/>
<script type='text/javascript' src='../../js/jquery.min.js'></script>
<script type="text/javascript" language="javascript" src="../../js/jquery.dropdown.js"></script>
<div id="page-wrap">
	<ul class="dropdown">
	<li><a href="login.jsp">首页</a></li>
	
	<li><a href="#">我的物流</a>
		<ul class="sub_menu">
			<li><a href="myOrder.jsp">我的订单</a></li>
			<li><a href="myPaidOrder.jsp">我的账单</a></li>
			<li><a href="payBack.jsp">在线理赔</a></li>
			<li><a href="Message.jsp">站内消息</a></li>
			<li><a href="personSet.jsp">个人信息设置</a></li>
			<li><a href="trackGood.jsp">货物追踪</a></li>
		</ul>
	</li>
	<li ><a href="#">网上托运</a>
		<ul class="sub_menu">
			<li><a href="makeOrder.jsp">网上下单</a></li>
			<li><a href="checkFee.jsp">运费查询</a></li>
			<li><a href="checkStation.jsp">网点查询</a></li>
		</ul>
	</li>
</ul>
</div>