<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="../../css/style.css" type="text/css" />
<script type='text/javascript' src='../../js/jquery.min.js'></script>
<script type="text/javascript" language="javascript"
	src="../../js/jquery.dropdown.js"></script>
<div id="page-wrap">
	<ul class="dropdown">
		<li>
			<a href="login.jsp">首页</a>
		</li>
		<li>
			<a href="#">货物查询</a>
			<ul class="sub_menu">
				<li>
					<a href="sendGoods.jsp">发送货物</a>
				</li>
				<li>
					<a href="recieveGoods.jsp">接受货物</a>
				</li>
			</ul>
		</li>
				<li>
		<a href="#">货物确认</a>
			<ul class="sub_menu">
				<li>
					<a href="sendConfirm.jsp">发送确认</a>
				</li>
				<li>
					<a href="recieveConfirm.jsp">接受确认</a>
				</li>
				<li>
					<a href="notOrder.jsp">未到订单</a>
				</li>
			</ul>
		</li>
		<li>
			<a href="checkStation.jsp">配送点查询</a>
		</li>
	</ul>
</div>