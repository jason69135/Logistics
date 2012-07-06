<%@ page contentType="text/html; charset=utf-8" language="java"%>
<%@ page import="beans.Order"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>项目管理系统 by www.nongfuit.com</title>

<link href="css/css.css" rel="stylesheet" type="text/css" />
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link href="css/list.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/xiangmu.js"></script>
</head>

<SCRIPT language=JavaScript>
function sousuo(){
	window.open("gaojisousuo.htm","","depended=0,alwaysRaised=1,width=800,height=510,location=0,menubar=0,resizable=0,scrollbars=0,status=0,toolbar=0");
}
function selectAll(){
	var obj = document.fom.elements;
	for (var i=0;i<obj.length;i++){
		if (obj[i].name == "delid"){
			obj[i].checked = true;
		}
	}
}

function unselectAll(){
	var obj = document.fom.elements;
	for (var i=0;i<obj.length;i++){
		if (obj[i].name == "delid"){
			if (obj[i].checked==true) obj[i].checked = false;
			else obj[i].checked = true;
		}
	}
}

function link(){
    document.getElementById("fom").action="sendxiaoxi.htm";
   document.getElementById("fom").submit();
}

function on_load(){
	var loadingmsg=document.getElementById("loadingmsg");
	var mainpage=document.getElementById("mainpage");
	loadingmsg.style.display="";
	mainpage.style.display="none";
	
	loadingmsg.style.display="none";
	mainpage.style.display="";
}
</SCRIPT>


<body onload="on_load()">
<form name="fom" id="fom" method="post" action="">
<table id="mainpage" width="100%" border="0" cellspacing="0" cellpadding="0">

  <tr>
    <td height="30">
    <table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td height="62" background="images/nav04.gif">
          
		   <table width="98%" border="0" align="center" cellpadding="0" cellspacing="0">
		  <tr>
			<td width="29"><img src="images/ico07.gif" width="20" height="18" /></td>
			<td width="300">查询订单：输入订单号查询： 
			 <input name="textfield" type="text" size="12"/>	
			 </td>
			 <td width="432">
			   <input name="Submit" type="button" class="right-button02" value="查 询" /></td>	
		  </tr>
        </table></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td><table id="subtree1" style="DISPLAY: " width="100%" border="0" cellspacing="0" cellpadding="0">

        <tr>
          <td><table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">

          	 
              <tr>
                <td height="40" class="font42">
				<div id="main_list">
				<table width="607" border="0" cellpadding="4" cellspacing="1" bgcolor="#464646" class="newfont03" height="185">
					<tr>
                    <td height="20" colspan="13" align="center" class="tablestyle_title">订单列表</td>
                    </tr>
                  <tr>
				    
                    <th width="13%" align="center" bgcolor="#EEEEEE">订单编号</th>
                    <th width="13%" align="center" bgcolor="#EEEEEE">发货人</th>
                    <th width="13%" align="center" bgcolor="#EEEEEE">收货人</th>
                    <th width="20%" align="center" bgcolor="#EEEEEE">是否加急</th>
                    <th width="10%" align="center" bgcolor="#EEEEEE">运费</th>
                    <th width="20%" align="center" bgcolor="#EEEEEE">审核状态</th>
                    <th width="20%" align="center" bgcolor="#EEEEEE">操作</th>
                  </tr>
<%
							List<Order> list = (List) session.getAttribute("checkorder");
							for (int i = 0; i < list.size(); i++) {
							    out.println("<tr align='center'>");
							    out.println("<td bgcolor='#FFFFFF'>");
								out.println(list.get(i).getOrderNo());
								out.println("</td>");
							    out.println("<td bgcolor='#FFFFFF'>");
								out.println(list.get(i).getCusid());
								out.println("</td>");
								out.println("<td bgcolor='#FFFFFF'>");  
								out.println(list.get(i).getRecieveid());
								out.println("</td>");
								out.println("<td bgcolor='#FFFFFF'>");  
								out.println(list.get(i).getPriority());
								out.println("</td>");
								out.println("<td bgcolor='#FFFFFF'>");  
								out.println(list.get(i).getFee());
								out.println("</td>");
								out.println("<td bgcolor='#FFFFFF'>");  
								out.println(list.get(i).getCheckstate());
								out.println("</td>");
								out.println("<td bgcolor='#FFFFFF'><a href='CheckOrderAction.action'>审核</a>");
								session.setAttribute("Needorder",list.get(i));
								out.println("</tr>");
							}
						%>
                </table>
				</div>
				</td>
              </tr>
            </table></td>
        </tr>
      </table>
      <table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
        <tr>
          <td height="6"><img src="../images/spacer.gif" width="1" height="1" /></td>
        </tr>
        <tr>
          <td height="33"><table width="100%" border="0" align="center" cellpadding="0" cellspacing="0" class="right-font08">
              <tr>
                <td width="50%">共 <span class="right-text09">5</span> 页 | 第 <span class="right-text09">1</span> 页</td>
                <td width="49%" align="right">[<a href="#" class="right-font08">首页</a> | <a href="#" class="right-font08">上一页</a> | <a href="#" class="right-font08">下一页</a> | <a href="#" class="right-font08">末页</a>] 转至：</td>
                <td width="1%"><table width="20" border="0" cellspacing="0" cellpadding="0">
                    <tr>
                      <td width="1%"><input name="textfield3" type="text" class="right-textfield03" size="1" /></td>
                      <td width="87%"><input name="Submit23222" type="submit" class="right-button06" value=" " />
                      </td>
                    </tr>
                </table></td>
              </tr>
          </table></td>
        </tr>
      </table></td>
  </tr>
</table>
</form>
</body>
</html>
