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
	<a style="float:right" href="LoginAction.action">退出</a>
管理员:<a href="#">jason</a>
<jsp:include page="navi.jsp"></jsp:include>
<div id="left" style="margin-top: 100px; margin-left: 100px;">
<h2>网点查询</h2>
	<li>海淀总配送点
		<ul class="sub_menu">
			<li>交大配送点</li>
			<li>中财配送点</li>
		</ul>
	</li>
	<p></p>
	<li>朝阳总配送点
		<ul class="sub_menu">
			<li>贸大配送点</li>
			<li>三里屯配送点</li>
		</ul>
	</li>
	</div>
</body>
</html>