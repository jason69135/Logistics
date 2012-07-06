<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
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

		<title>My JSP 'usermain.jsp' starting page</title>

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
		欢迎：<%=(String) session.getAttribute("username")%><br>
		您有
		<a href=""><s:text name="unread"></s:text> </a> 封未读站内信
		<div>
			新闻：
		</div>
		<s:text name="news"></s:text>
		<input type="button" value="网上下单"
			onclick="window.location='makeorder.jsp'" />
		<br>
		<br>
		<s:form action="CheckFeeAction.action" method="POST">
			<s:textfield label="起始站点" name="subsitenamea"></s:textfield>
			<s:textfield label="目的站点" name="subsitenameb"></s:textfield>
			<s:submit id="Submit" value="运费查询"></s:submit>
		</s:form>
		<br>
		<br>
		<s:form action="AddComplainAction.action" method="POST">
			<s:textfield label="理赔订单" name="claims.orderno"></s:textfield>
			<s:textfield label="理赔人" name="claims.person"></s:textfield>
			<s:textfield label="理赔金额 " name="claims.fee"></s:textfield>
			<s:textfield label="理赔原因" name="claims.reason"></s:textfield>
			<s:submit id="Submit" value="在线理赔"></s:submit>
		</s:form>
		<input type="button" value="配送点查询"/>
		<br>
		<br>
		<s:form action="TrackOrderAction.action" method="POST">
			<s:textfield label="订单号" name="orderno"></s:textfield>
			<s:submit id="Submit" value="货物追踪"></s:submit>
		</s:form>
		<s:form action="CheckOrderAction.action" method="POST">
			<s:submit id="Submit" value="查询我的订单"></s:submit>
		</s:form>
		<s:form action="CheckPersonsetAction.action" method="POST">
			<s:submit id="Submit" value="修改个人信息"></s:submit>
		</s:form>
		
		<s:form action="ShowMessageAction.action" method="POST">
			<s:submit id="Submit" value="我的站内信"></s:submit>
		</s:form>
	</body>
</html>
