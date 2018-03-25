<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="org.sccooperation.domain.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>e_project_management</title>
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
		List listE = (List) request.getSession().getAttribute("enterprise");
		Enterprise enterprise = (Enterprise) listE.get(0);

		List Esu = (List) request.getSession().getAttribute("esu");//接收所有项目的负责人信息
		List Protag = (List) request.getSession().getAttribute("protag");//接收所有项目的tag信息
	%>

	<p>
		当前企业:<%=enterprise.getEname()%></p>

	<button class="btn btn-primary btn-lg" data-toggle="modal"
		data-target="#newproject_Modal">新增项目</button>

	<form id="addpost-form" action="eaddproject.action?pageNo=1"
		method="post" enctype="multipart/form-data">
		<!-- 模态框（Modal） -->
		<div class="modal fade" id="newproject_Modal" tabindex="-1"
			role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">&times;</button>
						<h4 class="modal-title" id="myModalLabel">新增项目</h4>
					</div>
					<div class="modal-body">
						<p class="main-font">项目名称:</p>
						<input type="text" name="projectname">
						<p class="main-font">简介:</p>
						<input type="text" name="summary">
						<p class="main-font">工作地点:</p>
						<input type="text" name="place">
						<p class="main-font">工作时间:</p>
						<input type="text" name="ptime">
						<p class="main-font">要求:</p>
						<input type="text" name="demand">
						<p class="main-font">薪资待遇:</p>
						<input type="text" name="remuneration">
						<p class="main-font">报名截止时间:</p>
						<input type="text" name="stime">
						<p class="main-font">职位诱惑:</p>
						<input type="text" name="allure">
						<p class="main-font">联系方式:</p>
						<input type="text" name="contact">
						<p class="main-font">项目类型:</p>
						<select name="tagno" class="form-control">
							<%
								for (int j = 0; j < Protag.size(); j++) {
									Tag tag = (Tag) Protag.get(j);
							%>
							<option value="<%=tag.getId()%>"><%=tag.getTagname()%></option>
							<%
								}
							%>
						</select>
						<p class="main-font">项目负责人:</p>
						<select name="enterprisesubuser_id" class="form-control">
							<%
								for (int i = 0; i < Esu.size(); i++) {
									Enterprisesubuser enterprisesubuser = (Enterprisesubuser) Esu.get(i);
							%>
							<option value="<%=enterprisesubuser.getId()%>"><%=enterprisesubuser.getNickname()%></option>
							<%
								}
							%>
						</select> <br />
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">取消
						</button>
						<input class="btn btn-primary" id="modify-btn" type="submit"
							value="提交">
					</div>
				</div>
				<!-- /.modal-content -->
			</div>
			<!-- /.modal -->
		</div>
	</form>

	<br>
	<br>
	<br>

	<%
		List listEpost = (List) request.getSession().getAttribute("epost");
	%>

	<div class="panel-group" id="accordion">
		<%
			if (!listEpost.isEmpty()) {
				List post_esu = (List) request.getAttribute("post_esu");//接收各个项目的负责人信息
				List post_tag = (List) request.getAttribute("post_tag");//接收各个项目的tag信息

				for (int i = 0; i < listEpost.size(); i++) {
					Post epost = (Post) listEpost.get(i);
					Enterprisesubuser enterprisesubuser = epost.getManager_id();

					Enterprisesubuser pesu = (Enterprisesubuser) post_esu.get(i);//获取出各个项目的负责人信息和tag信息
					Tag ptag = (Tag) post_tag.get(i);//获取出各个项目的tag信息
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
						项目名称:<%=epost.getProjectname()%></p>
					<p class="main-font">
						简介:<%=epost.getSummary()%></p>
					<p class="main-font">
						工作地点:<%=epost.getPlace()%></p>
					<p class="main-font">
						工作时间:<%=epost.getPtime()%></p>
					<p class="main-font">
						要求:<%=epost.getDemand()%></p>
					<p class="main-font">
						薪资待遇:<%=epost.getRemuneration()%></p>
					<p class="main-font">
						报名截止时间:<%=epost.getStime()%></p>
					<p class="main-font">
						职位诱惑:<%=epost.getAllure()%></p>
					<p class="main-font">
						联系方式:<%=epost.getContact()%></p>
					<p class="main-font">
						项目类型:<%=ptag.getTagname()%></p>
					<p class="main-font">
						项目负责人:<%=pesu.getNickname()%></p>

					<!-- 按钮触发模态框 -->
					<button class="btn btn-primary btn-lg" data-toggle="modal"
						data-target="#project<%=i + 1%>_Modal">编辑</button>
					<form id="modifypost<%=i + 1%>-form"
						action="eupdateproject.action?pageNo=1" method="post"
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

										<input type="hidden" value="<%=epost.getId()%>" name="post_id">
										<p class="main-font">项目名称:</p>
										<input type="text" value="<%=epost.getProjectname()%>"
											name="projectname">
										<p class="main-font">简介:</p>
										<input type="text" value="<%=epost.getSummary()%>"
											name="summary">
										<p class="main-font">工作地点:</p>
										<input type="text" value="<%=epost.getPlace()%>" name="place">
										<p class="main-font">工作时间:</p>
										<input type="text" value="<%=epost.getPtime()%>" name="ptime">
										<p class="main-font">要求:</p>
										<input type="text" value="<%=epost.getDemand()%>"
											name="demand">
										<p class="main-font">薪资待遇:</p>
										<input type="text" value="<%=epost.getRemuneration()%>"
											name="remuneration">
										<p class="main-font">报名截止时间:</p>
										<input type="text" value="<%=epost.getStime()%>" name="stime">
										<p class="main-font">职位诱惑:</p>
										<input type="text" value="<%=epost.getAllure()%>"
											name="allure">
										<p class="main-font">联系方式:</p>
										<input type="text" value="<%=epost.getContact()%>"
											name="contact">
										<p class="main-font">
											项目类型:<%=ptag.getTagname()%></p>
										<select name="tagno" class="form-control">
											<%
												for (int j = 0; j < Protag.size(); j++) {
															Tag tag = (Tag) Protag.get(j);
											%>
											<option value="<%=tag.getId()%>"><%=tag.getTagname()%></option>
											<%
												}
											%>
										</select>


										<p class="main-font">
											项目负责人:<%=pesu.getNickname()%></p>
										<select name="enterprisesubuser_id" class="form-control">
											<%
												for (int j = 0; j < Esu.size(); j++) {
															enterprisesubuser = (Enterprisesubuser) Esu.get(j);
											%>
											<option value="<%=enterprisesubuser.getId()%>"><%=enterprisesubuser.getNickname()%></option>
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