package org.sccooperation.service.impl;

import org.sccooperation.dao.IUserDao;
import org.sccooperation.service.UserManage;
/**
 * Project:SCCooperation Comments:�������û������ӿ�ʵ����
 *  JDK version used:JDK1.8 
 *  Author��WLNSSS Create Date��2017-9-27 Modified By�� <�޸�����������ƴ����д>
 * Modified Date: <�޸����ڣ���ʽ:YYYY-MM-DD> Why & What is modified <�޸�ԭ������>
 * Version:1.0
 */
public class UserManageImpl implements UserManage {
	/**�ñ�����springװ�䣬*/
    private IUserDao userDao;
	public String loginCheck(String account, String password) {
		
		
			System.out.println("kong");
			return userDao.loginCheck(account, password);

	}
	public IUserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}
	}
