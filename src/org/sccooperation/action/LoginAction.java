package org.sccooperation.action;




import org.sccooperation.service.UserManage;
/**
 * Project:SCCooperation Comments:����action������springװ��һ��ʵ����Ȼ�󽫸�ʵ������struts����
 *  JDK version used:JDK1.8 
 *  Author��WLNSSS Create Date��2017-9-27 Modified By�� <�޸�����������ƴ����д>
 * Modified Date: <�޸����ڣ���ʽ:YYYY-MM-DD> Why & What is modified <�޸�ԭ������>
 * Version:1.0
 */

public class LoginAction {
	/**ʵ����һ��service��ı����������䷽��*/
	private UserManage userManage;
	/**��ҳ�������˺�*/
	private String account;
	/**��ҳ����������*/
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
	 * ������ҳ���������˺����룬����service��֤���ݿ��Ƿ��д�����¼���е�¼
	 * 
	 * @return ����'success'��'error'�ַ���
	 * @exception ��ʱû��
	 */
	public String execute()
	{    
		
		System.out.println(account+"    "+password);
		System.out.println("kaishile");		
			return userManage.loginCheck(account, password);

	}



}
