<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>校企合作平台首页</title>
	<link rel="stylesheet" href="plugin/css/easy-responsive-tabs.css">
	 <!-- Bootstrap -->
	<link rel="stylesheet" href="plugin/css/bootstrap.min.css">
    <!-- Animate -->
	<link rel="stylesheet" href="plugin/css/animate.css">
    <link rel="stylesheet" href="plugin/css/animate-control.css">
 
    <!-- Owl Carousel -->
	<link rel="stylesheet" href="plugin/css/owl.carousel.min.css">
	<link rel="stylesheet" href="plugin/css/owl.theme.default.min.css">
    <!-- Font Awesome -->
	<link rel="stylesheet" href="plugin/font-awesome-4.7.0/css/font-awesome.min.css">
	 <!-- easyTab css -->
  
  <link rel="stylesheet" href="css/style.css">
  <link rel="stylesheet" href="css/index.css">
  <style>

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
/*!主体内容--介绍模块
-------------------------------------------------------------------------------!*/
		.content {
        	width: 100%;
        }
        .content-intro {
        	height: 280px;
        	padding: 40px;
            background-color: #f5f7f9;
        }
        .content-intro-item {
        	display: block;
        }
        .content .item-icon {
        	border-radius: 50%;
        	background-color: blue;
        	color: white;
        	width: 120px;
        	height: 120px;
        	padding: 35px;
        	margin: 0 auto;
        }
        .content .item-title {
        	color: black;
        	font-size: 18px;
        	margin-top: 15px;
        	margin-bottom: 8px;
        	letter-spacing: 1px;
        }
        .content .item-border {
        	display: block;
        	height: 2px;
        	width: 85px;
        	background-color: red;
        	margin: 0 auto;
        	margin-bottom: 5px;
        }
        .content .main-font {
        	color: grey;
        }
        .content-intro-item:hover {
        	color: black;
        }
/*!主体内容--新闻模块
-------------------------------------------------------------------------------!*/
          .content-news {
          	padding: 40px 0;
          }
          .head-news {
          	width: 100%;
          }
          .font-first-heading {
          	color: #000066;
          	font-size: 1.4em;
          }
       .head-news-icon {
       	color: #000066;
       	float: left;
       	margin-right: .7em;
       }
          .head-news .font-first-heading {
          	float: left;
          }
          
          .head-news .fa-angle-right {
          	float: right;
          	color: grey;
          }
          .know-more {
          	float: right;
          	color: grey;
          }
          .know-more a {
          	color: grey;
          }
          .head-news-border {
          	display: block;
          	height: 1px;
          	width: 100%;
          	margin: 0 auto;
          	clear: both;
            background: rgba(0,0,0,0.35);
          }
          .head-news-body {
          	margin-top: .7em;
          }
          .head-news-body .fa-angle-double-right {
          	float: left;
          	color: #0099CC;
          	font-size: 1.4em;
          	/*margin-right: -1em;*/
          	margin-top: 5px;
          	margin-left: -1.8em;
          }
          .head-news-body .main-font {
          	margin-left: -1.5em;
          	margin-top: 6px;
          }
          .fa-angle-right {
          	margin-top: 3px;
          }
          .head-news-body-item {
          	padding: 6px 0;
          	display: block;
          }
          .head-news-body-item:hover {
          	background: rgba(0,0,0,0.01);
          }
          .span-news-border2 {
           	display: block;
           	height: 1px;
           	width: 240px;
           	margin-left: -22px;
           	background: rgba(0,0,0,0.1);
           }
           .head-news-body-item:hover {
             color: rgba(0,0,0,0.7);
           }
           .head-news-body-item:hover .font-main {
		       -webkit-animation: intro-news-content-animate .2s linear 0s 1 alternate forwards;
		       -o-animation: intro-news-content-animate .2s linear 0s 1 alternate forwards;
		       animation: intro-news-content-animate .2s linear 0s 1 alternate forwards;
           }
           @keyframes intro-news-content-animate {
	       	from {

	       	}
	       	to {
	           	margin-left: 1em;
	           	color: black;
	       	}
	       }
