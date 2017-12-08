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
		 
		System.out.println(postManage.findAllJob());
		request.put("allJob", postManage.findAllJob());

		System.out.println("hahahahahahahahah"+postManage.findJobByPageNo(Integer.parseInt(pageNo)));
		request.put("list", postManage.findJobByPageNo(Integer.parseInt(pageNo)));
		
		return "success";
	}
}
