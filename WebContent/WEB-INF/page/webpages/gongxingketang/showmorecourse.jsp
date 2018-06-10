<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="org.sccooperation.domain.*"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>躬行课堂搜索页</title>
<link rel="stylesheet" href="./plugin/css/easy-responsive-tabs.css">
<!-- Bootstrap -->
<link rel="stylesheet" href="./plugin/css/bootstrap.min.css">
<!-- Animate -->
<link rel="stylesheet" href="./plugin/css/animate.css">
<link rel="stylesheet" href="./plugin/css/animate-control.css">

<!-- Owl Carousel -->
<link rel="stylesheet" href="./plugin/css/owl.carousel.min.css">
<link rel="stylesheet" href="./plugin/css/owl.theme.default.min.css">
<!-- Font Awesome -->
<link rel="stylesheet"
	href="./plugin/font-awesome-4.7.0/css/font-awesome.min.css">
<!-- easyTab css -->

<link rel="stylesheet" href="./css/style.css">
<link rel="stylesheet" href="./css/class.css">
<style>
.contain1 {
	background: #f5f7f9;
}
/*!首部
-------------------------------------------------------------------------------!*/
.logo-header {
	position: relative;
	height: 120px;
	padding-top: 40px;
	border-bottom: 2px solid #eee;
	box-shadow: 0px 5px 3px #f5f7f9;
}

.logo-img {
	display: block;
	width: 140px;
	height: 45px;
}

.border-1 {
	background: rgba(0, 0, 0, 0.3);
	height: 45px;
	width: 1px;
	margin-left: 15px;
	margin-right: 15px;
}

.logo-header .font-title {
	margin-top: 5px;
}

/*************/
#search-input {
	position: absolute;
	right: 40px;
	top: -150px;
	width: 320px;
	height: 32px;
	margin: 200px 150px;
	z-index: 100;
	border: 0px solid grey;
}

#search-input .span-text {
	float: left;
	width: 12%;
	font-size: 12px;
	height: 30px;
	line-height: 30px;
	margin-left: 5px;
	color: grey;
}

#search-input .span-img {
	float: right;
	width: 2%;
	margin-right: 13px;
	font-size: 12px;
}

#search-input .span-img a:hover {
	color: red;
}

#search-input .span-button {
	float: right;
	width: 25%;
}

#search-input .span-button button {
	width: 80px;
	height: 30px;
	box-shadow: i
}

#search-input .span-img-circle {
	width: 13px;
	height: 13px;
	margin: 5px 5px 0 0;
	padding-left: 5px;
	background: rgba(10, 10, 10, 0.2);
	border-radius: 1em;
}

#search-input #input-text {
	height: 30px;
	width: 55%;
	border: none;
}
/***********/
#search-input .menu1-down {
	display: none;
	width: 45px;
	color: #c3ccd0;
	margin-left: -6px;
	font-size: 12px;
	border-right: 1px solid grey;
	border-left: 1px solid grey;
	border-bottom: 1px solid grey;
	text-align: center;
	z-index: 100;
	margin-top: -3px;
	border-top: none;
	background: white;
	padding-top: 3px;
}

#search-input .focus {
	background: #f2ecde;
}
/**************/
#search-input .menu2-drop {
	display: none;
	width: 240px;
	z-index: 100;
	height: 200px;
	background: white;
	margin-left: -1px;
	border: 1px solid grey;
}

#search-input .menu2-drop-circle {
	float: left;
	width: 10px;
	height: 13px;
	margin: 5px 5px 0 0;
	padding-left: 5px;
	border-radius: 2px;
	color: grey;
	background: #f2ecde;
	font-size: 10px;
	margin-left: 10px;
}

#search-input .menu2-drop-top3 {
	color: white;
	background: green;
}

#search-input .menu2-drop-top3+p sub {
	margin-left: 5px;
	color: red;
}
/*!导航栏
-------------------------------------------------------------------------------!*/
* {
	padding: 0;
	margin: 0;
}

