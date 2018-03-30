package org.sccooperation.action.chuangxinggu;

import java.util.Map;

import org.sccooperation.service.EnterpriseManage;
import org.sccooperation.service.PostManage;

import com.opensymphony.xwork2.ActionContext;



public class ChuangxingguAction {
	
	//信息�?
	private String pageNo;
	private Map request;
	private String button;
	
	private PostManage postManage;
	private EnterpriseManage enterpriseManage;
	
	// 信息�? Set & Get�?
	public String getPageNo() {
		return pageNo;
	}

	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}

	public Map getRequest() {
		return request;
	}

	public void setRequest(Map request) {
		this.request = request;
	}

	public String getButton() {
		return button;
	}

	public void setButton(String button) {
		this.button = button;
	}

	public PostManage getPostManage() {
		return postManage;
	}

	public void setPostManage(PostManage postManage) {
		this.postManage = postManage;
	}

	public EnterpriseManage getEnterpriseManage() {
		return enterpriseManage;
	}

	public void setEnterpriseManage(EnterpriseManage enterpriseManage) {
		this.enterpriseManage = enterpriseManage;
	}

	public String execute() {
		//创兴谷主页：
		// �? URL 传参数中获得信息
		request = (Map)ActionContext.getContext().get("request");

		if (button != null) {	// �? button 存在
			//主页-显示标签对应的工�?
			request.put("JobList", postManage.findJobByButton(Integer.parseInt(pageNo), button));
		} else {					// �? button 不存�?
			//主页-显示�?有工�?
			request.put("JobList", postManage.findJobByPageNo(Integer.parseInt(pageNo)));			
		}
				
		// 主页-显示�?有公�?
		request.put("EnterpriseList", enterpriseManage.findEnterpriseByPageNo(Integer.parseInt(pageNo)));

		return "success";
	}
}
