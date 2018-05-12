<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<!-- 以上代码IE=edge告诉IE使用最新的引擎渲染网页，chrome=1则可以激活Chrome Frame. -->
    <title>躬行课堂-详情页</title>
    <link rel="stylesheet" href="./plugin/css/easy-responsive-tabs.css">
<!-- Bootstrap -->
<link rel="stylesheet" href="./plugin/css/bootstrap.min.css">
<!-- Animate -->
<link rel="stylesheet" href="./plugin/css/animate.css">
<link rel="stylesheet" href="./plugin/css/animate-control.css">

<!-- Owl Carousel -->
<link rel="stylesheet" href="./plugin/css/owl.carousel.min.css">
<link rel="stylesheet" href="./plugin/css/owl.theme.default.min.css">
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

    
	<link rel="stylesheet" type="text/css" href="css/gongxingclass_detailpage1.css"/>
	<!-- <script type="text/javascript" src="jq/jquery-3.2.1.min.js"></script> -->
	<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
	<script type="text/javascript" src="js/main.js" ></script>
	<script type="text/javascript">
// 导航
$(document).ready(function(){

	var lis = document.getElementsByName("list");
	  // 播放列表的长度
	//document.getElementById("content").style.height = "lis.length"//;

	var navstr = '';	
	for (c in vars = '0'.split(',')) {
		$('#menu_' + vars[c]).addClass('selected');
	}	
	$('#wrap-nav ul.menu > li').hover(function() {
		$(this).find('.children').show();
		if ($(this).find('.children').length) $(this).addClass('hover');
	},function() {
		$('.children').hide();
		$(this).removeClass('hover');
	});	
	$('#wrap-nav ul.menu h3, #wrap-nav ul.menu ul.children > li, #wrap-cats h3').hover(function() {
		$(this).addClass('hover');
	},function() {
		$(this).removeClass('hover');
	});	
});

function showitem1(obj,itemdl,setvalid){
	var fodinfo=document.getElementById(itemdl).getElementsByTagName("li");
	var ii = 0;
	for(var i=0;i<fodinfo.length;i++){
		if(obj==fodinfo[i]){
			//fodinfo[i].className=objcss+(i+1)+'2';
			ii=i+1;
			document.getElementById(setvalid+ii).style.display="";
			fodinfo[i].style.borderBottom=" 2px solid #3AAEA9";
		}
		else{
			//fodinfo[i].className=objcss+(i+1)+'1';
			ii=i+1;
			document.getElementById(setvalid+ii).style.display="none";
			fodinfo[i].style.borderBottom=" 0";
		}
	}
}

</script>
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
				<a href="#" class="navbar-title">躬行课堂</a>
			</div>
		    <div class="navbar-right">
		    	<ul class="navbar-body">
		    		<li class="navbar-body-item"><a href="frontIndex.action"  class="navbar-link">首页</a></li>
		    		<li class="navbar-body-item"><a href="chuangxinggutest.action?pageNo=1&button=1" class="navbar-link">创行谷</a></li>
		    		<li class="navbar-body-item"><a  id="lock" href="luntan.action?pageNo=1" class="navbar-link">知行圈</a></li>
		    		<li class="navbar-body-item"><a href="gongxingketangtest.action?pageNo=1" class="navbar-link">躬行课堂</a></li>
		    		<li class="navbar-body-item"><a href="personalcenter.action" class="navbar-link">个人中心</a></li>
		    	</ul>
		    </div>
		</div>
	</div>
		</div>
		<div class="top" id="topBar">
    <div class="wrapper">
    	<div class="top_logo">
    		<a href="" class="logo"></a>	
    	</div>
		<div class="search">
			<form name="searchform" method="post" action="/e/search/index.php">
				<input name='ecmsfrom' type='hidden' value='9'>
				<input type="hidden" name="show" value="title,newstext">
				<select name="classid" id="choose">
					<option value="0">搜索全部</option>
					<option value="1">新闻中心</option>
				</select> 
				<input class="inp_srh" name="keyboard"  placeholder="请输入您要搜索的作品" >
				<input class="btn_srh" type="submit" name="submit" value="搜索">
			</form>
		</div>
		<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
		<script type="text/javascript" src="js/jquery.select.js"></script>
        <div class="TOP_login">
                <a class="loge" href="">登录</a>
                <a class="reg" href="">注册</a>
        </div><!-- =E TOP_login -->

        <!-- 直播提示 -->
        <div class="aside-tips" id="aside-tips"></div>
        <!-- 直播提示 -->
    </div>
