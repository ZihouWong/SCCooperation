<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@page import="java.util.List"%>
<%@page import="org.sccooperation.domain.*"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>躬行课堂</title>
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
.team-class .class-parter {
	margin-bottom: 0;
}

.class-parter {
	height: 290px;
}

.class-parter-item {
	width: 32%;
	float: left;
	margin-right: 3px;
}

.class-parter-item .main-font {
	font-size: 12px;
}

.class-parter-body {
	padding: 10px 5px;
}

.class-teacher .hot-class-item {
	height: 360px;
}

.class-teacher .hot-class-body {
	padding: 10px 5px;
}

.class-teacher .main-font {
	font-size: 12px;
	color: grey;
}

span {
	display: block;
}

/*!课程分类
-------------------------------------------------------------------------------!*/
.body {
	margin-top: -40px;
}

.menu {
	position: relative;
	width: 280px;
}

.menu-list {
	padding: 15px 0;
	margin: 9;
	padding-top: 0;
	list-style: none;
	background-color: #eee;
	color: black;
	border-right-width: 0;
}

.menu-title {
	display: block;
	height: 30px;
	line-height: 30px;
	padding-left: 12px;
	letter-spacing: 1px;
	cursor: pointer;
	font-size: 14px;
	position: relative;
}

.menu-head {
	width: 280px;
	height: 40px;
	line-height: 40px;
	font-size: 16px;
	font-weight: bold;
	text-align: center;
	position: relative;
	letter-spacing: 1px;
	background: #0099CC;
	color: white;
}

.menu-title i {
	margin-right: 7px;
	margin-top: 4px;
}

.menu-title.active {
	background-color: #f5f7f9;
	border-left: 3px solid #0099CC;
}

.menu-title span:hover {
	/*color: white;*/
	
}

.display {
	display: none;
}

.menu-body {
	width: 600px;
	z-index: 100;
	position: absolute;
	border: 1px solid #f7f7f7;
	color: black;
	background-color: #f5f7f9;
	box-shadow: 2px 0 5px rgba(0, 0, 0, .3);
	left: 280px;
	top: 0;
	box-sizing: border-box;
	margin: 0;
	padding-left: 10px;
}

.menu-body-item {
	height: 345px;
}

.menu-body-item a {
	font-size: 12px;
	color: #666;
	text-decoration: none;
}

.menu-body-item dd a {
	border-left: 1px solid #e0e0e0;
	padding: 0 10px;
	margin: 4px 0;
}

.menu-body-item dl {
	overflow: hidden;
}

.menu-body-item dt {
	float: left;
	width: 70px;
	font-weight: bold;
	clear: left;
	position: relative;
}

.menu-body-item dd {
	float: left;
	margin-right: 5px;
	border-top: 1px solid #eee;
	margin-bottom: 5px;
}

.menu-body-item dt i {
	width: 4px;
	height: 14px;
	font: 400 9px/14px consolas;
	position: absolute;
	right: 5px;
	top: 5px;
}
/*!轮播图
-------------------------------------------------------------------------------!*/
.carousel {
	height: 340px;
	width: 100%;
	/*margin-top: 40px;*/
}

#owl-demo {
	width: 100%;
	height: 100%;
}

#owl-demo .item {
	display: block;
}

#owl-demo img {
	display: block;
	height: 386px;
	width: 100%;
}

.carousel #owl-demo .item-intro {
	position: absolute;
	width: 100%;
	background: rgba(0, 0, 0, 0.45);
	padding: 1em .7em;
	bottom: 0;
	color: white;
	font-size: 1.4em;
	text-align: center;
}

.carousel .owl-dots {
	position: absolute;
	display: block;
	right: 10px;
	clear: both;
	/*bottom: 18px;*/
	top: 50%;
}
/* .carousel .owl-dots span {
			 	display: block;
			 	clear: both;
			 	float: none;
			 }*/
.owl-dots .owl-dot.active span, .owl-dots .owl-dot:hover span {
	background: none;
	border: 2px solid #f66d52;
}
/*!主题内容-课程推荐
-------------------------------------------------------------------------------!*/
.hot-class-item {
	height: 270px;
	width: 100%;
	border: 1px solid #eee;
	margin-bottom: 20px;
}

.hot-class-heading {
	height: 40px;
	background: #f5f7f9;
	padding: 7px 15px;
}

.hot-class-border {
	width: 5px;
	height: 18px;
	background: #0099CC;
	float: left;
	margin-right: 7px;
}

.hot-class-title {
	font-size: 16px;
	font-weight: bold;
	color: black;
	margin-top: -2px;
	float: left;
}

