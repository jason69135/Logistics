<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="beans.Customer"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'companyuserresult.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">

	</head>

	<body>
		用户信息：
		<br>
		<%
			Customer cus = (Customer) session.getAttribute("cus");
				out.println("用户姓名:" + cus.getUsername());
				out.println("<br>");
				out.println("邮箱:" + cus.getEmail());
				out.println("<br>");
				out.println("电话:" + cus.getTel());
				out.println("<br>");
				out.println("密码:" + cus.getPassword());
				out.println("<br>");
				out.println("支付方式:" + cus.getSubsiteid());
				out.println("<br>");
		%>
	</body>
</html>
