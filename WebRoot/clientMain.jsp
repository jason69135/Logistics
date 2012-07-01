<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<%=session.getAttribute("username")%>
	<h3>修改密码</h3>
	<form action="ChangePasswordAction.action" method="POST">
		原密码：<input type="text" name="customer.password"></input>
		 现密码：<input type="password" name="newPassword"></input> 
		<input type="submit" value="submit"></input>
	</form>
</body>
</html>
