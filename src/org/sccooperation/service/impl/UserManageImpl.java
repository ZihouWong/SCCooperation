package org.sccooperation.service.impl;

import java.util.List;

import org.sccooperation.dao.IUserDao;
import org.sccooperation.service.UserManage;
/**
 * Project:SCCooperation Comments:�������û������ӿ�ʵ����
 *  JDK version used:JDK1.8 
 *  Author��WLNSSS Create Date��2017-9-27 Modified By�� <�޸�����������ƴ����д>
 * Modified Date: <�޸����ڣ���ʽ:YYYY-MM-DD> Why & What is modified <�޸�ԭ������>
 * Version:1.0
 */
public class UserManageImpl<T> implements UserManage<T> {
	/**�ñ�����springװ�䣬*/
    private IUserDao userDao;
	public List loginCheck(String account, String password) {
		
		
			System.out.println("kong");
			return userDao.loginCheck(account, password);

	}
	public IUserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}
	@Override
	public void insertUser(T entity) {
		// TODO Auto-generated method stub
		userDao.insertUser(entity);
		}
	}
