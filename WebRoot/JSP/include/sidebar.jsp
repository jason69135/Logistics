<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
�˻���Ϣ
<a href="#">ˢ��</a>
����,<%=session.getAttribute("token")%><a href="#">ע��</a>
<ul>
	<li>�����ж���<a href="#"><%=session.getAttribute("transOrder")%></a></li>
	<li>�������<a href="#"><%=session.getAttribute("toPayOrder")%></a></li>
	<li>δ��վ����<a href="#"><%=session.getAttribute("siteMessage")%></a>
	</li>
</ul>
<a href="OrderBillAction.action">��Ҫ�µ�</a>
<ul id="menu">
	<li class="menu">�ҵĶ���
		<ul>
			<li><a href="#">��������</a>
			</li>
		</ul></li>
	<li class="menu">�ҵ��˵�
		<ul>
			<li><a href="#">��Ҫ֧��</a>
			</li>
			<li><a href="#">�����˵�</a>
			</li>
			<li><a href="#">���ջ���</a>
			</li>
		</ul></li>
	<li class="menu"><a href="#">��ϵ�˹���</a>
	</li>
	<li class="menu"><a href="#">��������</a>
	</li>
	<li class="menu"><a href="#">վ����Ϣ</a>
	</li>
	<li class="menu"><a href="#">������������</a>
	</li>
</ul>