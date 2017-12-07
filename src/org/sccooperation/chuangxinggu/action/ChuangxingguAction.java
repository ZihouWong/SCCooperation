package org.sccooperation.chuangxinggu.action;

import java.util.Map;
import org.sccooperation.service.PostManage;

import com.opensymphony.xwork2.ActionContext;



public class ChuangxingguAction {
	
	private PostManage postManage;
	private String pageNo;
	
	public String getPageNo() {
		return pageNo;
	}

	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}

	private Map request;
	

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

	public String execute() {
		request = (Map)ActionContext.getContext().get("request");
		 
		request.put("allJob", postManage.findAllJob());
		
		request.put("list", postManage.findJob(Integer.parseInt(pageNo)));
		
		return "success";
	}
}
