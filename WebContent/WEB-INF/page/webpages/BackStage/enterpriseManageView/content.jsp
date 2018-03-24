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
           <form class="form-inline" role="form" method="post" action="enterpriseManageSearch.action">  
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
				<td>公司名</td>
				<td>创建时间</td>
				<td>性质</td>
				<td>从事行业</td>
				<td>账号</td>
				<td>联系方式</td>
				<td>操作</td>


			</tr>
			<%
				List<Enterprise> list = (List<Enterprise>) request.getAttribute("enterpriseList");
				for (Object i : list) {
					Enterprise enterprise = (Enterprise) i;
			%>
			<tr>
				<td><%=enterprise.getId()%></td>
				<td><%=enterprise.getEname()%></td>
				<td><%=enterprise.getBtime()%></td>
				<td><%=enterprise.getProperty()%></td>
				<td><%=enterprise.getVocation()%></td>
				<td><%=enterprise.getAccount()%></td>
				<td><%=enterprise.getContact()%></td>
				<!-- 将Cv组装成数组传给js -->
				<td>
					<!-- Button trigger modal -->
					<button type="button" class="btn btn-primary btn-sm"
						data-toggle="modal" onclick="test(
						'<%=enterprise.getEname()%>','<%=enterprise.getState() %>','<%=enterprise.getPlace()%>','<%=enterprise.getBtime()%>'
						,'<%=enterprise.getProperty()%>','<%=enterprise.getWebsite()%>','<%=enterprise.getVocation()%>'
						,'<%=enterprise.getAccount()%>','<%=enterprise.getContact()%>'
						,'<%=enterprise.getSummary()%>'
						)" data-target="#myModal">公司详情</button>
				
				&nbsp&nbsp&nbsp  
				<% if(enterprise.getState().equals("1")) {%>
				
				<button type="button" class="btn btn-danger" 
				onclick="window.location = 'stopEnterprise.action?table=Enterprise&id=<%=enterprise.getId()%>&state=<%=enterprise.getState()%>&pageNo=<%=request.getParameter("pageNo")%>'">
				封停公司</button></td>
				<%}else{ %>
		
				<button type="button" class="btn btn-success" 
				onclick="window.location = 'stopEnterprise.action?table=Enterprise&id=<%=enterprise.getId()%>&state=<%=enterprise.getState()%>&pageNo=<%=request.getParameter("pageNo")%>'">
				恢复公司</button>
			
				<%} %>
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
							<h4 class="modal-title" id="myModalLabel">公司详细情况</h4>
						</div>
						<div id ="contentbody" class="modal-body">
						
						
						<div id ="contentbody" class="modal-body">
						<div style="float:right"><img src="http://7xpmt1.com1.z0.glb.clouddn.com/zhiweibig_620*344.png" style="width:80px;height:80px;"/></div><br/><br/>
						<div style="float: left">公司名:<span id="ename">.</span></div><br/><br/>
						<div style="float: left">状态:<span id="state"></span></div><br/><br/>
						<div style="float: left">创建时间:<span id="btime"></span></div><br/><br/>
						<div style="float: left">公司性质:<span id="property"></span></div><br/><br/>
						<div style="float: left">官网网址:<span id="website"></span></div><br/><br/>
						
						
						<div style="float: left">从事行业:<span id="vocation"></span></div><br/><br/>
						<div style="float: left">账号:<span id="account"></span></div><br/><br/>
						<div style="float: left">联系方式:<span id="contact"></span></div><br/><br/>
						<div style="float: left">简介:<span id="summary"></span></div><br/><br/>
						
						</div>
						
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
	function test(ename,state,place,btime,property,website,vocation,account
			,contact,summary){
		document.getElementById('ename').innerHTML= ename;
		document.getElementById('state').innerHTML= state;
		document.getElementById('place').innerHTML= place;
		document.getElementById('btime').innerHTML= btime;
		document.getElementById('property').innerHTML= property;
		document.getElementById('website').innerHTML= website;
		document.getElementById('vocation').innerHTML= vocation;
		document.getElementById('account').innerHTML= account;
		document.getElementById('contact').innerHTML= contact;
		document.getElementById('summary').innerHTML= summary;
	}
	</script>
</body>
</html>