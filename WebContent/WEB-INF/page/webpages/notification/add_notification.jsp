<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>  
<%@page import="org.sccooperation.domain.*"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>add_notification</title>
</head>
<body>
	<form id="newannouncement" action="addnotification.action" method="post" enctype="multipart/form-data">
		<p class="main-font">新建公告</p>
		<p class="main-font">标题:</p><input type="text" name="title">
		<p class="main-font">内容:</p><input type="text" name="contect" style="height:200px;width:800px;">	
		<br/>
		<input id="modify-btn" type="submit" value="提交">
	</form>
</body>
</html>