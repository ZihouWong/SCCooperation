<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="org.sccooperation.domain.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>esu_modify_password</title>

<link rel="stylesheet"
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>

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
#body {
	/*width: 100%;*/
	/*height: 800px;*/
	margin-top: -60px;
	background: #f5f7f9;
}

#body {
	padding-bottom: 60px;
}
/*!课程分类
-------------------------------------------------------------------------------!*/
.resume-intro {
	width: 100%;
	height: 800px;
	background: white;
	margin: 0 auto;
	margin-top: 40px;
	padding: 25px 45px;
}

.resume-detail {
	height: 240px;
}

.resume-intro-left {
	width: 50%;
	float: left;
	margin-top: 2px;
}

.resume-intro-right {
	width: 50%;
	float: right;
	background: #f3fafe;
	padding: 15px 10px;
	border: 2px dotted #eee;
	border-radius: 5px;
}

.user-img {
	width: 80px;
	height: 80px;
	border-radius: 50%;
	display: block;
	margin: 0 auto;
	border: 1px solid grey;
	font-weight: 300;
	overflow: hidden;
	margin-bottom: 20px;
}

.user-img:hover {
	background: grey;
}

.user-img:hover .fa-normal {
	display: none;
}

.user-img:hover .fa-active {
	display: inline-block;
	position: relative;
	top: 18px;
	left: 16px;
	color: white;
}

.user-img i {
	position: relative;
	left: 9px;
	top: 13px;
	color: #0099CC;
}

.resume-set .main-font {
	margin-right: 6px;
}

.resume-menu {
	clear: left;
	position: relative;
	left: 20px;
	top: -30px;
}

.resume-menu .font-intro {
	letter-spacing: 1px;
	position: relative;
	/*left: -2px;*/
	top: 5px;
}

.font-intro-right {
	position: relative;
	left: -10px;
}

.resume-menu-item:hover .font-intro {
	color: #0099CC;
}

.resume-menu-item:hover i {
	color: #0099CC;
}

.display {
	display: none;
}
/* .resume-intro .container {
     	background: white;
     	padding: 20px 10px;
     }*/
.resume-intro-left .main-font {
	margin-top: 8px;
	margin-left: 25px;
}

.resume-intro-left i {
	margin-top: 8px;
	margin-right: 30px;
}

.resume-info {
	clear: left;
	/*margin-left: -25px;
    	margin-top: 20px;*/
	position: relative;
	left: -25px;
	top: 20px;
}

.resume-left-list-item {
	text-align: center;
	width: 30%;
	float: left;
}

.resume-left-list-item:hover i {
	color: #0099CC;
}

.resume-left-list-item:hover .main-font {
	color: #0099CC;
}

.resume-left-list {
	position: relative;
	left: -42px;
	top: 135px;
}

.resume-left-list i {
	margin-left: 4px;
}

.resume-left-list .main-font {
	margin-left: -18px;
}

.hot-company-list-border {
	width: 1px;
	height: 50px;
	display: block;
	background: #eee;
	/*float: right;*/
	position: relative;
	top: 12px;
	left: -8px;
	float: left;
	/*margin-top: -17px;
	margin-left: 10px;*/
}
/*!课程分类
-------------------------------------------------------------------------------!*/
.apply-work-border {
	display: block;
	height: 18px;
	width: 3px;
	background: #0099CC;
	margin-right: 7px;
}

.apply-work {
	margin-top: 20px;
	/*height: 300px;*/
	background: white;
	padding: 25px 45px;
}

.apply-work .font-title2 {
	margin-bottom: 25px;
}

.apply-work-btn {
	display: block;
	width: 140px;
	height: 30px;
	color: white;
	background: #0099CC;
	text-align: center;
	letter-spacing: 1px;
	position: relative;
	top: -4px;
	margin-bottom: 20px;
	/*padding: 7px 0;*/
}

.select-p {
	margin-right: 9px;
}

input[type="checkbox"] {
	margin-right: 5px;
}

.apply-work-item-input {
	clear: left;
}

.apply-work-item {
	padding: 10px 20px;
	height: 80px;
	border-radius: 3px;
	cursor: pointer;
	border: 2px dotted #eee;
	margin-bottom: 15px;
}

