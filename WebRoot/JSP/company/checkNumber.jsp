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
		<a href="#">�ղ���ҳ</a> ����,<%=session.getAttribute("token")%><a
			href="LoginOutAction.action">ע��</a>
		<jsp:include page="navi.jsp"></jsp:include>
		<div id="left" style="margin-top: 100px; margin-left: 100px;">
		<h2>
			��ѯ���
		</h2>
		������ʼ���͵㣺
		<input type="text" />
		����Ŀ�����͵㣺
		<input type="text" />
		<input type="button" value="��ѯ">
		<p>
			<h3>
				���
			</h3>
			���͵�
			<input type="text" size="30" value="�����������͵�-�������͵�">
			<p>
				��� :
				<table border="1">
					<tr>
						<th>
							���
						</th>
						<th>
							����
						</th>
						<th>
							����ʱ��
						</th>
					</tr>
					<tr>
						<td>
							���1
						</td>
						<td>
							��ͨ
						</td>
						<td>
							9��00����
						</td>
					</tr>
					<tr>
						<td>
							���2
						</td>
						<td>
							��ͨ
						</td>
						<td>
							15��00����
						</td>
					</tr>
					<tr>
						<td>
							���3
						</td>
						<td>
							�Ӽ�
						</td>
						<td>
							12��00����
						</td>
					</tr>
					<tr>
						<td>
							���4
						</td>
						<td>
							�Ӽ�
						</td>
						<td>
							21��00����
						</td>
					</tr>
				</table>
				</div>
	</body>
</html>
