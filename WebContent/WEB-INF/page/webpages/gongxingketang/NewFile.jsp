<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="org.sccooperation.domain.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta charset="UTF-8">
<meta http-equiv=X-UA-Compatible content="IE=edge,chrome=1">
<!-- 以上代码IE=edge告诉IE使用最新的引擎渲染网页，chrome=1则可以激活Chrome Frame. -->
<title>躬行课堂-详情页</title>

<link rel="stylesheet" type="text/css"
	href="css/gongxingclass_detailpage1.css" />
<!-- <script type="text/javascript" src="jq/jquery-3.2.1.min.js"></script> -->
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="js/main.js"></script>
<script type="text/javascript">
	// 导航
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
		var fodinfo = document.getElementById(itemdl)
				.getElementsByTagName("li");
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
	
</script>
<meta charset="UTF-8">
<title>工作详情</title>
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
/*!课程分类
-------------------------------------------------------------------------------!*/
.container2 {
	width: 1024px !important;
	margin: 0 auto;
}

.body {
	margin-top: -40px;
}
/*!课程分类
-------------------------------------------------------------------------------!*/
.work-header {
	height: 230px;
	width: 100%;
	padding: 30px 0;
	background-color: #f3f5f4;
}

.work-head-left {
	width: 70%;
	float: left;
}

.work-head-right {
	width: 30%;
	float: right;
}

.work-header .label {
	display: block;
	width: 80px;
	height: 25px;
	border-radius: 10px;
	text-align: center;
	line-height: 25px;
	background-color: white;
	font-weight: 300;
	float: left;
	margin-right: 10px;
}

.work-header .publish-time {
	clear: left;
	position: relative;
	top: 20px;
}

.work-head-btn {
	display: block;
	height: 40px;
	padding: 7px 0;
	width: 120px;
	text-align: center;
	letter-spacing: 1px;
	float: left;
	margin-right: 15px;
	border-radius: 5px;
	margin-top: 33px;
}

.work-head-btn-left {
	border: 1px solid #0099CC;
	color: #0099CC;
	background: white;
}

.work-head-btn-left i {
	margin-right: 7px;
}

.work-head-btn-left:hover {
	color: #09c;
}

.work-head-btn-right {
	background: grey;
	color: white;
}

.work-head-btn-right:hover {
	color: white;
}

.work-head-resume {
	display: block;
	width: 120px;
	height: 35px;
	margin-right: 20px;
	float: left;
}

.work-head-resume {
	position: relative;
	top: 20px;
}

.work-head-resume a {
	text-decoration: underline;
}

.title-intro {
	position: relative;
	top: -4px;
	left: 3px;
	letter-spacing: 1px;
}
/*!课程分类
-------------------------------------------------------------------------------!*/
.work-body {
	padding: 40px 0;
	/*background: #f3f5f4;*/
}

.condition-title {
	margin-bottom: 15px;
	font-size: 16px;
}

.work-body-condition {
	margin-bottom: 40px;
}

.work-body-left {
	width: 68%;
	float: left;
	background: white;
}

.work-body-right {
	width: 25%;
	float: right;
	background: white;
}
/*!课程分类
-------------------------------------------------------------------------------!*/
.work-body-hr {
	
}

.condition-left-img {
	width: 70px;
	height: 70px;
	border: 1px solid #eee;
	margin-right: 20px;
}

.condition-left i {
	margin-left: 10px;
}

.condition-left .main-font {
	position: relative;
	top: 8px;
}

.condition-title {
	clear: left;
}

.condition-left {
	width: 30%;
	float: left;
}

.condition-right {
	width: 60%;
	float: right;
}

.hot-company-list-item {
	display: block;
	width: 28%;
	float: left;
	margin-left: 12px;
	margin-bottom: 25px;
}

.hot-company-list-item:hover .hot-company-list-intro {
	color: #0099CC;
}

.hot-company-list-item .main-color {
	font-size: 14px;
	/*clear: right;*/
}

.hot-company-list-border {
	width: 1px;
	height: 35px;
	display: block;
	background: #eee;
	float: right;
	position: relative;
	top: 0px;
	left: 8px;
	/*margin-top: -17px;
	margin-left: 10px;*/
}

ul {
	padding: none;
	margin: 0;
}

.hot-company-body {
	margin-top: 20px;
}

