<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>  
<%@page import="org.sccooperation.domain.*"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>enterprisesubuserLogin</title>
</head>
<body>
<!-- 登陆框、联系方式 -->
	<div id="head-link" class="login">
		<div class="container">
			<div class="col-xs-12">
				<%
				List listEsu = (List)request.getSession().getAttribute("enterprisesubuser");
				if(request.getSession().getAttribute("enterprisesubuser")==null) {%>
				    <div class="login-in">
						<form id="login-form" action="esul.action?pageNo=1" method="post">
							<p class="main-font">企业子账户:</p><input type="text" name="account">
							<p class="main-font">密码:</p><input type="password" name="password">
							<p class="main-font">验证码:</p><input id="input-code" type="text" name="code">
							<img src="" alt="" class="code-img">
							<input id="login-btn" type="submit" value="登陆">
							<a href="register-goto.html" id="login-btn-a" class="float">注册</a>
	
						</form>
					</div>
				<%
				}else{ 
					Enterprisesubuser enterprisesubuser =(Enterprisesubuser) listEsu.get(0);
				%>
					<div class="login-in">
						欢迎<%=enterprisesubuser.getAccount() %>
						<p">企业子用户昵称:</p><input type="text" value="<%=enterprisesubuser.getNickname()%>" name="nickname">
						<p">企业子用户所属公司名称:</p><input type="text" value="<%=enterprisesubuser.getEname()%>" name="ename">
						<p">企业子用户联系电话:</p><input type="text" value="<%=enterprisesubuser.getTel()%>" name="tel">
					</div>
					<br/>
					<a href="esudisec.action">企业子用户信息中心</a>
					<a href="esu_display_enterprisesubuserinfo.action">修改企业子用户信息</a>
					<a href="esu_display_password.action">修改密码</a>
					<a href="esuq.action">退出</a>
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