</div><!-- =E TOP -->

<div class="nav">
 <div id="wrap-nav">
	
 </div>
</div>

<div class="videoli">                       
<div id="cans">
	<video controls="controls" id="video"　src="" poster="" height="500px" width="760px">
				
	</video>

	<aside id="playList">
		<header>
			<h2>&nbsp;播放列表</h2>
		</header>
					
		<div id="mainBox">
 			 <ul id="content">
				<li name="list" value="video/VID_20170323_193609.mp4" title="进球瞬间">进球瞬间</li>
				<li name="list" value="video/VID_20170323_215451.mp4" title="胜利庆祝">胜利庆祝</li>
				<li name="list" value="video/VID_20170323_193609.mp4" title="进球瞬间">进球瞬间</li>
				<li name="list" value="video/VID_20170323_215451.mp4" title="胜利庆祝">胜利庆祝</li>
				<li name="list" value="video/VID_20170323_193609.mp4" title="进球瞬间">进球瞬<li>
				<li name="list" value="video/VID_20170323_215451.mp4" title="胜利庆祝">胜利庆祝</li>
				<li name="list" value="video/VID_20170323_193609.mp4" title="进球瞬间">进球瞬间</li>
				<li name="list" value="video/VID_20170323_215451.mp4" title="胜利庆祝">胜利庆祝</li>
				<li name="list" value="video/VID_20170323_193609.mp4" title="进球瞬间">进球瞬间</li>
				<li name="list" value="video/VID_20170323_215451.mp4" title="胜利庆祝">胜利庆祝</li>
				<li name="list" value="video/VID_20170323_193609.mp4" title="进球瞬间">进球瞬<li>
				<li name="list" value="video/VID_20170323_215451.mp4" title="胜利庆祝">胜利庆祝</li>
				<li name="list" value="video/VID_20170323_193609.mp4" title="进球瞬间">进球瞬间</li>
				<li name="list" value="video/VID_20170323_215451.mp4" title="胜利庆祝">胜利庆祝</li>
				<li name="list" value="video/VID_20170323_193609.mp4" title="进球瞬间">进球瞬间</li>
				<li name="list" value="video/VID_20170323_215451.mp4" title="胜利庆祝">胜利庆祝</li>
				<li name="list" value="video/VID_20170323_193609.mp4" title="进球瞬间">进球瞬<li>
				<li name="list" value="video/VID_20170323_215451.mp4" title="胜利庆祝">胜利庆祝</li>
			</ul>	
		</div>	
		<button title="收起播放列表" id="playList-hidden"> > </button>
	</aside>	
	<button title="展开播放列表" id="playList-show1"> < </button>
</div>
</div>



<div class="detail" style="margin: 0;overflow: hidden;background-color: #F5F5F5;">
    <div class="introduce" >
        <div class="info-part">
            <div class="class_name">沈军说注册教练</div>
            <div class="info">
                 <span>课时总数 <i>7</i></span>
                <i class="spl">|</i>
                <span>学习有效期 <i>3650天</i></span>
                <i class="spl">|</i>
                <span>学习次数 <i>25</i></span>
                <i class="spl">|</i>
                <span>学生满意度 <i>100%</i> <a href="javascript:void(0);" id="show_vote">(查看评价)</a></span>
            </div>
        </div>
        <div class="join-part">
          
            <div class="join" >
                <a href="javascript:;" class="btn-join">加入我的课程</a>
                <!--<p>1人已报名</p>-->
            </div>
              <div class="price">免费</div>
        </div>
    </div>
    
