package org.sccooperation.gongxingketang.action;

import java.util.Map;

import org.sccooperation.domain.Enterprise;
import org.sccooperation.service.CourseManage;
import org.sccooperation.service.EnterpriseManage;
import org.sccooperation.service.PostManage;
import org.sccooperation.service.TagManage;

import com.opensymphony.xwork2.ActionContext;

public class GongxingketangAction {
	
	// 信息�?
	private Map request;
	private String pageNo;
	private String button;
	
	private CourseManage courseManage;
	private EnterpriseManage enterpriseManage;
	private TagManage tagManage;
	
	
	// 信息 Set & Get:
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

	public EnterpriseManage getEnterpriseManage() {
		return enterpriseManage;
	}

	public void setEnterpriseManage(EnterpriseManage enterpriseManage) {
		this.enterpriseManage = enterpriseManage;
	}

	public TagManage getTagManage() {
		return tagManage;
	}

	public void setTagManage(TagManage tagManage) {
		this.tagManage = tagManage;
	}

	public String execute() {
		// 躬行课堂主页�?
		// �? URL 传参数中获得信息
		request = (Map)ActionContext.getContext().get("request");
	
		// 主页-猜你喜欢模块
		request.put("GuessULike", courseManage.guessUlike(Integer.parseInt(pageNo)));
		
		if (button != null) {	// �? button 存在
			// 主页-标签�?对应的课�?
			request.put("CourseList", courseManage.findCourseByButton(Integer.parseInt(button), Integer.parseInt(pageNo)));
			// 显示标签名字
			request.put("TagName", tagManage.getTitleName(Integer.parseInt(button)));
		} else {					// �? button 不存�?
			// 主页-主体框课�?
			request.put("CourseList", courseManage.findAllCourse(Integer.parseInt(pageNo)));
		}
		// 主页-合作伙伴
		request.put("EnterpriseList", enterpriseManage.findPartner(Integer.parseInt(pageNo)));
		
		return "success";
	}

}
