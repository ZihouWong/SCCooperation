package org.sccooperation.action;

import java.util.List;

import org.sccooperation.service.UserManage;
import org.sccooperation.service.impl.UManageImpl;

public class TestLoginAction {
	private UManageImpl uuu;
	/**网页传来的账号*/
	private String account;
	/**网页传来的密码*/
	private String password;
	public UManageImpl getUuu() {
		return uuu;
	}
	public void setUuu(UManageImpl uuu) {
		this.uuu = uuu;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String execute()
	{
		List list = uuu.loginCheck(account, password);
		if(list.isEmpty())
		{
			return "error";
		}
		return "success";
		
	}
}
