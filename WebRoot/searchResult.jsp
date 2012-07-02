<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="beans.Customer"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<a href="LogoutAction.action">注销</a>
	<%
		Customer customer = (Customer) session.getAttribute("searchUser");
	%>
	<%=customer.getId()%><%=customer.getUsername()%>
	<%=customer.getEmail()%>
</body>
</html>