ul, li, a, em, i {
	list-style: none;
	list-style-type: none;
	margin: 0;
	padding: 0;
}

a, a:hover, a:link {
	text-decoration: none;
}

body {
	font: 12px/180% Arial, Helvetica, sans-serif, "新宋体";
	background: #ffffff;
}

html, body {
	height: 100%;
}

a:link {
	color: #000;
	text-decoration: none;
}

a:visited {
	color: #838383;
	text-decoration: none;
}

a:hover {
	color: #CC0000;
	text-decoration: none;
}

.nav {
	background-color: #B1B3A7;
	margin-top: 0;
}

#wrap-nav {
	height: 42px;
	line-height: 35px;
	background-repeat: repeat-x;
	background-position: 0 0;
	background-color: #B1B3A7;
	width: 100%;
	margin: 0 auto 0 auto;
}

#wrap-nav ul.menu li {
	position: relative;
	float: left;
	background-position: 0 -40px;
	height: 100%;
}

#wrap-nav ul.menu li h3 { /*border-right:1px solid white;*/
	padding: 0 20px 0 20px;
	margin: 0;
}

#wrap-nav ul.menu li h3 a.depth_1 {
	display: inline-block;
	color: #F6F7EF;
	font-size: 18px;
}

#wrap-nav ul.menu li h3.hover, #wrap-nav ul.menu li h3.selected {
	background-position: right -80px;
	background: white;
}

#wrap-nav ul.menu li h3.hover a.depth_1, #wrap-nav ul.menu li h3.selected a.depth_1
	{
	background-position: left -80px;
	color: #6ed3cf;
}

#wrap-nav ul.menu li.hover h3 {
	background-position: right -120px;
}

#wrap-nav ul.menu li.hover h3 a.depth_1 {
	background-position: left -120px;
	color: #ffffff;
}

#wrap-nav ul.menu li ul.children {
	position: absolute;
	top: 42px;
	z-index: 999;
	display: none;
	width: 450px;
	padding: 6px 7px 5px 6px;
	border: 3px solid #6ed3cf;
	background: #FFFFFF;
}

#wrap-nav ul.menu li ul.children li {
	width: 393px;
	padding: 0 0 1px 0;
	background: none;
}

#wrap-nav ul.menu li ul.children li.nosub {
	width: 130px;
	overflow: hidden;
}

#wrap-nav ul.menu li ul.children li h3 {
	
}

#wrap-nav ul.menu li ul.children li h3 a.depth_2 {
	width: 120px;
	line-height: 25px;
	display: block;
	font-weight: normal;
	font-size: 9pt;
	color: #000000;
}

#wrap-nav ul.menu li ul.children li h3 a.depth_2 span.icon10 {
	margin: 10px 3px 0 5px;
	background-position: -60px -380px;
}

#wrap-nav ul.menu li ul.children li h3.selected {
	background: #e62739;
}

#wrap-nav ul.menu li ul.children li.hover {
	z-index: 20;
}

#wrap-nav ul.menu li ul.children li.hover h3 a.depth_2 {
	background: #e1e8f0;
	font-weight: bold;
}

#wrap-nav ul.menu li ul.children li.hover ul {
	background: #e1e8f0;
	border-color: #FFBFBF;
	height: auto;
	z-index: 20;
}

#wrap-nav ul.menu li ul.children li.hover ul li a.depth_3 {
	color: #000000;
}

#wrap-nav ul.menu li ul.children li.hover ul li a.depth_3:hover {
	color: #e62739;
}

#wrap-nav ul.menu li ul.children ul {
	position: absolute;
	top: 0;
	left: 120px;
	padding: 0 0 0 10px;
	width: 250px;
	height: 25px;
	overflow: hidden;
	background: #F4F8F9;
	border-left: 2px solid #D8E2EC;
}

