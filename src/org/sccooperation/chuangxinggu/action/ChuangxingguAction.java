package org.sccooperation.chuangxinggu.action;

import java.util.Map;
import org.sccooperation.service.PostManage;

import com.opensymphony.xwork2.ActionContext;



public class ChuangxingguAction {
	
	private PostManage postManage;
	private Map request;

	public Map getRequest() {
		return request;
	}

	public void setRequest(Map request) {
		this.request = request;
	}

	public String execute() {
//		request = (Map)ActionContext.getContext().get("request");
	
//		request.put("list",	postManage.findAllJob());
		
		return "success";
	}
}
