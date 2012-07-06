<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
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
			<td width="300">查询订单：输入订单号：  
			<input type="text"/>
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
               <td height="20"><span class="newfont07">选择：<a href="#" class="right-font08" onclick="selectAll();">全选</a>-<a href="#" class="right-font08" onclick="unselectAll();">反选</a></span>
	              <input name="Submit" type="button" class="right-button08" value="审核通过" />
	              <input name="Submit" type="button" class="right-button08" value="审核不通过" /></td>
          	 </tr>
              <tr>
                <td height="40" class="font42">
				<div id="main_list">
				<table width="621" border="0" cellpadding="4" cellspacing="1" bgcolor="#464646" class="newfont03" height="230">
					<tr>
                    <td height="20" colspan="16" align="center" class="tablestyle_title">订单列表</td>
                    </tr>
                  <tr>
				    <th height="26" align="center" bgcolor="#EEEEEE">选择</th>
                    <th  align="center" bgcolor="#EEEEEE">订单号</th>
                    <th  align="center" bgcolor="#EEEEEE">发货人</th>
                    <th  align="center" bgcolor="#EEEEEE">发货站点</th>
                    <th  align="center" bgcolor="#EEEEEE">收货人</th>
                    <th  align="center" bgcolor="#EEEEEE">应到配送点</th>
                    <th  align="center" bgcolor="#EEEEEE">运费</th>
                    <th  align="center" bgcolor="#EEEEEE">是否加急</th>
                    <th  align="center" bgcolor="#EEEEEE">操作</th>
                  </tr>
                  <tr align="center">
				    <td bgcolor="#FFFFFF"><input type="checkbox" name="delid"/></td>
                    
                    <td bgcolor="#FFFFFF">1002</td>
                    <td bgcolor="#FFFFFF">aran</td>
                    <td bgcolor="#FFFFFF">馍馍站阿斯达斯的打发打发点</td>
                    <td bgcolor="#FFFFFF">10:00</td>
                    <td bgcolor="#FFFFFF">aran</td>
                    <td bgcolor="#FFFFFF">aran</td>
                    <td bgcolor="#FFFFFF">aran</td>
                    <td bgcolor="#FFFFFF"><a href="#">审核通过</a></td>
                  </tr>
                   <tr align="center">
				    <td bgcolor="#FFFFFF"><input type="checkbox" name="delid"/></td>
                    
                    <td bgcolor="#FFFFFF">电信</td>
                    <td bgcolor="#FFFFFF">500万</td>
                   	<td bgcolor="#FFFFFF">500万</td>
                   	<td bgcolor="#FFFFFF">aran</td>
                   	<td bgcolor="#FFFFFF">aran</td>
                   	<td bgcolor="#FFFFFF">aran</td>
                   	<td bgcolor="#FFFFFF">aran</td>
                    <td bgcolor="#FFFFFF"><a href="#">审核通过</a></td>
                  </tr>
				   <tr align="center">
				    <td bgcolor="#FFFFFF"><input type="checkbox" name="delid"/></td>
                    
                    <td bgcolor="#FFFFFF">电信</td>
                    <td bgcolor="#FFFFFF">500万</td>
                    <td bgcolor="#FFFFFF">500万</td>
                    <td bgcolor="#FFFFFF"><a href="#">删除</a>|<a href="sendxiaoximingxi.htm">查看</a></td>
                    <td bgcolor="#FFFFFF"><a href="#">删除</a>|<a href="sendxiaoximingxi.htm">查看</a></td>
                    <td bgcolor="#FFFFFF">aran</td>
                    <td bgcolor="#FFFFFF">aran</td>
                    <td bgcolor="#FFFFFF"><a href="#">审核通过</a></td>
                  </tr>
				   <tr align="center">
				    <td bgcolor="#FFFFFF"><input type="checkbox" name="delid"/></td>
                    
                    <td bgcolor="#FFFFFF">电信</td>
                    <td bgcolor="#FFFFFF">500万</td>
                    <td bgcolor="#FFFFFF">500万</td>
                    <td bgcolor="#FFFFFF"><a href="#">删除</a>|<a href="sendxiaoximingxi.htm">查看</a></td>
                    <td bgcolor="#FFFFFF"><a href="#">删除</a>|<a href="sendxiaoximingxi.htm">查看</a></td>
                    <td bgcolor="#FFFFFF">aran</td>
                    <td bgcolor="#FFFFFF">aran</td>
                    <td bgcolor="#FFFFFF"><a href="#">审核通过</a></td>
                  </tr>
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
