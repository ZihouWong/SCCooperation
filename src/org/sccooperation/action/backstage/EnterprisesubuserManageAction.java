package org.sccooperation.action.backstage;

import java.util.List;
import java.util.Map;

import org.sccooperation.domain.Enterprise;
import org.sccooperation.domain.Enterprisesubuser;
import org.sccooperation.domain.Post;
import org.sccooperation.service.CommonManage;
import org.sccooperation.service.EnterpriseManage;
import org.sccooperation.service.EnterprisesubuserManage;

import com.opensymphony.xwork2.ActionContext;

/*
 * ��˾���û��������
 * @author WLNSSS
 * @time 2018.1.20
 * */
public class EnterprisesubuserManageAction {

	
	//ҳ��
	private int pageNo;
	
	//������
	private EnterprisesubuserManage<Enterprisesubuser> enterprisesubuserManage;
	
	//�����������
		private CommonManage<Enterprisesubuser> commonManage;
		
		//����
		private String table;
		
		//id
		private String id;
		
		//״̬
		private String state;

		private String keyword;

		public CommonManage<Enterprisesubuser> getCommonManage() {
			return commonManage;
		}

		public void setCommonManage(CommonManage<Enterprisesubuser> commonManage) {
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

	
	public String index()  throws Exception{
		
		List<Enterprisesubuser> list = enterprisesubuserManage.findByPageNo(pageNo);
		
		//����request����
		 ((Map) ActionContext.getContext().get("request")).put("enterprisesubuserList", list);
		 
		 
		 return "success";
	}
	
public String stopEnterprisesubuser() throws NumberFormatException, Exception {
		
		boolean result = commonManage.isEnable(table, Integer.parseInt(id), state);
		
		if(result == false) {
			return "error";
		}
		
		if(result == true) {
			return "success";
		}
		return "success";
	}



	public String getKeyword() {
	return keyword;
}

public void setKeyword(String keyword) {
	this.keyword = keyword;
}

	//����ҳ��
	public String search() {
		
		//��ȡ�����Ľ����
		List<Enterprisesubuser> list = enterprisesubuserManage.searchByPageNo(keyword,pageNo);
		
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

	public EnterprisesubuserManage<Enterprisesubuser> getEnterprisesubuserManage() {
		return enterprisesubuserManage;
	}

	public void setEnterprisesubuserManage(EnterprisesubuserManage<Enterprisesubuser> enterprisesubuserManage) {
		this.enterprisesubuserManage = enterprisesubuserManage;
	}

}
