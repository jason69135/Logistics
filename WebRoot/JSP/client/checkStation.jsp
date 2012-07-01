<%-- 
    Document   : index
    Created on : 2012-6-27, 19:23:50
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="../../css/index.css" />
		<link rel="stylesheet" type="text/css" href="../../css/sider.css" />
		<link rel="stylesheet" type="text/css" href="../../css/header.css" />
		<link rel="stylesheet" type="text/css" href="../../css/style.css" />
		<script type='text/javascript' src='../../js/jquery.min.js'></script>
		<script type="text/javascript" language="javascript"
			src="../../js/jquery.dropdown.js"></script>

	</head>
	<body>
		<div id="bodyContent">
			<div id="navi">
				<div id="loginInfo">
					<a href="#">jason</a>
				</div>
				<div id="page-wrap">
					<ul class="dropdown">
						<li>
							<a href="#">我的物流</a>
							<ul class="sub_menu">
								<li>
									<a href="myOrder.jsp">我的订单</a>
								</li>
								<li>
									<a href="myPaidOrder.jsp">我的账单</a>
								</li>
								<li>
									<a href="payBack.jsp">在线理赔</a>
								</li>
								<li>
									<a href="Message.jsp">站内消息</a>
								</li>
								<li>
									<a href="personSet.jsp">个人信息设置</a>
								</li>
								<li>
									<a href="trackGood.jsp">货物追踪</a>
								</li>
							</ul>
						</li>
						<li>
							<a href="#">网上托运</a>
							<ul class="sub_menu">
								<li>
									<a href="makeOrder.jsp">网上下单</a>
								</li>
								<li>
									<a href="checkFee.jsp">运费查询</a>
								</li>
								<li>
									<a href="checkStation.jsp">网点查询</a>
								</li>
							</ul>
						</li>
						<li>
							<a href="#">技术与支持</a>
							<ul class="sub_menu">
							</ul>
						</li>
						<li>
							<a href="#">关于我们</a>
							<ul class="sub_menu">
							</ul>
						</li>
					</ul>
				</div>
			</div>



			<div id="content">
				<div id="siderBar">
					<div id="login" class="sideDiv">
						<h3>
							登陆我的账户
						</h3>
						<div id="userLogin">
							欢迎,用户：
							<a href="#">jason691353279</a>
							<br>
							<br>
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<a href="#">退出</a>
							<br>
							<br>
							<input type="button" value="网上下单" onclick=window.location='makeOrder.jsp';
>
						</div>
					</div>
					<div id="fastLeader" class="sideDiv">
						<h3>
							物流网站新闻
						</h3>
						<ul>
							<li>
								<a href="#">实训将在6.29号下午答辩</a>
							</li>
							<li>
								<a href="#">实训将在6.29号下午答辩</a>
							</li>
							<li>
								<a href="#">实训将在6.29号下午答辩</a>
							</li>
							<li>
								<a href="#">实训将在6.29号下午答辩</a>
							</li>
							<li>
								<a href="#">实训将在6.29号下午答辩</a>
							</li>
						</ul>
					</div>
				</div>

				<div id="main2" type="height:900px">

					<div id="makeorder">
						<br>
						<h3>
							网点查询
						</h3>
						------------------------------------------------------------------------------------------------------------
						
							<li>海淀总配送点
		<ul class="sub_menu">
			<li>交大配送点</li>
			<li>中财配送点</li>
		</ul>
	</li>
	<p></p>
	<li>朝阳总配送点
		<ul class="sub_menu">
			<li>贸大配送点</li>
			<li>三里屯配送点</li>
		</ul>
	</li>
						<br>
					</div>
				</div>
			</div>

			<%@include file="footer.jsp"%>

		</div>
	</body>
</html>
