<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="org.sccooperation.domain.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="./css/bootstrap.min.css">
<link rel="stylesheet" href="./js/jquery.min.js">
<link rel="stylesheet"
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script
	src="./js/replacePage.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<style type="text/css">
body {
	text-align: center
}

.tableContent {
	margin: 0 auto;
}

.right {
	margin: 0 auto;
	width: 80%;
}
</style>

<style type="text/css">
*{
    margin: 0px;
    padding:0px;
}
.topbody{
    width:900px;
    margin: 0 auto;
}
.topbar{
    width:100%;
    background-color: #000;
    display: inline-block;
}

.topbar li{
    float:left;
}
.toplist{
    display: inline-block;
    list-style-type:none;
}
.toplist a{
    color:#FFF;
    text-decoration: none;
}
.title,.toplist a{
    display:block;
    
    display: block;
    float: left;
}
.toplist a{
    padding:15px 20px 15px 20px;
}
.title{
    color:#FFF;
    text-decoration: none;
    padding:15px 30px 15px 30px;
   
}
.topbody{
    width:900px;
    margin: 0 auto;
}
.topbar{
	height:60px;
	background-color: black;
}
</style>

</head>
<body>

</head>
<body>
<div class="topbar">
<div class="container">
 <div class="row">
    <div class="col-md-9 col-lg-9" style="margin-top:10px"> 
    <div class="col-md-6 col-lg-6" >  
           <form class="form-inline" role="form" method="post" action="peopleManageSearch.action">  
       <input type="text" class="form-control" name="keyword" placeholder="请输入字段名"/>  
       <input type="hidden" class="form-control" name="pageNo" value="1"/> 
               <button type="submit"  class="btn btn-primary">查找</button>   
            </form>
</div>
 </div>
 </div>
 </div>
 </div>
	<div class="right">
		<table class="tableContent table">
			<tr>
				<td>id</td>
				<td>项目名称</td>
				<td>公司名</td>
				<td>工作开始时间</td>
				<td>报名截止时间</td>
				<td>待遇</td>
				<td>联系方式</td>
				<td>操作</td>


			</tr>
			<%
				List<Post> list = (List<Post>) request.getAttribute("backstagePostList");
				for (Object i : list) {
					Post post = (Post) i;
			%>
			<tr>
				<td><%=post.getId()%></td>
				<td><%=post.getProjectname()%></td>
				<td><%=post.getEname()%></td>
				<td><%=post.getPtime()%></td>
				<td><%=post.getStime()%></td>
				<td><%=post.getRemuneration()%></td>
				<td><%=post.getContact()%></td>
				<!-- 将Cv组装成数组传给js -->
				<td><button type="button" class="btn btn-danger">查看详情</button> 
				&nbsp&nbsp&nbsp  
				<% if(post.getState().equals("1")) {%>
				<td>
				<button type="button" class="btn btn-danger" 
				onclick="window.location = 'stopPost.action?table=Post&id=<%=post.getId()%>&state=<%=post.getState()%>&pageNo=<%=request.getParameter("pageNo")%>'">
				封停用户</button></td>
				<%}else{ %>
				<td>
				<button type="button" class="btn btn-success" 
				onclick="window.location = 'stopPost.action?table=Post&id=<%=post.getId()%>&state=<%=post.getState()%>&pageNo=<%=request.getParameter("pageNo")%>'">
				恢复用户</button>
				<%} %>
				</td></td>
			</tr>

			<!-- Modal -->
			<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
				aria-labelledby="myModalLabel">
				<div class="modal-dialog" role="document">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-label="Close">
								<span aria-hidden="true">&times;</span>
							</button>
							<h4 class="modal-title" id="myModalLabel">项目详情</h4>
						</div>
						<div id ="contentbody" class="modal-body">
						<div style="float:right"><img src="http://7xpmt1.com1.z0.glb.clouddn.com/zhiweibig_620*344.png" style="width:80px;height:80px;"/></div><br/><br/>
						<div style="float: left">姓名:<span id="content_name">。</span></div><br/><br/>
						<div style="float: left">性别:<span id="content_sex">。</span></div><br/><br/>
						<div style="float: left">年龄:<span id="content_age">。</span></div><br/><br/>
						<div style="float: left">年龄:<span id="content_age">。</span></div><br/><br/>
						
						
						<div style="float: left">出生日期:<span id="content_birthday"></span></div><br/><br/>
						<div style="float: left">身份证号:<span id="content_idNumber"></span></div><br/><br/>
						<div style="float: left">手机号:<span id="content_pNumber"></span></div><br/><br/>
						<div style="float: left">图片url:<span id="content_prictureurl"></span></div><br/><br/>
						<div style="float: left">毕业院校:<span id="content_school"></span></div><br/><br/>
						<div style="float: left">获得荣誉:<span id="content_prize"></span></div><br/><br/>
						<div style="float: left">简介:<span id="content_summary"></span></div><br/><br/>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal">Close</button>
							<button type="button" class="btn btn-primary">Save
								changes</button>
						</div>
					</div>
				</div>
			</div>

			<%
				}
			%>
		</table>
	</div>
	
<ul  id = "replacePage" class="pagination pagination-lg">
	<li><a id = "last">&laquo;</a></li>
	<li><a id = "first">1</a></li>
	<li><a id = "second">2</a></li>
	<li><a id = "third">3</a></li>
	<li><a id = "fourth">4</a></li>
	<li><a id = "Fifth">5</a></li>
	<li><a id = "next">&raquo;</a></li>
</ul>

<script type="text/javascript">

</script>
	<script type="text/javascript">
	function test(content_name,content_age,content_birthday,content_sex,content_idNumber,content_pNumber,content_prictueurl
			,content_prize,content_school,content_summary){
		document.getElementById('content_name').innerHTML= content_name;
		document.getElementById('content_age').innerHTML= content_age;
		document.getElementById('content_birthday').innerHTML= content_birthday;
		document.getElementById('content_sex').innerHTML= content_sex;
		document.getElementById('content_idNumber').innerHTML= content_idNumber;
		document.getElementById('content_pNumber').innerHTML= content_pNumber;
		document.getElementById('content_prictureurl').innerHTML= content_prictueurl;
		document.getElementById('content_prize').innerHTML= content_prize;
		document.getElementById('content_school').innerHTML= content_school;
		document.getElementById('content_summary').innerHTML= content_summary;
	}
	</script>
</body>
</html>