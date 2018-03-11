<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>  
<%@page import="org.sccooperation.domain.*"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; UTF-8">
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
	<link rel="stylesheet" href="./plugin/font-awesome-4.7.0/css/font-awesome.min.css">
	 <!-- easyTab css -->
  
  <link rel="stylesheet" href="./css/style.css">
  <link rel="stylesheet" href="./css/luntan.css">

    

  <style>
  /*!课程分类
-------------------------------------------------------------------------------!*/
.body {
	/*margin-top: -40px;*/
	/*background-color: #f5f7f9;
*/	padding-bottom: 60px;
    margin-top: 25px;
}
/*!课程分类
-------------------------------------------------------------------------------!*/
/*!轮播图
-------------------------------------------------------------------------------!*/
.carousel {
		height: 340px;
		width: 100%;
		margin-top: -40px;
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
			    height: 340px;
			    width: 100%;
			}
			.carousel #owl-demo .item-intro{
                position: absolute;
                width: 100%;
                background: rgba(0,0,0,0.45);
                padding: 1em .7em;
                bottom: 0;
                color: white;
                font-size: 1.4em;
                text-align: center;
			}
			 .carousel .owl-dots {
			 	position: absolute;
			 	right: 200px;
			 	bottom: 18px;
			 }
			 .carousel .owl-carousel .owl-controls .owl-nav .owl-prev,
			 .carousel .owl-carousel .owl-controls .owl-nav .owl-next {
                position: absolute;
			 	top: 35%;
			 	width: 45px;
			 	height: 70px;
			 	padding-top: 12px;
			 	background: rgba(0,0,0,0.25);
			 }
			 .carousel .owl-carousel .owl-controls .owl-nav .owl-prev:hover,
			 .carousel .owl-carousel .owl-controls .owl-nav .owl-next:hover {
			 	background: rgba(0,0,0,0.65);
			 }
			 .carousel .owl-carousel .owl-controls .owl-nav .owl-prev {
			 	left: -5px;
			 }
			 .carousel .owl-carousel .owl-controls .owl-nav .owl-next {
			 	right: -5px;
			 }
			  .owl-dots .owl-dot.active span, 
			  .owl-dots .owl-dot:hover span {
				  background: none;
				  border: 2px solid #f66d52;
				}
