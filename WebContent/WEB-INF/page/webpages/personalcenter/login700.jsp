<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>  
<%@page import="org.sccooperation.domain.*"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login700</title>
</head>
<body>
<!-- 登陆框、联系方式 -->
	<div id="head-link" class="login">
		<div class="container">
			<div class="col-xs-12">
				<%
				List listU = (List)request.getSession().getAttribute("user");
				if(request.getSession().getAttribute("user")==null) {%>
				    <div class="login-in">
						<form id="login-form" action="loginoperating.action?pageNo=1" method="post">
							<p class="main-font">学生代码:</p><input type="text" name="account">
							<p class="main-font">密码:</p><input type="password" name="password">
							<p class="main-font">验证码:</p><input id="input-code" type="text" name="code">
							<img src="" alt="" class="code-img">
							<input id="login-btn" type="submit" value="登陆">
							<a href="register-goto.html" id="login-btn-a" class="float">注册</a>
	
						</form>
					</div>
				<%
				}else{ 
					People people =(People) listU.get(0);
				%>
					<div class="login-in">
						欢迎<%=people.getPnumber() %>
						<p">姓名:</p><input type="text" value="<%=people.getName()%>" name="pname">
						<p">身份证号:</p><input type="text" value="<%=people.getIdnumber()%>" name="pidnumber">
						<p">手机号:</p><input type="text" value="<%=people.getPnumber()%>" name="ppnumber">
					</div>
					<br/>
					<a href="personalcenter.action">个人信息中心</a>
					<a href="display_people_700.action">修改个人资料</a>
					<a href="display_password_700.action">修改密码</a>
					<a href="display_cv_700.action">修改简历资料</a>
					<a href="quit_700.action">退出</a>
				<%
				}
				%>
			    <div class="login-tel">
			    	<i class="fa fa-phone fa-lg"></i>
			    	<p class="main-font">咨询电话：010-82319999转2846</p>
			    </div>
			</div>
		</div>
	</div>
</body>
</html>