.hot-class-refresh, .hot-class-heading i, .mask {
	float: right;
	color: grey;
	font-size: 12px;
}

.fa-refresh {
	margin-top: 3px;
	margin-right: 5px;
}

.hot-class-heading a:hover {
	text-decoration: underline;
}

.class-body-item-img {
	width: 100%;
	height: 120px;
}

.class-body-item-img1 {
	background: url("./img/hot-class1.jpg");
}

.class-body-item-img2 {
	background: url("./img/hot-class2.jpg");
}

.class-body-item-img3 {
	background: url("./img/hot-class3.jpg");
}

.class-body-item-img4 {
	background: url("./img/hot-class4.jpg");
}

.hot-class-body-item {
	padding: 15px 0;
	display: block;
}

.class-body-item-img:hover {
	animation: key1 0.7s linear 0s 1 alternate;
	-webkit-animation-fill-mode: both;
	-o-animation-fill-mode: both;
	animation-fill-mode: both;
}

@
keyframes key1 { 0% {
	background-size: 100% 100%;
}

50%{
background-size


:


102%
102%;
}
100%
{
background-size


:


105%
105%;
border-right


:


2
px

 

dotted

 

#424c50


;
border-bottom


:


1
px

 

dotted

 

#424c50


;
box-shadow


:


4
px

 

3
px

 

3
px

 

#a1afc9


;
}
/*!主题内容-课程分享
-------------------------------------------------------------------------------!*/
.share-class {
	height: 560px;
	width: 100%;
}

.share-class-item {
	display: block;
	width: 200px;
	height: 200px;
	margin: 0 auto;
	margin-bottom: 20px;
	/*background: url("./img/share-class-img1");*/
}

#share-class-item-img {
	width: 100%;
	height: 100%;
}

.share-class-body {
	padding-top: 15px;
}
/*!主题内容-课程分享2
-------------------------------------------------------------------------------!*/
</style>
<style>
.hot-class-item2 {
	height: 330px;
}

.hot-class-item2 .hot-class-title-intro {
	margin-left: 30px;
}

.hot-class-item2 .hot-class-title-intro a {
	color: grey;
}

.hot-class-item2 .mask a {
	color: grey;
}

.hot-class-item2 .class-body-item-img {
	width: 45%;
	float: left;
	margin-right: 20px;
}

.hot-class-item2 i {
	margin-top: 3px;
}

.hot-class-item2 .fa-clock-o {
	margin-left: 3px;
}

.hot-class-item2 .class-body-item-study {
	position: relative;
	left: -30px;
	margin-right: 10px;
}

