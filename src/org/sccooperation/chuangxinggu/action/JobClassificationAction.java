package org.sccooperation.chuangxinggu.action;

import java.util.List;
import java.util.Map;

import org.sccooperation.service.PostManage;

import com.opensymphony.xwork2.ActionContext;



public class JobClassificationAction {
	
	private String buttom;
	private Map request;
	private PostManage postManage;


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

	public String getButtom() {
		return buttom;
	}
	
	public void setButtom(String buttom) {
		this.buttom = buttom;
	}
	
	public String execute() {
		
		request = (Map)ActionContext.getContext().get("request");
		
		request.put("list",	postManage.findJobByButtom(buttom));
		
		return "success";
	}
	

}
