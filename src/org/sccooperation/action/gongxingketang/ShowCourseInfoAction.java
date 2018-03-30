package org.sccooperation.gongxingketang.action;

import java.util.Map;

import org.sccooperation.service.CourseManage;
import org.sccooperation.service.PeopleManage;
import com.opensymphony.xwork2.ActionContext;

public class ShowCourseInfoAction {
	
	// 信息:
	private Map request;
	private String pageNo;
	private String button;
	private String courseNo;
	private String peopleid;

	private CourseManage courseManage;
	private PeopleManage peopleManage;
	
	// 信息的 Set & Get：
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
	

	public String getCourseNo() {
		return courseNo;
	}

	public void setCourseNo(String courseNo) {
		this.courseNo = courseNo;
	}
	
	public String getPeopleid() {
		return peopleid;
	}

	public void setPeopleid(String peopleid) {
		this.peopleid = peopleid;
	}

	public PeopleManage getPeopleManage() {
		return peopleManage;
	}

	public void setPeopleManage(PeopleManage peopleManage) {
		this.peopleManage = peopleManage;
	}

	public String execute() {
		// 躬行课堂-详细页面:
		// 从 URL 传参数中获得信息
		request = (Map)ActionContext.getContext().get("request");
		
		// 详细页面-（视频显示）课程列表
		request.put("courseList",courseManage.getCourseList());

		// 详细页面-课程信息
		request.put("courseInfo", courseManage.getCourseInfo(Integer.parseInt(courseNo)));
		
		// 详细页面-讲师信息
		request.put("teacherInfo", peopleManage.findTeacherInfo(Integer.parseInt(peopleid)));
		
		// 详细页面-课程广告
		request.put("courseAd", courseManage.findCourseAd());
		
		return "success";
	}

	
}