/*!主体内容--合作伙伴模块
-------------------------------------------------------------------------------!*/
	  .content-teamwork {
      	background: #f5f7f9;
      	padding: 40px;
      	
      }
      .content-teamwork .item {
      	display: block;
      	margin-right: 5px;
      }
		.content-teamwork .item img {
			width: 14em;
			height: 10em;
		}
		.index-success-title {
			font-size: 1.6em;
			color: #000066;
			letter-spacing: 1px;
			
		}
		
		#owl-demo2  .owl-controls .owl-nav .owl-prev,
			 #owl-demo2  .owl-controls .owl-nav .owl-next {
                position: absolute;
			 	top: 20%;
			 	width: 45px;
			 	height: 70px;
			 	padding-top: 12px;
			 	background: rgba(0,0,0,0.25);
			 }
			 #owl-demo2  .owl-controls .owl-nav .owl-prev:hover,
			 #owl-demo2  .owl-controls .owl-nav .owl-next:hover {
			 	background: rgba(0,0,0,0.65);
			 }
			 #owl-demo2  .owl-controls .owl-nav .owl-prev {
			 	left: -80px;
			 }
			 #owl-demo2  .owl-controls .owl-nav .owl-next {
			 	right: -80px;
			 }
/*!主体内容--工作资讯模块
-------------------------------------------------------------------------------!*/
	.content-work {
		/*height: 480px;*/
		width: 100%;
	}
	.content-work .index-success-title {
           float: left;
		}
		.content-work .index-success-more {
			float: right;
			margin-top: 8px;
		}
		.content-work .index-success-title-find,
		.content-work .index-success-title-say {
			float: none;
		}
	.work-item-border {
		display: block;
		width: 4px;
		height: 28px;
		margin-right: 5px;
		background-color: orange;
	}
	.work-item-img {
		width: 100%;
		height: 120px;
	}
	.work-item-list {
		padding: 0;
		margin: 0;
	}
	.work-item-list-item {
		margin-top: 7px;
		letter-spacing: 1px;
		display: block;
	}
	#work-item-list-item1 {
		margin-top: 14px;
	}
	.work-item-group-name {
		font-size: 16px;
		margin: 6px 0 8px 0;
	}
	.work-item-group-img {
		margin-right: 8px;
		margin-bottom: 5px;
	}
	.content-work .container1 {
		margin-bottom: 20px;
	}
	.work-item-find input[type="text"] {
		width: 70%;
		margin-left: 30px;
	}
	.work-item-find .row {
		padding-left: 15px;
	}
	#work-find-btn {
		position: relative;
		width: 120px;
		padding: 8px 0;
		background: orange;
		color: white;
		left: 88px;
		top: 25px;
	}
  </style>
