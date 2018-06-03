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
 * 公司子用户管理入口
 * @author WLNSSS
 * @time 2018.1.20
 * */
public class EnterprisesubuserManageAction {

	
	//页数
	private int pageNo;
	
	//操作器
	private EnterprisesubuserManage<Enterprisesubuser> enterprisesubuserManage;
	
	//共有类操作器
		private CommonManage<Enterprisesubuser> commonManage;
		
		//表名
		private String table;
		
		//id
		private String id;
		
		//状态
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
		
		//置入request容器
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

	//查找页面
	public String search() {
		
		//获取搜索的结果集
		List<Enterprisesubuser> list = enterprisesubuserManage.searchByPageNo(keyword,pageNo);
		
		//置入request容器
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