<div class="course">
  <div class="x_ltr">
    <ul class="x_xh" id="em"><!-- ,'n_em' --><!-- class="n_em12" --> 
      <li id="newsitem_1" onclick="showitem1(this,'em','h_em_');" style="border-bottom: 2px solid #3AAEA9;"><a href="javascript:;">课程简介</a></li>
      <li id="newsitem_2" onclick="showitem1(this,'em','h_em_');"><a href="javascript:;">课程目录</a></li>
      <li id="newsitem_3" onclick="showitem1(this,'em','h_em_');"><a href="javascript:;">课程评价</a></li>
    </ul>
    <div class="x_cont" id="h_em_1">
     	<h1>中国教练行业即将推出“注册教练职业标准与认证课程”!</h1>
     	<p>中国注册教练职业标准由中国管理科学研究院教研所企业教练研究中心根据中国教练行业发展状况及各行业对教练的实际需求，召集中国教练行业最顶尖的、大师级教练（包括中国大陆、香港及台湾地区）共同研讨制定，旨在培育与认证中国最优秀的职业教练，创建中国教练学体系。中国注册教练标准涵盖各个教练领域，其中就包括注册企业教练、注册心理教练、注册健康教练等。</p>
    	1111111111111111<br /><br />
    	1111111111111111<br /><br />
    	1111111111111111<br /><br />
    	1111111111111111<br /><br />
    	1111111111111111<br /><br />
    </div>
    <div class="x_cont" id="h_em_2" style="display:none;">
    <ul>
  		<li class="catalog">课程目录</li>
    	<li class="chapter_nane">第1章沈军说注册教练</li>
     	<ul>
   			<li>1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;【沈军说注册教练1】为什么要推出中国注册教练认证项目？</li>
    		<li>2&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;【沈军说注册教练2】什么是中国注册教练认证项目？</li>
    		<li>3&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;【沈军说注册教练3】注册企业教练认证课程是怎么来的？</li>
    		<li>4&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;【沈军说注册教练4】注册企业教练认证课程模块一 有效对话</li>
    		<li>5&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;【沈军说注册教练5】注册企业教练认证课程模块二 架构模式</li>
    	</ul>
    </ul>
    	22222222222222222222<br /><br />
    	22222222222222222222<br /><br />
    	22222222222222222222<br /><br />
    	22222222222222222222<br /><br />
    	22222222222222222222<br /><br />
    	22222222222222222222<br /><br />
    	22222222222222222222<br /><br />
    </div>
    <div class="x_cont" id="h_em_3" style="display:none;">
    	<div class="grade">
    		<ul>
    			<li class="grade-title">课程评价<span>（1）</span></li>

    			<li>
   
    			
    				<div class="tags">
        				<div class="rate-score">
            				<p class="rate">100<span>%</span></p>
            				<h4 class="satisfy">满意度</h4>
        				</div>
        				<ul class="proportion">
            			  <li>
                			<h5 class="fl">好评<em class="c-999">（）</em></h5>
							<p class="progress-bar" style="width:50px ; background-color:#FF8E1C;"></p>
                			
            			  </li>
            			  <li>
                			<h5 class="fl">中评<em class="c-999">（）</em></h5>

                			<p class="progress-bar" style="width: 10px;"></p>
           				  </li>
            			  <li>
                			<h5 class="fl">差评<em class="c-999">（）</em></h5>

                			<p class="progress-bar" style="width: 100px;"></p>
            			  </li>
        				</ul>
        				<div class="tag">
            				<ul class="comment-tag">
                			
                				<li class="w1"><em>非常不错</em></li>
                			
            				</ul>
        				</div>
    				</div>

    			</li>

    			<li><label><input name="Fruit" type="radio" value="" />苹果 </label> 
					<label><input name="Fruit" type="radio" value="" />桃子 </label> 
					<label><input name="Fruit" type="radio" value="" />香蕉 </label> 
					<label><input name="Fruit" type="radio" value="" />梨 </label> 
					<label><input name="Fruit" type="radio" value="" />其它 </label> </li>
    			<li>
    				<div class="evaluate">
    				<div class="pic">
    					<img src="图片地址" /><span>你的名字</span>
    				</div>
    				<p class="detail-evaluate">我是asd789 维欣：asdf789,欢迎一起交流</p>
    				</div>
    			</li>
    		</ul>
    	</div>
    </div>
  </div>
  <div class="advertise">
	<div class="ad1">

    	<div class="picture"></div>
		<span><a href="">不过进口国i多个《、》嘎嘎恶搞噶发放和</a></span>
		<div class="mode">
			<ul>
			<li></li>
			<li></li>
			</ul> 
		</div>
  </div>
  	<div class="ad2">

    	<div class="picture"></div>
		<span><a href="">不过进口国i多个《、》嘎嘎恶搞噶发放和</a></span>
		<div class="mode">
			<ul>
			<li></li>
			<li></li>
			</ul> 
		</div>
  </div>
</div>

</div>

<div class="footer">
<br /><br/>
&copy;北京理工大学珠海学院 2017 版权所有&reg;
<br />
联系方式：QQ： 545900360&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;地址：广东省珠海市北京理工大学珠海学院


</div>
</body>
</html>