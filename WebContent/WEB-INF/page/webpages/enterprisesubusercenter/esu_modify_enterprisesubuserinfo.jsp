<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>  
<%@page import="org.sccooperation.domain.*"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>esu_modify_enterprisesubuserinfo</title>
</head>
<body>
	<%
	List listEsu = (List)request.getSession().getAttribute("enterprisesubuser");
	Enterprisesubuser enterprisesubuser =(Enterprisesubuser) listEsu.get(0);
	%>
	<form id="modifycv-form" action="esumdinfo.action" method="post" enctype="multipart/form-data">
		<p class="main-font">子用户昵称:</p><input type="text" value="<%=enterprisesubuser.getNickname()%>" name="nickname">
		<p class="main-font">子用户真实姓名:</p><input type="text" value="<%=enterprisesubuser.getRealname()%>" name="realname">
		<p class="main-font">联系电话:</p><input type="text" value="<%=enterprisesubuser.getTel()%>" name="tel">
		<p class="main-font">QQ:</p><input type="text" value="<%=enterprisesubuser.getQq()%>" name="qq">
		<p class="main-font">mail:</p><input type="text" value="<%=enterprisesubuser.getMail()%>" name="mail">
		<p class="main-font">简介:</p><input type="text" value="<%=enterprisesubuser.getBriefly()%>" name="briefly">
		<img src="<%=enterprisesubuser.getPictureurl()%>">
		<p class="main-font">请选择需要上传的图标：</p><input type="file" name="upload"/><br />
		<br/>
		<input id="modify-btn" type="submit" value="提交">
	</form>
</body>
</html>