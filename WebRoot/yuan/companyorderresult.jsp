<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="beans.Order"%>
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

		<title>My JSP 'companyorderresult.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">

	</head>

	<body>
		&nbsp;&nbsp;&nbsp; 订单信息：
		<br>
		<%
			Order order = (Order) session.getAttribute("companyorder");
				out.println("订单号:" + order.getOrderNo());
				out.println("<br>");
				out.println("发货人id:" + order.getCusid());
				out.println("<br>");
				out.println("id:" + order.getId());
				out.println("<br>");
				out.println("支付方式:" + order.getPayway());
				out.println("<br>");

		%>
	</body>
</html>
