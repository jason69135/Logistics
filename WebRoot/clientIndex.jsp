<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<h3>登录我的账户</h3>
	<form action="LoginAction.action" method="POST">
		<input type="text" name="customer.username"></input> 
		<input type="password" name="customer.password"></input> 
		<input type="submit" value="submit">
	</form>
	<h3>注册账户</h3>
	<form action="RegisterAction.action" method="POST">
		<input type="text" name="customer.username"></input> 
		<input type="password" name="customer.password"></input> 
		<input type="text" name="customer.email"></input> 
		<input type="submit" value="submit">
	</form>
</body>
</html>
