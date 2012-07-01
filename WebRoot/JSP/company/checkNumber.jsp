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
			查询班次
		</h2>
		输入起始配送点：
		<input type="text" />
		输入目的配送点：
		<input type="text" />
		<input type="button" value="查询">
		<p>
			<h3>
				班次
			</h3>
			配送点
			<input type="text" size="30" value="海淀区总配送点-交大配送点">
			<p>
				班次 :
				<table border="1">
					<tr>
						<th>
							班次
						</th>
						<th>
							种类
						</th>
						<th>
							出发时间
						</th>
					</tr>
					<tr>
						<td>
							班次1
						</td>
						<td>
							普通
						</td>
						<td>
							9：00发车
						</td>
					</tr>
					<tr>
						<td>
							班次2
						</td>
						<td>
							普通
						</td>
						<td>
							15：00发车
						</td>
					</tr>
					<tr>
						<td>
							班次3
						</td>
						<td>
							加急
						</td>
						<td>
							12：00发车
						</td>
					</tr>
					<tr>
						<td>
							班次4
						</td>
						<td>
							加急
						</td>
						<td>
							21：00发车
						</td>
					</tr>
				</table>
				</div>
	</body>
</html>
