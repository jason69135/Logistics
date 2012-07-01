<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>My JSP 'success.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">

	</head>

	<body>
		<a href="#">收藏网页</a> 您好,<%=session.getAttribute("token")%><a
			href="LoginOutAction.action">注销</a>
		<jsp:include page="navi.jsp"></jsp:include>
		<div id="left" style="margin-top: 100px; margin-left: 100px;">
		<h2>
			添加管理员
		</h2>
		<p>
			<h2>
				按配送点查询
			</h2>
			选择配送点：
			<input type="text" />
			管理员姓名：
			<input type="text" />
			管理员密码：
			<input type="text" />
			<input type="button" value="添加">
			<p>
				<table border="1">
					<tr>
						<th>
							管理员ID
						</th>
						<th>
							管理员姓名
						</th>
						<th>
							管理员密码
						</th>
						<th>
							所属配送点
						</th>
						<th>
							操作
						</th>
					</tr>
					<tr>
						<td>
							1
						</td>
						<td>
							jason
						</td>
						<td>
							262728
						</td>
						<td>
							交大配送点
						</td>
						<td>
							<a href=""#>删除 </a>
						</td>
					</tr>
					<tr>
						<td>
							2
						</td>
						<td>
							过云峰
						</td>
						<td>
							123
						</td>
						<td>
							三里屯配送点
						</td>
						<td>
						<a href=""#>删除 </a>
						</td>
					</tr>
					<tr>
				</table>
				</div>
	</body>
</html>
