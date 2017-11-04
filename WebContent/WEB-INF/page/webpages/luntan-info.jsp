<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.List"%>  
<%@page import="org.sccooperation.domain.*"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
    <link href="umeditor/themes/default/css/umeditor.css" type="text/css" rel="stylesheet">
    <script type="text/javascript" src="umeditor/third-party/jquery.min.js"></script>
    <script type="text/javascript" src="umeditor/third-party/template.min.js"></script>
    <script type="text/javascript" charset="utf-8" src="umeditor/umeditor.config.js"></script>
    <script type="text/javascript" charset="utf-8" src="umeditor/umeditor.min.js"></script>
    <script type="text/javascript" src="umeditor/lang/zh-cn/zh-cn.js"></script>
  <style>
  /*!课程分类
-------------------------------------------------------------------------------!*/
.body {
	/*margin-top: -40px;*/
	/*background-color: #f5f7f9;
*/	padding-bottom: 60px;
    margin-top: 25px;
}
.btn {
	display: block;
	text-align: center;
}
/*!课程分类
-------------------------------------------------------------------------------!*/

/*!课程分类
-------------------------------------------------------------------------------!*/
/*!课程分类
-------------------------------------------------------------------------------!*/
.wangEditor-container .wangEditor-txt blockquote {
  /* 在此自定义引用区域样式 */
  border: none;
}
.wangEditor-container .wangEditor-txt table {
  /* 在此表格样式 */
  height: 100%;
  width: 100%;
  border: none;
}
.wangEditor-container .wangEditor-txt table td,
.wangEditor-container .wangEditor-txt table th {
  /* 在此表格样式 */
  border: none;
}
.wangEditor-container .wangEditor-txt pre {
  /* 在此代码区域样式 */
  border: none;
}
/*!课程分类
-------------------------------------------------------------------------------!*/
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
</head>
<body>
	 <!-- 登陆框、联系方式 -->
	<div id="head-link" class="login">
		<div class="container">
			<div class="col-xs-12">
			    <%
			List listU = (List)request.getSession().getAttribute("user");
			if(request.getSession().getAttribute("user")==null) {%>
			    <div class="login-in">
					<form id="login-form" action="login.action?pageNo=1" method="post">
						<p class="main-font">学生代码:</p><input type="text" name="account">
						<p class="main-font">密码:</p><input type="password" name="password">
						<p class="main-font">验证码:</p><input id="input-code" type="text" name="code">
						<img src="" alt="" class="code-img">
						<input id="login-btn" type="submit" value="登陆">
						<a href="register-goto.html" id="login-btn-a" class="float">注册</a>

					</form>
				</div>
				<%}else{ 
					
					People people =(People) listU.get(0);
					%>
				}
				<div class="login-in">
				欢迎<%=people.getPnumber() %>
				</div>
				<%} %>
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
			      <a href="./index.html"><img src="./img/logo.png" alt="" class="logo-img float"></a>
			      <span class="border-1 float"></span>
			      <p class="font-title">创行谷管理</p>
			    </div>
		</div>
	
	<!-- 导航条 结束-->
	<div class="body" style="padding-bottom:60px">
		<div class="container">
			<style>
                .reply {
                	background-color: #eee;
                	width: 100%;
                	height: 35px;
                	line-height: 35px;
                	padding: 0 20px;
                }
                .topic1 {
                	width: 100%;
                	height: 60px;
                	line-height: 60px;
                	border-bottom: 2px solid #eee;
                /*	padding-left: 20px;*/
                	letter-spacing: 1px;
                	
                }
                .topic1 .topic-btn {
                	border: 1px solid #eee;
                	margin-top: 15px;
                }
                .topic1 .font-title2 {
                	margin-left: -102px;
                }
                .apply-item {
                	position: relative;
                	padding: 0;
                	height: 236px;
                	width: 100%;
                	border: 1px solid #eee;
                	margin-bottom: 10px;
                }
                .apply-item-left {
                	position: absolute;
                	/*left: 300px;*/
                	left: 0;
                	width: 16%;
                	height: 100%;
                	background: #eee;
                	/*float: left;*/
                	/*margin-left: -293px;*/
                }
                .apply-head {
                	width: 85px;
                	height: 85px;
                	margin: 0 auto;
                	margin-top: 20px;
                }
                .apply-head-img {
                	width: 100%;
                	height: 100%;
                }
                .apply-name {
                	margin-top: 20px;
                	color: blue;
                	letter-spacing: 1px;
                }
                .apply-item-right {
                	/*position: absolute;
                	width: 84%;
                	height: 236px;
                	left: 198px;
                	padding: 30px 25px;*/
                	position: relative;
                	width: 84%;
                	height: 236px;
                	left: 198px;
                	padding: 30px 25px;
                }
                .apply-item-right .font-intro {
                	font-size: 14px;
                }
                .apply-body-remark {
                	position: absolute;
                	bottom: 15px;
                	right: 20px;
                }
                .apply-btn-input {
                	border: 1px solid #eee;
                	
                }
                .apply-btn-publish {
                    width: 100px;
                	height: 35px;
                	text-align: center;
                	background: #0099cc;
                	letter-spacing: 1px;
                	color: white;
                }
                .apply-message {
                	z-index: 100;
                	position: absolute;
                	width: 85%;
                	/*height: 280px;*/
                	background: #f5f7f9;
                	padding: 12px 0px;
                	top: 210px;
                    right: 20px;
                    z-index: 1000;
                    border: 1px dotted grey;
                }
                .hidden {
                	display: none;
                }
                .apply-menu-item {
                	margin: 0 auto;
                	width: 95%;
                	height: 55px;
                	display: block;
                	padding: 10px 0;
                	border-bottom: 1px dotted grey;
                	position: relative;
                	/*background: yellow;*/
                }
                .apply-menu-item .apply-name {
                	margin-top: 10px;
                }
                .apply-menu-item .apply-body-remark {
                	position: absolute;
                	bottom: 0px;
                }
                .apply-menu-head {
                	width: 45px;
                	height: 45px;
                	margin-top: -4px;
                	margin-right: 6px;
                	float: left;
                } 
                .apply-menu-item img {
                	width: 100%;
                	height: 100%;
                }
                .apply-menu-item .apply-content {
                	margin-top: 10px;
                }
                .lock {
                	font-weight: 600;
                }
                .apply-tab {
                	margin-left: 25px;
                	letter-spacing: 3px;
                	margin-top: 18px;
                }
                .apply-menu-btn:hover {
                    color: white;
                }
			</style>
			<%Note note = (Note)request.getAttribute("firstNote");
			  People host = (People)request.getAttribute("host");
			  List replyList = (List)request.getAttribute("replyNote");
			%>
			<div class="reply">
				<p class="font-intro float"><span class="red"> 10 </span>回复贴，共<span class="red"> 1 </span>页</p>
				<p class="font-intro float-right"><a href="#">&lt;&lt; 返回创行谷</a></p>
			</div>
			<div class="topic1">
				<p class="font-title2 float"><%=note.getTitle() %></p>
				<a href="#apply" class="btn float-right topic-btn"><i class="fa fa-commenting-o fa-lg"></i>回复</a>

			</div>
				 <div class="apply-item">
					<div class="apply-item-left">
						<div class="apply-head">
							<img class="apply-head-img" src="<%=host.getPicture() %>" alt="">
						</div>
						<p class="font-intro apply-name text-center"><%=host.getUsername() %></p>
					</div>
					<div class="apply-item-right">
						<p class="font-intro"><%=note.getContent() %></p>
						<p class="apply-body-remark font-intro float"><%=note.getTime() %>
							<a class="apply-btn-input apply-floot-btn btn" href="#" style="color:blue">收起回复</a>
							<div class="apply-message ">
								<div class="apply-menu">
									<div class="apply-menu-item">
										<div class="apply-menu-head">
											<img class="float img-thumbnail" src="./img/class-teach.jpg" alt="">
										</div>
										
										<p class="font-intro apply-name float">可爱炸了:</p>
										<p class="font-intro apply-content">小吧，这贴不加精吗？</p>
										<p class="apply-body-remark font-intro float">  1楼  2017-10-11 11:24&nbsp;&nbsp;<a class="apply-foor-btn" href="#">回复</a></p>
									</div>
									<div class="apply-menu-item">
										<div class="apply-menu-head">
											<img class="float img-thumbnail" src="./img/class-teach.jpg" alt="">
										</div>
										
										<p class="font-intro apply-name float">可爱炸了:</p>
										<p class="font-intro apply-content">小吧，这贴不加精吗？</p>
										<p class="apply-body-remark font-intro float">  1楼  2017-10-11 11:24&nbsp;&nbsp;<a class="apply-foor-btn" href="#">回复</a></p>
									</div>
									<div class="apply-menu-item">
										<div class="apply-menu-head">
											<img class="float img-thumbnail" src="./img/class-teach.jpg" alt="">
										</div>
										
										<p class="font-intro apply-name float">可爱炸了:</p>
										<p class="font-intro apply-content">小吧，这贴不加精吗？</p>
										<p class="apply-body-remark font-intro float">  1楼  2017-10-11 11:24&nbsp;&nbsp;<a class="apply-foor-btn" href="#">回复</a></p>
									</div>
									<div class="apply-menu-item">
										<div class="apply-menu-head">
											<img class="float img-thumbnail" src="./img/class-teach.jpg" alt="">
										</div>
										
										<p class="font-intro apply-name float">可爱炸了:</p>
										<p class="font-intro apply-content">小吧，这贴不加精吗？</p>
										<p class="apply-body-remark font-intro float">  1楼  2017-10-11 11:24&nbsp;&nbsp;<a class="apply-foor-btn" href="#">回复</a></p>
									</div>
									<div class="apply-menu-item">
										<div class="apply-menu-head">
											<img class="float img-thumbnail" src="./img/class-teach.jpg" alt="">
										</div>
										
										<p class="font-intro apply-name float">可爱炸了:</p>
										<p class="font-intro apply-content">小吧，这贴不加精吗？</p>
										<p class="apply-body-remark font-intro float">  1楼  2017-10-11 11:24&nbsp;&nbsp;<a class="apply-foor-btn" href="#">回复</a></p>
									</div>
								</div>
								<!-- apply-menu ending -->
								<!--  ..............................................................-->

								
								
				
								<!-- ..................................................... -->
