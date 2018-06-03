<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@page import="java.util.List"%>
<%@page import="org.sccooperation.domain.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<head>
<meta charset="UTF-8">
<title>创行谷</title>
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
/*  .container {
  	padding-left: 0;
  }
  .cos-xs-3 {
  	padding: 0;
  	margin: 0;
  }/*!课程分类
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
	left: 50%;
	margin-left: -50px;
	clear: both;
	bottom: -25px;
}

.owl-dots .owl-dot.active span, .owl-dots .owl-dot:hover span {
	background: none;
	border: 2px solid #f66d52;
}
/*!工作列表
-------------------------------------------------------------------------------!*/
.hot-work {
	width: 100%;
	height: 800px;
}

.hot-work-head {
	height: 40px;
}

.hot-work-head-item {
	width: 68px;
	display: block;
	/*	border: 1px solid #eee;*/
	text-align: center;
	letter-spacing: 1px;
	float: left;
	font-size: 16px;
	padding: 9px 0;
}

.hot-work-head-item2 {
	margin-left: 45px;
}

.hot-work-hr {
	display: block;
	width: 1200px;
	height: 1px;
	background: #eee;
	clear: both;
	position: relative;
	top: -1px;
}

.hot-work-body {
	height: 800px;
	/*background: #f5f7f9;*/
	margin-bottom: 40px;
}

.hot-work-body-item {
	width: 100%;
	height: 220px;
	border: 1px solid #eee;
	margin-top: 20px;
	padding: 20px 15px;
}

.hot-work-body-item:hover {
	box-shadow: 3px 3px 10px #eee;
}

.work-name {
	font-size: 16px;
	letter-spacing: 1px;
	margin-right: 3px;
}

.demand {
	clear: both;
	font-weight: 200;
}

.publish-time {
	font-weight: 200;
}

.publish-time i {
	margin-left: 7px;
}

.salary {
	color: red;
	font-size: 18px;
	font-weight: 200;
}

.condition {
	display: block;
	padding: 3px 0;
	width: 70px;
	text-align: center;
	color: grey;
	border: 1px solid #eee;
	font-size: 12px;
	margin-right: 12px;
	float: left;
}

.hot-work-body-border {
	display: block;
	height: 1px;
	width: 340px;
	margin: 0 auto;
	border-bottom: 2px dotted #eee;
	clear: both;
	margin-top: 50px;
	margin-bottom: 20px;
}

.company-logo {
	width: 45px;
	height: 45px;
	margin-right: 12px;
}

.company-intro {
	margin-top: -3px;
	font-weight: 200;
}

.selected {
	border-bottom: 3px solid #0099CC;
}

.hot-work-btn {
	display: block;
	width: 390px;
	height: 40px;
	padding: 7px 0;
	letter-spacing: 1px;
	background: #0099CC;
	/*border: 1px solid #0099CC*/;
	color: white;
	margin: 0 auto;
	position: relative;
	top: 20px;
	font-size: 16px;
	clear: both;
	text-align: center;
}

.hot-work-btn a:hover {
	color: #0099CC;
}

.hot-work-btn:hover {
	background: white;
	border: 1px solid #0099CC;
	color: #0099CC;
}

/*!公司列表
-------------------------------------------------------------------------------!*/
.hot-company {
	margin-top: 70px;
	height: 800px;
}

.hot-company .company-logo {
	width: 75px;
	height: 75px;
	display: block;
	position: relative;
	left: 50%;
	margin-left: -38px;
}

.hot-company-body-item {
	width: 100%;
	height: 280px;
	padding: 20px 0px;
	border: 1px solid #eee;
	text-align: center;
}

.hot-company-body-item:hover {
	box-shadow: 3px 3px 10px #eee;
}

.hot-company-name {
	font-size: 16px;
	margin-top: 12px;
	letter-spacing: 1px;
}

