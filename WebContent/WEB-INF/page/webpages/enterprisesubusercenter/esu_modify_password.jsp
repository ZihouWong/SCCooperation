<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>  
<%@page import="org.sccooperation.domain.*"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>esu_modify_password</title>
</head>
<body>
	<form id="modifycv-form" action="esumdpwd.action" method="post" enctype="multipart/form-data">
		<p class="main-font">旧密码:</p><input type="text" name="password_old">
		<p class="main-font">新密码:</p><input type="text" name="password_new">
		<p class="main-font">再次输入新密码:</p><input type="text" name="password_new_repeat">
		<input id="modify-btn" type="submit" value="提交">
	</form>
</body>
</html>