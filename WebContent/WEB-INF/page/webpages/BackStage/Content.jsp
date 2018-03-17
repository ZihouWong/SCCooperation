<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="org.sccooperation.domain.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="./css/bootstrap.min.css">
<link rel="stylesheet" href="./css/jquery.min.js">
<link rel="stylesheet"
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<!-- 引入 ECharts 文件 -->
<script src="./js/echarts.min.js"></script>
<script type="text/javascript"
	src="http://echarts.baidu.com/gallery/vendors/echarts/echarts-all-3.js"></script>
<script type="text/javascript"
	src="http://echarts.baidu.com/gallery/vendors/echarts-stat/ecStat.min.js"></script>
<script type="text/javascript"
	src="http://echarts.baidu.com/gallery/vendors/echarts/extension/dataTool.min.js"></script>
<script type="text/javascript"
	src="http://echarts.baidu.com/gallery/vendors/echarts/map/js/china.js"></script>
<script type="text/javascript"
	src="http://echarts.baidu.com/gallery/vendors/echarts/map/js/world.js"></script>
<script type="text/javascript"
	src="http://api.map.baidu.com/api?v=2.0&ak=ZUONbpqGBsYGXNIYHicvbAbM"></script>
<script type="text/javascript"
	src="http://echarts.baidu.com/gallery/vendors/echarts/extension/bmap.min.js"></script>

<style type="text/css">
</style>


</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-xs-6" style="height: 30px">
				<p></p>
			</div>
		</div>
		<div class="row">
			<div class="col-xs-6" style="">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">注册人热力图</h3>
					</div>
					<div class="panel-body">
						<div id="heat" style="width: 100%; height: 400px;"></div>
					</div>
				</div>

			</div>
			<div class="col-xs-6" style="">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">注册人周对比折线图</h3>
					</div>
					<div class="panel-body">
						<div id="broken_line" style="width: 100%; height: 400px;"></div>
					</div>
				</div>

			</div>
		</div>
		
		<div class="row">
			<div class="col-xs-6" style="">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">知行圈发帖数上周统计</h3>
					</div>
					<div class="panel-body">
						<div id="knowledge_line" style="width: 100%; height: 400px;"></div>
					</div>
				</div>

			</div>
			<div class="col-xs-6" style="">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">躬行课堂视频发帖数上周统计</h3>
					</div>
					<div class="panel-body">
						<div id="school_line" style="width: 100%; height: 400px;"></div>
					</div>
				</div>

			</div>
		</div>
		
				
		<div class="row">
			<div class="col-xs-6" style="height: 30px">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">创行谷工作数上周统计</h3>
					</div>
					<div class="panel-body">
						<div id="work_line" style="width: 100%; height: 400px;"></div>
					</div>
				</div>

			</div>
			
			
		<div class="col-xs-6" style="">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">总上周统计</h3>
					</div>
					<div class="panel-body">
						<div id="sum_line" style="width: 100%; height: 400px;"></div>
					</div>
				</div>

			</div>
		</div>
		</div>
		
		
		
	</div>
	<script type="text/javascript" src="./js/backstageChart.js"></script>
</body>
</html>