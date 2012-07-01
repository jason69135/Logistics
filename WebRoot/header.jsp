<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="../../css/style.css" type="text/css" />
<link rel="stylesheet" type="text/css" href="css/header.css"/>
<script type='text/javascript' src='../../js/jquery.min.js'></script>
<script type="text/javascript" language="javascript"
	src="../../js/jquery.dropdown.js"></script>
<div id ="navi">
    <div id ="logo">老狗</div>
    <div id ="loginInfo">信息</div>
    <div id ="page-wrap">
        <ul class="dropdown">
		<li>
			<a href="login.jsp">首页</a>
		</li>
		<li>
			<a href="#">信息查询</a>
			<ul class="sub_menu">
				<li>
					<a href="checkStation.jsp">配送点查询</a>
				</li>
				<li>
					<a href="checkOrder.jsp">订单查询</a>
				</li>
				<li>
					<a href="checkUser.jsp">用户查询</a>
				</li>
			</ul>
		</li>
		<li>
			<a href="#">班次管理</a>
			<ul class="sub_menu">
				<li>
					<a href="checkNumber.jsp">查询班次</a>
				</li>
				<li>
					<a href="addNumber.jsp">添加班次</a>
				</li>
				<li>
					<a href="deleteNumber.jsp">删除班次</a>
				</li>
			</ul>
		</li>
		<li>
			<a href="#">配送点管理管理</a>
			<ul class="sub_menu">
				<li>
					<a href="checkNumber.jsp">添加一级配送点</a>
				</li>
				<li>
					<a href="addNumber.jsp">删除一级配送点</a>
				</li>
				<li>
					<a href="deleteNumber.jsp">添加二级配送点</a>
				</li>
				<li>
					<a href="deleteNumber.jsp">删除二级配送点</a>
				</li>
			</ul>
		</li>
		<li>
			<a href="#">管理员管理</a>
			<ul class="sub_menu">
				<li>
					<a href="checkAdmin.jsp">管理员查询</a>
				</li>
				<li>
					<a href="addAdmin.jsp">添加管理员</a>
				</li>
				<li>
					<a href="deleteAdmin.jsp">删除管理员</a>
				</li>
			</ul>
		</li>
	</ul>
    </div>
</div>

