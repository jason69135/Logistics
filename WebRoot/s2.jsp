<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head id="Head1">
    <title>Ư����easyui��̨�����ʾ-css��̨ģ��-www.nongfuit.com</title>
    <link href="css/default.css" rel="stylesheet" type="text/css" />
    <link rel="stylesheet" type="text/css" href="js/themes/default/easyui.css" />
    <link rel="stylesheet" type="text/css" href="js/themes/icon.css" />
    <script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
    <script type="text/javascript" src="js/jQuery.easyui.js"></script>

	<script type="text/javascript" src='js/outlook2.js'> </script>

    <script type="text/javascript">
	 var _menus = {"menus":[
						{"menuid":"1","icon":"icon-sys","menuname":"վ���ѯ",
							"menus":[{"menuname":"��ѯ��վ��","icon":"icon-nav","url":"checkS1.jsp"},
									{"menuname":"��ѯ��վ��","icon":"icon-add","url":"checkStation.jsp"}
								]
						},{"menuid":"8","icon":"icon-sys","menuname":"�ջ�ȷ��",
							"menus":[{"menuname":"һ��վ�����","icon":"icon-nav","url":"receiveConfirm.jsp"},
									{"menuname":"��ɢ����","icon":"icon-nav","url":"receiveConfirm2.jsp"}
								]
						},{"menuid":"56","icon":"icon-sys","menuname":"����ȷ��",
							"menus":[{"menuname":"һ��վ��ȷ��","icon":"icon-nav","url":"sendConfirm.jsp"},
									{"menuname":"��ɢ����","icon":"icon-nav","url":"demo2.html"}
								]
						},{"menuid":"28","icon":"icon-sys","menuname":"�������",
							"menus":[{"menuname":"�鿴����","icon":"icon-nav","url":"checkOrder.jsp"},
									{"menuname":"��˶���","icon":"icon-nav","url":"notOrde.jsp"}
								]
						}
				]};
        //���õ�¼����
        function openPwd() {
            $('#w').window({
                title: '�޸�����',
                width: 300,
                modal: true,
                shadow: true,
                closed: true,
                height: 160,
                resizable:false
            });
        }
        //�رյ�¼����
        function close() {
            $('#w').window('close');
        }

        

        //�޸�����
        function serverLogin() {
            var $newpass = $('#txtNewPass');
            var $rePass = $('#txtRePass');

            if ($newpass.val() == '') {
                msgShow('ϵͳ��ʾ', '���������룡', 'warning');
                return false;
            }
            if ($rePass.val() == '') {
                msgShow('ϵͳ��ʾ', '����һ���������룡', 'warning');
                return false;
            }

            if ($newpass.val() != $rePass.val()) {
                msgShow('ϵͳ��ʾ', '�������벻һ��������������', 'warning');
                return false;
            }

            $.post('/ajax/editpassword.ashx?newpass=' + $newpass.val(), function(msg) {
                msgShow('ϵͳ��ʾ', '��ϲ�������޸ĳɹ���<br>����������Ϊ��' + msg, 'info');
                $newpass.val('');
                $rePass.val('');
                close();
            })
            
        }

        $(function() {

            openPwd();
            //
            $('#editpass').click(function() {
                $('#w').window('open');
            });

            $('#btnEp').click(function() {
                serverLogin();
            })

           

            $('#loginOut').click(function() {
                $.messager.confirm('ϵͳ��ʾ', '��ȷ��Ҫ�˳����ε�¼��?', function(r) {

                    if (r) {
                        location.href = '/ajax/loginout.ashx';
                    }
                });

            })
			
			
			
        });
		
		

    </script>

</head>
<body class="easyui-layout" style="overflow-y: hidden"  scroll="no">
<noscript>
<div style=" position:absolute; z-index:100000; height:2046px;top:0px;left:0px; width:100%; background:white; text-align:center;">
    <img src="images/noscript.gif" alt='��Ǹ���뿪���ű�֧�֣�' />
</div></noscript>
    <div region="north" split="true" border="false" style="overflow: hidden; height: 30px;
        background: url(images/layout-browser-hd-bg.gif) #7f99be repeat-x center 50%;
        line-height: 20px;color: #fff; font-family: Verdana, ΢���ź�,����">
        <span style="float:right; padding-right:20px;" class="head">��ӭ ������ <a href="#" id="editpass">�޸�����</a> <a href="#" id="loginOut">��ȫ�˳�</a></span>
        <span style="padding-left:10px; font-size: 16px; "><img src="images/blocks.gif" width="20" height="20" align="absmiddle" /> ũ��itվwww.nongfuit.com</span>
    </div>
    <div region="south" split="true" style="height: 30px; background: #D2E0F2; ">
        <div class="footer"></div>
    </div>
    <div region="west" split="true" title="�����˵�" style="width:180px;" id="west">
		<div class="easyui-accordion" fit="true" border="false">
			<!--  �������� -->
				
		</div>

    </div>
    <div id="mainPanle" region="center" style="background: #eee; overflow-y:hidden">
        <div id="tabs" class="easyui-tabs"  fit="true" border="false" >
			<div title="��ӭʹ��" style="padding:20px;overflow:hidden;" id="home">
				
			<h1>Welcome to jQuery UI!</h1>

			</div>
		</div>
    </div>
    
    
    <!--�޸����봰��-->
    <div id="w" class="easyui-window" title="�޸�����" collapsible="false" minimizable="false"
        maximizable="false" icon="icon-save"  style="width: 300px; height: 150px; padding: 5px;
        background: #fafafa;">
        <div class="easyui-layout" fit="true">
            <div region="center" border="false" style="padding: 10px; background: #fff; border: 1px solid #ccc;">
                <table cellpadding=3>
                    <tr>
                        <td>�����룺</td>
                        <td><input id="txtNewPass" type="Password" class="txt01" /></td>
                    </tr>
                    <tr>
                        <td>ȷ�����룺</td>
                        <td><input id="txtRePass" type="Password" class="txt01" /></td>
                    </tr>
                </table>
            </div>
            <div region="south" border="false" style="text-align: right; height: 30px; line-height: 30px;">
                <a id="btnEp" class="easyui-linkbutton" icon="icon-ok" href="javascript:void(0)" >
                    ȷ��</a> <a class="easyui-linkbutton" icon="icon-cancel" href="javascript:void(0)"
                        onclick="closeLogin()">ȡ��</a>
            </div>
        </div>
    </div>

	<div id="mm" class="easyui-menu" style="width:150px;">
		<div id="mm-tabclose">�ر�</div>
		<div id="mm-tabcloseall">ȫ���ر�</div>
		<div id="mm-tabcloseother">����֮��ȫ���ر�</div>
		<div class="menu-sep"></div>
		<div id="mm-tabcloseright">��ǰҳ�Ҳ�ȫ���ر�</div>
		<div id="mm-tabcloseleft">��ǰҳ���ȫ���ر�</div>
		<div class="menu-sep"></div>
		<div id="mm-exit">�˳�</div>
	</div>


</body>
</html>
