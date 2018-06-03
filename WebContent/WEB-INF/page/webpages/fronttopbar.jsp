<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.List"%>  
<%@page import="org.sccooperation.domain.*"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 <!-- 登陆框、联系方式 -->
	<div id="head-link" class="login">
		<div class="container">
			<div class="col-xs-12">
			<%
			List listU = null;
			String name = "";
			if(request.getSession().getAttribute("user") != null){
				listU = (List)request.getSession().getAttribute("user");
				name = ((People)listU.get(0)).getName();
			}else if(request.getSession().getAttribute("enterprise") != null){
				listU = (List)request.getSession().getAttribute("enterprise");
				name = ((Enterprise)listU.get(0)).getEname();
			}else if(request.getSession().getAttribute("enterprisesubuser") != null){
				listU = (List)request.getSession().getAttribute("enterprisesubuser");
				name = ((Enterprisesubuser)listU.get(0)).getNickname();
			}else{
				
			}
			if( listU == null || listU.size() == 0 ) {%>
			  
			  您好！欢迎使用校企合作平台。你可以<a href="clientLoginView.action" style="color:blue">登录</a>
				<%}else{ 
					
					
					%>
				}
				<div class="login-in">
				欢迎<%=name %>
				</div>
				<%} %>
			    <div class="login-tel">
			    	<i class="fa fa-phone fa-lg"></i>
			    	<p class="main-font">咨询电话：010-82319999转2846</p>
			    </div>
			</div>
		</div>
	</div>
</body>
</html>