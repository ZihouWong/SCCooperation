<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link rel="stylesheet" href="css/BackStageStyle.css" media="screen"
	type="text/css" />
<link rel="stylesheet" type="text/css" href="css/menu.css">
<link rel="stylesheet" type="text/css"
	href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css"
	rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	</div>
	<nav class="main-menu"
		style="position:fixed;left:0px;top:0px;z-index:1000;">

	<div class="logo"></div>
	<div class="settings"></div>

	<ul>

		<li><a href="backstageIndex.action"> <i
				class="fa fa-home fa-lg"></i> <span class="nav-text">主页</span>

		</a></li>



		<li class="has-subnav"><a href="peopleManage.action?pageNo=1">
				<i class="fa fa-clock-o fa-lg"></i> <span class="nav-text">
					用户管理 </span>
		</a></li>

		<li><a href="enterpriseManageIndex.action?pageNo=1"> <i
				class="fa fa-desktop fa-lg"></i> <span class="nav-text"> 企业管理
			</span>
		</a></li>
		<li class="has-subnav"><a href="enterprisesubuserManageIndex.action?pageNo=1"> <i
				class="fa fa-plane fa-lg"></i> <span class="nav-text">
					企业子用户管理 </span>
		</a></li>

		<li><a href="noteManage.action?pageNo=1"> <i
				class="fa fa-shopping-cart"></i> <span class="nav-text">
					管理帖子 </span>
		</a></li>
		<li><a href="replyNoteManage.action?pageNo=1"> <i class="fa fa-picture-o fa-lg"></i> <span
				class="nav-text"> 管理回复贴 </span>
		</a></li>
		<li><a href="backstagePostManageIndex.action?pageNo=1"> <i class="fa fa-microphone fa-lg"></i> <span
				class="nav-text"> 管理项目</span>
		</a></li>
		<li><a href="#"> <i class="fa fa-flask fa-lg"></i> <span
				class="nav-text"> 管理视频 </span>
		</a></li>

		<li><a href="postCheck.action?pageNo=1"> <i class="fa fa-align-left fa-lg"></i> <span
				class="nav-text"> 审核项目 </span>
		</a></li>
		<li><a href="#"> <i class="fa fa-gamepad fa-lg"></i> <span
				class="nav-text">审核视频 </span>
		</a></li>
		<li><a href="noteCheck.action?pageNo=1"> <i class="fa fa-glass fa-lg"></i> <span
				class="nav-text"> 审核贴子 </span>
		</a></li>
		<li class="has-subnav"><a href="#"> <i
				class="fa fa-rocket fa-lg"></i> <span class="nav-text"> Fun </span>
		</a></li>
	</ul>

	<ul class="logout">
		<li><a href="backstageUserLoginOut.action"> <i class="fa fa-lightbulb-o fa-lg"></i> <span
				class="nav-text"> 登出 </span>

		</a></li>
	</ul>
	</nav>
	<div style="text-align: center; clear: both">
		<script src="/gg_bd_ad_720x90.js" type="text/javascript"></script>
		<script src="/follow.js" type="text/javascript"></script>
	</div>
</body>
</html>