.hot-company .hot-work-body-border {
	width: 95%;
	margin-top: -1px;
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

.hot-company-list-border {
	width: 1px;
	height: 35px;
	display: block;
	background: #eee;
	float: right;
	position: relative;
	top: -17px;
	left: 6px;
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
	font-size: 12px;
	margin-left: 12px;
	font-weight: 300;
}
</style>
</head>





</head>
<body>
<body>
	<!-- 登陆框、联系方式 -->
	<%
	int lastbutton = Integer.parseInt((String)request.getAttribute("lastbutton"));
	
	%>
	<jsp:include page="../fronttopbar.jsp"></jsp:include>
	<!-- 导航条 -->

	<div class="navbar">
		<div class="container">
			<div class="navbar-left">
				<img src="img/logo.png" alt="" class="navbar-logo">
				<span class="navbar-border"></span>
				<a href="#" class="navbar-title">创行谷</a>
			</div>
		    <div class="navbar-right">
		    	<ul class="navbar-body">
		    		<li class="navbar-body-item"><a href="frontIndex.action"  class="navbar-link">首页</a></li>
		    		<li class="navbar-body-item"><a  id="lock" href="chuangxinggutest.action?pageNo=1&button=1" class="navbar-link">创行谷</a></li>
		    		<li class="navbar-body-item"><a href="luntan.action?pageNo=1" class="navbar-link">知行圈</a></li>
		    		<li class="navbar-body-item"><a href="gongxingketangtest.action?pageNo=1" class="navbar-link">躬行课堂</a></li>
		    		<li class="navbar-body-item"><a href="personalcenter.action" class="navbar-link">个人中心</a></li>
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
								String [] array = {"编程", "设计", "IT软件", "求职", "职场", "办公软件", "英语", "日语", "法语", "韩语", "营销"
											, "理财", "专业技能", "钢琴", "建造师", "国学", "省学", "学历教育", "高考", "中考", "小升初", "考研", "四六级", "计算机考试"
								             , "雅思", "托福", "留学指导", "生活", "文化", "兴趣", "学术", "TED", "名校公开课"};
									
									for(int i = 0; i < 33; i++) {
										
										if(i%3 == 0) { %> <li class="menu-title"> <% }%> 
										
										<a href="chuangxinggutest.action?button=<%=i+1%>&pageNo=1"> <span><%=array[i] %> </span> </a>

								 <% } %>
							
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

		<div class="hot-work">
			<div class="container">
				<div class="col-xs-12">
					<div class="hot-work-head">
						<a href="#" class="hot-work-head-item selected">热门职位</a>
					</div>
				</div>
				<span class="hot-work-hr"></span>
			</div>
			<div class="container">
				<div class="hot-work-body">

					<!-- 正确显示 -->
					<%
						
						if (request.getAttribute("JobList") != null) {
							List Job = (List) request.getAttribute("JobList");
							int JlistSize = Job.size();

							for (int i = 0; i < 9; i++) {
								if (JlistSize > i) {
									Post post = (Post) Job.get(i);
					%>
					<div class="col-xs-4">
						<div class="hot-work-body-item">
							<p class="work-name float">
								<a href="showjobinfo.action?jobNo=<%=post.getId()%>&button=<%=post.getTagno() %>">
									<%=post.getSummary()%></a>
							</p>



							<p class="publish-time main-font grey2 float">
								[<%=post.getStime()%>年发布] <i
									class="fa fa-commenting-o fa-lg main-color"></i>
							</p>
							<p class="salary float-right"><%=post.getRemuneration()%></p>


							<% String demand = post.getDemand();
								demand = demand.replace('|', ' ');
								if(demand.length() > 30) 
									demand = demand.substring(0, 30);
							%>
							<p class="demand main-font grey2"><%=demand%>...
							</p>
							<%
								String sp = post.getAllure();
											String sps[] = sp.split(",");
											int spslength = sps.length;
											System.out.print(spslength);
											for (int a = 0; a < spslength; a++) {
							%>
							<span class="condition"><%=sps[a]%></span>
							<%
								}
							%>
							<span class="hot-work-body-border"></span> <img
								class="company-logo float" src="./img/company-logo1.png" alt="">
							<p class="company-name">
								<a href="#"><%=post.getEname()%></a>
							</p>
							<p class="company-intro grey2">
								移动互联网
								<%=post.getPlace()%></p>
						</div>
					</div>
					<%
						}
							}
						}
					%>

					<!-- col-xs-4 ending -->
					<a href="showmorejob.action?button=<%=lastbutton %>&pageNo=1" class="hot-work-btn">查看更多</a>

					<!-- mark1 -->
				</div>

				<!-- hot-work-body ending -->
			</div>
		</div>

		<!-- 热门职位 结束 -->
		<div class="hot-company">
			<div class="container">
				<div class="col-xs-12">
					<div class="hot-work-head">
						<a href="#" class="hot-work-head-item selected">热门公司</a>
					</div>
				</div>
				<div>
					<span class="hot-work-hr"></span>
					<div class="hot-company-body">

						<!-- 正确显示 -->
						<%
							List EnterpriseList = (List) request.getAttribute("EnterpriseList");
							if (request.getAttribute("EnterpriseList") != null) {
								int ElistSize = EnterpriseList.size();

								for (int a = 0; a < 8; a++) {
									if (ElistSize > a) {
										Enterprise enterprise = (Enterprise) EnterpriseList.get(a);
						%>

						<div class="col-xs-3">
							<div class="hot-company-body-item">
								<img class="company-logo" src="<%=enterprise.getPictureurl()%>"
									alt="">
								<p class="hot-company-name">
									<a href="#"><%=enterprise.getEname()%></a>
								</p>
								<p class="company-intro grey2"><%=enterprise.getProperty()%></p>
								<p class="company-intro"><%=enterprise.getSummary()%></p>
								<span class="hot-work-body-border"></span>
								<!--  <ul class="hot-company-list"> -->
								<a href="#" class="hot-company-list-item float"> <span
									class="main-color">122</span>
									<p class="main-font float  hot-company-list-intro">面试评价</p> <span
									class="hot-company-list-border"></span>
								</a> <a href="#" class="hot-company-list-item float"> <span
									class="main-color">38</span>
									<p class="main-font float  hot-company-list-intro">在找职位</p> <span
									class="hot-company-list-border"></span>
								</a> <a href="#" class="hot-company-list-item float"> <span
									class="main-color">100%</span>
									<p class="main-font float hot-company-list-intro">简历处理率</p>
								</a>
							</div>
							<!-- hot-company-body-item ending -->
						</div>
						<%
							} else {
						%>
						<!-- 错误反馈 -->
						<div class="col-xs-3">
							<div class="hot-company-body-item">
								<img class="company-logo" alt="">
								<p class="hot-company-name">
									<a href="#">error</a>
								</p>
								<p class="company-intro grey2">error</p>
								<p class="company-intro">error</p>
								<span class="hot-work-body-border"></span>
								<!--  <ul class="hot-company-list"> -->
								<a href="#" class="hot-company-list-item float"> <span
									class="main-color">error</span>
									<p class="main-font float  hot-company-list-intro">面试评价</p> <span
									class="hot-company-list-border"></span>
								</a> <a href="#" class="hot-company-list-item float"> <span
									class="main-color">error</span>
									<p class="main-font float  hot-company-list-intro">在找职位</p> <span
									class="hot-company-list-border"></span>
								</a> <a href="#" class="hot-company-list-item float"> <span
									class="main-color">error</span>
									<p class="main-font float hot-company-list-intro">简历处理率</p>
								</a>
							</div>
							<!-- hot-company-body-item ending -->
						</div>

						<%
							}
								}
							}
						%>


						<a href="#" class="hot-work-btn">查看更多</a>
					</div>
					<!-- hot-company-body ending -->
				</div>
				<!-- col-xs-12 ending -->
			</div>
		</div>

		<div class="footer margin">
			<div class="container">
				<div class="row">
					<div class="col-md-4">
						<img src="./img/logo_bottom.png" alt=""> <span
							class="footer-brd footer-brd1 pull-right"></span>
					</div>
					<div class="col-md-4">

						<p class="footer-address">地址:广东省珠海市唐家湾金凤路6号 邮编：519088</p>
						<p class="footer-address">联系电话：0756-3622745
							招生咨询电话：0756-3622966</p>
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
										var index = $(".menu-title")
												.index(this);
										$(".menu-body-item").eq(index).show()
												.siblings().hide();
									});
							$(".menu-title").on('mouseleave', function(e) {
								$(this).removeClass('active');
							});
						}).on('mouseleave', function(e) {
					sub.addClass('display');
				});
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
				/*!Tab
				 -------------------------------------------------------------------------------!*/
				$(".hot-work-head-item").click(
						function() {
							$(this).addClass("selected").siblings()
									.removeClass("selected");
							var index = $(".hot-work-head-item").index(this);
							$(".hot-work-body").eq(index).show().siblings()
									.hide();
						});
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
							$(this).find(".fixed-munu-item-content").animate({
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

</body>
</html>




