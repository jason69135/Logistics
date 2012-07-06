<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>项目管理系统 by www.nongfuit.com</title>
<style type="text/css">
<!--
.atten {font-size:12px;font-weight:normal;color:#F00;}
-->
</style>
<link href="css/css.css" rel="stylesheet" type="text/css" />
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link href="css/list.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/xiangmu.js"></script>

</head>

<script language="JavaScript" type="text/javascript">
function tishi()
{
  var a=confirm('数据库中保存有该人员基本信息，您可以修改或保留该信息。');
  if(a!=true)return false;
  window.open("冲突页.htm","","depended=0,alwaysRaised=1,width=800,height=400,location=0,menubar=0,resizable=0,scrollbars=0,status=0,toolbar=0");
}

function check()
{
document.getElementById("aa").style.display="";
}


function link(){
alert('保存成功！');
    document.getElementById("fom").action="xuqiumingxi.htm";
   document.getElementById("fom").submit();
}



</script>


<body class="ContentBody">
  <form action="" method="post" enctype="multipart/form-data" name="fom" id="fom" target="sypost" >
<div class="MainDiv">
<table width="99%" border="0" cellpadding="0" cellspacing="0" class="CContent">
  <tr>
      <th class="tablestyle_title" >添加管理员页面<br /></th>
  </tr>
  <tr>
    <td class="CPanel">
		
		<table border="0" cellpadding="0" cellspacing="0" width="927" height="441">
		<tr><td align="left">
		<input type="button" name="Submit" value="保存" class="button" onclick="alert('保存成功！');"/>　
			
			<input type="button" name="Submit2" value="返回" class="button" onclick="window.history.go(-1);"/>
		</td></tr>

		<TR>
			<TD width="100%">
				<fieldset style="height:100%;">
				<legend>添加管理员</legend>
					  <table border="0" cellpadding="2" cellspacing="1" style="width:100%">
					 
					  <tr>
					    <td nowrap align="right" width="13%">员工姓名：</td>
					    <td width="41%"><input name="text" class="text" style="width:100px" type="text" size="40" /></td>
					    <td align="right" width="19%">密码：<br /></td>
					    <td width="27%"><input name="Input22" id="Input22" class="text" style="width:154px" /></td>
					    </tr>
					  <tr>
					    <td nowrap align="right">员工ID：</td>
					    <td><input name="" id="" class="text" style="width:154px" /></td>
					    <td align="right">确认密码：</td>
					    <td><input name="Input" id="Input" class="text" style="width:154px" /></td>
					  </tr>
					   <tr>
					    <td nowrap align="right">所在站点:</td>
					    <td><select name="select2" >
                          <option  selected="selected">== 请 选 择 ==</option>
                          <option>暂不</option>
                          <option>一般</option>
                          <option>需要</option>
                          <option>急</option>
                          <option>很急</option>
                        </select></td>
					    <td align="right"><br /></td>
					    <td></td>
					  </tr>
					  <tr>
					    <td nowrap align="right" height="120px"><br /></td>
					    <td colspan="3">
					    	<table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">

          	 
              <tr>
                <td height="40" class="font42">
                <table width="456" border="0" cellpadding="4" cellspacing="1" bgcolor="#464646" class="newfont03" height="185">
					<tr>
                    <td height="20" colspan="13" align="center" bgcolor="#EEEEEE"class="tablestyle_title">管理员列表<br /></td>
                    </tr>
                  <tr>
				    
                    
                    <th width="20%" align="center" bgcolor="#EEEEEE">管理员ID</th>
                    <th width="21%" align="center" bgcolor="#EEEEEE">姓名</th>
                    <th width="20%" align="center" bgcolor="#EEEEEE">所属站点</th>
                    
                  </tr>
                  <tr align="center">
				    
                    
                    <td bgcolor="#FFFFFF">1002</td>
                    <td bgcolor="#FFFFFF">aran</td>
                    <td bgcolor="#FFFFFF">馍馍站点</td>
                  </tr>
                   <tr align="center">
				    
                    
                    <td bgcolor="#FFFFFF">电信</td>
                    <td bgcolor="#FFFFFF">500万</td>
                   	<td bgcolor="#FFFFFF">500万</td>
                  </tr>
				   <tr align="center">
				    
                    
                    <td bgcolor="#FFFFFF">电信</td>
                    <td bgcolor="#FFFFFF">500万</td>
                    <td bgcolor="#FFFFFF">500万</td>
                  </tr>
				   <tr align="center">
				    
                    
                    <td bgcolor="#FFFFFF">电信</td>
                    <td bgcolor="#FFFFFF">500万</td>
                    <td bgcolor="#FFFFFF">500万</td>
                  </tr>
                </table></td>
                
              </tr>
              	<tr><td>
					<table width="100%" border="0" align="center" cellpadding="0" cellspacing="0" class="right-font08">
              <tr>
                <td width="50%">共 <span class="right-text09">5</span> 页 | 第 <span class="right-text09">1</span> 页</td>
                <td width="49%" align="right">[<a href="#" class="right-font08">首页</a> | <a href="#" class="right-font08">上一页</a> | <a href="#" class="right-font08">下一页</a> | <a href="#" class="right-font08">末页</a>] 转至：</td>
                <td width="1%"></td>
              </tr>
          </table>
                </td></tr>
            </table>
					    </td>
					    </tr>
					  </table>
			 <br />
				</fieldset>			</TD>
		</TR>
		
		</TABLE>
	
	
	 </td>
  </tr>
  

		
		
		
		
		<TR>
			<TD colspan="2" align="center" height="50px">
			<input type="button" name="Submit" value="保存" class="button" onclick="link();"/>　
			
			<input type="button" name="Submit2" value="返回" class="button" onclick="window.history.go(-1);"/></TD>
		</TR>
		</TABLE>
	
	
	 </td>
  </tr>
  
  
  
  
  </table>

</div>
</form>
</body>
</html>
