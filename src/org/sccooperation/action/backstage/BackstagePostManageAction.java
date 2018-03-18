package org.sccooperation.action.backstage;

import java.util.List;
import java.util.Map;

import org.sccooperation.domain.Enterprise;
import org.sccooperation.domain.Enterprisesubuser;
import org.sccooperation.domain.Post;
import org.sccooperation.service.BackstagePostManage;
import org.sccooperation.service.CommonManage;
import org.sccooperation.service.EnterpriseManage;
import org.sccooperation.service.EnterprisesubuserManage;

import com.opensymphony.xwork2.ActionContext;

/*
 * ��Ŀ��̨����
 * @author WLNSSS
 * @time 2018.1.21
 * */
public class BackstagePostManageAction {

	//ҳ��
	private int pageNo;
	
	//�����ؼ���
	private String keyword;
	
	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	//������
	private BackstagePostManage<Post> backstagePostManage;
	
	//�����������
	private CommonManage<Post> commonManage;
	
	//����
	private String table;
	
	//id
	private String id;
	
	//״̬
	private String state;

	public CommonManage<Post> getCommonManage() {
		return commonManage;
	}

	public void setCommonManage(CommonManage<Post> commonManage) {
		this.commonManage = commonManage;
	}

	public String getTable() {
		return table;
	}

	public void setTable(String table) {
		this.table = table;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	//��ҳ
	public String index() throws Exception{
		
		List<Post> list = backstagePostManage.findByPageNo(pageNo);
		
		//����request����
		 ((Map) ActionContext.getContext().get("request")).put("backstagePostList", list);
		 
		 return "success";
	}
	
public String stopPost() throws NumberFormatException, Exception {
		
		boolean result = commonManage.isEnable(table, Integer.parseInt(id), state);
		
		if(result == false) {
			return "error";
		}
		
		if(result == true) {
			return "success";
		}
		return "success";
	}

//����ҳ��
	public String search() {
		
		//��ȡ�����Ľ����
		List<Post> list = backstagePostManage.searchByPageNo(keyword,pageNo);
		
		//����request����
		((Map) ActionContext.getContext().get("request")).put("noteList", list);
		
		return "success";
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public BackstagePostManage<Post> getBackstagePostManage() {
		return backstagePostManage;
	}

	public void setBackstagePostManage(BackstagePostManage<Post> backstagePostManage) {
		this.backstagePostManage = backstagePostManage;
	}


	
	
}
