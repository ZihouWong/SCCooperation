package org.sccooperation.action.backstage;

import java.util.List;
import java.util.Map;

import org.sccooperation.domain.Enterprise;
import org.sccooperation.domain.Note;
import org.sccooperation.domain.Post;
import org.sccooperation.service.CommonManage;
import org.sccooperation.service.EnterpriseManage;

import com.opensymphony.xwork2.ActionContext;

/*
 * @author WLNSSS
 * @time 2018.1.13
 * ��ҵ�������
 * */
public class EnterpriseManageAction {
	
	//ҳ��
	private int pageNo;
	
	//�ؼ���
	private String keyword;
	
	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	//������
	private EnterpriseManage<Enterprise> enterpriseManage;
	
	//�����������
		private CommonManage<Enterprise> commonManage;
		
		//����
		private String table;
		
		//id
		private String id;
		
		//״̬
		private String state;

		public CommonManage<Enterprise> getCommonManage() {
			return commonManage;
		}

		public void setCommonManage(CommonManage<Enterprise> commonManage) {
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



	
	@SuppressWarnings("unchecked")
	public String index()  throws Exception{
		
		List<Enterprise> list = enterpriseManage.findByPageNo(pageNo);
		
		//����request����
		 ((Map) ActionContext.getContext().get("request")).put("enterpriseList", list);
		 
		 
		 return "success";
	}
	
public String stopEnterprise() throws NumberFormatException, Exception {
		
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
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public String search() {
		
		//��ȡ�����Ľ����
		List<Enterprise> list = enterpriseManage.searchByPageNo(keyword,pageNo);
		
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

	public EnterpriseManage<Enterprise> getEnterpriseManage() {
		return enterpriseManage;
	}

	public void setEnterpriseManage(EnterpriseManage<Enterprise> enterpriseManage) {
		this.enterpriseManage = enterpriseManage;
	}

}