.apply-work-item:hover {
	background: #eee;
}

.work-group {
	clear: left;
}

.work-place {
	position: relative;
	left: 30px;
}

.salary {
	position: relative;
	left: 500px;
}

.work-time {
	position: relative;
	left: 460px;
}

.apply-work i {
	position: relative;
	top: -24px;
}

.apply-work-item:hover i {
	color: #0099CC;
}
/*!课程分类
-------------------------------------------------------------------------------!*/
.modal {
	/*position: relative;*/
	top: 50%;
	margin-top: -85px;
}

.modal-dialog {
	background: rgba(0, 0, 0, 0.1);
}

.modal-body input {
	width: 180px;
}
/*!课程分类
-------------------------------------------------------------------------------!*/
nav {
	position: relative;
	left: 50%;
	margin-left: -110px;
}
</style>
</head>
<body>
	<!-- 导航条 -->
	<div class="navbar">
		<div class="container">
			<div class="col-xs-12">
				<div class="navbar-left">
					<img src="./img/logo.png" alt="" class="navbar-logo"> <span
						class="navbar-border"></span> <a href="#" class="navbar-title">大创项目</a>
				</div>
			</div>
		</div>
	</div>

	<!-- 导航条 结束-->
	<div class="space"></div>
	<div id="body" class="body"
		style="background: #f5f7f9; padding-bottom: 60px">
		<div class="container">
			<div class="col-xs-12">
				<div class="resume-intro">

					<form id="modifycv-form" action="esumdpwd.action" method="post"
						enctype="multipart/form-data">
						<div class="form-group">
							<label for="name">旧密码:</label> <input type="password"
								class="form-control" name="password_old">
						</div>
						<div class="form-group">
							<label for="name">新密码:</label> <input type="password"
								class="form-control" name="password_new">
						</div>
						<div class="form-group">
							<label for="name">再次输入新密码:</label> <input type="password"
								class="form-control" name="password_new_repeat">
						</div>
						<button type="submit" class="btn btn-default">提交</button>
					</form>

				</div>
			</div>
			<!-- container ending -->
		</div>
		<!-- body ending -->
		<div class="footer margin">
			<div class="container">
				<div class="row">
					<div class="col-xs-4">
						<img src="./img/logo_bottom.png" alt=""> <span
							class="footer-brd footer-brd1 pull-right"></span>
					</div>
					<div class="col-xs-4">

						<p class="footer-address">地址:广东省珠海市唐家湾金凤路6号 邮编：519088</p>
						<p class="footer-address">联系电话：0756-3622745
							招生咨询电话：0756-3622966</p>
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
				$(function() {
					/*!侧边菜单栏
					-------------------------------------------------------------------------------!*/
					$(window).scroll(function() {

						if (($(this).scrollTop() > 0)) {

							$(".fixed-munu-item").css("opacity", "1");
						} else {
							$(".fixed-munu-item").css("opacity", "0");
						}

					});
					$(window).load(function() {

						if (($(this).scrollTop() > 0)) {

							$(".fixed-munu-item").css("opacity", "1");
						} else {
							$(".fixed-munu-item").css("opacity", "0");
						}

					});
					//滚动监听完成
					$(".fixed-munu-item").hover(
							function() {
								$(this).find(".fixed-munu-item-icon").css(
										"background", "#0099CC");
								$(this).find(".fixed-munu-item-icon i").css(
										"color", "#eee");
								$(this).find(".fixed-munu-item-content")
										.animate({
											width : "120px"
										}, 1000).css("visibility", "visible");

							},
							function() {
								$(this).find(".fixed-munu-item-content").css({
									"visibility" : "hidden",
									"width" : "80px"
								});
								$(this).find(".fixed-munu-item-icon").css(
										"background", "#7d6d6d");
								$(this).find(".fixed-munu-item-icon i").css(
										"color", "#eee");
							});
					$(".fixed-munu-item-content").hover(
							function() {
								$(this).find(".fix-menu-item-door").css(
										"visibility", "visible");
							},
							function() {
								$(this).find(".fix-menu-item-door").css(
										"visibility", "hidden");
							});
					//侧边回馈栏完成
				});
			</script>
</body>
</html>
