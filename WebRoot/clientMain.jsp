<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<a href="LogoutAction.action">注销</a>
	<%=session.getAttribute("username")%>
	<h3>修改密码</h3>
	<form action="ChangePasswordAction.action" method="POST">
		原密码：<input type="text" name="customer.password"></input> 
		现密码：<input type="password" name="newPassword"></input> 
		<input type="submit" value="submit"></input>
	</form>
	<h3>修改邮箱</h3>
	<form action="ChangeEmailAction.action" method="POST">
		原邮箱： <%=session.getAttribute("email")%><br>
		现邮箱：<input type="text" name="newEmail"></input> 
		<input type="submit" value="submit"></input>
	</form>
	<h3>搜索用户</h3>
	<form action="SearchUserAction.action" method="POST">
		用户名：<input type="text" name="customer.username"></input> 
		<input type="submit" value="submit"></input>
	</form>
</body>
</html>
