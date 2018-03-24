package org.sccooperation.action;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;

import org.sccooperation.domain.BackstageUser;
import org.sccooperation.service.UserManage;

import com.opensymphony.xwork2.ActionContext;

import sun.misc.BASE64Encoder;
/**
 * Project:SCCooperation Comments:此类action，先由spring装配一个实例，然后将该实例交给struts管理 JDK
 * version used:JDK1.8 Author：WLNSSS Create Date：2017-9-27 Modified By：
 * <修改人中文名或拼音缩写> Modified Date: <修改日期，格式:YYYY-MM-DD> Why & What is modified
 * <修改原因描述> Version:1.0
 */

public class LoginAction {
	/** 实例化一个service层的变量，调用其方法 */
	private UserManage userManage;
	/** 网页传来的账号 */
	private String account;
	/** 网页传来的密码 */
	private String password;
	// session
	private Map session;

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
	 * @throws NoSuchAlgorithmException
	 * @throws UnsupportedEncodingException
	 * @exception 暂时没做
	 */
	public String execute() throws NoSuchAlgorithmException, UnsupportedEncodingException {
		// 双重解密获取密码，判断数据库是否有相关字段判断登录
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		BASE64Encoder base64en = new BASE64Encoder();
		password = base64en.encode(md5.digest(password.getBytes("utf-8")));
		System.out.println(account + "    " + password);
		System.out.println("kaishile");
		List list = userManage.loginCheck(account, password);

		System.out.println("..................................");
		System.out.println(password);
		// if(session.get("user")==null)
		ActionContext.getContext().getSession().put("user", list);

		if (list.isEmpty()) {
			return "error";
		}
		return "success";
	}
	
	@SuppressWarnings("unchecked")
	public String backstageLogin() {
		List<BackstageUser> list = userManage.backstageLoginCheck(account, password);
		
		
		if(list.isEmpty()) {
			((Map<String, String>)ActionContext.getContext().get("request")).put("tip", "*登录失败请检查账号密码是否有误");
			return "error";
		}
		
		ActionContext.getContext().getSession().put("backstageUser", list);
		
		return "success";
	}
	
	public String loginOutByBackstage() {
		Map session = ActionContext.getContext().getSession();
		session.remove("backstageUser");
		return "success";
	}

}
