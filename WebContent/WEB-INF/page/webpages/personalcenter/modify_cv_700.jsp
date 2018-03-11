<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>  
<%@page import="org.sccooperation.domain.*"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>modify_cv_700</title>
</head>
<body>
	<%
	Cv cv =(Cv) request.getAttribute("cv");
	
	%>
	<form id="modifycv-form" action="modify_cv_700.action?pageNo=1" method="post" enctype="multipart/form-data">
		<p class="main-font">姓名:</p><input type="text" value="<%=cv.getName()%>" name="name">
		<p class="main-font">身份证号:</p><input type="text" value="<%=cv.getIdnumber()%>" name="idnumber">
		<p class="main-font">手机号码:</p><input type="text" value="<%=cv.getPnumber()%>" name="pnumber">
		<p class="main-font">性别:</p><input type="text" value="<%=cv.getSex()%>" name="sex">
		<p class="main-font">生日:</p><input type="text" value="<%=cv.getBirthday()%>" name="birthday">
		<p class="main-font">年龄:</p><input type="text" value="<%=cv.getAge()%>" name="age">
		<p class="main-font">概要:</p><input type="text" value="<%=cv.getSummary()%>" name="summary">
		<p class="main-font">经历:</p><input type="text" value="<%=cv.getExperience()%>" name="experience">
		<p class="main-font">奖项:</p><input type="text" value="<%=cv.getPrize()%>" name="prize">
		<p class="main-font">学校:</p><input type="text" value="<%=cv.getSchool()%>" name="school">
		<img src="<%=cv.getPrictureurl()%>">
		<p class="main-font">请选择需要上传的头像：</p><input type="file" name="upload"/><br />  
		<br/>
		<input id="modify-btn" type="submit" value="提交">
	</form>
	

</body>
</html>