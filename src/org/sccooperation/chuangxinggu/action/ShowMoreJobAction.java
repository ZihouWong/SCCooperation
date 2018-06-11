package org.sccooperation.chuangxinggu.action;

import java.util.Map;

import org.sccooperation.domain.Post;
import org.sccooperation.service.PostManage;

import com.opensymphony.xwork2.ActionContext;

public class ShowMoreJobAction {
	
	// 信息：
	private Map request;
	private String pageNo;
	private String content;	// 搜索内容
	private String button;    
	
	private PostManage postManage;

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

	public PostManage getPostManage() {
		return postManage;
	}

	public void setPostManage(PostManage postManage) {
		this.postManage = postManage;
	}

	public String execute() {
		// 创兴谷-搜索页面：		
		// 从 URL 传参数中获得信息
		request = (Map)ActionContext.getContext().get("request");
		
		// 搜索页面-热点工作列表
		request.put("HotJobList", postManage.showHotJob(Integer.parseInt(pageNo), Integer.parseInt(button)));

		// 搜索页面-主体工作信息列表		
		request.put("JobList", postManage.showMainJob(Integer.parseInt(pageNo), Integer.parseInt(button)));

		// 搜索页面-获得工作总数
		request.put("postNum", postManage.getPostNum(Post.class));
		
		// 显示 
		request.put("button", button);
		request.put("pageNo", pageNo);
		request.put("content", content);
		
		// 搜索模块 
		if(content != null) {
			// 搜索页面-查找对应工作
			request.put("JobList", postManage.SearchJob(content, Integer.parseInt(pageNo)));
		}
		return "success";
	}
}