#wrap-nav ul.menu li ul.children ul li {
	width: auto;
	padding: 0;
	float: left;
}

#wrap-nav ul.menu li ul.children ul li a.depth_3 {
	margin: 0 15px 0 0;
	line-height: 25px;
	display: block;
	color: #666;
	white-space: nowrap;
}

#wrap-nav ul.menu li ul.children ul li a.depth_3:hover {
	text-decoration: underline;
}

#wrap-nav ul.menu li ul.children ul li a.selected {
	background: none;
	color: #e62739;
}

.mn_extd {
	float: right;
	margin: 0;
	font-size: 1.5em;
}

.mn_extd li a {
	color: #F7F4F4;
}

.mn_extd:hover li a {
	color: #F7F4F4;
	font-weight: bold;
	text-decoration: underline;
}

#wrap-nav ul.menu li h3 {
	height: 42px;
	line-height: 42px;
}
/*!课程分类条件
-------------------------------------------------------------------------------!*/
.class-condition {
	height: 60px;
	background: #f5f7f9;
	line-height: 60px;
}

.class-condition span {
	position: relative;
	top: 50%;
	margin-top: -12px;
	width: 120px;
	height: 25px;
	text-align: center;
	line-height: 25px;
	border: 1px dotted grey;
	margin-right: 10px;
}

.class-condition p {
	position: relative;
	top: 18px;
}
/*!课程所有分类
-------------------------------------------------------------------------------!*/
.carousel {
	height: 100px;
	padding: 20px;
	background: white;
}

.carousel .class-p {
	display: block;
	width: 10%;
	height: 100%;
	text-align: center;
	float: left;
}

.carousel .class-menu {
	height: 100%;
	width: 90%;
	float: right;
}

.carousel .class-menu li {
	width: 15%;
	height: 20px;
	padding: 0 5px;
	display: block;
	text-align: center;
	float: left;
}

/*!课程列表介绍
-------------------------------------------------------------------------------!*/
.carousel-intro {
	margin: 25px 0;
}

.carousel-intro .item {
	display: block;
	width: 19%;
	height: 280px;
	padding: 7px;
	background: white;
	float: left;
	margin-right: 12px;
	margin-bottom: 15px;
}

.carousel-intro .item:hover {
	-webkit-animation: aboutTeam-animate .5s linear 0s 1 alternate forwards;
	-o-animation: aboutTeam-animate .5s linear 0s 1 alternate forwards;
	animation: aboutTeam-animate .5s linear 0s 1 alternate forwards;
}

@
keyframes aboutTeam-animate {from {
	
}

to {
	box-shadow: 5px 5px 15px 0px rgba(0, 0, 0, 0.1), -5px -5px 15px 0px
		rgba(0, 0, 0, 0.1);
	/* box-shadow: 0px 0px 5px 20px rgba(0,0,0,0.08);*/
}

}
.carousel-intro .item .item-caption {
	width: 100%;
	height: 55%;
}

.carousel-intro .item .item-caption img {
	width: 100%;
	height: 100%;
}

.carousel-intro .item .item-body .font-title2 {
	margin-top: 10px;
}

.carousel-intro .item .item-body .main-font {
	font-size: 12px;
	color: grey;
}

.item-pay {
	clear: both;
}

.item-pay span {
	font-size: 14px;
	color: #0099CC;
}
/*!分页
-------------------------------------------------------------------------------!*/
.pagintion {
	clear: both;
	height: 60px;
	width: 100%;
	margin-bottom: 100px;
}

