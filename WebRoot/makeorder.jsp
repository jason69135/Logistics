<%@ taglib prefix="s" uri="/struts-tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
	<head>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
	</head>
	<body>
		<s:form action="MakeOrderAction.action" method="POST">
			<s:textfield label="发货人姓名" name="cusname"></s:textfield>
			<s:textfield label="发货人电弧" name="customertel"></s:textfield>
			<s:textfield label="发货人地址" name="cusaddres"></s:textfield>
			<s:textfield label="发货点" name="sendsubsitename"></s:textfield>
			<s:textfield label="收货点" name="recievesubsitename"></s:textfield>
			<s:textfield label="发货人姓名" name="recievername"></s:textfield>
			<s:textfield label="发货人电话" name="recievertel"></s:textfield>
			<s:textfield label="货物名称" name="goodname"></s:textfield>
			<s:textfield label="保价" name="proprice"></s:textfield>
			<s:textfield label="重量" name="weight"></s:textfield>
			<s:textfield label="优先级" name="priority"></s:textfield>
			<s:textfield label="备注" name="remark"></s:textfield>
			<s:submit id="Submit" value="提交订单"></s:submit>
		</s:form>
	</body>
</html>