<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
账户信息
<a href="#">刷新</a>
您好,<%=session.getAttribute("token")%><a href="#">注销</a>
<ul>
	<li>运输中订单<a href="#"><%=session.getAttribute("transOrder")%></a></li>
	<li>代付款订单<a href="#"><%=session.getAttribute("toPayOrder")%></a></li>
	<li>未读站内信<a href="#"><%=session.getAttribute("siteMessage")%></a>
	</li>
</ul>
<a href="OrderBillAction.action">我要下单</a>
<ul id="menu">
	<li class="menu">我的订单
		<ul>
			<li><a href="#">订单管理</a>
			</li>
		</ul></li>
	<li class="menu">我的账单
		<ul>
			<li><a href="#">我要支付</a>
			</li>
			<li><a href="#">已有账单</a>
			</li>
			<li><a href="#">代收货款</a>
			</li>
		</ul></li>
	<li class="menu"><a href="#">联系人管理</a>
	</li>
	<li class="menu"><a href="#">在线理赔</a>
	</li>
	<li class="menu"><a href="#">站内消息</a>
	</li>
	<li class="menu"><a href="#">个人资料设置</a>
	</li>
</ul>