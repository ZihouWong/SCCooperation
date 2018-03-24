package org.sccooperation.action.backstage;
/**
 * Project:SCCooperation Comments:此类action，先由spring装配一个实例，然后将该实例交给struts管理,主要功能管理注册用户
 *  JDK version used:JDK1.8 
 *  Author：WLNSSS
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
		//根据页数获取用户列表
		List list = userManage.selectAllUser(Integer.parseInt(pageNo));
		
		Map request =(Map)ActionContext.getContext().get("request");
		
		//置入request容器
		request.put("peopleList", list);

		return "success";
	}
	
	@SuppressWarnings("unchecked")
	public String search() {
		
		//通过共有类查询数据，list进行接收结果集
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
