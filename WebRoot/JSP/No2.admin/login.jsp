<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
</head>
<body>
ÄúºÃ,<%=session.getAttribute("token")%><a href="LoginOutAction.action">×¢Ïú</a>
	<a style="float:right" href="LoginAction.action">ÍË³ö</a>
	
<jsp:include page="navi.jsp"></jsp:include>
<div style="margin-right:900px">
	</div>
</body>
</html>