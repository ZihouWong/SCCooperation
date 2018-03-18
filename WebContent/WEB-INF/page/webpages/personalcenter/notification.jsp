<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="org.sccooperation.domain.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>check notification</title>
<link rel="stylesheet"
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="./js/replacePage.js"></script>
</head>
<body>

	<%
		List listpnotification = (List) request.getSession().getAttribute("pnotification");
	%>
	
	<p class="main-font">通知</p><br/>

	<div class="panel-group" id="accordion">
		<%
			if (!listpnotification.isEmpty()) {
				for (int i = 0; i < listpnotification.size(); i++) {
					Notification pn = (Notification) listpnotification.get(i);
		%>

		<div class="panel panel-default">
			<div class="panel-heading">
				<h4 class="panel-title">
					<a data-toggle="collapse" data-parent="#accordion"
						href="#collapse<%=i + 1%>"> 标题：<%=pn.getTitle()%>
					</a>
				</h4>
			</div>
			<div id="collapse<%=i + 1%>" class="panel-collapse collapse">
				<div class="panel-body">
					<p class="main-font">
						通知内容:<%=pn.getContect()%></p>
				</div>
			</div>
		</div>

		<%
				}
			}
		%>
	</div>


	<ul id="replacePage" class="pagination pagination-lg">
		<li><a id="last">&laquo;</a></li>
		<li><a id="first">1</a></li>
		<li><a id="second">2</a></li>
		<li><a id="third">3</a></li>
		<li><a id="fourth">4</a></li>
		<li><a id="Fifth">5</a></li>
		<li><a id="next">&raquo;</a></li>
	</ul>


</body>
</html>