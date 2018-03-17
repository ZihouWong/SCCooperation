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
 * Project:SCCooperation Comments:����action������springװ��һ��ʵ����Ȼ�󽫸�ʵ������struts���� JDK
 * version used:JDK1.8 Author��WLNSSS Create Date��2017-9-27 Modified By��
 * <�޸�����������ƴ����д> Modified Date: <�޸����ڣ���ʽ:YYYY-MM-DD> Why & What is modified
 * <�޸�ԭ������> Version:1.0
 */

public class LoginAction {
	/** ʵ����һ��service��ı����������䷽�� */
	private UserManage userManage;
	/** ��ҳ�������˺� */
	private String account;
	/** ��ҳ���������� */
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
	 * ������ҳ���������˺����룬����service��֤���ݿ��Ƿ��д�����¼���е�¼
	 * 
	 * @return ����'success'��'error'�ַ���
	 * @throws NoSuchAlgorithmException
	 * @throws UnsupportedEncodingException
	 * @exception ��ʱû��
	 */
	public String execute() throws NoSuchAlgorithmException, UnsupportedEncodingException {
		// ˫�ؽ��ܻ�ȡ���룬�ж����ݿ��Ƿ�������ֶ��жϵ�¼
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
			((Map<String, String>)ActionContext.getContext().get("request")).put("tip", "*��¼ʧ�������˺������Ƿ�����");
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
