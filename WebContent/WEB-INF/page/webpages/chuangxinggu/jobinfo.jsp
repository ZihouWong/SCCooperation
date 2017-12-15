<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	 <!-- 登陆框、联系方式 -->
	<div id="head-link" class="login">
		<div class="container">
			<div class="col-xs-12">
			    <div class="login-in">
					<form id="login-form" action="" method="post">
						<p class="main-font">学生代码:</p><input type="text" name="id">
						<p class="main-font">密码:</p><input type="password" name="password">
						<p class="main-font">验证码:</p><input id="input-code" type="text" name="code">
						<img src="" alt="" class="code-img">
						<input id="login-btn" type="submit" value="登陆">
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
					<img src="../img/logo.png" alt="" class="navbar-logo">
					<span class="navbar-border"></span>
					<a href="#" class="navbar-title">大创项目</a>
				</div>
			    <div class="navbar-right">
			    	<ul class="navbar-body">
			    		<li class="navbar-body-item"><a id="lock" href="#" class="navbar-link">项目介绍</a></li>
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
		<div class="work-header">
			<div class="container">
				<div class="col-xs-12">
					<div class="work-head-left">
						<p class="font-intro grey2">红网技术中心招聘</p>
						<p class="font-title">前端工程师</p>
						<p class="font-title2"><span class="red">6k-12k</span> /长沙 / 经验3-5年 / 本科及以上 / 全职</p>
						<span class="label"><p class="font-intro">移动互联网</p></span>
						<span class="label"><p class="font-intro">移动互联网</p></span>
						<span class="label"><p class="font-intro">移动互联网</p></span>
						<span class="label"><p class="font-intro">移动互联网</p></span>
						<span class="label"><p class="font-intro">移动互联网</p></span>
						<p class="main-font grey2 publish-time">2017-07-06  发布于拉勾网</p>
					</div>
					<div class="work-head-right">
						<div class="work-head-btn-group">
							<a href="#" class="work-head-btn work-head-btn-left"><i class="fa fa-star fa-lg main-color"></i>收藏</a>
							<!-- <a href="#" class="work-head-btn work-head-btn-right">已下线</a> -->
							<a href="#" class="work-head-btn work-head-btn-right" data-toggle="modal" data-target="#myModal">投递简历</a>
							<!-- 弹窗 -->
							<style>
            .modal {
            	/*position: relative;*/
            	top: 50%;
            	margin-top: -85px;
            	
            }
            .modal-dialog {
background: rgba(0,0,0,0.1);
            }
							</style>
							<div class="modal fade" id="myModal"  role="dialog" aria-labelledby="myModalLabel">
							  <div class="modal-dialog" role="document">
							    <div class="modal-content">

							      <div class="modal-header">
							        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
							        <h4 class="modal-title" id="myModalLabel">投递简历确认</h4>
							      </div>
							      <div class="modal-body">
							        确认要投递简历吗？
							      </div>
							      <div class="modal-footer">
							        <button type="button" class="btn btn-default" data-dismiss="modal">确认投递</button>
							        <button type="button" class="btn btn-primary">放弃投递</button>
							      </div>

							    </div>
							  </div>
							</div>
							<!-- 弹窗 ending-->
						</div>
						<div class="work-head-resume">
							<span class=""><i class="fa fa-lg fa-pencil-square-o grey2 float"></i><a href="#" ><p class="title-intro grey2">完善在线简历</p></a></span>
							<span class=""><i class="fa fa-lg fa-calendar-minus-o grey2 float"></i><a href="#" ><p class="title-intro grey2">上传附件简历</p></a></span>
						</div>
					</div>
					<!-- work-head-right ending -->
				</div>
		    </div>
		</div>
	
		<!-- work-head ending -->
		<div class="work-body">
			<div class="container">
				<div class="col-xs-12">
					
				
				<div class="work-body-left">
					<div class="work-body-condition">
						<h5 class="condition-title">职位诱惑:</h5>
						<p class="main-font">五险一金,节假福利,带薪年假,交通补贴</p>
					</div>
					<div class="work-body-condition">
						<h5 class="condition-title">职位描述:</h5>
						<h5 class="main-font">基本要求：</h5>
						<p class="main-font">
1、精通HTML5、CSS3、 JavaScript等Web前端开发技术，对html5页面适配充分了解，熟悉不同浏览器间的差异，熟练写出兼容各种浏览器的代码；<br>

2、熟悉运用常见JS开发框架，如JQuery、vue、angular，能快速高效实现各种交互效果；<br>

3、熟悉编写能够自动适应HTML5界面，能让网页格式自动适应各款各大小的手机；<br>

