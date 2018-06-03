<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@page import="java.util.List"%>
<%@page import="org.sccooperation.domain.*"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta http-equiv=X-UA-Compatible content="IE=edge,chrome=1">
<!-- 以上代码IE=edge告诉IE使用最新的引擎渲染网页，chrome=1则可以激活Chrome Frame. -->
<title>躬行课堂-详情页</title>

<link rel="stylesheet" type="text/css"
	href="css/gongxingclass_detailpage1.css" />
<!-- <script type="text/javascript" src="jq/jquery-3.2.1.min.js"></script> -->
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="js/main.js"></script>
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

	<div class="top" id="topBar">
		<div class="wrapper">
			<div class="top_logo">
				<a href="" class="logo"></a>
			</div>
			<div class="search">
				<form name="searchform" method="post" action="/e/search/index.php">
					<input name='ecmsfrom' type='hidden' value='9'> <input
						type="hidden" name="show" value="title,newstext"> <select
						name="classid" id="choose">
						<option value="0">搜索全部</option>
						<option value="1">新闻中心</option>
					</select> <input class="inp_srh" name="keyboard" placeholder="请输入您要搜索的作品">
					<input class="btn_srh" type="submit" name="submit" value="搜索">
				</form>
			</div>
			<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
			<script type="text/javascript" src="js/jquery.select.js"></script>

			<!-- 登陆栏修改 -->
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

			<!-- 直播提示 -->
			<div class="aside-tips" id="aside-tips"></div>
			<!-- 直播提示 -->
		</div>
	</div>
	<!-- =E TOP -->

	<div class="nav">
		<div id="wrap-nav">
			<ul class="menu ul">

				<li><h3>
						<a href="#" class="depth_1">原创作品</a>
					</h3></li>
				<li><h3>
						<a href="#" class="depth_1">经验分享</a>
					</h3></li>
				<li><h3>
						<a href="#" class="depth_1">设计趋势</a>
					</h3></li>
				<li><h3>
						<a href="#" class="depth_1">设计趋势</a>
					</h3></li>
			</ul>
			<ul class="mn_extd">
				<li><a class="a2" target="_blank" style=""
					href="//chuanke.baidu.com/?mod=school&act=create">创建学校</a></li>
			</ul>
		</div>
	</div>

	<div class="videoli">
		<div id="cans">
			<video controls="controls" id="video" 　src="" poster=""
				height="500px" width="760px">

			</video>

			<aside id="playList">
				<header>
					<h2>&nbsp;播放列表</h2>
				</header>

				<div id="mainBox">
					<ul id="content">
						<%
					if (request.getAttribute("courseInfo") != null && request.getAttribute("courseList") != null) {
						List otherCourse = (List)request.getAttribute("courseList");
						List courseInfo = (List)request.getAttribute("courseInfo");
						int courseListLength = otherCourse.size();
						
						for (int i = 0; i < 11; i++) {
							if (i == 0) {
								Course course = (Course)courseInfo.get(0);
							%>
						<li name="list" value="<%=course.getVideourl()%>"
							title="<%=course.getTitle() %>"><%=course.getTitle() %></li>
						<%
								
							} else if (i < courseListLength + 1) {
								Course course_o = (Course)otherCourse.get(i);
				%>
						<li name="list" value="<%=course_o.getVideourl()%>"
							title="<%=course_o.getTitle() %>"><%=course_o.getTitle() %></li>
						<%
						} else {
					%>
						<li name="list" value="#" title="#"></li>
						<%
							}
						}
					}
				%>
					</ul>
				</div>
				<button title="收起播放列表" id="playList-hidden">></button>
			</aside>
			<button title="展开播放列表" id="playList-show1"><</button>
		</div>
	</div>



	<div class="detail"
		style="margin: 0; overflow: hidden; background-color: #F5F5F5;">
		<div class="introduce">
			<%
		if (request.getAttribute("courseInfo") != null) {
			List courseList = (List) request.getAttribute("courseInfo");
			Course course = (Course) courseList.get(0);
		%>
			<!-- 正确显示 -->
			<div class="info-part">
				<div class="class_name"><%=course.getTitle()%></div>
				<div class="info">
					<span>课时总数 <i><%=course.getTimeconsuming()%></i></span> <i
						class="spl">|</i> <span>学习有效期 <i>3650天</i></span> <i class="spl">|</i>
					<span>学习次数 <i><%=course.getSeenum()%></i></span> <i class="spl">|</i>
					<span>学生满意度 <i>100%</i> <a href="javascript:void(0);"
						id="show_vote">(查看评价)</a></span>
				</div>
			</div>
			<div class="join-part">

				<div class="join">
					<a href="javascript:;" class="btn-join">加入我的课程</a>
					<!--<p>1人已报名</p>-->
				</div>
				<div class="price">免费</div>
				<% } else { %>
				<!-- 错误显示 -->
				<div class="info-part">
					<div class="class_name">ER-Title</div>
					<div class="info">
						<span>课时总数 <i>ER-Timeconsuming</i></span> <i class="spl">|</i> <span>学习有效期
							<i>3650天</i>
						</span> <i class="spl">|</i> <span>学习次数 <i>ER-Seenum</i></span> <i
							class="spl">|</i> <span>学生满意度 <i>100%</i> <a
							href="javascript:void(0);" id="show_vote">(查看评价)</a></span>
					</div>
				</div>
				<div class="join-part">

					<div class="join">
						<a href="javascript:;" class="btn-join">加入我的课程</a>
						<!--<p>1人已报名</p>-->
					</div>
					<div class="price">ER-Price</div>
				</div>
				<% } %>
			</div>

			<div class="course">
				<div class="x_ltr">
					<!-- 正确显示 -->
					<%
		if (request.getAttribute("courseInfo") != null) {
			List courseList = (List) request.getAttribute("courseInfo");
			Course course = (Course) courseList.get(0);
	%>
					<ul class="x_xh" id="em">
						<li id="newsitem_1" onclick="showitem1(this,'em','h_em_');"
							style="border-bottom: 2px solid #3AAEA9;"><a
							href="javascript:;">课程简介</a></li>
						<li id="newsitem_2" onclick="showitem1(this,'em','h_em_');"><a
							href="javascript:;">课程目录</a></li>
						<li id="newsitem_3" onclick="showitem1(this,'em','h_em_');"><a
							href="javascript:;">课程评价</a></li>
					</ul>
					<div class="x_cont" id="h_em_1">
						<h1><%=course.getTitle()%></h1>
						<p>
							<%
			String br = course.getSummary();
			String[] brs = br.split("[|]");
			int brslength = brs.length;
			for (int a = 0; a < brslength; a++) {
				if (a < brslength) {
				%><br /><%=a + 1%>、<%=brs[a]%><br />
							<%
				}
			}	%>
						</p>
					</div>
					<div class="x_cont" id="h_em_2" style="display: none;">
						<ul>
							<li class="catalog">课程目录</li>
							<ul>
								<li>
									<%
				String br_t = course.getCatalogue();
				String[] brs_t = br_t.split("[|]");
				int brslength_t = brs_t.length;
				for (int a = 0; a < brslength_t; a++) {
					if (a < brslength_t) {
						%><br /><%=brs_t[a]%><br /> <%
					}
				} %>
								</li>
							</ul>
						</ul>
					</div>
					<div class="x_cont" id="h_em_3" style="display: none;">
						<div class="grade">
							<ul>
								<li class="grade-title">课程评价<span>（1）</span></li>

								<li>


									<div class="tags">
										<div class="rate-score">
											<p class="rate">
												100<span>%</span>
											</p>
											<h4 class="satisfy">满意度</h4>
										</div>
										<ul class="proportion">
											<li>
												<h5 class="fl">
													好评<em class="c-999">（）</em>
												</h5>
												<p class="progress-bar"
													style="width: 50px; background-color: #FF8E1C;"></p>

											</li>
											<li>
												<h5 class="fl">
													中评<em class="c-999">（）</em>
												</h5>

												<p class="progress-bar" style="width: 10px;"></p>
											</li>
											<li>
												<h5 class="fl">
													差评<em class="c-999">（）</em>
												</h5>

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

								<li><label><input name="Fruit" type="radio"
										value="" />苹果 </label> <label><input name="Fruit"
										type="radio" value="" />桃子 </label> <label><input
										name="Fruit" type="radio" value="" />香蕉 </label> <label><input
										name="Fruit" type="radio" value="" />梨 </label> <label><input
										name="Fruit" type="radio" value="" />其它 </label></li>
								<li>
									<%
					if(request.getAttribute("teacherInfo") != null){
					List teacherinfo = (List)request.getAttribute("teacherInfo");
					People people = (People)teacherinfo.get(0);
					%>

									<div class="evaluate">
										<div class="pic">
											<img src="<%=people.getPicture()%>" /><span><%=people.getName() %></span>
										</div>
										<p class="detail-evaluate"><%=people.getSummary() %></p>
									</div> <% } %>
								</li>
							</ul>
						</div>
					</div>
				</div>

				<% } else { %>
				<!-- 错误显示 -->
				<div class="x_ltr">
					<ul class="x_xh" id="em">
						<li id="newsitem_1" onclick="showitem1(this,'em','h_em_');"
							style="border-bottom: 2px solid #3AAEA9;"><a
							href="javascript:;">课程简介</a></li>
						<li id="newsitem_2" onclick="showitem1(this,'em','h_em_');"><a
							href="javascript:;">课程目录</a></li>
						<li id="newsitem_3" onclick="showitem1(this,'em','h_em_');"><a
							href="javascript:;">课程评价</a></li>
					</ul>
					<div class="x_cont" id="h_em_1">
						<h1>ER-Title</h1>
						<p>ER-Summary</p>
					</div>
					<div class="x_cont" id="h_em_2" style="display: none;">
						<ul>
							<li class="catalog">课程目录</li>
							<ul>
								<li>ER-Catalogue</li>
							</ul>
						</ul>
					</div>
					<div class="x_cont" id="h_em_3" style="display: none;">
						<div class="grade">
							<ul>
								<li class="grade-title">课程评价<span>（1）</span></li>
								<li>
									<div class="tags">
										<div class="rate-score">
											<p class="rate">
												100<span>%</span>
											</p>
											<h4 class="satisfy">满意度</h4>
										</div>
										<ul class="proportion">
											<li>
												<h5 class="fl">
													好评<em class="c-999">（）</em>
												</h5>
												<p class="progress-bar"
													style="width: 50px; background-color: #FF8E1C;"></p>

											</li>
											<li>
												<h5 class="fl">
													中评<em class="c-999">（）</em>
												</h5>

												<p class="progress-bar" style="width: 10px;"></p>
											</li>
											<li>
												<h5 class="fl">
													差评<em class="c-999">（）</em>
												</h5>

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

								<li><label><input name="Fruit" type="radio"
										value="" />苹果 </label> <label><input name="Fruit"
										type="radio" value="" />桃子 </label> <label><input
										name="Fruit" type="radio" value="" />香蕉 </label> <label><input
										name="Fruit" type="radio" value="" />梨 </label> <label><input
										name="Fruit" type="radio" value="" />其它 </label></li>
								<li>
									<div class="evaluate">
										<div class="pic">
											<img src="ER-Picture" /><span>ER-Name</span>
										</div>
										<p class="detail-evaluate">ER-Summary</p>
									</div>
								</li>
							</ul>
						</div>
					</div>
				</div>



				<% } %>



				<div class="advertise">
					<%
					if(request.getAttribute("courseAd") != null){
						List courseAd = (List)request.getAttribute("courseAd");
						int courseAdList = courseAd.size();
						for(int i = 0; i < 2; i++) {
							if (i < courseAdList) {
								Course course = (Course)courseAd.get(i);
					%>
					<div class="ad1">

						<div class="picture" >
						<img src="<%=course.getPictureurl() %>">
						</div>
						<span><a href="showcourseinfo.action?pageNo=0&courseNo=<%=course.getId()%>&peopleid=<%=course.getPeople_id() %>"><%=course.getTitle() %></a></span>
						<div class="mode">
							<ul>
								<li>学习人数：<%=course.getSeenum() %></li>
							</ul>
						</div>
					</div>
					<% } else { %>
					<div class="ad1">

						<div class="picture"></div>
						<span><a href="www.baidu.com">公司（课程）广告栏一(跳转百度)</a></span>
						<div class="mode">
							<ul>
								<li></li>
								<li></li>
							</ul>
						</div>
					</div>
					<div class="ad2">

						<div class="picture"></div>
						<span><a href="www.baidu.com">公司（课程）广告栏二(跳转百度)</a></span>
						<div class="mode">
							<ul>
								<li></li>
								<li></li>
							</ul>
						</div>
					</div>
					
					<% }} }%>
					
					
				</div>

			</div>

			<div class="footer">
				<br />
				<br /> &copy;北京理工大学珠海学院 2017 版权所有&reg; <br /> 联系方式：QQ：
				545900360&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;地址：广东省珠海市北京理工大学珠海学院


			</div>
</body>
</html>