<p class="apply-tab text-left float"> 
									   <a class="lock" href="#">1</a> 
                                       <a href="#">2</a>
                                       <a href="#">3</a>
                                       <a href="#">4</a>
                                       <a href="#">5</a>
                                       <a href="#">6</a>
                                       <a href="#">7</a>
                                       <a href="#">8</a>
                                       <a href="#">9</a>
                                       <a href="#">10</a>
                                       <a href="#">下一页</a>
                                       <a href="#">尾页</a>
									</p>
									<a class="btn apply-btn-publish float-right apply-menu-btn" href="#" style="margin-right:25px;margin-top:10px;">我也说一句</a>
								<form class="hidden apply-form" action="" method="post" name="apply-floor" style="padding-left:25px;">
									<textarea name="" id="" cols="131" rows="5">
										fvfvrtbrt
									</textarea>
									<input type="submit" class="apply-btn-publish" value="发表" name="topic-form">
								</form>
							</div>
						</p>
					</div>
				</div>
				 <!-- apply-item end -->
				 								<%if(replyList.size()>0){ %>
								<%for(int i =0 ;i<replyList.size();i++){
									ReplyNote replyNote = (ReplyNote)replyList.get(i);
									People people = replyNote.getRpeople();
									%>
				 <div class="apply-item">
					<div class="apply-item-left">
						<div class="apply-head">
							<img class="apply-head-img" src="<%=people.getPicture() %>" alt="">
						</div>
						<p class="font-intro apply-name text-center"><%=people.getUsername() %></p>
					</div>
					<div class="apply-item-right">
						<p class="font-intro"><%=replyNote.getContent() %></p>
						<p class="apply-body-remark font-intro float"><%=replyNote.getTime() %>
							<a class="apply-btn-input apply-floot-btn btn" href="#" style="color:blue">收起回复</a>
							<div class="apply-message ">
								<div class="apply-menu">
									<div class="apply-menu-item">
										<div class="apply-menu-head">
											<img class="float img-thumbnail" src="./img/class-teach.jpg" alt="">
										</div>
										
										<p class="font-intro apply-name float">可爱炸了:</p>
										<p class="font-intro apply-content">小吧，这贴不加精吗？</p>
										<p class="apply-body-remark font-intro float">  1楼  2017-10-11 11:24&nbsp;&nbsp;<a class="apply-foor-btn" href="#">回复</a></p>
									</div>
									<div class="apply-menu-item">
										<div class="apply-menu-head">
											<img class="float img-thumbnail" src="./img/class-teach.jpg" alt="">
										</div>
										
										<p class="font-intro apply-name float">可爱炸了:</p>
										<p class="font-intro apply-content">小吧，这贴不加精吗？</p>
										<p class="apply-body-remark font-intro float">  1楼  2017-10-11 11:24&nbsp;&nbsp;<a class="apply-foor-btn" href="#">回复</a></p>
									</div>
									<div class="apply-menu-item">
										<div class="apply-menu-head">
											<img class="float img-thumbnail" src="./img/class-teach.jpg" alt="">
										</div>
										
										<p class="font-intro apply-name float">可爱炸了:</p>
										<p class="font-intro apply-content">小吧，这贴不加精吗？</p>
										<p class="apply-body-remark font-intro float">  1楼  2017-10-11 11:24&nbsp;&nbsp;<a class="apply-foor-btn" href="#">回复</a></p>
									</div>
									<div class="apply-menu-item">
										<div class="apply-menu-head">
											<img class="float img-thumbnail" src="./img/class-teach.jpg" alt="">
										</div>
										
										<p class="font-intro apply-name float">可爱炸了:</p>
										<p class="font-intro apply-content">小吧，这贴不加精吗？</p>
										<p class="apply-body-remark font-intro float">  1楼  2017-10-11 11:24&nbsp;&nbsp;<a class="apply-foor-btn" href="#">回复</a></p>
									</div>
									<div class="apply-menu-item">
										<div class="apply-menu-head">
											<img class="float img-thumbnail" src="./img/class-teach.jpg" alt="">
										</div>
										
										<p class="font-intro apply-name float">可爱炸了:</p>
										<p class="font-intro apply-content">小吧，这贴不加精吗？</p>
										<p class="apply-body-remark font-intro float">  1楼  2017-10-11 11:24&nbsp;&nbsp;<a class="apply-foor-btn" href="#">回复</a></p>
									</div>
								</div>
								<!-- apply-menu ending -->
								<!--  ..............................................................-->

								
								
				
								<!-- ..................................................... -->
<p class="apply-tab text-left float"> 
									   <a class="lock" href="#">1</a> 
                                       <a href="#">2</a>
                                       <a href="#">3</a>
                                       <a href="#">4</a>
                                       <a href="#">5</a>
                                       <a href="#">6</a>
                                       <a href="#">7</a>
                                       <a href="#">8</a>
                                       <a href="#">9</a>
                                       <a href="#">10</a>
                                       <a href="#">下一页</a>
                                       <a href="#">尾页</a>
									</p>
									<a class="btn apply-btn-publish float-right apply-menu-btn" href="#" style="margin-right:25px;margin-top:10px;">我也说一句</a>
								<form class="hidden apply-form" action="" method="post" name="apply-floor" style="padding-left:25px;">
									<textarea name="" id="" cols="131" rows="5">
										fvfvrtbrt
									</textarea>
									<input type="submit" class="apply-btn-publish" value="发表" name="topic-form">
								</form>
							</div>
						</p>
					</div>
				</div>
				<%} }%> 
		<!-- ............................... -->		
				
				
				<p class="apply-tab text-center float"> 
									   <a class="lock" href="#">1</a> 
                                       <a href="#">2</a>
                                       <a href="#">3</a>
                                       <a href="#">4</a>
                                       <a href="#">5</a>
                                       <a href="#">6</a>
                                       <a href="#">7</a>
                                       <a href="#">8</a>
                                       <a href="#">9</a>
                                       <a href="#">10</a>
                                       <a href="#">下一页</a>
                                       <a href="#">尾页</a>
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
						  	margin-top: 4px;
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
			        <div class="apply" id="apply" style="margin-top:60px;">
