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
<link rel="stylesheet" href="./css/jquery.min.js">
<link rel="stylesheet"
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
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
           <form class="form-inline" role="form" method="post" action="noteManageSearch.action">  
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
				<td>标题</td>
				<td>内容</td>
				<td>查看数量</td>
				<td>时间</td>
				<td>状态</td>
				<td>发帖人</td>
				<td>操作</td>
			</tr>
			<%
				List<Note> list = (List<Note>) request.getAttribute("noteList");
				for (Object i : list) {
					Note note = (Note) i;
			%>
			
			
			<tr>
			
				<td><%=note.getId()%></td>
				<td><%=note.getTitle()%></td>
				<td><%=note.getContent()%></td>
				<td><%=note.getSeenum()%></td>
				<td><%=note.getTime()%></td>
				<td><%=note%></td>
				<td><%=note.getPeople_id().getName()%></td>
				<!-- 将Cv组装成数组传给js -->
				
				<% if(note.getState().equals("1")) {%>
				<td>
				<button type="button" class="btn btn-primary btn-sm"
						data-toggle="modal" onclick="test(
						'<%=note.getTitle()%>','<%=note.getContent()%>'
						)" data-target="#myModal">具体内容</button> 
				<button type="button" class="btn btn-danger" 
				onclick="window.location = 'stopNote.action?table=Note&id=<%=note.getId()%>&state=<%=note.getState()%>&pageNo=<%=request.getParameter("pageNo")%>'">
				封停帖子</button></td>
				<%}else{ %>
				<td>
				<button type="button" class="btn btn-primary btn-sm"
						data-toggle="modal" onclick="test(
						'<%=note.getTitle()%>','<%=note.getContent()%>'
						)" data-target="#myModal">具体内容</button>
				<button type="button" class="btn btn-success" 
				onclick="window.location = 'stopNote.action?table=Note&id=<%=note.getId()%>&state=<%=note.getState()%>&pageNo=<%=request.getParameter("pageNo")%>'">
				恢复帖子</button>
				</td>
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
							<h4 class="modal-title" id="myModalLabel">帖子详情</h4>
						</div>
						<div id ="contentbody" class="modal-body">
						
						<div style="float: left">标题:<span id="title">。</span></div><br/><br/>
						<div style="float: left">内容:<span id="content">。</span></div><br/><br/>
					
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
	<script type="text/javascript">
	function test(title,content){
		document.getElementById('title').innerHTML= title;
		document.getElementById('content').innerHTML= content;

	}
	</script>
</body>
</html>