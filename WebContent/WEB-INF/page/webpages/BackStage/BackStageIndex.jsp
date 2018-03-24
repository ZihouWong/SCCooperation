<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
body {
	margin: 0px;
	padding: 0px;
	color: #333333;
	background: #F0F8FF;
	text-align:center;
}

input {
	border: 1px solid #ccc;
	padding: 7px 0px;
	border-radius: 3px; /*css3属性IE不支持*/
	padding-left: 5px;
	width: 250px;
}

.loginButton{
	border: 1px solid #ccc;
	padding: 7px 0px;
	border-radius: 3px; /*css3属性IE不支持*/
	padding-left: 5px;
	width: 260px;
	margin-top: 10px;
	height: 40px;
}

.container {
	margin-top: 5%;
	margin: 0 auto;
}

.form-control {
	margin-top: 10px;
	height: 25px;
}

.h1_title{
    margin-top: 8%;
	height: 25px;
}

.bottom {
        padding: 80px 0;
        line-height: 24px;
        color: #7F7F7F;
    }

#header {
	background-color: #336699;
	width: 100%;
	height: 100px;
}

#header_left {
	width: 20%;
	float: left;
	height: 100px;
	text-align: center;
}



#header_right {
	width: 20%;
	float: right;
	height: 100px;
	text-align: center;
}
</style>
</head>
<body>
	<div id="header">
		<div id="header_left">
			<br />
			<p>
				<font size="5" color="#FFFFFF">校企合作后台</font>
			</p>
		</div>
  
		<div id="header_right">
			<br />
			<p>
				<font size="5" color="#FFFFFF">官网</font>
			</p>
		</div>

	</div>

	<div class="container">
		<form action="backstageUserLogin.action" method="post">
			<h1 class="h1_title">登录后台</h1>
			<input type="text" class="form-control" name="account" placeholder="UserAccount"> <br />
			<input type="password" class="form-control" name="password" placeholder="UserPassword"><br />
			
			<%if(request.getAttribute("tip") == null) {}
			else{
			%>
			<span style="color: red;font-size: 10px"><%=request.getAttribute("tip") %></span><br />
			<%} %>
			<input class="loginButton" type="submit" class="btn" value="登录"  /> 
			
		</form>
	</div>
	
	<div class="bottom">
    <p>© 2017 WLNSSS. </p>

</div>
</body>
</html>