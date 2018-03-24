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
           <form class="form-inline" role="form" method="post" action="enterprisesubuserManageSearch.action?pageNo=1">  
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
				<td>昵称</td>
				<td>所属公司</td>
				<td>真实姓名</td>
				<td>账号</td>
				<td>邮箱</td>
				<td>操作</td>


			</tr>
			<%
				List<Enterprisesubuser> list = (List<Enterprisesubuser>) request.getAttribute("enterprisesubuserList");
				for (Object i : list) {
					Enterprisesubuser enterprisesubuser = (Enterprisesubuser) i;
			%>
			<tr>
				<td><%=enterprisesubuser.getId()%></td>
				<td><%=enterprisesubuser.getNickname()%></td>
				<td><%=enterprisesubuser.getEname()%></td>
				<td><%=enterprisesubuser.getRealname()%></td>
				<td><%=enterprisesubuser.getAccount()%></td>
				<td><%=enterprisesubuser.getMail()%></td>
				<!-- 将Cv组装成数组传给js -->
				<td><button type="button" class="btn btn-primary btn-sm"
						data-toggle="modal" onclick="test(
						'<%=enterprisesubuser.getNickname()%>','<%=enterprisesubuser.getState()%>','<%=enterprisesubuser.getRealname()%>','<%=enterprisesubuser.getEname()%>',
						'<%=enterprisesubuser.getTel()%>','<%=enterprisesubuser.getMail()%>','<%=enterprisesubuser.getAccount()%>'
						,'<%=enterprisesubuser.getQq() %>','<%=enterprisesubuser.getBriefly()%>'
						)" data-target="#myModal">查看详情</button>
				&nbsp&nbsp&nbsp  
				<% if(enterprisesubuser.getState().equals("1")) {%>
				
				<button type="button" class="btn btn-danger" 
				onclick="window.location = 'stopEnterprisesubuser.action?table=Enterprisesubuser&id=<%=enterprisesubuser.getId()%>&state=<%=enterprisesubuser.getState()%>&pageNo=<%=request.getParameter("pageNo")%>'">
				封停用户</button>
				<%}else{ %>
				
				<button type="button" class="btn btn-success" 
				onclick="window.location = 'stopEnterprisesubuser.action?table=Enterprisesubuser&id=<%=enterprisesubuser.getId()%>&state=<%=enterprisesubuser.getState()%>&pageNo=<%=request.getParameter("pageNo")%>'">
				恢复用户</button>
				<%} %>
				</td>
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
							<h4 class="modal-title" id="myModalLabel">公司子用户详细情况</h4>
						</div>
						<div id ="contentbody" class="modal-body">
						<div style="float:right"><img src="http://7xpmt1.com1.z0.glb.clouddn.com/zhiweibig_620*344.png" style="width:80px;height:80px;"/></div><br/><br/>
						<div style="float: left">昵称:<span id="nickname">。</span></div><br/><br/>
						
						<div style="float: left">真实姓名:<span id="realname">。</span></div><br/><br/>
						<div style="float: left">状态:<span id="state">。</span></div><br/><br/>
						<div style="float: left">所属公司名:<span id="ename">。</span></div><br/><br/>
						
						
						<div style="float: left">电话:<span id="tel"></span></div><br/><br/>
						<div style="float: left">邮箱:<span id="mail"></span></div><br/><br/>
						<div style="float: left">账号:<span id="account"></span></div><br/><br/>
						<div style="float: left">QQ:<span id="qq"></span></div><br/><br/>
						<div style="float: left">简介:<span id="briefly"></span></div><br/><br/>
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
	function test(nickname,state,realname,ename,tel,mail,account,qq
			,briefly){
		document.getElementById('nickname').innerHTML=nickname;
		document.getElementById('state').innerHTML= state;
		document.getElementById('realname').innerHTML= realname;
		document.getElementById('ename').innerHTML= ename;
		document.getElementById('tel').innerHTML= tel;
		document.getElementById('mail').innerHTML= mail;
		document.getElementById('account').innerHTML= account;
		document.getElementById('qq').innerHTML= qq;
		document.getElementById('briefly').innerHTML= briefly;
	}
	</script>
</body>
</html>