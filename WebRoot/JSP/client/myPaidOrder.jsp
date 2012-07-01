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
		<script type="text/javascript" language="javascript" src="../../js/jquery.dropdown.js"></script>
	
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
						<h4>
							我的订单
						</h4>
						------------------------------------------------------------------------------------------------------
						<h4>
							订单编号：10002
						</h4>
						<ul class="defaultInfo">
							<li>
								<label class="zt_widthlabel">
									发货人 :
								</label>
								<label id="eidtsignee">
									jason691353279
								</label>
								<label class="signee1"></label>
							</li>
							<li>
								<label class="zt_widthlabel">
									手机 :
								</label>
								<label id="eidtnum">
									1521110012312
								</label>
								<label class="zt_widthlabel"></label>
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<label class="zt_widthlabel">
									固定电话 :
								</label>
								<label id="eidttel" class="labelRight">
									-
								</label>
								<label id="eidttel_two"></label>
							</li>
							<li>
								<label class="zt_widthlabel">
									发货地址 :
								</label>
								<label id="eidtaddress">
									<font class="shen">天津市-虹桥区</font>
									<font class="jie">哈哈大街</font>
								</label>
							</li>
							<li>
								<label class="zt_widthlabel">
									发货网点 :
								</label>
								<label id="editdian">
									<font class="dian">北京朝阳区十里河桥营业部</font>
								</label>
							</li>
						</ul>

						<ul class="defaultInfo">
							<li>
								<label class="zt_widthlabel">
									收货人 :
								</label>
								<label class="zt_widthlabel">
									过云峰
								</label>
							</li>
							<li>
								<label class="zt_widthlabel">
									手机 :
								</label>
								<label class="zt_widthlabel">
									15210584331
								</label>
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<label class="zt_widthlabel">
									固定电话 :
								</label>
								<label id="eidttel" class="labelRight">
								</label>
								<label id="eidttel_two"></label>
							</li>
							<li>
								<label class="zt_widthlabel">
									收货地址 :
								</label>
								<label id="eidtaddress">
									<label class="zt_widthlabel">
										北京市海淀区北交大配送点
									</label>
								</label>
							</li>
						</ul>
						<ul class="defaultInfo">
							<li>
								<label class="zt_widthlabel">
									货物名称
								</label>
								<label class="zt_widthlabel">
									玩具
								</label>
							</li>
							<li>
								<label class="zt_widthlabel">
									保价声明 :
								</label>
								<label class="zt_widthlabel">
									500
								</label>
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<label class="zt_widthlabel">
									货物重量 :
								</label>
								<label id="eidttel" class="labelRight">
								</label>
								<label class="zt_widthlabel">
									3kg
								</label>
								<label id="eidttel_two"></label>
							</li>
							<li>
								<label class="zt_widthlabel">
									货物件数 :
								</label>
								<label id="eidtaddress">
									<label class="zt_widthlabel">
										5件
									</label>
								</label>
							</li>
						</ul>
						<ul class="defaultInfo">
							<li>
								<label class="zt_widthlabel">
									付款方式
								</label>
								<label class="zt_widthlabel">
									未付款
								</label>
							</li>
						</ul>
						<br>
					</div>
				</div>
			</div>

			<%@include file="footer.jsp"%>

		</div>
	</body>
</html>
