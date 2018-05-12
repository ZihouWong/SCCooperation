<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="org.sccooperation.domain.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
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
	<!-- 导航条 结束-->
	<div class="body">


		<div class="work-header">
			<% 	
				
			if (request.getAttribute("JobInfo") != null) {
				List JobInfo = (List)request.getAttribute("JobInfo");
				Post post = (Post)JobInfo.get(0);
				
			%>

			<div class="container">
				<div class="col-xs-12">
					<div class="work-head-left">
						<p class="font-intro grey2"><%=post.getSummary() %>招聘
						</p>
						<p class="font-title"><%=post.getSummary() %></p>
						<p class="font-title2">
							<span class="red"><%=post.getPlace() %> </span> / 经验3-5年 / 本科及以上
							/ 全职
						</p>

						<% 	
							 
						%>
						<!-- mark2 -->
						<%
						if (request.getAttribute("JobInfo") != null) {
							List TagList = (List)request.getAttribute("TagName");
							Tag tag = (Tag)TagList.get(0);
						%>
						
						<span class="label"><p class="font-intro"><%=tag.getTagname() %></p></span>
						<% } %>
						<p class="main-font grey2 publish-time">2017-07-06 发布于拉勾网</p>
					</div>
					<div class="work-head-right">
						<div class="work-head-btn-group">
							<a href="#" class="work-head-btn work-head-btn-left"><i
								class="fa fa-star fa-lg main-color"></i>收藏</a>
							<!-- <a href="#" class="work-head-btn work-head-btn-right">已下线</a> -->
							<a href="submitresume.action?post_id=<%=post.getId() %>" class="work-head-btn work-head-btn-right"
								data-toggle="modal" data-target="#myModal">投递简历</a>
							<!-- 弹窗 -->


							<div class="modal fade" id="myModal" role="dialog"
								aria-labelledby="myModalLabel">
								<div class="modal-dialog" role="document">
									<div class="modal-content">

										<div class="modal-header">
											<button type="button" class="close" data-dismiss="modal"
												aria-label="Close">
												<span aria-hidden="true">&times;</span>
											</button>
											<h4 class="modal-title" id="myModalLabel">投递简历确认</h4>
										</div>
										<div class="modal-body">确认要投递简历吗？</div>
										<div class="modal-footer">
											<button type="button" class="btn btn-default"
												data-dismiss="modal">确认投递</button>
											<button type="button" class="btn btn-primary">放弃投递</button>
										</div>

									</div>
								</div>
							</div>
							<!-- 弹窗 ending-->
						</div>
						<div class="work-head-resume">
							<span class=""><i
								class="fa fa-lg fa-pencil-square-o grey2 float"></i><a href="#"><p
										class="title-intro grey2">完善在线简历</p></a></span> <span class=""><i
								class="fa fa-lg fa-calendar-minus-o grey2 float"></i><a href="#"><p
										class="title-intro grey2">上传附件简历</p></a></span>
						</div>
					</div>
					<!-- work-head-right ending -->
				</div>
			</div>
			<% }%>
		</div>

		<!-- work-head ending -->
		<div class="work-body">
			<div class="container">
				<div class="col-xs-12">
					<div class="work-body-left">

						<!-- 成功显示 -->
						<% 
							if (request.getAttribute("JobInfo") != null) {
								List JobInfo = (List)request.getAttribute("JobInfo");
								Post post = (Post)JobInfo.get(0);
							%>

						<div class="work-body-condition">
							<h5 class="condition-title">职位诱惑:</h5>
							<p class="main-font"><%=post.getAllure() %></p>
						</div>
						<div class="work-body-condition">
							<h5 class="condition-title">职位描述:</h5>
							<h5 class="main-font">基本要求：</h5>
							<p class="main-font">
								<%
								String br = post.getDemand();
								String [] brs = br.split("[|]");
								int brslength = brs.length;
								System.out.println("successfully"+ brslength);
								for (int i = 0; i < brslength; i++) {
								%>
								<%=i+1%>、<%=brs[i]%>
								<%if (i < brslength) { %>
								<br>
								<% }} %>

							</p>
						</div>
						<div class="work-body-condition">
							<h5 class="condition-title">工作地址:</h5>
							<p class="main-font float">
								<span class="main-color inline-block"><%=post.getPlace() %></span>
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
								<img src="<%=post.getPictureurl() %>" alt=""
									class="condition-left-img img-circle float">
								<p class="main-font">
									<%=post.getManager_id().getNickname() %><i
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
						<% } %>
					</div>
					<!-- col-xs-8 ending -->

					<div class="work-body-right">
						<!-- <span class="border float"></span> -->

						<% 
							if (request.getAttribute("JobInfo") != null) {
								List JobInfo = (List)request.getAttribute("JobInfo");
								Post post = (Post)JobInfo.get(0);
							%>
						<div class="company-info">
							<img class="float img-thumbnail" src="./img/work-intro-logo.png"
								alt="">
							<p class="font-title2">
								<%=post.getEname() %><i class="fa fa-lg fa-shield main-color"></i>
							</p>
							<ul class="company-info-list">

								<%	
									if (request.getAttribute("ETagName") != null) {
										List ETagNameList = (List)request.getAttribute("ETagName");
										int ETagNameListSize = ETagNameList.size();
										
										for (int i = 0; i < ETagNameListSize; i++) {
											if (i < ETagNameListSize) {
												Tag tag = (Tag)ETagNameList.get(i);
												
								
								%>
								<li class="info-list-item">
									<p class="main-font grey2">
										<i class="fa fa-lg fa-user-o"></i><%=tag.getTagname() %>
									</p>
								</li>
								<% } } } %>
							</ul>
						</div>
						<% } %>
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
							<% } } } %>
							<span class="media-border"></span>
						</div>


					</div>
					<!-- col-xs-4 ending -->
				</div>
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
