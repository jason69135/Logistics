<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>物流后台管理系统</title>
		<link href="css/alogin.css" rel="stylesheet" type="text/css" />
	</head>
	<body>
		<form id="form1" action="No1adminLoginAction" method="POST">
			<div class="Main">
				<ul>
					<li class="top"></li>
					<li class="top2"></li>
					<li class="topA"></li>
					<li class="topB">
						<span> <img src="images/login/logo.gif" alt="" style="" />
						</span>
					</li>
					<li class="topC"></li>
					<li class="topD">
						<ul class="login">
							<li>
								<span class="left">用户名：</span>
								<span style=""> <input id="Text1" type="text"
										name="siteadmin.username" name="siteadmin.username" /> </span>
							</li>
							<li>
								<span class="left">密 码：</span>
								<span style=""> <input id="Text2" type="password"
										name="siteadmin.password" /> </span>
							</li>
							<li>
								<span class="left">记住我：</span>
								<input id="Checkbox1" type="checkbox" />
							</li>
						</ul>
					</li>

					<li class="topE"></li>
					<li class="middle_A"></li>
					<li class="middle_B"></li>
					<li class="middle_C">
						<span class="btn"> <input type="submit" /> </span>
					</li>
					<li class="middle_D"></li>
					<li class="bottom_A"></li>
					<li class="bottom_B">
						温馨之路  同城物流
					</li>
				</ul>
			</div>
		</form>
	</body>
</html>
