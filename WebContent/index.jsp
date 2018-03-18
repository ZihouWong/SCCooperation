<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link href="umeditor/themes/default/css/umeditor.css" type="text/css" rel="stylesheet">
    <script type="text/javascript" src="umeditor/third-party/jquery.min.js"></script>
    <script type="text/javascript" src="umeditor/third-party/template.min.js"></script>
    <script type="text/javascript" charset="utf-8" src="umeditor/umeditor.config.js"></script>
    <script type="text/javascript" charset="utf-8" src="umeditor/umeditor.min.js"></script>
    <script type="text/javascript" src="umeditor/lang/zh-cn/zh-cn.js"></script>
  </head>
  
  <body>
    imis后台管理系统<br>
    <form action="login.action" method="post">
    账号:<input type="text" name="account">
    密码:<input type="text" name="password"><br/>
    <script type="text/plain" id="myEditor" name="content" style="width:1000px;height:240px;">
</script>
<script type="text/javascript">
    var um = UM.getEditor('myEditor'); 
</script>
    <input type="submit">
    </form>
    <a href="pregister.action">注册</a>
    <a href="cregister.action">注册</a>
    <a href="luntan.action?pageNo=1">luntan</a>
    <a href="chuangxinggu.action">luntanppppp</a>
    <a href="backstageLogin.action?pageNo=1">sexxxxxxxxx</a>
 <a href="chuangxinggu.action">chuangxinggu</a>
    <a href="seex.action">sexx</a>
    <a href="chuangxinggutest.action?pageNo=1">chuangxinggutest12</a>
    <a href="showmorejob.action?pageNo=1&button=2">ShowMoreJob</a>
    <a href="gongxingketangtest.action?pageNo=1">gongxingketangtest12</a>
    <a href="newcourseinfo.action?pageNo=1&jobNo=1&enterpriseNo=1&tagNo=1">newcourseinfo</a>
  </body>
</html>