</head>
<body>
    <!-- 登陆框、联系方式 -->
	<jsp:include page="./fronttopbar.jsp"></jsp:include>
	<!-- 导航条 -->
	<div class="navbar">
		<div class="container">
			<div class="navbar-left">
				<img src="img/logo.png" alt="" class="navbar-logo">
				<span class="navbar-border"></span>
				<a href="#" class="navbar-title">大创项目</a>
			</div>
		    <div class="navbar-right">
		    	<ul class="navbar-body">
		    		<li class="navbar-body-item"><a id="lock" href="#" class="navbar-link">首页</a></li>
		    		<li class="navbar-body-item"><a href="gongxingketangtest.action?pageNo=1" class="navbar-link">创行谷</a></li>
		    		<li class="navbar-body-item"><a href="luntan.action?pageNo=1" class="navbar-link">知行圈</a></li>
		    		<li class="navbar-body-item"><a href="gongxingketangtest.action?pageNo=1" class="navbar-link">躬行课堂</a></li>
		    		<li class="navbar-body-item"><a href="personalcenter.action" class="navbar-link">个人中心</a></li>
		    	</ul>
		    </div>
		</div>
	</div>
	<!-- 轮播图 -->
	<div class="carousel">
		<div id="owl-demo" class="owl-carousel">
			<a class="item"><img src="img/owl-img1.jpg" alt=""><div class="item-intro">欢迎领导到校访问交流！</div></a>
			<a class="item"><img src="img/owl-img2.png" alt=""><div class="item-intro">欢迎青年教师团队交流教学经验！</div></a>
			<a class="item"><img src="img/owl-img3.png" alt=""><div class="item-intro">热烈庆祝信管专业成为广东省特级专业！</div></a>
			<a class="item"><img src="img/owl-img4.png" alt=""><div class="item-intro">欢迎领导到校访问交流！</div></a>
			<a class="item"><img src="img/owl-img5.png" alt=""><div class="item-intro">欢迎青年教师团队交流教学经验！</div></a>
		</div>
	</div>
	<!-- 主题内容 -->
	<div class="content">
		
			<!-- 介绍 start-->
			<div class="content-intro">
			  <div class="container">	
				
				  <div class="col-xs-3">
					<a href="#" class="content-intro-item">
						<div class="item-icon">
							<i class="fa fa-phone fa-4x"></i>
						</div>
						<p class="item-title text-center">项目简介</p>
						<span class="item-border"></span>
						<p class="main-font text-center">
							创建“学历教育+职业教育<br>
							+网络教育”的新型<br>
							校企合作模式
						</p>
					</a>
				  </div>
				  <!-- col-xs-4 ending -->
				  <div class="col-xs-3">
					<a href="#" class="content-intro-item">
						<div class="item-icon">
							<i class="fa fa-phone fa-4x"></i>
						</div>
						<p class="item-title text-center">项目简介</p>
						<span class="item-border"></span>
						<p class="main-font text-center">
							创建“学历教育+职业教育<br>
							+网络教育”的新型<br>
							校企合作模式
						</p>
					</a>
				  </div>
				  <!-- col-xs-4 ending -->
				  <div class="col-xs-3">
					<a href="#" class="content-intro-item">
						<div class="item-icon">
							<i class="fa fa-phone fa-4x"></i>
						</div>
						<p class="item-title text-center">项目简介</p>
						<span class="item-border"></span>
						<p class="main-font text-center">
							创建“学历教育+职业教育<br>
							+网络教育”的新型<br>
							校企合作模式
						</p>
					</a>
				  </div>
				  <!-- col-xs-4 ending -->
				  <div class="col-xs-3">
					<a href="#" class="content-intro-item">
						<div class="item-icon">
							<i class="fa fa-phone fa-4x"></i>
						</div>
						<p class="item-title text-center">项目简介</p>
						<span class="item-border"></span>
						<p class="main-font text-center">
							创建“学历教育+职业教育<br>
							+网络教育”的新型<br>
							校企合作模式
						</p>
					</a>
				  </div>
				  <!-- col-xs-4 ending -->
			  </div>
			</div>
            <!-- 介绍项目模块 结束 -->
            <div class="space"></div>
			<div class="content-news">
				<div class="container">
					<div class="col-xs-4">
					<div class="head-news padding">
					    <div class="head-news-title">
                        	<i class="fa fa-graduation-cap fa-2x head-news-icon"></i>
						    <p class="font-first-heading">创行谷</p>
						    
						    <p class="know-more pull-right"><a href="chuangxinggutest.action?pageNo=1">更多<i class="fa fa-angle-right fa-lg"></i></a></p>
						    
                        </div>
                        <span class="head-news-border"></span>
						<ul class="head-news-body">
							<li class="head-news-body-item">
								<i class="fa fa-angle-double-right"></i>
								<p class="main-font"><a href="#">我院举行学生党员示范寝室启动仪式</a></p>
							</li>
							<span class="span-news-border2"></span><li class="head-news-body-item">
								<i class="fa fa-angle-double-right"></i>
								<p class="main-font"><a href="#">我院举行学生党员示范寝室启动仪式</a></p>
							</li>
							<span class="span-news-border2"></span><li class="head-news-body-item">
								<i class="fa fa-angle-double-right"></i>
								<p class="main-font"><a href="#">我院举行学生党员示范寝室启动仪式</a></p>
							</li>
							<span class="span-news-border2"></span><li class="head-news-body-item">
								<i class="fa fa-angle-double-right"></i>
								<p class="main-font"><a href="#">我院举行学生党员示范寝室启动仪式</a></p>
							</li>
							<span class="span-news-border2"></span><li class="head-news-body-item">
								<i class="fa fa-angle-double-right"></i>
								<p class="main-font"><a href="#">我院举行学生党员示范寝室启动仪式</a></p>
							</li>
							
						</ul>
				    </div>
			    </div>
			    <!-- col-xs-4 ending -->
			 <div class="col-xs-4">
					<div class="head-news padding">
						<div class="head-news-title">
                        	<i class="fa fa-university fa-2x head-news-icon"></i>
						    <p class="font-first-heading">知行圈</p>
						    
						    <p class="know-more pull-right"><a href="luntan.action?pageNo=1">更多<i class="fa fa-angle-right fa-lg"></i></a></p>
						    
                        </div>
                        <span class="head-news-border"></span>
						<ul class="head-news-body">
							<li class="head-news-body-item">
								<i class="fa fa-angle-double-right"></i>
								<p class="main-font"><a href="#">我院举行学生党员示范寝室启动仪式</a></p>
							</li>
							<span class="span-news-border2"></span><li class="head-news-body-item">
								<i class="fa fa-angle-double-right"></i>
								<p class="main-font"><a href="#">我院举行学生党员示范寝室启动仪式</a></p>
							</li>
							<span class="span-news-border2"></span><li class="head-news-body-item">
								<i class="fa fa-angle-double-right"></i>
								<p class="main-font"><a href="#">我院举行学生党员示范寝室启动仪式</a></p>
							</li>
							<span class="span-news-border2"></span><li class="head-news-body-item">
								<i class="fa fa-angle-double-right"></i>
								<p class="main-font"><a href="#">我院举行学生党员示范寝室启动仪式</a></p>
							</li>
							<span class="span-news-border2"></span><li class="head-news-body-item">
								<i class="fa fa-angle-double-right"></i>
								<p class="main-font"><a href="#">我院举行学生党员示范寝室启动仪式</a></p>
							</li>
							
						</ul>
				</div>
			 </div>
			 <!-- col-xs-4 ending -->
				<div class="col-xs-4">
					<div class="head-news padding">
						<div class="head-news-title">
                        	<i class="fa fa-newspaper-o fa-2x head-news-icon"></i>
						    <p class="font-first-heading">躬行课堂</p>
						    
						    <p class="know-more pull-right"><a href="gongxingketangtest.action?pageNo=1">更多<i class="fa fa-angle-right fa-lg"></i></a></p>
						    
                        </div>
                        <span class="head-news-border"></span>
						<ul class="head-news-body">
							<li class="head-news-body-item">
								<i class="fa fa-angle-double-right"></i>
								<p class="main-font"><a href="#">我院举行学生党员示范寝室启动仪式</a></p>
							</li>
							<span class="span-news-border2"></span><li class="head-news-body-item">
								<i class="fa fa-angle-double-right"></i>
								<p class="main-font"><a href="#">我院举行学生党员示范寝室启动仪式</a></p>
							</li>
							<span class="span-news-border2"></span><li class="head-news-body-item">
								<i class="fa fa-angle-double-right"></i>
								<p class="main-font"><a href="#">我院举行学生党员示范寝室启动仪式</a></p>
							</li>
							<span class="span-news-border2"></span><li class="head-news-body-item">
								<i class="fa fa-angle-double-right"></i>
								<p class="main-font"><a href="#">我院举行学生党员示范寝室启动仪式</a></p>
							</li>
							<span class="span-news-border2"></span><li class="head-news-body-item">
								<i class="fa fa-angle-double-right"></i>
								<p class="main-font"><a href="#">我院举行学生党员示范寝室启动仪式</a></p>
							</li>
						</ul>
				  </div> 
				  <!-- col-xs-4 ending -->
				</div>

				<!-- container ending -->
			</div>
			<!-- 新闻模块 结束 -->

			<!-- 合作伙伴模块 开始 -->
			<div class="content-teamwork">
				
        	    <p class="index-success-title text-center">合作伙伴</p>
	        	<div class="container">
	        		<div class="row">
	        			<div id="owl-demo2" class="owl-carousel">  
	  					    <a href="#" class="item"><img class="lazyOwl" src="img/head-owl-img1.jpeg" alt=""></a>
	  					    <a href="#" class="item"><img class="lazyOwl" src="img/head-owl-img2.jpg" alt=""></a>
	  					    <a href="#" class="item"><img class="lazyOwl" src="img/head-owl-img3.jpg" alt=""></a>
	  					   <a href="#" class="item"><img class="lazyOwl" src="img/head-owl-img1.jpeg" alt=""></a>
	  					    <a href="#" class="item"><img class="lazyOwl" src="img/head-owl-img2.jpg" alt=""></a>
	  					    <a href="#" class="item"><img class="lazyOwl" src="img/head-owl-img3.jpg" alt=""></a><a href="#" class="item"><img class="lazyOwl" src="img/head-owl-img1.jpeg" alt=""></a>
	  					    <a href="#" class="item"><img class="lazyOwl" src="img/head-owl-img2.jpg" alt=""></a>
	  					    <a href="#" class="item"><img class="lazyOwl" src="img/head-owl-img3.jpg" alt=""></a>
	                    </div>
	        		</div>
	        	</div>
  
			</div>
			<!-- 合作伙伴模块 结束 -->

			<!-- 工作资讯模块 开始 -->
			<div class="content-work padding">
				<div class="container container1">
					<div class="col-xs-4">
						<div class="work-item">
							<span class="work-item-border float"></span>
							<p class="index-success-title">就业动态</p>
							<p class="main-font index-success-more">more ></p>
							<img class="work-item-img" src="img/work-img1.jpg" alt="">
							<ul class="work-item-list">
								<li id="work-item-list-item1" class="work-item-list-item"><a href="#">·关于职工社会保险费的费率的规定</a></li>
								<li class="work-item-list-item"><a href="#">·关于职工社会保险费的费率的规定</a></li>
								<li class="work-item-list-item"><a href="#">·关于职工社会保险费的费率的规定</a></li>
							</ul>

						</div>
					</div>
					<!-- col-xs-4 ending -->
					<div class="col-xs-4">
						<div class="work-item">
							<span class="work-item-border float"></span>
							<p class="index-success-title">招聘信息</p>
							<p class="main-font index-success-more">more ></p>
							<img class="work-item-img" src="img/work-img2.jpg" alt="">
							<ul class="work-item-list">
								<li id="work-item-list-item1" class="work-item-list-item"><a href="#">·关于职工社会保险费的费率的规定</a></li>
								<li class="work-item-list-item"><a href="#">·关于职工社会保险费的费率的规定</a></li>
								<li class="work-item-list-item"><a href="#">·关于职工社会保险费的费率的规定</a></li>
							</ul>

						</div>
					</div>
					<!-- col-xs-4 ending -->
					<div class="col-xs-4">
						<div class="work-item">
							<span class="work-item-border float"></span>
							<p class="index-success-title index-success-title-say">企业"说"</p>
							
							<div class="work-item-group">
								<img class="work-item-group-img float" src="img/work-gourp-img1.jpg" alt="">
                                <p class="work-item-group-name">致同会计师事务所：</p>
                                <p class="work-item-group-say main-font">
                                	大学生求职最主要是明确自己的职业发展。
                                    网校推荐的审计实习生，专业技能与个人职业规划均佳。
                                </p>
							</div>
                            <div class="work-item-group">
								<img class="work-item-group-img float" src="img/work-gourp-img2.png" alt="">
                                <p class="work-item-group-name">南京水游城假日酒店：</p>
                                <p class="work-item-group-say main-font">
                                	网校推荐的财务应届生勤奋，接受能力好，工作心态优。
                                    大学生初入职场，求职心态与工作态度尤为重要。
                                </p>
							</div>
							<!-- <p class="main-font index-success-more">more ></p> -->
							<!-- work-item-group ending -->
						</div>
						<!-- container ending -->
					</div>
					<!-- col-xs-4 ending -->
				</div>
				<div class="container">
					<div class="col-xs-4">
						<div class="work-item">
							<span class="work-item-border float"></span>
							<p class="index-success-title">就业喜报</p>
							<p class="main-font index-success-more">more ></p>
							<img class="work-item-img" src="img/work-img3.jpg" alt="">
							<ul class="work-item-list">
								<li id="work-item-list-item1" class="work-item-list-item"><a href="#">·关于职工社会保险费的费率的规定</a></li>
								<li class="work-item-list-item"><a href="#">·关于职工社会保险费的费率的规定</a></li>
								<li class="work-item-list-item"><a href="#">·关于职工社会保险费的费率的规定</a></li>
							</ul>

						</div>
					</div>
					<!-- col-xs-4 ending -->
					<div class="col-xs-4">
						<div class="work-item">
							<span class="work-item-border float"></span>
							<p class="index-success-title">求职干货</p>
							<p class="main-font index-success-more">more ></p>
							<img class="work-item-img" src="img/work-img4.jpg" alt="">
							<ul class="work-item-list">
								<li id="work-item-list-item1" class="work-item-list-item"><a href="#">·关于职工社会保险费的费率的规定</a></li>
								<li class="work-item-list-item"><a href="#">·关于职工社会保险费的费率的规定</a></li>
								<li class="work-item-list-item"><a href="#">·关于职工社会保险费的费率的规定</a></li>
							</ul>

						</div>
					</div>
					<!-- col-xs-4 ending -->
					<div class="col-xs-4">
						<div class="work-item work-item-find">
							<span class="work-item-border float"></span>
							<p class="index-success-title index-success-title-find">快速招聘</p>
							<form action="" method="post" name="fast-work">
								<div class="row">
									<p class="main-font float">公司名称:</p>
								    <input type="text" name="name">
								</div>
								<div class="row">
									<p class="main-font float">招聘岗位:</p>
								    <input type="text" name="work">
								</div>
								<div class="row">
									<p class="main-font float">联 系 人 :</p>
								    <input class="work-item-find3" type="text" name="people">
								</div>
								<div class="row">
									<p class="main-font float">联系方式:</p>
								    <input type="text" name="tel">
								</div>
								
								
							</form>
                            <input id="work-find-btn" type="submit" class="btn" value="快速招聘">
						</div>
					</div>
					<!-- col-xs-4 ending -->
				</div>
				<!-- container ending -->
			</div>
			<!-- 工作资讯模块 结束 -->
	</div>
	<!-- 尾部 -->
	<div class="footer margin">
		<div class="container">
			<div class="row">
				<div class="col-xs-4">
					<img src="img/logo_bottom.png" alt="">
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

<!-- 侧边菜单栏 开始-->
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
</div>
<!-- 侧边菜单栏 结束-->
	<!-- JQuery -->
	<script src="plugin/js/jquery.min.js"></script>
    <!-- Bootstrap -->
	<script src="plugin/js/bootstrap.min.js"></script>
    <!-- Owl Carousel -->
	<script src="plugin/js/owl.carousel.min.js"></script>
	<script>
      $(function(){
      	// alert("1");
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
	      	$('#owl-demo2').owlCarousel({
	            items: 5,
	            navigation: true,
	            autoplay:true,
	            autoplayTimeout:3000,
	            // animateIn:true,
	            animateOut:'fadeOut',
	            loop:true,
	            nav:true,
	            navText:[' <i class="fa fa-3x fa-angle-left"></i>',' <i class="fa fa-3x fa-angle-right"></i>']
            });
         //轮播图完成
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

</body>
</html>