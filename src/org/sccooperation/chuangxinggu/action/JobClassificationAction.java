package org.sccooperation.chuangxinggu.action;

import java.util.List;
import java.util.Map;

import org.sccooperation.service.PostManage;

import com.opensymphony.xwork2.ActionContext;



public class JobClassificationAction {
	
	private String button;
	private Map request;
	private PostManage postManage;
	private int pageNo;


	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public Map getRequest() {
		return request;
	}

	public void setRequest(Map request) {
		this.request = request;
	}

	public PostManage getPostManage() {
		return postManage;
	}

	public void setPostManage(PostManage postManage) {
		this.postManage = postManage;
	}

	
	public String getButton() {
		return button;
	}

	public void setButton(String button) {
		this.button = button;
	}

	public String execute() {
		
		request = (Map)ActionContext.getContext().get("request");
		
		
		System.out.println(button);
		System.out.println(pageNo);
		//显示所选的标签对应的工作
		request.put("ButtonJob",	 postManage.findJobByButtom(pageNo, button));
		
		return "success";
	}

}
