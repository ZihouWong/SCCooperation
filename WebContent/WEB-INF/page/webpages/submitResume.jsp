<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="org.sccooperation.domain.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>submit resume</title>
</head>
<body>
	<%
		List postlist = (List) request.getAttribute("post");
		Post post = (Post) postlist.get(0);
	%>

	<p class="main-font">项目名称:<%=post.getEname() %></p>
	<p class="main-font">企业名称:<%=post.getEnterprise_id().getEname() %></p>
	<p class="main-font">项目简介:<%=post.getSummary() %></p>
	<a href="submitresume.action?post_id=<%=post.getId()%>">申请加入项目</a>
</body>
</html>