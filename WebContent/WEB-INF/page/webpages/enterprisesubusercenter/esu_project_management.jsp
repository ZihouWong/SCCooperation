<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="org.sccooperation.domain.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>esu_project_management</title>
<link rel="stylesheet"
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="./js/replacePage.js"></script>
</head>
<body>
	<%
		List listEsu = (List) request.getSession().getAttribute("enterprisesubuser");
		Enterprisesubuser enterprisesubuser = (Enterprisesubuser) listEsu.get(0);

		//所有的tag信息
		List Esuprotag = (List) request.getSession().getAttribute("esuprotag");
	%>

	<p>
		当前负责人:<%=enterprisesubuser.getNickname()%></p>

	<br>
	<br>
	<br>

	<p>所管理的项目:</p>
	<br>

	<%
		//负责人所管理的项目
		List listEsupost = (List) request.getSession().getAttribute("esupost");
	%>

	<div class="panel-group" id="accordion">
		<%
			if (!listEsupost.isEmpty()) {
				List esupost_tag = (List) request.getAttribute("esupost_tag");//接收出各个项目的tag信息

				for (int i = 0; i < listEsupost.size(); i++) {
					Post esupost = (Post) listEsupost.get(i);
					
					Tag ptag = (Tag) esupost_tag.get(i);//获取出各个项目的tag信息
		%>

		<div class="panel panel-default">
			<div class="panel-heading">
				<h4 class="panel-title">
					<a data-toggle="collapse" data-parent="#accordion"
						href="#collapse<%=i + 1%>"> 点击我进行展开，再次点击我进行折叠。第 <%=i + 1%> 部分
					</a>
				</h4>
			</div>
			<div id="collapse<%=i + 1%>" class="panel-collapse collapse">
				<div class="panel-body">
					<p class="main-font">
						项目名称:<%=esupost.getProjectname()%></p>
					<p class="main-font">
						简介:<%=esupost.getSummary()%></p>
					<p class="main-font">
						工作地点:<%=esupost.getPlace()%></p>
					<p class="main-font">
						工作时间:<%=esupost.getPtime()%></p>
					<p class="main-font">
						要求:<%=esupost.getDemand()%></p>
					<p class="main-font">
						薪资待遇:<%=esupost.getRemuneration()%></p>
					<p class="main-font">
						报名截止时间:<%=esupost.getStime()%></p>
					<p class="main-font">
						职位诱惑:<%=esupost.getAllure()%></p>
					<p class="main-font">
						联系方式:<%=esupost.getContact()%></p>
					<p class="main-font">
						项目类型:<%=ptag.getTagname()%></p>
					<p class="main-font">
						项目负责人:<%=enterprisesubuser.getNickname()%></p>

					<!-- 按钮触发模态框 -->
					<button class="btn btn-primary btn-lg" data-toggle="modal"
						data-target="#project<%=i + 1%>_Modal">编辑</button>
					<form id="modifypost<%=i + 1%>-form"
						action="esuupdateproject.action" method="post"
						enctype="multipart/form-data">
						<!-- 模态框（Modal） -->
						<div class="modal fade" id="project<%=i + 1%>_Modal" tabindex="-1"
							role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
							<div class="modal-dialog">
								<div class="modal-content">
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal"
											aria-hidden="true">&times;</button>
										<h4 class="modal-title" id="myModalLabel">编辑项目</h4>
									</div>
									<div class="modal-body">

										<input type="hidden" value="<%=esupost.getId()%>"
											name="post_id">
										<p class="main-font">项目名称:</p>
										<input type="text" value="<%=esupost.getProjectname()%>"
											name="projectname">
										<p class="main-font">简介:</p>
										<input type="text" value="<%=esupost.getSummary()%>"
											name="summary">
										<p class="main-font">工作地点:</p>
										<input type="text" value="<%=esupost.getPlace()%>"
											name="place">
										<p class="main-font">工作时间:</p>
										<input type="text" value="<%=esupost.getPtime()%>"
											name="ptime">
										<p class="main-font">要求:</p>
										<input type="text" value="<%=esupost.getDemand()%>"
											name="demand">
										<p class="main-font">薪资待遇:</p>
										<input type="text" value="<%=esupost.getRemuneration()%>"
											name="remuneration">
										<p class="main-font">报名截止时间:</p>
										<input type="text" value="<%=esupost.getStime()%>"
											name="stime">
										<p class="main-font">职位诱惑:</p>
										<input type="text" value="<%=esupost.getAllure()%>"
											name="allure">
										<p class="main-font">联系方式:</p>
										<input type="text" value="<%=esupost.getContact()%>"
											name="contact">
										<p class="main-font">
											项目类型:<%=ptag.getTagname()%></p>
										<select name="tagno" class="form-control">
											<%
												for (int j = 0; j < Esuprotag.size(); j++) {
															Tag tag = (Tag) Esuprotag.get(j);
											%>
											<option value="<%=tag.getId()%>"><%=tag.getTagname()%></option>
											<%
												}
											%>
										</select>

									</div>
									<div class="modal-footer">
										<button type="button" class="btn btn-default"
											data-dismiss="modal">取消</button>
										<input class="btn btn-primary" id="modify-btn" type="submit"
											value="提交">
									</div>
								</div>
								<!-- /.modal-content -->
							</div>
							<!-- /.modal -->
						</div>
					</form>

				</div>
			</div>
		</div>

		<%
			}
		%>

		<%
			}
		%>
	</div>


	<ul id="replacePage" class="pagination pagination-lg">
		<li><a id="last">&laquo;</a></li>
		<li><a id="first">1</a></li>
		<li><a id="second">2</a></li>
		<li><a id="third">3</a></li>
		<li><a id="fourth">4</a></li>
		<li><a id="Fifth">5</a></li>
		<li><a id="next">&raquo;</a></li>
	</ul>


</body>
</html>