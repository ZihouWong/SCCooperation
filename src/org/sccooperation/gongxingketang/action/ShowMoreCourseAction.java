package org.sccooperation.gongxingketang.action;

import java.util.Map;

public class ShowMoreCourseAction {

	// 信息：
	private Map request;
	private String pageNo;
	private String content;	// 搜索内容
	private String button; 
	
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
		return "success";
	}
}