/*!课程分类
-------------------------------------------------------------------------------!*/
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
          .hot-class-refresh,
          .hot-class-heading i,
          .mask {
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
         @keyframes key1 {
       	  0% {
       	  	background-size: 100% 100%;
       	    
       	  }
       	  50% {
       	  	background-size: 102% 102%;
       	    
       	  }
       	  100% {
       	  	background-size: 105% 105%;
       	    border-right: 2px dotted #424c50;
       	    border-bottom: 1px dotted #424c50; 
       	    box-shadow: 4px 3px 3px #a1afc9;
       	  }
/*!课程分类
-------------------------------------------------------------------------------!*/
/*!课程分类
-------------------------------------------------------------------------------!*/
.new-content {
	margin-top: 30px;
}
.new-content-item {
	position: relative;
}
.visit {
	position: absolute;
    top: 10px;
    right: 125px;
}
/*!课程分类
-------------------------------------------------------------------------------!*/
#login-btn-a {
  width: 70px;
  height: 26px;
  display: block;
  text-align: center;
  border: 1px solid rgba(0,0,0,0.25);
  margin-top: -5px;
  margin-left: -3px;
}
  </style>
  
  	<link href="umeditor/themes/default/css/umeditor.css" type="text/css" rel="stylesheet">
    <script type="text/javascript" src="umeditor/third-party/jquery.min.js"></script>
    <script type="text/javascript" src="umeditor/third-party/template.min.js"></script>
    <script type="text/javascript" charset="utf-8" src="umeditor/umeditor.config.js"></script>
    <script type="text/javascript" charset="utf-8" src="umeditor/umeditor.min.js"></script>
    <script type="text/javascript" src="umeditor/lang/zh-cn/zh-cn.js"></script>
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
	
		<div class="container">
			    <div class="logo-header">
			      <style>
				      .logo-header {
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
				          background: rgba(0,0,0,0.3);
				          height: 45px;
				          width: 1px;
				          margin-left: 15px;
				          margin-right: 15px;
				        }
				        .logo-header .font-title {
				          margin-top: 5px;
				        }
			      </style>
			      <a href="./index.html"><img src="../img/logo.png" alt="" class="logo-img float"></a>
			      <span class="border-1 float"></span>
			      <p class="font-title">知行圈</p>
			    </div>
		</div>
	
	<!-- 导航条 结束-->
	<div class="body" style="padding-bottom:60px">
		<!-- 轮播图 -->
	<div class="carousel">
		<div id="owl-demo" class="owl-carousel">
			<a class="item"><img src="./img/owl-img1.jpg" alt=""><div class="item-intro">欢迎领导到校访问交流！</div></a>
			<a class="item"><img src="./img/owl-img2.png" alt=""><div class="item-intro">欢迎青年教师团队交流教学经验！</div></a>
			<a class="item"><img src="./img/owl-img3.png" alt=""><div class="item-intro">热烈庆祝信管专业成为广东省特级专业！</div></a>
			<a class="item"><img src="./img/owl-img4.png" alt=""><div class="item-intro">欢迎领导到校访问交流！</div></a>
			<a class="item"><img src="./img/owl-img5.png" alt=""><div class="item-intro">欢迎青年教师团队交流教学经验！</div></a>
		</div>
	</div>
		<div class="container">
			<div class="col-xs-8">
				 <div class="new-content">   
				 	<style>
                       .visit {
                       	margin-top: 5px;
                       	margin-left: 35px;
                       }
				 	</style>
				 	<% List list = (List)request.getAttribute("list");
				 	   List manyNotePeople = (List)request.getAttribute("manyNotePeople");
				 	   int pageN=Integer.parseInt(request.getParameter("pageNo"));
				 	   int noteSum =Integer.parseInt( request.getAttribute("noteSum")+"");
				 	   float pageS = (float)noteSum/23;
				 	   int pageSum ;
				 	   if(pageS>(int)pageS)
				 	   	pageSum = (int)pageS+1;
				 	   else
				 	   	pageSum =(int) pageS;
				 	int listSize = list.size();
				 	for(int i =0;i<23;i++)
				 	{
				 		if(listSize>i)
				 		{
				 			Note note = (Note)list.get(i);
				 		
				 		
				 	%>
				 	<span class="span-news-border2"></span>
		                       	  <li class="new-content-item">
		                       	  	<i class="fa fa-tag"></i>
		                       	  	 <p class="main-font text-left float"><a href="minutenote.action?id=<%=note.getId()%>&pageNo=1"><%=note.getTitle() %></a></p>
		                       	  	 <p class="time float visit">
		                       	  	 	<%=note.getSeenum()%>人浏览
		                       	  	 </p>
		                       	  	 <p class="time text-right">
		                       	  	    <%=note.getTime() %>
		                       	  	 </p>
		                      	  	 
		                       	  </li>
		              <%}else{ 
		              
		              %> 
		                         <span class="span-news-border2"></span>
		                       	  <li class="new-content-item">
		                       	  	<i class="fa fa-tag"></i>
		                       	  	 <p class="main-font text-left float"><a></a></p>
		                       	  	 <p class="time float visit">
		                       	  	
		                       	  	 </p>
		                       	  	 <p class="time text-right">
		                       	  	 
		                       	  	 </p>
		                       	  	 
		                       	  </li>
		              <%}} %>
		                       	  <!--
		                       	  <span class="span-news-border2"></span>
		                       	  <li class="new-content-item">
		                       	  	<i class="fa fa-tag"></i>
		                       	  	 <p class="main-font text-left float"><a href="#">2014级工程硕士论文中期考核通知</a></p>
		                       	  	 <p class="time float visit">
		                       	  	 	..人浏览
		                       	  	 </p>
		                       	  	 <p class="time text-right">
		                       	  	 	2017-02-16
		                       	  	 </p>
		                       	  	 
		                       	  </li>
		                       	  <span class="span-news-border2"></span>	
		                       	    -->	                       	   
						</div>
		                <!-- new-content end -->
			                <p class="main-font new-content-pagin text-right">
			                	<a href="luntan.action?pageNo=1">首页</a>
								<a href="luntan.action?pageNo=<%=pageN-1%>">上页</a>
								<a href="luntan.action?pageNo=<%=pageN+1%>">下页</a>
								<a href="luntan.action?pageNo=<%=pageSum%>">尾页	</a>
								<input type="text" value="1">
								<a href="#">GO</a>
								 共1/<%=pageSum %>页 15条/页 共<%=noteSum %>条记录
			                </p>
			                <style>
                          .apply {
                          	width: 100%;
                          	height: 500px;
                          	background: #f5f7f9;
                          	padding: 20px 15px;
                          }
						  .topic {
                           width: 85%;
                           height: 35px;
						  }
						  .topic-icon {
						  	margin-top: 4px;433
						  }
						  .fa-star {
						  	margin-top: 3px;
						  	color: orange;
						  }
						  .fa-comment-o {
						  	margin-top: 3px;
						  }
						  .apply-body {
						  	margin-top: 10px;
						  	width: 100%;
						  	height: 250px;
						  }
						  .apply-topic-title {
						  	height: 35px;
						  	width: 100%;
						  }
						  .btn {
	display: block;
	text-align: center;
}
						  .apply-btn {
						  	position: relative;
						  	top: 90px;
						  	color: white;
						  	background: blue;
						  	height: 38px;
						  	border-radius: 3px;
						  	letter-spacing: 1px;
						  	width: 75px;
						  }
			                </style>

			        <div class="apply">
<form action="addNote.action?pageNo=1" name="topic-form" method="post">
			            <p class="main-font" style="font-weight:500"><i class="fa fa-lg fa-star float"></i>发布新帖</p>
			            <div class="apply-topic-title">
				            	<input type="text" name="title" class="topic float">
				            	<p class="main-font float-right topic-icon"><i class="fa fa-lg fa-comment-o float"></i><span style="color:#7d6d6d">话题</span></p>
			                <!-- 加载编辑器的容器 -->

			            </div>
			                
<script type="text/plain" id="myEditor" name="content" style="width:635px;height:240px;">
</script>
<script type="text/javascript">
    var um = UM.getEditor('myEditor'); 
</script>
 <input type="submit" class="apply-btn" value="发表" name="topic-form">
</form>
			        </div>
			</div>
			<!-- col-xs-8 结束 -->
			<div class="col-xs-4">
				<!-- 明星教师开始 结束 -->
    			<div class="class-teacher">
    				<div class="hot-class-item">
	    				<div class="hot-class-heading">
	    					<span class="hot-class-border"></span>
	    					<p class="hot-class-title">明星发帖用户</p>
	    					<p class="main-font hot-class-refresh mask"><a href="#"></a></p>
	    					<!-- <i class="fa fa-refresh fa-1x"></i> -->
	    				</div>
	    				<%
	    				if(manyNotePeople!=null)
	    				for(int i =0;i<manyNotePeople.size();i++) {
	    					People people =(People)manyNotePeople.get(i);
	    				%>
	    				<div class="hot-class-body">
	    					<div class="media">
							  <div class="media-left">
							    <a href="#">
							      <img class="media-object" src="<%=people.getPicture() %>" style="width:60px;height:60px" alt="...">
							    </a>
							  </div>
							  <div class="media-body">
							    <h6 class="media-heading"><%=people.getName() %></h6>
							    <p class="main-font">累计发帖数<%=people.getNotesum() %></p>
							  </div>
							</div>
							<%} %>
							<!-- media ending -->
							
						
	    				</div>
	    				<!-- hot-class-body ending -->
	    				
	    			</div>
    			</div>
    			<!-- 明星教师模块 结束 -->
    			<!-- 合作伙伴模块 开始 -->
    			<div class="team-class ">
    				<div class="hot-class-item class-parter">
	    				<div class="hot-class-heading">
	    					<span class="hot-class-border"></span>
	    					<p class="hot-class-title">合作伙伴</p>
	    					<p class="main-font hot-class-refresh mask"><a href="#">更多</a></p>
	    					<!-- <i class="fa fa-refresh fa-1x"></i> -->
	    				</div>
	    				<style>
	    				.team-class .class-parter {
 margin-bottom: 0;
	    				}
	    				.class-parter {
	    					height: 340px;
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

.class-teacher .hot-class-item{
 height: 360px;
}
.class-teacher .hot-class-body{
padding: 10px 5px;
}
.class-teacher .main-font {
	font-size: 12px;
	color: grey;
}
	    				</style>
	    				<div class="hot-class-body class-parter-body">
	    					<div class="class-parter-item">
	    						 <a href="#">
					               <img style="width:100%;height:100%" src="./img/class-parter.jpg" alt="">
					               
					               <p class="main-font"><a href="#">Excel学习乐园</a></p>
					             </a>
	    					</div>
	    					<div class="class-parter-item">
	    						 <a href="#">
					               <img style="width:100%;height:100%" src="./img/class-parter.jpg" alt="">
					               
					               <p class="main-font"><a href="#">Excel学习乐园</a></p>
					             </a>
	    					</div>
                            <div class="class-parter-item">
	    						 <a href="#">
					               <img style="width:100%;height:100%" src="./img/class-parter.jpg" alt="">
					               
					               <p class="main-font"><a href="#">Excel学习乐园</a></p>
					             </a>
	    					</div>
	    					 <div class="class-parter-item">
	    						 <a href="#">
					               <img style="width:100%;height:100%" src="./img/class-parter.jpg" alt="">
					               
					               <p class="main-font"><a href="#">Excel学习乐园</a></p>
					             </a>
	    					</div>
	    					 <div class="class-parter-item">
	    						 <a href="#">
					               <img style="width:100%;height:100%" src="./img/class-parter.jpg" alt="">
					               
					               <p class="main-font"><a href="#">Excel学习乐园</a></p>
					             </a>
	    					</div>
	    					 <div class="class-parter-item">
	    						 <a href="#">
					               <img style="width:100%;height:100%" src="./img/class-parter.jpg" alt="">
					               
					               <p class="main-font"><a href="#">Excel学习乐园</a></p>
					             </a>
	    					</div>

	    				</div>
	    				<!-- hot-class-body ending -->
	    			</div>
    			</div>
    			<!-- 合作伙伴模块 结束 -->
			</div>
			<!-- col-xs-4 结束 -->
		</div>
	</div>
	<div class="footer margin">
	<div class="container">
		<div class="row">
			<div class="col-xs-4">
				<img src="./img/logo_bottom.png" alt="">
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
	<script src="./plugin/js/jquery.min.js"></script>
    <!-- Bootstrap -->
	<script src="./plugin/js/bootstrap.min.js"></script>
    <!-- Owl Carousel -->
	<script src="./plugin/js/owl.carousel.min.js"></script>

	<script src="./plugin/js/fix-menu.js"></script>

	<script src="./plugin/js/wangEditor.min.js"></script>
	<script>
       $(function(){
       	  /*!富文本编辑器
-------------------------------------------------------------------------------!*/
       	 var E = window.wangEditor;
						        var editor = new E('.apply-body');
						        editor.create();
       	  /*!轮播图
-------------------------------------------------------------------------------!*/
       	$('#owl-demo').owlCarousel({
		          items: 1,
		          autoplay: true,
		          autoplayTimeout:3000,
		          animateIn:'fadeIn',
		          animateOut:'fadeOut',
		          // dotsSpeed:3000,
		          loop:true,
		          nav:true,
		          navText:[' <i class="fa fa-3x fa-angle-left"></i>',' <i class="fa fa-3x fa-angle-right"></i>']
	         });
	      	//轮播图完成
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
    });
	</script>
</body>
</html>