.hot-class-item2 #class-body-item-intro {
	position: relative;
	left: 3px;
}
</style>
</head>
<body>
	<!-- 登陆框、联系方式 -->
	<div id="head-link" class="login">
		<div class="container">
			<div class="login-in">
				<form id="login-form" action="" method="post">
					<p class="main-font">学生代码:</p>
					<input type="text" name="id">
					<p class="main-font">密码:</p>
					<input type="password" name="password">
					<p class="main-font">验证码:</p>
					<input id="input-code" type="text" name="code"> <img src=""
						alt="" class="code-img"> <input id="login-btn" type="submit"
						value="登陆">
				</form>
			</div>
			<div class="login-tel">
				<i class="fa fa-phone fa-lg"></i>
				<p class="main-font">咨询电话：010-82319999转2846</p>
			</div>
		</div>
	</div>
	<!-- 导航条 -->
	<div class="navbar">
		<div class="container">
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
	<!-- 主体内容 开始 -->
	<div class="body">
		<!-- 课程分类菜单栏 开始 -->
		<div class="all-class">
			<div class="container">
				<div class="col-xs-3">
					<div class="menu-head">所有工作分类</div>
					<div class="menu">
						<ul class="menu-list">
							<%
								String[] array = {"编程", "设计", "IT软件", "求职", "职场", "办公软件", "英语", "日语", "法语", "韩语", "营销", "理财", "专业技能", "钢琴",
										"建造师", "国学", "省学", "学历教育", "高考", "中考", "小升初", "考研", "四六级", "计算机考试", "雅思", "托福", "留学指导", "生活", "文化",
										"兴趣", "学术", "TED", "名校公开课"};

								for (int i = 0; i < 33; i++) {

									if (i % 3 == 0) {
							%>
							<li class="menu-title">
								<%
									}
								%> <a
								href="gongxingketangtest.action?button=<%=i + 1%>&pageNo=1">
									<span><%=array[i]%> </span>
							</a> <%
 	}
 %>
							
						</ul>
					</div>
					<!-- menu ending -->
				</div>
				<!-- col-xs-4 ending -->


				<div class="col-xs-9">
					<div class="carousel">
						<div id="owl-demo" class="owl-carousel">
							<a class="item"><img src="	" alt=""></a> <a class="item"><img
								src="./img/owl-img2.png" alt=""></a> <a class="item"><img
								src="./img/owl-img3.png" alt=""></a> <a class="item"><img
								src="./img/owl-img4.png" alt=""></a> <a class="item"><img
								src="./img/owl-img5.png" alt=""></a>
						</div>
					</div>
				</div>
				<!-- col-xs-9 ending -->
			</div>
			<!-- container ending -->
		</div>
		<!-- 课程分类菜单栏 结束 -->


		<!-- 课程具体推荐 开始 -->
		<div class="intro-class">
			<div class="container">
				<div class="col-xs-9">


					<!-- hot-class-item ending -->
					<div class="hot-class-item hot-class-item2">
						<div class="hot-class-heading">
							<span class="hot-class-border"></span>
							<p class="hot-class-title">
								精品课程
								<!-- mark TITLENAME -->
							</p>
							<%
								if (request.getAttribute("TagName") != null) {
									List tag = (List) request.getAttribute("TagName");
									Tag tagName = (Tag) tag.get(0);
							%>
							<p class="main-font hot-class-title-intro float ">
								<a href="#"><%=tagName.getTagname()%></a>
							</p>
							<%
								}
							%>
							<p class="main-font hot-class-refresh mask">
								<a href="#">更多</a>
							</p>
							<!-- <i class="fa fa-refresh fa-1x"></i> -->
						</div>
						<div class="hot-class-body">

							<%
								if (request.getAttribute("CourseList") != null) {
									List CourseList = (List) request.getAttribute("CourseList");
									int CourseListLength = CourseList.size();
									for (int i = 0; i < 8; i++) {
										if (CourseListLength > i) {
											Course course = (Course) CourseList.get(i);
							%>
							<!-- 正确显示 -->

							<div class="col-xs-6">
								<a href="#" class="hot-class-body-item">
									<div class="class-body-item-img class-body-item-img1"></div> <a
									class="class-body-item-title text-center"
									href="showcourseinfo.action?pageNo=0&courseNo=<%=course.getId()%>&peopleid=<%=course.getPeople_id() %>"><%=course.getTitle()%></a>
									<p class="main-font mask">
										<i class="fa fa-clock-o fa-lg float grey2"></i><span
											class="main-color float"><%=course.getTimeconsuming()%></span>课时
									</p>
									<p class="mask class-body-item-study">
										<i class="fa fa-user-o fa-lg float"></i><span
											class="main-color float"><%=course.getSeenum()%>万</span>次学习
									</p> <i class="fa fa-people fa-1x"></i>
									<h5 id="class-body-item-intro"
										class="class-body-item-intro main-color">
										<%
											if (course.getPrice() == 0) {
										%>免费<%
											} else {
										%><%=course.getPrice()%>元
										<%
											}
										%>
									</h5>
								</a>
								<!-- hot-class-body-item ending -->
							</div>
							<!-- col-xs-6 ending -->




							<%
								} else {
							%>

							<!-- 错误显示 -->
							<div class="col-xs-6">
								<a href="#" class="hot-class-body-item">
									<div class="class-body-item-img class-body-item-img1"></div>
									<h5 class="class-body-item-title text-center">eR-title</h5>
									<p class="main-font mask">
										<i class="fa fa-clock-o fa-lg float grey2"></i><span
											class="main-color float">eR-t</span>课时
									</p>
									<p class="mask class-body-item-study">
										<i class="fa fa-user-o fa-lg float"></i><span
											class="main-color float">eRs万</span>次学习
									</p> <i class="fa fa-people fa-1x"></i>
									<h5 id="class-body-item-intro"
										class="class-body-item-intro main-color">eRprice</h5>
								</a>
								<!-- hot-class-body-item ending -->
							</div>
							<!-- col-xs-6 ending -->

							<%
								}
									}
								}
							%>
						</div>
						<!-- hot-class-body ending -->

					</div>
					<!-- hot-class-item ending -->
				</div>
				<!-- col-xs-9 ending -->
				<div class="col-xs-3">
					<!-- 最近直播课 开始 -->
					<div class="recent-class"></div>
					<!-- 课程排名 开始 -->
					<div class="list-class"></div>
					<!-- 合作伙伴模块 开始 -->
					<div class="team-class ">
						<div class="hot-class-item class-parter">
							<div class="hot-class-heading">
								<span class="hot-class-border"></span>
								<p class="hot-class-title">合作伙伴</p>
								<p class="main-font hot-class-refresh mask">
									<a href="#">更多</a>
								</p>
								<!-- <i class="fa fa-refresh fa-1x"></i> -->
							</div>

							<div class="hot-class-body class-parter-body">
								<%
									if (request.getAttribute("EnterpriseList") != null) {
										List partner = (List) request.getAttribute("EnterpriseList");
										int partnerLength = partner.size();
										for (int i = 0; i < 6; i++) {
											if (i < partnerLength) {
												Enterprise enterprise = (Enterprise) partner.get(i);
								%>

								<!-- 正确显示 -->
								<div class="class-parter-item">
									<!-- mark——详细页面 -->
									<a href=""> <img style="width: 100%; height: 100%"
										src="<%=enterprise.getPictureurl()%>" alt="">

										<p class="main-font">
											<a href="#"><%=enterprise.getEname()%></a>
										</p>
									</a>
								</div>
								<%
									} else {
								%>

								<!-- 错误显示 -->
								<div class="class-parter-item">
									<a href="#"> <img style="width: 100%; height: 100%"
										src="./img/class-parter.jpg" alt="">
										<p class="main-font">
											<a href="#">error-ename</a>
										</p>
									</a>
								</div>

								<%
									}
										}
									}
								%>
							</div>
							<!-- hot-class-body ending -->
						</div>
					</div>
					<!-- 合作伙伴模块 结束 -->
					<!-- 明星教师开始 结束 -->
					<!-- <div class="class-teacher">
						<div class="hot-class-item">
							<div class="hot-class-heading">
								<span class="hot-class-border"></span>
								<p class="hot-class-title">明星讲师</p>
								<p class="main-font hot-class-refresh mask">
									<a href="#">更多</a>
								</p>
								<i class="fa fa-refresh fa-1x"></i>
							</div>
							<div class="hot-class-body">
								<div class="media">
									<div class="media-left">
										<a href="#"> <img class="media-object"
											src="./img/class-teach.jpg" style="width: 60px; height: 60px"
											alt="..">
										</a>
									</div>
									<div class="media-body">
										<h6 class="media-heading">汉普爸爸</h6>
										<p class="main-font">汉普老师-自闭症康复教育培训</p>
									</div>
								</div>
								media ending
								<div class="media">
									<div class="media-left">
										<a href="#"> <img class="media-object"
											src="./img/class-teach.jpg" style="width: 60px; height: 60px"
											alt="..">
										</a>
									</div>
									<div class="media-body">
										<h6 class="media-heading">汉普爸爸</h6>
										<p class="main-font">汉普老师-自闭症康复教育培训</p>
									</div>
								</div>
								media ending
								<div class="media">
									<div class="media-left">
										<a href="#"> <img class="media-object"
											src="./img/class-teach.jpg" style="width: 60px; height: 60px"
											alt="..">
										</a>
									</div>
									<div class="media-body">
										<h6 class="media-heading">汉普爸爸</h6>
										<p class="main-font">汉普老师-自闭症康复教育培训</p>
									</div>
								</div>
								media ending
								<div class="media">
									<div class="media-left">
										<a href="#"> <img class="media-object"
											src="./img/class-teach.jpg" style="width: 60px; height: 60px"
											alt="..">
										</a>
									</div>
									<div class="media-body">
										<h6 class="media-heading">汉普爸爸</h6>
										<p class="main-font">汉普老师-自闭症康复教育培训</p>
									</div>
								</div>
								media ending
							</div>
							hot-class-body ending

						</div>
					</div> -->
					<!-- 明星教师模块 结束 -->
				</div>
			</div>
		</div>

		<!-- 课程具体推荐 结束 -->
		<!-- 推荐课程模块 开始 -->
		<div class="hot-class">
			<div class="container">
				<div class="col-xs-9">
					<div class="hot-class-item">

						<div class="hot-class-heading">
							<span class="hot-class-border"></span>
							<p class="hot-class-title">猜你喜欢</p>
							<p class="main-font hot-class-refresh mask">
								<a href="#">换一批</a>
							</p>
							<i class="fa fa-refresh fa-1x"></i>
						</div>


						<div class="hot-class-body">


							<!-- 正确显示 -->
							<%
								if (request.getAttribute("GuessULike") != null) {
									List GuessUlike = (List) request.getAttribute("GuessULike");
									int GuessLength = GuessUlike.size();
									for (int i = 0; i < 12; i++) {
										if (i < GuessLength) {
											Course course = (Course) GuessUlike.get(i);
							%>
							<div class="col-xs-3">
								<a href="#" class="hot-class-body-item">
									<div class="class-body-item-img class-body-item-img1"></div>
									<h5 class="class-body-item-title text-center"><%=course.getTitle()%></h5>
									<p class="class-body-item-intro float">
										<span class="main-color"> <%
 	if (course.getPrice() == 0) {
 %>免费<%
 	} else {
 %><%=course.getPrice()%>元 <%
 	}
 %>
										</span>
									</p>
									<p class="mask">
										<span class="main-color float"><%=course.getSeenum()%>万</span>次学习
									</p> <i class="fa fa-people fa-1x"></i>
								</a>
								<!-- hot-class-body-item ending -->
							</div>

							<%
								} else {
							%>


							<!-- 错误显示 -->
							<!-- col-xs-4 ending -->
							<div class="col-xs-3">
								<a href="#" class="hot-class-body-item">
									<div class="class-body-item-img class-body-item-img2"></div>
									<h5 class="class-body-item-title text-center">error-title</h5>
									<p class="class-body-item-intro float">
										<span class="main-color">error-price</span>
									</p>
									<p class="mask">
										<span class="main-color float">error-seenum</span>次学习
									</p> <i class="fa fa-people fa-1x"></i>
								</a>
								<!-- hot-class-body-item ending -->
							</div>
							<%
								}
									}
								}
							%>

						</div>
						<!-- hot-class-body ending -->

					</div>
					<!-- hot-class-item ending -->



					<!-- hot-class-item ending -->

				</div>
				<!-- col-xs-9 ending -->
				<div class="col-xs-3">
					<div class="hot-class-item share-class">
						<div class="hot-class-heading">
							<span class="hot-class-border"></span>
							<p class="hot-class-title">猜你喜欢</p>
							<p class="main-font hot-class-refresh mask">
								<a href="#">换一批</a>
							</p>
							<i class="fa fa-refresh fa-1x"></i>
						</div>
						<div class="hot-class-body share-class-body">
							<a href="#" class="share-class-item"><img
								src="./img/share-class-img1.jpg"
								style="width: 100%; height: 100%" alt=""
								class="share-class-item-img"></a> <a href="#"
								class="share-class-item"><img
								src="./img/share-class-img2.jpg"
								style="width: 100%; height: 100%" alt=""
								class="share-class-item-img"></a>
						</div>
						<!-- hot-class-body ending -->

					</div>
					<!-- hot-class-item ending -->
				</div>
				<!-- col-xs-3 ending -->
			</div>
		</div>
		<!-- 推荐课程模块 结束 -->
	</div>
	<!-- 主体部分 结束 -->
	<!-- 尾部 -->
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

	<!-- 侧边菜单栏 开始-->
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
	<!-- 侧边菜单栏 结束-->
	<!-- JQuery -->
	<script src="./plugin/js/jquery.min.js"></script>
	<!-- Bootstrap -->
	<script src="./plugin/js/bootstrap.min.js"></script>
	<!-- Owl Carousel -->
	<script src="./plugin/js/owl.carousel.min.js"></script>

	<script src="./plugin/js/fix-menu.js"></script>
	<script>
		$(function() {
			/*!课程分类
			 -------------------------------------------------------------------------------!*/
			var sub = $('.menu-body');
			$(".menu").on(
					'mouseenter',
					function(e) {
						sub.removeClass('display');
						$(".menu-title").on(
								'mouseenter',
								function(e) {
									$(this).addClass('active');
									var index = $(".menu-title").index(this);
									$(".menu-body-item").eq(index).show()
											.siblings().hide();
								});

						$(".menu-title").on(
								'mouseleave',
								function(e) {
									var index = $(".menu-title").index(this);

									if (!$(".menu-body-item").eq(index).css(
											"display") == "none") {
									} else {
										$(this).removeClass('active');
									}
								});
					}).on('mouseleave', function(e) {
				sub.addClass('display');
			});
			;
			/*!轮播图
			 -------------------------------------------------------------------------------!*/
			$('#owl-demo').owlCarousel({
				items : 1,
				autoplay : true,
				autoplayTimeout : 3000,
				animateIn : 'fadeIn',
				animateOut : 'fadeOut',
				// dotsSpeed:3000,
				loop : true
			// nav:true
			});

		});
	</script>
</body>






</html>