<form action="addreplynote.action?pageNo=1&id=<%=note.getId() %>" name="topic-form" method="post">
			            <p class="main-font" style="font-weight:500"><i class="fa fa-lg fa-star float"></i>发布新帖</p>
			            <div class="apply-topic-title">
				            	<input type="text" name="title" class="topic float">
				            	<p class="main-font float-right topic-icon"><i class="fa fa-lg fa-comment-o float"></i><span style="color:#7d6d6d">话题</span></p>
			                <!-- 加载编辑器的容器 -->

			            </div>
			                
    <script type="text/plain" id="myEditor" name="content" style="width:1003px;height:240px;">
</script>
<script type="text/javascript">
    var um = UM.getEditor('myEditor'); 
</script>
 <input type="submit" class="apply-btn" value="发表" name="topic-form">
</form>
			        </div>
	</div>
	<div class="footer margin">
	<div class="container">
		<div class="row">
			<div class="col-xs-4">
				<img src="..img/logo_bottom.png" alt="">
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

	<script src="./plugin/js/wangEditor.min.js"></script>

	<script src="./plugin/js/fix-menu.js"></script>
	<script>
       $(function(){
       	 	  /*!楼层下的回复
-------------------------------------------------------------------------------!*/
	$('.apply-menu-btn').click(function(){
          	// var _this = this;
          	var space = $('.apply-form');
            var index =  $(".apply-menu-btn").index(this);
            
          	if(space.eq(index).is(":hidden")) {
          		$(this).text("收起回复");
                space.eq(index).removeClass("hidden");
                var h2 = 266+$('.apply-message').height();
                $('.apply-item').eq(index).height(h2);

                if(!(space.is(":animated"))){
                	
                  // space.animate({height:"140px"},300,function(){});
                }
          	}
          	else {
          		$(this).text("回复");
                space.eq(index).addClass("hidden");
                $('.apply-item').eq(index).height(589);
                if(!(space.eq(index).is(":animated"))){
                	
                  // space.animate({height:"0px"},300,function(){});
                }
               
          	}  
          });

       	 	  /*!富文本编辑器
-------------------------------------------------------------------------------!*/
       	 // var E = window.wangEditor;
						   //      var editor = new E('.apply-body');
						   //      editor.create();
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


      /*!课程分类
-------------------------------------------------------------------------------!*/
       
   // var E = window.wangEditor;
		 //        var editor = new E('.apply-message');
		 //        editor.create();
/*!课程分类
-------------------------------------------------------------------------------!*/
          $('.apply-floot-btn').click(function(){
          	// var _this = this;
          	var space = $('.apply-message');
            var index =  $(".apply-floot-btn").index(this);

          	if(space.eq(index).is(":hidden")) {
          		$(this).text("收起回复");
          		
              if(space.eq(index).find('.apply-menu').length>0) {
              	$('.apply-item').eq(index).height(589);
              }
              else {
                $('.apply-item').eq(index).height(412);
              }
              
                space.eq(index).removeClass("hidden");
                if(!(space.is(":animated"))){
                	
                  // space.animate({height:"140px"},300,function(){});
                }
          	}
          	else {
          		$(this).text("回复");
                space.eq(index).addClass("hidden");
                // var h = $('.apply-item').eq(index).height();
                $('.apply-item').eq(index).height(236);
                if(!(space.eq(index).is(":animated"))){
                	
                  // space.animate({height:"0px"},300,function(){});
                }
               
          	}  
          });
          /*!课程分类
-------------------------------------------------------------------------------!*/
	    for(var i=0;i<$('.apply-message').length;i++){
	    	if($('.apply-message').is(":visible")) {
	    	  var h = 266+$('.apply-message').eq(i).height();
              $('.apply-item').eq(i).height(h);
              

	    	}
	    }
    });
	</script>
</body>
</html>