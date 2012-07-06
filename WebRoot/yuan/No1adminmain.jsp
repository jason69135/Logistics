<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'No1adminmain.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

  </head>
  
  <body>
  		<s:form action="AddWaitlistAction.action" method="POST">
			<s:textfield label="订单号" name=""></s:textfield>
			<s:submit id="Submit" value="生成待发订单"></s:submit>
		</s:form>
		
		  <s:form action="ShowWaitlistAction.action" method="POST">
			<s:textfield label="订单号" name=""></s:textfield>
			<s:submit id="Submit" value="检查待发订单"></s:submit>
		</s:form>
		
		<s:form action="No1ReceiveNo1Action.action" method="POST">
			<s:textfield label="班次号" name=""></s:textfield>
			<s:submit id="Submit" value="一级站点确认收货"></s:submit>
		</s:form>
		
		<s:form action="No1ReceiveNo2Action.action" method="POST">
			<s:textfield label="班次号" name=""></s:textfield>
			<s:submit id="Submit" value="二级站点确认收货"></s:submit>
		</s:form>

		<s:form action="No1SendNo1Action.action" method="POST">
			<s:textfield label="班次号" name=""></s:textfield>
			<s:submit id="Submit" value="一级站点确认发货"></s:submit>
		</s:form>
		
		<s:form action="No1SendNo2Action.action" method="POST">
			<s:textfield label="班次号" name=""></s:textfield>
			<s:submit id="Submit" value="二级站点确认发货"></s:submit>
		</s:form>
</html>
