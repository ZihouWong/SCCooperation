package org.sccooperation.chuangxinggu.action;

import java.util.Map;

import org.sccooperation.service.EnterpriseManage;
import org.sccooperation.service.PostManage;

import com.opensymphony.xwork2.ActionContext;



public class ChuangxingguAction {

	private PostManage postManage;
	private EnterpriseManage enterpriseManage;
	private String pageNo;

	public EnterpriseManage getEnterpriseManage() {
		return enterpriseManage;
	}

	public void setEnterpriseManage(EnterpriseManage enterpriseManage) {
		this.enterpriseManage = enterpriseManage;
	}

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

		//显示主页显示所有工作
		System.out.println("hahahahahahahahah"+postManage.findJobByPageNo(Integer.parseInt(pageNo)));
		request.put("JobList", postManage.findJobByPageNo(Integer.parseInt(pageNo)));
		//显示主页显示所有公司
		System.out.println("hahahahahahahahah"+ enterpriseManage.findEnterpriseByPageNo(Integer.parseInt(pageNo)));
		request.put("EnterpriseList", enterpriseManage.findEnterpriseByPageNo(Integer.parseInt(pageNo)));

		return "success";
	}
}
