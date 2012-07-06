<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="beans.Letters"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'showmessage.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

  </head>
  
  <body>
 我的站内信：<br><% List<Letters> list = (List) session.getAttribute("message");
       for (int i = 0; i < list.size(); i++) {
       				out.println("订单号:" + list.get(i).getFrom());
					out.println("<br>");
					out.println("货物名称:" + list.get(i).getContent());
					out.println("<br>");
					out.println("运费:" + list.get(i).getState());
					out.println("<br>");
					out.println("<input type='button' value='More Details'/>");
					out.println("<br>");
       }
         %>
  </body>
</html>