.pagintion nav {
	position: relative;
	left: 50%;
	margin-left: -150px;
}
</style>
</head>
<body>
	<%
		int lastbutton = Integer.parseInt((String) (request.getAttribute("button")));

		int pageNo = Integer.parseInt((String) (request.getAttribute("pageNo")));

		String lastcontent = (String) request.getAttribute("content");
	%>
	<div class="container contain1">
		<!-- 首部 -->
		<div class="logo-header">
			<img src="./img/logo.png" alt="" class="logo-img float"> <span
				class="border-1 float"></span>
			<p class="font-title float">创行谷</p>

			<div id="search-input">


				<form class="form-inline" role="form" method="post"
					action="showmorejob.action">
					<div class="form-group">
						<input type="hidden" name="pageNo" value="1" /> <input
							type="hidden" name="button"
							value="<%=Integer.parseInt(request.getAttribute("button") + "")%>" />
						<input type="text" class="form-control" id="name" name="content"
							placeholder="请输入查询内容">
					</div>
					<button type="submit" class="btn btn-default">查询</button>
				</form>

				<div class="menu2-drop">
					<ul class="menu2-drop-ul">
						<%
							if (request.getAttribute("HotJobList") != null) {
								List HotJob = (List) request.getAttribute("HotJobList");
								int HlistSize = HotJob.size();

								for (int i = 0; i < 4; i++) {
									if (HlistSize > i) {
										Post post = (Post) HotJob.get(i);
						%>

						<li><a href="#">
								<div class="menu2-drop-circle menu2-drop-top3"><%=i%></div> <%
 	String demand = post.getDemand();
 				demand = demand.replace('|', ' ');
 				if (demand.length() > 30)
 					demand = demand.substring(0, 30);
 %>
								<p><%=demand%><sub>新！</sub><sub><%=post.getSeenum()%>万次学习</sub>
								</p>
						</a></li>
						<%
							}
								}
							}
						%>

					</ul>
				</div>
			</div>

		</div>
		<!-- 首部 结束-->
		<!-- 导航栏 -->
		<div class="nav">
			<div id="wrap-nav">
				<ul class="menu ul">

					<li>
						<h3 id="menu_01"
							style="background-color: #82CCC9 /*6ed3cf*/; opacity: 1; filter (alpha=150); width: 205px; padding-left: 15px;">
							<a href="#" class="depth_1">所有项目</a>
						</h3>
						<ul id="children_01" class="children">
							<li>
								<h3 id="menu_01a">
									<a href="#" class="depth_2"><span class="icon10"></span>高清图片</a>
								</h3>
								<ul id="children_01a">
									<li><a
										href="showmorejob.action?pageNo=<%=pageNo - 1%>&button=<%=lastbutton%>&content=JAVA">JAVA</a></li>
									<li><a
										href="showmorejob.action?pageNo=<%=pageNo - 1%>&button=<%=lastbutton%>&content=HTML">HTML</a></li>
									<li><a
										href="showmorejob.action?pageNo=<%=pageNo - 1%>&button=<%=lastbutton%>&content=CSS">CSS</a></li>
									<li><a
										href="showmorejob.action?pageNo=<%=pageNo - 1%>&button=<%=lastbutton%>&content=PHP">PHP</a></li>
									<li><a
										href="showmorejob.action?pageNo=<%=pageNo - 1%>&button=<%=lastbutton%>&content=Node">Node</a></li>
									<li><a
										href="showmorejob.action?pageNo=<%=pageNo - 1%>&button=<%=lastbutton%>&content=JavaScript">JavaScript</a></li>
									<li><a
										href="showmorejob.action?pageNo=<%=pageNo - 1%>&button=<%=lastbutton%>&content=cpp">C++</a></li>
									<li><a
										href="showmorejob.action?pageNo=<%=pageNo - 1%>&button=<%=lastbutton%>&content=C#">C#</a></li>
								</ul>
							</li>
							<li>
								<h3 id="menu_01b">
									<a href="#" class="depth_2"><span class="icon10"></span>矢量</a>
								</h3>
								<ul id="children_01b">
									<li><a href="#" class="depth_3">潮流</a></li>
									<li><a href="#" class="depth_3">传统</a></li>
									<li><a href="#" class="depth_3">花纹</a></li>
									<li><a href="#" class="depth_3">花边</a></li>
									<li><a href="#" class="depth_3">图标</a></li>
									<li><a href="#" class="depth_3">节庆</a></li>
									<li><a href="#" class="depth_3">人物</a></li>
									<li><a href="#" class="depth_3">运动</a></li>
								</ul>
							</li>
							<li>
								<h3 id="menu_01i">
									<a href="#" class="depth_2"><span class="icon10"></span>Flash文件</a>
								</h3>
								<ul id="children_01i">
									<li><a href="#" class="depth_3">其他</a></li>
								</ul>
							</li>
						</ul>
					</li>
				</ul>
				<ul class="mn_extd">
					<li><a class="a2" target="_blank" style="margin-right: 40px;"
						href="//chuanke.baidu.com/?mod=school&act=create">创建项目</a></li>
				</ul>
			</div>
		</div>
		<!-- 导航栏 结束-->

		<%
			int postNum = Integer.parseInt(request.getAttribute("postNum") + "");
		%>
		<div class="class-condition">
			<span class="class-c1 float">IT/计算机/互联网</span> <span
				class="class-c2 float">编程语言</span>
			<p class="main-font">
				共找到<span class="red"><%=postNum%></span>门项目
			</p>
		</div>

		<div class="carousel">
			<div class="class-p" style="font-size: 16px;">课 程:</div>
			<div class="class-menu">
				<ul>
					<li><a href="#">全部(<%=postNum%>)
					</a></li>
					<li><a href="#">JAVA</a></li>
					<li><a href="#">HTML</a></li>
					<li><a href="#">CSS</a></li>
					<li><a href="#">PHP</a></li>
					<li><a href="#">Node</a></li>
					<li><a href="#">JavaScript</a></li>
					<li><a href="#">C++</a></li>
					<li><a href="#">C#</a></li>
				</ul>
			</div>
		</div>

		<div class="carousel-intro">
			<!-- item start-->


			<%
				List AllJob = (List) request.getAttribute("JobList");
				if (request.getAttribute("JobList") != null) {
					int JobListSizeA = AllJob.size();

					for (int i = 0; i < 10; i++) {
						if (JobListSizeA > i) {
							Post post = (Post) AllJob.get(i);
			%>
			<a
				href="showjobinfo.action?jobNo=<%=post.getId()%>&button=<%=post.getTagno()%>"
				class="item">
				<div class="item-caption">
					<img src="<%=post.getPictureurl()%>" alt="">
				</div>
				<div class="item-body">
					<p class="font-title2">

						<%
							String demand = post.getDemand();
										demand = demand.replace('|', ' ');
										if (demand.length() > 30)
											demand = demand.substring(0, 30);
						%>
						<%=demand%>...
					</p>
					<p class="main-font float"><%=post.getSeenum()%>次浏览
					</p>
					<p class="main-font float-right"><%=post.getEname()%></p>
				</div>
				<div class="item-pay">
					<span><%=post.getPlace()%></span>
				</div>
			</a>
			<%
				}
					}
				}
			%>



			<!-- item start-->


		</div>
		<div class="pagintion">
			<nav class="major-content-nav pull-center" aria-label="..">
				<ul class="pagination pagination-lg">
					<%
						if (pageNo == 1) {
					%>
					<li class="disabled">
						<%
							} else {
						%>
					
					<li>
						<%
							}
						%> <a
						href="showmorejob.action?pageNo=<%=pageNo - 1%>&button=<%=lastbutton%>"
						aria-label="Previous"><span aria-hidden="true">&laquo;</span></a>
					</li>

					<%
						for (int i = 1; i <= 5; i++) {
							if (pageNo == i) {
					%>
					<li class="active">
						<%
							} else {
						%>
					
					<li>
						<%
							}
						%> <a
						href="showmorejob.action?pageNo=<%=i%>&button=<%=lastbutton%>"><%=i%><span
							class="sr-only">(current)</span> </a>
					</li>
					<%
						}
						if (pageNo == 5) {
					%>
					<li class="disabled">
						<%
							} else {
						%>
					
					<li>
						<%
							}
						%> <a
						href="showmorejob.action?pageNo=<%=pageNo + 1%>&button=<%=lastbutton%>"
						aria-label="Next"> <span aria-hidden="true">&raquo;</span>
					</a>
					</li>
				</ul>
			</nav>
		</div>

	</div>
	<!-- 页面容器 结束-->

	<div class="footer margin">
		<div class="container">
			<div class="row">
				<div class="col-md-4">
					<img src="./img/logo_bottom.png" alt=""> <span
						class="footer-brd footer-brd1 pull-right"></span>
				</div>
				<div class="col-md-4">

					<p class="footer-address">地址:广东省珠海市唐家湾金凤路6号 邮编：519088</p>
					<p class="footer-address">联系电话：0756-3622745 招生咨询电话：0756-3622966
					</p>
					<p class="footer-address">邮箱：zhbit@zhbit.com</p>

				</div>
				<div class="col-md-4">
					<span class="footer-brd footer-brd2 pull-left"></span>
					<p class="footer-address">版权所有：北京理工大学珠海学院</p>
					<p class="footer-address">粤ICP备05063448号-1</p>
				</div>
			</div>
		</div>
	</div>
	<div class="footer-end">
		<p class="text-center footer-end-intro">信息管理与信息系统</p>
	</div>
	<!-- footer-end end -->

	<div class="fixed-menu">
		<div class="fixed-munu-item">
			<div class="fixed-munu-item-icon">
				<i class="fa fa-wechat fa-2x"></i>
			</div>
			<div class="fixed-munu-item-content">
				<p class="fixed-menu-intro text-center">
					<a href="#">专业公众号</a>
				</p>
				<div class="fix-menu-item-door"></div>
			</div>
		</div>
		<!-- fixed-munu-item end -->
		<div class="fixed-munu-item">
			<div class="fixed-munu-item-icon">
				<i class="fa fa-qq fa-2x"></i>
			</div>
			<div class="fixed-munu-item-content">
				<p class="fixed-menu-intro text-center">
					<a href="#">新生交流群</a>
				</p>
				<div class="fix-menu-item-door"></div>
			</div>
		</div>
		<!-- fixed-munu-item end -->
		<div class="fixed-munu-item">
			<div class="fixed-munu-item-icon">
				<i class="fa fa-volume-control-phone fa-2x"></i>
			</div>
			<div class="fixed-munu-item-content">
				<p class="fixed-menu-intro text-center">
					<a href="#">13192290054</a>
				</p>

			</div>
		</div>
		<!-- fixed-munu-item end -->
		<div class="fixed-munu-item">
			<div class="fixed-munu-item-icon">
				<i class="fa fa-pencil-square-o fa-2x"></i>
			</div>
			<div class="fixed-munu-item-content">
				<p class="fixed-menu-intro text-center">
					<a href="#">反馈</a>
				</p>
				<!-- <div class="fix-menu-item-door">
		      	  <textarea name="message" id="" cols="30" rows="10"></textarea>
		      </div> -->
			</div>
		</div>
		<!-- fixed-munu-item end -->
		<div class="fixed-munu-item">
			<div class="fixed-munu-item-icon">
				<a href="#head-link"><i class="fa fa-chevron-up fa-2x"></i></a>
			</div>
		</div>
		<!-- fixed-munu-item end -->
	</div>

	<script src="./plugin/js/jquery.min.js"></script>
	<!-- Bootstrap -->
	<script src="./plugin/js/bootstrap.min.js"></script>
	<!-- Owl Carousel -->
	<script src="./plugin/js/owl.carousel.min.js"></script>

	<script src="./plugin/js/fix-menu.js"></script>
	<script>
		$(document)
				.ready(
						function() {

							var lis = document.getElementsByName("list");
							// 播放列表的长度
							//document.getElementById("content").style.height = "lis.length"//;

							var navstr = '';
							for (c in vars = '0'.split(',')) {
								$('#menu_' + vars[c]).addClass('selected');
							}
							$('#wrap-nav ul.menu > li').hover(function() {
								$(this).find('.children').show();
								if ($(this).find('.children').length)
									$(this).addClass('hover');
							}, function() {
								$('.children').hide();
								$(this).removeClass('hover');
							});
							$(
									'#wrap-nav ul.menu h3, #wrap-nav ul.menu ul.children > li, #wrap-cats h3')
									.hover(function() {
										$(this).addClass('hover');
									}, function() {
										$(this).removeClass('hover');
									});
						});

		function showitem1(obj, itemdl, setvalid) {
			var fodinfo = document.getElementById(itemdl).getElementsByTagName(
					"li");
			var ii = 0;
			for (var i = 0; i < fodinfo.length; i++) {
				if (obj == fodinfo[i]) {
					//fodinfo[i].className=objcss+(i+1)+'2';
					ii = i + 1;
					document.getElementById(setvalid + ii).style.display = "";
					fodinfo[i].style.borderBottom = " 2px solid #3AAEA9";
				} else {
					//fodinfo[i].className=objcss+(i+1)+'1';
					ii = i + 1;
					document.getElementById(setvalid + ii).style.display = "none";
					fodinfo[i].style.borderBottom = " 0";
				}
			}
		}

		$(document)
				.ready(
						function() {
							$("#span-text-a")
									.click(
											function() {
												if ($(".menu1-down").is(
														":hidden")) {
													if ($(".menu2-drop").is(
															":visible")) {
														$(".menu2-drop").hide();
														$(".span-img").find(
																"div")
																.text("4")
																.remove("i");
													}
													$(this).find("i").attr(
															"class",
															"fa fa-angle-up");
													$(".menu1-down").slideDown(
															300);
												} else {
													$(this).find("i").attr(
															"class",
															"fa fa-angle-down");
													$(".menu1-down").slideUp(
															300);
												}
											}).blur(function() {
										$(".menu1-down").slideUp(300);
									});

							$(".menu1-down-ul li")
									.mousemove(
											function() {
												$(this).addClass("focus")
														.siblings()
														.removeClass();
											})
									.click(
											function() {
												var clickText = $(this).find(
														"a").text();
												$("#span-text-a span")
														.text(clickText)
														.append(
																'<i class="fa fa-angle-down"></i>');
												$(".menu1-down").slideUp(300);
											});

							/***************************************/

							$(".span-img")
									.click(
											function() {
												if ($(".menu2-drop").is(
														":hidden")) {
													if ($(".menu1-down").is(
															":visible")) {
														$(".menu1-down").hide();
														$("#span-text-a")
																.find("i")
																.attr("class",
																		"fa fa-angle-down");
													}
													$(this)
															.find("div")
															.text("")
															.append(
																	'<i class="fa fa-angle-down"></i>');
													$(".menu2-drop").slideDown(
															300);
												} else {
													$(this).find("div").text(
															"4").remove("i");
													$(".menu2-drop").slideUp(
															300);
												}
											})
							$(".menu2-drop-ul li").hover(
									function() {
										$(this).addClass("focus").siblings()
												.removeClass();
									}).click(
									function() {
										var $clickText2 = $(this).find("p")
												.text();
										$("#input-text").attr("value",
												$clickText2);
										$(".menu2-drop").slideUp(300);
										$(".span-img").find("div").text("4")
												.remove("i");
									});
							$(".span-button").click(function() {
								$("#input-text").attr("value", "");
							});
						});
	</script>
</body>
</html>
