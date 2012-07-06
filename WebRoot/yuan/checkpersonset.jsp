<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page import="beans.Customer"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'checkpersonset.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  账户信息:<br><% Customer cus = (Customer) session.getAttribute("userinfo");
       				out.println("登陆名:" + cus.getUsername());
					out.println("<br>");
					out.println("注册邮箱:" + cus.getEmail());
					out.println("<br>");%>
					<s:form action="ChangeEmailAction.action" method="POST">
                       <s:submit id="Submit" value="修改注册邮箱"></s:submit>
                     </s:form>
                    <s:form action="ChangePasswordAction.action" method="POST">
                        <s:submit id="Submit" value="修改密码"></s:submit>
                     </s:form>
    基本信息:<br><%
       				out.println("姓名:" + cus.getUsername());
					out.println("<br>");
					out.println("手机:" + cus.getTel());
					out.println("<br>");
					out.println("发货配送点id:" + cus.getSubsiteid());
					out.println("<br>");
					out.println("<br>");
         %>
  </body>
</html>
