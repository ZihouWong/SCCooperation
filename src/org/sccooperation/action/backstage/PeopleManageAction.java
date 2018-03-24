package org.sccooperation.action.backstage;
/**
 * Project:SCCooperation Comments:����action������springװ��һ��ʵ����Ȼ�󽫸�ʵ������struts����,��Ҫ���ܹ���ע���û�
 *  JDK version used:JDK1.8 
 *  Author��WLNSSS
 */

import java.util.List;
import java.util.Map;

import org.sccooperation.domain.Cv;
import org.sccooperation.domain.People;
import org.sccooperation.service.CommonManage;
import org.sccooperation.service.UserManage;

import com.opensymphony.xwork2.ActionContext;

public class PeopleManageAction {

	private UserManage<People> userManage;
	
	private CommonManage<People> commonManage;
	
	private String pageNo;
	
	private String table;
	
	private String id;
	
	private String state;
	
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

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	private String keyword;

	public UserManage<People> getUserManage() {
		return userManage;
	}

	public void setUserManage(UserManage<People> userManage) {
		this.userManage = userManage;
	}
	
	public String getPageNo() {
		return pageNo;
	}

	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}

	@SuppressWarnings("rawtypes")
	public String execute()
	{
		//����ҳ����ȡ�û��б�
		List list = userManage.selectAllUser(Integer.parseInt(pageNo));
		
		Map request =(Map)ActionContext.getContext().get("request");
		
		//����request����
		request.put("peopleList", list);

		return "success";
	}
	
	@SuppressWarnings("unchecked")
	public String search() {
		
		//ͨ���������ѯ���ݣ�list���н��ս����
		List<People> list = userManage.searchByPageNo(keyword, Integer.parseInt(pageNo));
		
		((Map<String, List<People>>)ActionContext.getContext().get("request")).put("peopleList", list);
		
		return "success";
		
	}
	
	public String stopPeople() throws NumberFormatException, Exception {
		
		boolean result = commonManage.isEnable(table, Integer.parseInt(id), state);
		
		if(result == false) {
			return "error";
		}
		
		if(result == true) {
			return "success";
		}
		return "success";
	}

	public CommonManage<People> getCommonManage() {
		return commonManage;
	}

	public void setCommonManage(CommonManage<People> commonManage) {
		this.commonManage = commonManage;
	}
}
