<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>  
<%@page import="org.sccooperation.domain.*"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>modify_people_700</title>
</head>
<body>
	<%
	List listU = (List)request.getSession().getAttribute("user");
	People people =(People) listU.get(0);
	%>
	<form id="modifycv-form" action="modify_people_700.action?pageNo=1" method="post" enctype="multipart/form-data">
		<p class="main-font">姓名:</p><input type="text" value="<%=people.getName()%>" name="name">
		<p class="main-font">身份证号:</p><input type="text" value="<%=people.getIdnumber()%>" name="idnumber">
		<p class="main-font">手机号码:</p><input type="text" value="<%=people.getPnumber()%>" name="pnumber">
		<p class="main-font">性别:</p><input type="text" value="<%=people.getSex()%>" name="sex">
		<p class="main-font">生日:</p><input type="text" value="<%=people.getBirthday()%>" name="birthday">
		<p class="main-font">年龄:</p><input type="text" value="<%=people.getAge()%>" name="age">
		<p class="main-font">概要:</p><input type="text" value="<%=people.getSummary()%>" name="summary">
		<img src="<%=people.getPicture()%>">
		<p class="main-font">请选择需要上传的头像：</p><input type="file" name="upload"/><br />  
		<br/>
		<p class="main-font">昵称:</p><input type="text" value="<%=people.getUsername()%>" name="username">
		<p class="main-font">微信:</p><input type="text" value="<%=people.getMail()%>" name="wechar">
		<p class="main-font">QQ:</p><input type="text" value="<%=people.getQq()%>" name="qq">
		<input id="modify-btn" type="submit" value="提交">
	</form>
	

</body>
</html>