.hot-company-list-intro {
	color: grey;
	font-size: 14px;
	clear: left;
	position: relative;
	left: 40px;
	top: 10px;
	font-weight: 300;
}
/*!课程分类
-------------------------------------------------------------------------------!*/
.company-info {
	/*padding-left: 40px;*/
	
}

.border {
	width: 5px;
	height: 1000px;
	display: block;
	background: #f3f5f4;
	position: relative;
	top: -100px;
}

.company-info .img-thumbnail {
	width: 100px;
	height: 100px;
	margin-right: 8px;
}

.company-info .font-title2 {
	position: relative;
	top: 76px;
}

.company-info .font-title2 i {
	margin-left: 8px;
}

.company-info .main-font {
	/*clear: left;*/
	
}

.company-info-list {
	clear: left;
	position: relative;
	top: 20px;
	padding: 0;
	margin-top: 20px;
}

.info-list-item {
	margin-bottom: 20px;
}

.company-info-list i {
	margin-right: 20px;
}

.similar-work {
	margin-top: 40px;
}

.condition-title-hr {
	display: block;
	height: 1px;
	width: 160px;
	background: grey;
	position: relative;
	top: 20px;
	left: 80px;
}

.similar-work img {
	width: 60px;
	height: 60px;
}

.similar-work .media {
	clear: left;
	display: block;
	width: 100%;
	height: 100%;
}

.similar-work .media:hover {
	background: #f3f5f4;
}

.similar-work .font-title2 {
	font-weight: 300;
}

.similar-work .font-intro {
	font-weight: 300;
	margin-top: -8px;
}

.similar-work .media-right {
	position: relative;;
	left: 20px;
}

.similar-work .media-border {
	display: block;
	height: 1px;
	width: 240px;
	border-bottom: 2px dotted #eee;
}
/*!课程分类
-------------------------------------------------------------------------------!*/
</style>
</head>
<body>

	<style>
.modal {
	/*position: relative;*/
	top: 50%;
	margin-top: -85px;
}

