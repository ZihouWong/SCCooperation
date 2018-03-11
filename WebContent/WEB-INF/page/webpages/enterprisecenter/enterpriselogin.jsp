<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>  
<%@page import="org.sccooperation.domain.*"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>enterpriseLogin</title>
</head>
<body>
<!-- 登陆框、联系方式 -->
	<div id="head-link" class="login">
		<div class="container">
			<div class="col-xs-12">
				<%
				List listE = (List)request.getSession().getAttribute("enterprise");
				if(request.getSession().getAttribute("enterprise")==null) {%>
				    <div class="login-in">
						<form id="login-form" action="el.action?pageNo=1" method="post">
							<p class="main-font">企业账户:</p><input type="text" name="account">
							<p class="main-font">密码:</p><input type="password" name="password">
							<p class="main-font">验证码:</p><input id="input-code" type="text" name="code">
							<img src="" alt="" class="code-img">
							<input id="login-btn" type="submit" value="登陆">
							<a href="register-goto.html" id="login-btn-a" class="float">注册</a>
	
						</form>
					</div>
				<%
				}else{ 
					Enterprise enterprise =(Enterprise) listE.get(0);
				%>
					<div class="login-in">
						欢迎<%=enterprise.getAccount() %>
						<p">企业名称:</p><input type="text" value="<%=enterprise.getEname()%>" name="ename">
						<p">企业地点:</p><input type="text" value="<%=enterprise.getPlace()%>" name="eplace">
						<p">联系电话:</p><input type="text" value="<%=enterprise.getContact()%>" name="econtact">
					</div>
					<br/>
					<a href="edisec.action">企业信息中心</a>
					<a href="e_display_enterpriseinfo.action">修改企业信息</a>
					<a href="e_display_password.action">修改密码</a>
					<a href="eq.action">退出</a>
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