package org.sccooperation.gongxingketang.action;

import java.util.Map;

import org.sccooperation.service.CourseManage;

import com.opensymphony.xwork2.ActionContext;

public class ShowMoreCourseAction {

	// 信息：
	private Map request;
	private String pageNo;
	private String content;	// 搜索内容
	private String button;
	
	private CourseManage courseManage; 
	
	public CourseManage getCourseManage() {
		return courseManage;
	}

	public void setCourseManage(CourseManage courseManage) {
		this.courseManage = courseManage;
	}

	public Map getRequest() {
		return request;
	}

	public void setRequest(Map request) {
		this.request = request;
	}

	public String getPageNo() {
		return pageNo;
	}

	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getButton() {
		return button;
	}

	public void setButton(String button) {
		this.button = button;
	}

	public String execute() {
		// 躬行课堂-搜索页面：
		// 从 URL 传参数中获得信息
		request = (Map)ActionContext.getContext().get("request");
		
		request.put("HotCourseList", courseManage.showHotCourse(Integer.parseInt(pageNo), Integer.parseInt(button)));
		
		request.put("CourseList", courseManage.showMainCourse(Integer.parseInt(pageNo), Integer.parseInt(button)));
		
		if (content != null) {
			
			request.put("CourseList", courseManage.searchCourse(content, Integer.parseInt(pageNo)));
		}
//		request.put("courseNum", course)
		return "success";
	}
}