.modal-dialog {
	background: rgba(0, 0, 0, 0.1);
}
</style>



	<!-- 登陆框、联系方式 -->

	<div id="head-link" class="login">
		<div class="container">
			<div class="col-xs-12">
				<div class="login-in">
					<form id="login-form" action="" method="post">
						<p class="main-font">学生代码:</p>
						<input type="text" name="id">
						<p class="main-font">密码:</p>
						<input type="password" name="password">
						<p class="main-font">验证码:</p>
						<input id="input-code" type="text" name="code"> <img
							src="" alt="" class="code-img"> <input id="login-btn"
							type="submit" value="登陆">
					</form>
				</div>
				<div class="login-tel">
					<i class="fa fa-phone fa-lg"></i>
					<p class="main-font">咨询电话：010-82319999转2846</p>
				</div>
			</div>
		</div>
	</div>
	<!-- 导航条 -->
	<div class="navbar">
		<div class="container">
			<div class="col-xs-12">
				<div class="navbar-left">
					<img src="./img/logo.png" alt="" class="navbar-logo"> <span
						class="navbar-border"></span> <a href="#" class="navbar-title">大创项目</a>
				</div>
				<div class="navbar-right">
					<ul class="navbar-body">
						<li class="navbar-body-item"><a id="lock" href="#"
							class="navbar-link">项目介绍</a></li>
						<li class="navbar-body-item"><a href="#" class="navbar-link">躬行课堂</a></li>
						<li class="navbar-body-item"><a href="#" class="navbar-link">创行谷管理</a></li>
						<li class="navbar-body-item"><a href="#" class="navbar-link">知行圈</a></li>
						<li class="navbar-body-item"><a href="#" class="navbar-link">个人中心</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	<!-- 导航条 结束-->
	<div class="body">


		<!-- work-head ending -->
		<div class="work-body">
			<div class="container">
				<div class="col-xs-12">
					<div class="videoli">
						<div id="cans">
							<video controls="controls" id="video" 　src="" poster=""
								height="500px" width="760px"> </video>
							<aside id="playList"> <header>
							<h2>&nbsp;播放列表</h2>
							</header>

							<div id="mainBox">
								<ul id="content">
									<li name="list" value="video/VID_20170323_193609.mp4"
										title="进球瞬间">进球瞬间</li>
									<li name="list" value="video/VID_20170323_215451.mp4"
										title="胜利庆祝">胜利庆祝</li>
									<li name="list" value="video/VID_20170323_193609.mp4"
										title="进球瞬间">进球瞬间</li>
									<li name="list" value="video/VID_20170323_215451.mp4"
										title="胜利庆祝">胜利庆祝</li>
									<li name="list" value="video/VID_20170323_193609.mp4"
										title="进球瞬间">进球瞬
									<li>
									<li name="list" value="video/VID_20170323_215451.mp4"
										title="胜利庆祝">胜利庆祝</li>
									<li name="list" value="video/VID_20170323_193609.mp4"
										title="进球瞬间">进球瞬间</li>
									<li name="list" value="video/VID_20170323_215451.mp4"
										title="胜利庆祝">胜利庆祝</li>
									<li name="list" value="video/VID_20170323_193609.mp4"
										title="进球瞬间">进球瞬间</li>
									<li name="list" value="video/VID_20170323_215451.mp4"
										title="胜利庆祝">胜利庆祝</li>
									<li name="list" value="video/VID_20170323_193609.mp4"
										title="进球瞬间">进球瞬
									<li>
									<li name="list" value="video/VID_20170323_215451.mp4"
										title="胜利庆祝">胜利庆祝</li>
									<li name="list" value="video/VID_20170323_193609.mp4"
										title="进球瞬间">进球瞬间</li>
									<li name="list" value="video/VID_20170323_215451.mp4"
										title="胜利庆祝">胜利庆祝</li>
									<li name="list" value="video/VID_20170323_193609.mp4"
										title="进球瞬间">进球瞬间</li>
									<li name="list" value="video/VID_20170323_215451.mp4"
										title="胜利庆祝">胜利庆祝</li>
									<li name="list" value="video/VID_20170323_193609.mp4"
										title="进球瞬间">进球瞬
									<li>
									<li name="list" value="video/VID_20170323_215451.mp4"
										title="胜利庆祝">胜利庆祝</li>
								</ul>
							</div>
							<button title="收起播放列表" id="playList-hidden">></button>
							</aside>
							<button title="展开播放列表" id="playList-show1"><</button>
						</div>
					</div>
					
				</div>
				<!-- markcopy -->
					<div class="work-body-left">

						<!-- 成功显示 -->
						<%
							if (request.getAttribute("JobInfo") != null) {
								List JobInfo = (List) request.getAttribute("JobInfo");
								Post post = (Post) JobInfo.get(0);
						%>

						<div class="work-body-condition">
							<h5 class="condition-title">职位诱惑:</h5>
							<p class="main-font"><%=post.getAllure()%></p>
						</div>
						<div class="work-body-condition">
							<h5 class="condition-title">职位描述:</h5>
							<h5 class="main-font">基本要求：</h5>
							<p class="main-font">
								<%
									String br = post.getDemand();
										String[] brs = br.split("[|]");
										int brslength = brs.length;
										System.out.println("successfully" + brslength);
										for (int i = 0; i < brslength; i++) {
								%>
								<%=i + 1%>、<%=brs[i]%>
								<%
									if (i < brslength) {
								%>
								<br>
								<%
									}
										}
								%>

							</p>
						</div>
						<div class="work-body-condition">
							<h5 class="condition-title">工作地址:</h5>
							<p class="main-font float">
								<span class="main-color inline-block"><%=post.getPlace()%></span>
							</p>
							<p class="main-font float-right">
								<a id="underline" class="underline" href="#"><span
									class="main-color inline-block">查看地图</span></a>
							</p>
						</div>

						<br>
						<!-- work-body-condition ending -->
						<div class="work-body-condition work-body-hr">
							<h5 class="condition-title">职位发布者:</h5>
							<div class="condition-left">
								<img src="<%=post.getPictureurl()%>" alt=""
									class="condition-left-img img-circle float">
								<p class="main-font">
									<%=post.getManager_id().getNickname()%><i
										class="fa fa-lg fa-commenting-o main-color"></i>
								</p>
								<p class="main-font grey2">职位发布者</p>
							</div>
							<!-- condition-left ending -->
							<div class="condition-right">
								<a href="#" class="hot-company-list-item float"> <span
									class="main-color">122</span>
									<h4 class="main-font float  hot-company-list-intro">面试评价</h4> <span
									class="hot-company-list-border"></span>
								</a> <a href="#" class="hot-company-list-item float"> <span
									class="main-color">38</span>
									<h4 class="main-font float  hot-company-list-intro">在找职位</h4> <span
									class="hot-company-list-border"></span>
								</a> <a href="#" class="hot-company-list-item float"> <span
									class="main-color">100%</span>
									<h4 class="main-font float hot-company-list-intro">简历处理率</h4>
								</a>
							</div>
							<!-- condition-right ending -->
						</div>
						<!-- work-body-condition ending -->


						<%
							} else {
						%>
						<!-- 错误显示 -->
						<div class="work-body-left">
							<div class="work-body-condition">
								<h5 class="condition-title">error职位诱惑:</h5>
								<p class="main-font">error五险一金,节假福利,带薪年假,交通补贴</p>
							</div>
							<div class="work-body-condition">
								<h5 class="condition-title">职位描述:</h5>
								<h5 class="main-font">基本要求：</h5>
								<p class="main-font">
									1、ERROR<br> 2、ERROR<br> 3、ERROR<br> 4、ERROR<br>

									5、ERROR<br> 6、ERROR<br> 7、ERROR
								</p>
								<h5 class="main-font">岗位职责：</h5>
								<p class="main-font">
									1、ERROR<br> 2、ERROR<br> 3、ERROR<br> 4、ERROR
								</p>
							</div>
							<div class="work-body-condition">
								<h5 class="condition-title">工作地址:</h5>
								<p class="main-font float">error</p>
								<p class="main-font float-right">
									<a id="underline" class="underline" href="#"> <span
										class="main-color inline-block">查看地图</span></a>
								</p>
							</div>

							<br>
							<!-- work-body-condition ending -->
							<div class="work-body-condition work-body-hr">
								<h5 class="condition-title">职位发布者:</h5>
								<div class="condition-left">
									<img src="./img/class-teach.jpg" alt=""
										class="condition-left-img img-circle float">
									<p class="main-font">
										errorname<i class="fa fa-lg fa-commenting-o main-color"></i>
									</p>
									<p class="main-font grey2">职位发布者</p>
								</div>
								<!-- condition-left ending -->
								<div class="condition-right">
									<a href="#" class="hot-company-list-item float"> <span
										class="main-color">errornum</span>
										<h4 class="main-font float  hot-company-list-intro">面试评价</h4>
										<span class="hot-company-list-border"></span>
									</a> <a href="#" class="hot-company-list-item float"> <span
										class="main-color">errornum</span>
										<h4 class="main-font float  hot-company-list-intro">在找职位</h4>
										<span class="hot-company-list-border"></span>
									</a> <a href="#" class="hot-company-list-item float"> <span
										class="main-color">errornum%</span>
										<h4 class="main-font float hot-company-list-intro">简历处理率</h4>
									</a>
								</div>
								<!-- condition-right ending -->
							</div>
							<!-- work-body-condition ending -->
						</div>




						<%
							}
						%>
					</div>
					<div class="work-body-right">
						<!-- <span class="border float"></span> -->

						<%
							if (request.getAttribute("JobInfo") != null) {
								List JobInfo = (List) request.getAttribute("JobInfo");
								Post post = (Post) JobInfo.get(0);
						%>
						<div class="company-info">
							<img class="float img-thumbnail" src="./img/work-intro-logo.png"
								alt="">
							<p class="font-title2">
								<%=post.getEname()%><i class="fa fa-lg fa-shield main-color"></i>
							</p>
							<ul class="company-info-list">

								<%
									if (request.getAttribute("ETagName") != null) {
											List ETagNameList = (List) request.getAttribute("ETagName");
											int ETagNameListSize = ETagNameList.size();

											for (int i = 0; i < ETagNameListSize; i++) {
												if (i < ETagNameListSize) {
													Tag tag = (Tag) ETagNameList.get(i);
								%>
								<li class="info-list-item">
									<p class="main-font grey2">
										<i class="fa fa-lg fa-user-o"></i><%=tag.getTagname()%>
									</p>
								</li>
								<%
									} else {
								%>
								<li class="info-list-item">
									<p class="main-font grey2">
										<i class="fa fa-lg fa-user-o"></i>error移动互联网,电子商务
									</p>
								</li>


								<%
									}
											}
										}
								%>
							</ul>
						</div>
						<%
							}
						%>
						<!-- company-info ending -->


					<div class="similar-work">
							<h5 class="condition-title float">其他工作</h5>
							<span class="condition-title-hr"></span>
							
							
							<% 	
							
						
							
						if (request.getAttribute("OtherJob") != null) {
							List OtherJob = (List)request.getAttribute("OtherJob");
							int OtherJobLength = OtherJob.size();
							
							for (int i = 0; i < 5; i++) {
								if (OtherJobLength < i) {
									Post post = (Post)OtherJob.get(i);
							%>
							<!-- media-item ending -->
							<span class="media-border"></span> <a href="#" class="media">
								<div class="media-left">
									<a href="#"> <img class="media-object img-thumbnail"
										src="<%=post.getPictureurl() %>" alt=".">
									</a>
								</div>
								<div class="media-body">
									<h4 class="media-heading font-title2">
										<a href="#"><%=post.getSummary() %></a>
									</h4>
									<p class="font-title2 red"><%=post.getRemuneration() %></p>
									<p class="font-intro"><%=post.getEname() %> [<%=post.getPlace() %>]</p>
								</div>
							</a>

							<% } else { %>

							<!-- media-item ending -->
							<span class="media-border"></span> <a href="#" class="media">
								<div class="media-left">
									<a href="#"> <img class="media-object img-thumbnail"
										src="./img/hot-company1.png" alt=".">
									</a>
								</div>
								<div class="media-body">
									<h4 class="media-heading font-title2">
										<a href="#">error job</a>
									</h4>
									<p class="font-title2 red">error price</p>
									<p class="font-intro">error软件[error location]</p>
								</div>
							</a>

							<% } } } %>
							<span class="media-border"></span>
						</div>


					</div>
					<!-- markcopy -->
			</div>
		</div>
		<!-- work-body ending -->

	</div>
	<div class="footer margin">
		<div class="container">
			<div class="row">
				<div class="col-xs-4">
					<img src="./img/logo_bottom.png" alt=""> <span
						class="footer-brd footer-brd1 pull-right"></span>
				</div>
				<div class="col-xs-4">

					<p class="footer-address">地址:广东省珠海市唐家湾金凤路6号 邮编：519088</p>
					<p class="footer-address">联系电话：0756-3622745 招生咨询电话：0756-3622966
					</p>
					<p class="footer-address">邮箱：zhbit@zhbit.com</p>

				</div>
				<div class="col-xs-4">
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
		<script src="./plugin/js/jquery.min.js"></script>
		<!-- Bootstrap -->
		<script src="./plugin/js/bootstrap.min.js"></script>
		<!-- Owl Carousel -->
		<script src="./plugin/js/owl.carousel.min.js"></script>

		<script src="./plugin/js/fix-menu.js"></script>
		<script>
       $(function(){
       	  /*!侧边菜单栏
-------------------------------------------------------------------------------!*/
$(window).scroll(function() {

          if(($(this).scrollTop() > 0)) {
            
            $(".fixed-munu-item").css("opacity","1");
        }
        else{
             $(".fixed-munu-item").css("opacity","0");
        }
              
      });
     $(window).load(function() {

          if(($(this).scrollTop() > 0)) {
            
            $(".fixed-munu-item").css("opacity","1");
        }
        else{
             $(".fixed-munu-item").css("opacity","0");
        }
              
      });
     //滚动监听完成
     $(".fixed-munu-item").hover(
           function() {   
               $(this).find(".fixed-munu-item-icon").css("background","#0099CC");
           $(this).find(".fixed-munu-item-icon i").css("color","#eee");
           $(this).find(".fixed-munu-item-content").animate({width:"120px"},1000).css("visibility","visible");

         },function(){         
             $(this).find(".fixed-munu-item-content").css({"visibility":"hidden","width":"80px"});
         $(this).find(".fixed-munu-item-icon").css("background","#7d6d6d");
             $(this).find(".fixed-munu-item-icon i").css("color","#eee");
           }
      );
      $(".fixed-munu-item-content").hover(
           function(){  
              $(this).find(".fix-menu-item-door").css("visibility","visible");
           },function(){
              $(this).find(".fix-menu-item-door").css("visibility","hidden");
           }
      );
      //侧边回馈栏完成
  
	</script>

		<!-- Modal -->
</body>
</html>