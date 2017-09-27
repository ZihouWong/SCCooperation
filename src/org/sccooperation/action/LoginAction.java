package org.sccooperation.action;




import org.sccooperation.service.UserManage;
/**
 * Project:SCCooperation Comments:此类action，先由spring装配一个实例，然后将该实例交给struts管理
 *  JDK version used:JDK1.8 
 *  Author：WLNSSS Create Date：2017-9-27 Modified By： <修改人中文名或拼音缩写>
 * Modified Date: <修改日期，格式:YYYY-MM-DD> Why & What is modified <修改原因描述>
 * Version:1.0
 */

public class LoginAction {
	/**实例化一个service层的变量，调用其方法*/
	private UserManage userManage;
	/**网页传来的账号*/
	private String account;
	/**网页传来的密码*/
	private String password;
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
	public UserManage getUserManage() {
		return userManage;
	}
	public void setUserManage(UserManage userManage) {
		this.userManage = userManage;
	}
	/**
	 * 根据网页传过来的账号密码，调用service验证数据库是否有此条记录进行登录
	 * 
	 * @return 返回'success'或'error'字符串
	 * @exception 暂时没做
	 */
	public String execute()
	{    
		
		System.out.println(account+"    "+password);
		System.out.println("kaishile");		
			return userManage.loginCheck(account, password);

	}



}
