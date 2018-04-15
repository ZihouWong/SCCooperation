package org.sccooperation.chuangxinggu.action;

import java.util.Map;

import org.sccooperation.domain.Enterprise;
import org.sccooperation.domain.Post;
import org.sccooperation.service.EnterpriseManage;
import org.sccooperation.service.PostManage;
import org.sccooperation.service.TagManage;

import com.opensymphony.xwork2.ActionContext;

public class ShowJobInfoAction {

	// 信息：
	private Map request;
	private String pageNo;
	private String jobNo;
	private String tagNo;
	private String enterpriseNo;

	
	private TagManage tagManage;
	private PostManage postManage;
	private EnterpriseManage enterpriseManage;
	
	// 信息的 Set & Get：
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

	public String getJobNo() {
		return jobNo;
	}

	public void setJobNo(String jobNo) {
		this.jobNo = jobNo;
	}

	public String getTagNo() {
		return tagNo;
	}

	public void setTagNo(String tagNo) {
		this.tagNo = tagNo;
	}

	public String getEnterpriseNo() {
		return enterpriseNo;
	}

	public void setEnterpriseNo(String enterpriseNo) {
		this.enterpriseNo = enterpriseNo;
	}

	public TagManage getTagManage() {
		return tagManage;
	}

	public void setTagManage(TagManage tagManage) {
		this.tagManage = tagManage;
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
		// 创兴谷-详细页面:
		// 从 URL 传参数中获得信息
		request = (Map)ActionContext.getContext().get("request");

		// 主体信息框
		request.put("JobInfo", postManage.showJobInfo(Integer.parseInt(jobNo)));
		
		// 该工作所属的标签名字
		request.put("TagName", tagManage.showTagName(Integer.parseInt(jobNo)));
		
		// 该公司所属的标签名字
		request.put("ETagName", enterpriseManage.showETagName(Integer.parseInt(enterpriseNo)));
		
		// 该公司其他的工作
		request.put("OtherJob", postManage.showOtherJob(Integer.parseInt(tagNo)));
		return "success";
	}
}