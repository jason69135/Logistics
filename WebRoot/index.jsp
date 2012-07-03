<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link href="css/style.css" type="text/css" rel="stylesheet"/>
		<link href="css/jquery.pageslide.css" type="text/css" rel="stylesheet"/>
		<link href="css/loginForm.css" type="text/css" rel="stylesheet"/>
		<link href="css/registerForm.css" type="text/css" rel="stylesheet"/>
		<link href="css/screen.css" type="text/css" rel="stylesheet"/>
		<script src="js/jquery-1.7.1.min.js"></script>
		<script src="js/easySlider1.7.js"></script>
		<script src="js/vanadium.js"></script>
		<script src="js/validate.js"></script>
		<script type="text/javascript" src="js/jquery.scrollTo-min.js"></script>
	</head>
	<body>
		<div id="left">
			<div class="topbg">
				<a href="http://www.elegantthemes.com/preview/Glider">
					<img src="images/logo.png" alt="Logo" id="logo">
				</a>
			</div>
			<div id="glow"></div>
			<div id="menu">
				<ul id="main-menu">
					<li>
						<a href="#home" class="active anchor">
							首页
						</a>
					</li>
					<li>
						<a href="#makeOrder" class="anchor">
							我的配送
						</a>
					</li>
					<li>
						<a href="#trackOrder" class="anchor">
							物流跟踪
						</a>
					</li>                           
					<li>
						<a href="#complaint" class="anchor">
							在线理赔
						</a>
					</li>
					<li>
						<a href="#search" class="anchor">
							服务查询
						</a>
					</li>
				</ul>
			</div>
			<span id="active-arrow"></span>
			<div id="right-border"></div>
		</div>

		<script type="text/javascript">
			$(function() {

				function scroll(direction) {

					var scroll, i,
							positions = [],
							here = $(window).scrollTop(),
							collection = $('.post');

					collection.each(function() {
						positions.push(parseInt($(this).offset()['top'],10));
					});

					for(i = 0; i < positions.length; i++) {
						if (direction == 'next' && positions[i] > here) { scroll = collection.get(i); break; }
						if (direction == 'prev' && i > 0 && positions[i] >= here) { scroll = collection.get(i-1); break; }
					}

					if (scroll) {
						$.scrollTo(scroll, {
							duration: 750       
						});
					}

					return false;
				}

		

				$(".anchor").click(function() {
					$.scrollTo($($(this).attr("href")), {
						duration: 750
					});
					return false;
				});

			});
		</script>



		<div id="right">
			<div class="block" id="home">
				<div id="tagline">
					<p id="quote1">为您提供温馨<span>&amp;</span> 安全的物流配送服务</p>
					<p id="quote2">欢迎使用温馨之路物流配送</p>
				</div>
				
				<script src="js/jquery.pageslide.js"></script>
				<script>
					$(document).ready(function(){
						$(".first").click(function(){
							$(this).pageslide({direction: "left", modal: false });
						});
						$(".second").click(function(){
							$(this).pageslide({direction: "left", modal: false });
						});
						$("#slider").easySlider({
							auto: true, 
							continuous: true
						});
					});
				</script>
				<div id="content">
					<ul class="loginAndRegister">
						<li>
							<a href="#modal" class="first">登陆</a>
						</li>
						<li>
							<a href="#modal2" class="second">注册</a> 
						</li>
					</ul>
				</div>
				<div id="slider">
					<ul>				
						<li><a href="http://templatica.com/preview/30"><img src="images/01.jpg" alt="Css Template Preview" /></a></li>
						<li><a href="http://templatica.com/preview/7"><img src="images/02.jpg" alt="Css Template Preview" /></a></li>
						<li><a href="http://templatica.com/preview/25"><img src="images/03.jpg" alt="Css Template Preview" /></a></li>
						<li><a href="http://templatica.com/preview/26"><img src="images/04.jpg" alt="Css Template Preview" /></a></li>
						<li><a href="http://templatica.com/preview/27"><img src="images/05.jpg" alt="Css Template Preview" /></a></li>			
					</ul>
				</div>
				<div class="intro"><p>德邦是国家“AAAAA”级物流企业，主营国内公路零担运输业务，创始于1996年。近年来，德邦以60%的速度稳健发展，截止2012年6月，德邦已在全国31个省级行政区开设直营网点2200余家，服务网络遍及国内550多个城市和地区，自有营运车辆4700余台，全国转运中心总面积超过75万平方米。</p> 
				<p>德邦始终以客户为中心随时候命、持续创新，始终坚持自建营业网点、自购进口车辆、搭建最优线路，优化运力成本，为客户提供快速高效、便捷及时、安全可靠的服务体验，助力客户创造最大的价值。</p>
				<p>德邦秉承“承载信任、助力成功”的服务理念，保持锐意进取、注重品质的态度，强化人才战略，通过不断的技术创新和信息化系统的搭建，提升运输网络和标准化体系，创造最优化的运载模式，为广大客户提供安全、快速、专业、满意的物流服务。一直以来，德邦都致力于与员工共同发展和成长，打造人企双赢。在推动经济发展，提升行业水平的同时，努力创造更多的社会效益，为国民经济的持续发展，和谐社会的创建做出积极贡献，努力将德邦打造成为中国人首选的国内物流运营商，实现“为中国提速”的使命。</p>
				</div>
				<div id="modal">
					<div id="glow"></div>
					<p style="font-size:30px;margin-left:50px;"><span style="font-size:60px">L</span>ogin</p>
					<div class="login-form">
						<h1>输入信息</h1>
						<form action="UserLoginAction.action" method="POST">
							<input type="text" name="customer.username" placeholder="用户名">
							<input type="password" name="customer.password" placeholder="密  码">
							<input type="submit" value="登陆">
						</form>
					</div>
					<p style="margin-top:200px;">
						<a href="javascript:$.pageslide.close()">Back</a>
					</p>
					<span id="active-arrow"></span>
					<div id="right-border"></div>
				</div>
				<div id="modal2">
					<div id="glow"></div>
					<p style="font-size:30px;margin-left:50px;"><span style="font-size:60px">S</span>ign in</p>
					<div class="login-form2">
						<h1>输入信息</h1>
						<form action="#">
							<input type="text" name="username" placeholder="用户名">
							<input type="password" name="password" placeholder="密  码">
							<input type="password" name="password" placeholder="确认密码">
							<input type="password" name="password" placeholder="邮  箱">
							<input type="submit" value="注册">
						</form>
					</div>
					<p style="margin-top:200px;">
						<a href="javascript:$.pageslide.close()">返回</a>
					</p>
					<span id="active-arrow"></span>
					<div id="right-border"></div>
				</div>
			</div>
			<div class="block" id="makeOrder">
				<p style="font-size:30px;margin-left:50px;"><span style="font-size:60px">O</span>rder</p>	
				<form action="#" class="login-form" style="height:460px;margin-top:20px;width:500px;">
						<h1>发货人信息</h1>
						<label for="sendUser">输入不能为空:</label>
						<input class=":required" id="sendUser" type="text" name="username" placeholder="发货人">
						<input type="password" name="password" placeholder="手机">
						<input type="password" name="password" placeholder="发货地址">
						<input type="password" name="password" placeholder="发货网店">
						<h1>收货人信息</h1>
						<input type="text" name="username" placeholder="收货人">
						<input type="password" name="password" placeholder="手机">
						<input type="password" name="password" placeholder="收货地址">
						<h1>货物信息</h1>
						<input type="text" name="username" placeholder="货物名称">
						<input type="password" name="password" placeholder="保价声明">
						<input type="password" name="password" placeholder="货物重量">
						<input type="submit" value="确认">
				</form>
			</div>
			<div class="block" id="trackOrder">
				<p style="font-size:30px;margin-left:50px;"><span style="font-size:60px">T</span>rack</p>	
				<form action="#" class="login-form" style="height:200px;margin-top:20px;width:200px;">
						<h1>订单信息</h1>
						<input type="text" name="username" placeholder="订单号">
						<input type="submit" value="确认">
				</form>
			</div>
			<div class="block" id="complaint">
				<p style="font-size:30px;margin-left:50px;"><span style="font-size:60px">C</span>omplaint</p>	
				<form action="#" class="login-form" style="height:200px;margin-top:20px;width:200px;">
						<h1>理赔信息</h1>
						<input type="text" name="username" placeholder="订单号">
						<input type="text" name="username" placeholder="原因">
						<input type="submit" value="确认">
				</form>
			</div>
			<div class="block" id="search">
				<p style="font-size:30px;margin-left:50px;"><span style="font-size:60px">S</span>earch</p>	
				<form action="#" class="login-form" style="height:200px;margin-top:20px;width:200px;float:left;">
						<h1>网点查询</h1>
						<input type="text" name="username" placeholder="请输入区名">
						<input type="submit" value="查找">
				</form>
				<form action="#" class="login-form" style="height:200px;margin-top:20px;width:200px;float:left;">
						<h1>运费查询</h1>
						<input type="text" name="username" placeholder="请输入发货区名">
						<input type="text" name="username" placeholder="请输入收货区名">
						<input type="submit" value="计算">
				</form>
			</div>
		</div>
	</body>
</html>