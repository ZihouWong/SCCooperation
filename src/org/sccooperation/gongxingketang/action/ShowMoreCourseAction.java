package org.sccooperation.gongxingketang.action;

import java.util.Map;

import org.sccooperation.domain.Course;
import org.sccooperation.service.CourseManage;

import com.opensymphony.xwork2.ActionContext;

public class ShowMoreCourseAction {

	// 信息：
	private Map request;
	private String pageNo;
	private String content;	// 搜索内容
	private String button;
	
	private CourseManage courseManage; 
	
	// 信息的 Set & Get：
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

	public CourseManage getCourseManage() {
		return courseManage;
	}

	public void setCourseManage(CourseManage courseManage) {
		this.courseManage = courseManage;
	}
	
	public String execute() {
		// 躬行课堂-搜索页面：
		// 从 URL 传参数中获得信息
		request = (Map)ActionContext.getContext().get("request");
		
		// 搜索页面-热点课程列表
		System.out.println("testingggggggg0000000000");
		request.put("HotCourseList", courseManage.showHotCourse(Integer.parseInt(pageNo), Integer.parseInt(button)));
		
		System.out.println("testingggggggg9999999999");
		// 搜索页面-主体课程信息列表
		System.out.println("testingggggggg4444444444");
		request.put("CourseList", courseManage.showMainCourse(Integer.parseInt(pageNo), Integer.parseInt(button)));
		System.out.println("content3:" + content);
		System.out.println("testingggggggg666666666666");
		// 搜索模块 
		
		
		System.out.println("button:" + button);
		System.out.println("content1:" + content);
		System.out.println("pageNo:" + pageNo);
		System.out.println("testingggggggg3333333333");
		// 搜索页面-获取课程数量
		request.put("courseNum", courseManage.getCourseNum(Course.class));
		System.out.println("testingggggggg3333333333");
		System.out.println("testingggggggg666666666666");
		if (content != null) {
			// 搜索页面-查找对应课程
			System.out.println("testingggggggg4444444444");
			request.put("CourseList", courseManage.searchCourse(content, Integer.parseInt(pageNo)));
			System.out.println("testingggggggg4444444444");
			// 搜索页面-返回查找内容
			request.put("content", content);
			System.out.println("testingggggggg666666666666");
		}
		System.out.println("testingggggggg0000000000");
		return "success";
		
	}
}
