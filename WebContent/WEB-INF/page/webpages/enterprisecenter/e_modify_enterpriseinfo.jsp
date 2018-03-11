<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>  
<%@page import="org.sccooperation.domain.*"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>e_modify_enterpriseinfo</title>
</head>
<body>
	<%
	List listE = (List)request.getSession().getAttribute("enterprise");
	Enterprise enterprise =(Enterprise) listE.get(0);
	%>
	<form id="modifycv-form" action="emdinfo.action" method="post" enctype="multipart/form-data">
		<p class="main-font">公司名称:</p><input type="text" value="<%=enterprise.getEname()%>" name="ename">
		<p class="main-font">简介:</p><input type="text" value="<%=enterprise.getSummary()%>" name="summary">
		<p class="main-font">详细地点:</p><input type="text" value="<%=enterprise.getPlace()%>" name="place">
		<p class="main-font">创建时间:</p><input type="text" value="<%=enterprise.getBtime()%>" name="btime">
		<p class="main-font">公司性质:</p><input type="text" value="<%=enterprise.getProperty()%>" name="property">
		<p class="main-font">公司官网:</p><input type="text" value="<%=enterprise.getWebsite()%>" name="website">
		<p class="main-font">公司CEO:</p><input type="text" value="<%=enterprise.getCeo()%>" name="ceo">
		<p class="main-font">公司所在城市:</p><input type="text" value="<%=enterprise.getVocation()%>" name="vocation">		
		<img src="<%=enterprise.getPictureurl()%>">
		<p class="main-font">请选择需要上传的图标：</p><input type="file" name="upload"/><br />
		<br/>
		<input id="modify-btn" type="submit" value="提交">
	</form>
	

</body>
</html>