4、利用HTML5相关技术开发移动平台、PC终端的前端页面，实现HTML5模板化<br>

5、熟悉手机端和PC端web实现的差异，有移动平台web前端开发经验，了解移动互联网产品和行业，有在Android,iOS等平台下HTML5+CSS+JavaScript（或移动JS框架）开发经验者优先考虑；<br>
6、良好的沟通能力和团队协作精神，对移动互联网行业有浓厚兴趣，有较强的研究能力和学习能力；<br>

7、能够承担公司前端培训工作，对公司各业务线的前端（HTML5\CSS3）工作进行支撑和指导。
</p>
<h5 class="main-font">岗位职责：</h5>
						<p class="main-font">
1、利用html5及相关技术开发移动平台、微信、APP等前端页面，各类交互的实现；<br>

2、持续的优化前端体验和页面响应速度，并保证兼容性和执行效率；<br>

3、根据产品需求，分析并给出最优的页面前端结构解决方案；<br>

4、协助后台及客户端开发人员完成功能开发和调试；<br>

5、移动端主流浏览器的适配、移动端界面自适应研发。
</p>
					</div>
					<div class="work-body-condition">
						<h5 class="condition-title">工作地址:</h5>
						<p class="main-font float"><span class="main-color inline-block">长沙</span> - <span class="main-color inline-block">天心区</span> -<span class="main-color inline-block">韶山南路</span>  - 韶山南路258号红网大楼</p>
						<p class="main-font float-right"><a id="underline" class="underline" href="#"><span class="main-color inline-block">查看地图</span></a></p>
					</div>
					
					<br>
					<!-- work-body-condition ending -->
					<div class="work-body-condition work-body-hr">
						<h5 class="condition-title">职位发布者:</h5>
						<div class="condition-left">
							<img src="../img/class-teach.jpg" alt="" class="condition-left-img img-circle float">
							<p class="main-font">moment<i class="fa fa-lg fa-commenting-o main-color"></i></p>
							<p class="main-font grey2">职位发布者</p>
						</div>
						<!-- condition-left ending -->
						<div class="condition-right">
							<a href="#" class="hot-company-list-item float">
                            		<span class="main-color">122</span>
                            		<h4 class="main-font float  hot-company-list-intro">面试评价</h4>
                            		<span class="hot-company-list-border"></span>
                            	</a>
                            	<a href="#" class="hot-company-list-item float">
                            		<span class="main-color">38</span>
                            		<h4 class="main-font float  hot-company-list-intro">在找职位</h4>
                            		<span class="hot-company-list-border"></span>
                            	</a>
                            	
                            	<a href="#" class="hot-company-list-item float">
                            		<span class="main-color">100%</span>
                            		<h4 class="main-font float hot-company-list-intro">简历处理率</h4>
                            	</a>
						</div>
						<!-- condition-right ending -->
					</div>
					<!-- work-body-condition ending -->
				</div>
				<!-- col-xs-8 ending -->
				
				<div class="work-body-right">
					<!-- <span class="border float"></span> -->
					<div class="company-info">
						<img class="float img-thumbnail" src="../img/work-intro-logo.png" alt="">
						<p class="font-title2">红网<i class="fa fa-lg fa-shield main-color"></i></p>
						<ul class="company-info-list">
							<li class="info-list-item">
								<p class="main-font grey2"><i class="fa fa-lg fa-user-o"></i>移动互联网,电子商务</p>
							</li>
							<li class="info-list-item">
								<p class="main-font grey2"><i class="fa fa-lg fa-user-o"></i>移动互联网,电子商务</p>
							</li>
							<li class="info-list-item">
								<p class="main-font grey2"><i class="fa fa-lg fa-user-o"></i>移动互联网,电子商务</p>
							</li>
							<li class="info-list-item">
								<p class="main-font grey2"><i class="fa fa-lg fa-user-o"></i>移动互联网,电子商务</p>
							</li>
						</ul>
					</div>
					<!-- company-info ending -->
					<div class="similar-work">
						<h5 class="condition-title float">工作地址</h5>
						<span class="condition-title-hr"></span>
						<a href="#" class="media">
						  <div class="media-left">
						    <a href="#">
						      <img class="media-object img-thumbnail" src="../img/hot-company1.png" alt="...">
						    </a>
						  </div>
						  <div class="media-body">
						    <h4 class="media-heading font-title2"><a href="#">前端开发工程师</a></h4>
						    <p class="font-title2 red">6k-12k</p>
						    <p class="font-intro">成功软件[长沙.岳麓区]</p>
						  </div>
						</a>
						<!-- media-item ending -->
						<span class="media-border"></span>
						<a href="#" class="media">
						  <div class="media-left">
						    <a href="#">
						      <img class="media-object img-thumbnail" src="../img/hot-company1.png" alt="...">
						    </a>
						  </div>
						  <div class="media-body">
						    <h4 class="media-heading font-title2"><a href="#">前端开发工程师</a></h4>
						    <p class="font-title2 red">6k-12k</p>
						    <p class="font-intro">成功软件[长沙.岳麓区]</p>
						  </div>
						</a>
						<!-- media-item ending -->
						<span class="media-border"></span>
						<a href="#" class="media">
						  <div class="media-left">
						    <a href="#">
						      <img class="media-object img-thumbnail" src="../img/hot-company1.png" alt="...">
						    </a>
						  </div>
						  <div class="media-body">
						    <h4 class="media-heading font-title2"><a href="#">前端开发工程师</a></h4>
						    <p class="font-title2 red">6k-12k</p>
						    <p class="font-intro">成功软件[长沙.岳麓区]</p>
						  </div>
						</a>
						<!-- media-item ending -->
						<span class="media-border"></span>
						<a href="#" class="media">
						  <div class="media-left">
						    <a href="#">
						      <img class="media-object img-thumbnail" src="../img/hot-company1.png" alt="...">
						    </a>
						  </div>
						  <div class="media-body">
						    <h4 class="media-heading font-title2"><a href="#">前端开发工程师</a></h4>
						    <p class="font-title2 red">6k-12k</p>
						    <p class="font-intro">成功软件[长沙.岳麓区]</p>
						  </div>
						</a>
						<!-- media-item ending -->
						<span class="media-border"></span>
						<a href="#" class="media">
						  <div class="media-left">
						    <a href="#">
						      <img class="media-object img-thumbnail" src="../img/hot-company1.png" alt="...">
						    </a>
						  </div>
						  <div class="media-body">
						    <h4 class="media-heading font-title2"><a href="#">前端开发工程师</a></h4>
						    <p class="font-title2 red">6k-12k</p>
						    <p class="font-intro">成功软件[长沙.岳麓区]</p>
						  </div>
						</a>
						<!-- media-item ending -->
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
				<img src="../img/logo_bottom.png" alt="">
				<span class="footer-brd footer-brd1 pull-right"></span>
			</div>
			<div class="col-xs-4">
				
				<p class="footer-address">
					地址:广东省珠海市唐家湾金凤路6号 邮编：519088</p>
				<p class="footer-address">
					联系电话：0756-3622745 招生咨询电话：0756-3622966
				</p>
				<p class="footer-address">
					邮箱：zhbit@zhbit.com
				</p>
                
			</div>
			<div class="col-xs-4">
				<span class="footer-brd footer-brd2 pull-left"></span>
			    <p class="footer-address">
			    	版权所有：北京理工大学珠海学院
			    </p>
			    <p class="footer-address"> 
                  粤ICP备05063448号-1
			    </p>
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
		      <p class="fixed-menu-intro text-center"><a href="#">专业公众号</a></p>
		      <div class="fix-menu-item-door">
		      	  
		      </div>
	    </div>
	</div>
	<!-- fixed-munu-item end -->
	<div class="fixed-munu-item">
		<div class="fixed-munu-item-icon">
		   <i class="fa fa-qq fa-2x"></i>
	    </div>
	    <div class="fixed-munu-item-content">
		      <p class="fixed-menu-intro text-center"><a href="#">新生交流群</a></p>
		      <div class="fix-menu-item-door">
		      	  
		      </div>
	    </div>
	</div>
	<!-- fixed-munu-item end -->
	<div class="fixed-munu-item">
		<div class="fixed-munu-item-icon">
		   <i class="fa fa-volume-control-phone fa-2x"></i>
	    </div>
	    <div class="fixed-munu-item-content">
		      <p class="fixed-menu-intro text-center"><a href="#">13192290054</a></p>
		      
	    </div>
	</div>
	<!-- fixed-munu-item end -->
	<div class="fixed-munu-item">
		<div class="fixed-munu-item-icon">
		   <i class="fa fa-pencil-square-o fa-2x"></i>
	    </div>
	    <div class="fixed-munu-item-content">
		      <p class="fixed-menu-intro text-center"><a href="#">反馈</a></p>
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
	<script src="../plugin/js/jquery.min.js"></script>
    <!-- Bootstrap -->
	<script src="../plugin/js/bootstrap.min.js"></script>
    <!-- Owl Carousel -->
	<script src="../plugin/js/owl.carousel.min.js"></script>

	<script src="../plugin/js/fix-menu.js"></script>
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