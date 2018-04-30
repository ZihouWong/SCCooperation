package org.sccooperation.service.impl;

import java.util.List;

import org.sccooperation.dao.IUserDao;
import org.sccooperation.domain.People;
import org.sccooperation.service.UserManage;
/**
 * Project:SCCooperation Comments:�������û������ӿ�ʵ����
 *  JDK version used:JDK1.8 
 *  Author��WLNSSS Create Date��2017-9-27 Modified By��blank700 <�޸�����������ƴ����д>
 * Modified Date:2017-11-30 <�޸����ڣ���ʽ:YYYY-MM-DD> Why & What is modified <�޸�ԭ������>
 * Version:1.0
 */
public class UserManageImpl<T> implements UserManage<T> {
	/** �ñ�����springװ�䣬 */
	private IUserDao userDao;
	public IUserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public List loginCheck(String account, String password) {
		System.out.println("start logincheck");
		return userDao.loginCheck(account, password);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void insertUser(T entity) {
		// TODO Auto-generated method stub
		userDao.insertUser(entity);
	}
	
	@Override
	public List<T> idtouser(int pid){
		System.out.println("idtouser");
		return userDao.idtouser(pid);
	}
	
	
	/******************************************************WLNSSS**********************************/

	@Override
	public List<People> selectAllUser(int pageNo) {
		// TODO Auto-generated method stub
		return userDao.selectAllUser(pageNo);

	}
	
	public List<T> searchByPageNo(String keyword,int pageNo) {
		// TODO Auto-generated method stub
		return userDao.searchByPageNo(keyword,pageNo);
	}

	@Override
	public List<T> backstageLoginCheck(String account, String password) {
		// TODO Auto-generated method stub
		return userDao.backstageLoginCheck(account, password);
	}
	
		@Override
	public boolean passwordCheck(String password_old) {
		return userDao.passwordCheck(password_old);
		/*
		if(userDao.passwordCheck(password_old)) {
			System.out.println("��ʼ����");
			((People)entity).setPassword(password_new);
			
			System.out.println("��ֵ�ɹ���������Ϊ��"+((People)entity).getPassword());
			
			userDao.updateUser((People)entity);//����������������ݿ⣬�ᷢ������a different object with the same identifier value was already associated with the session������ͬ��ʶ��ֵ�Ĳ�ͬ�����Ѿ���ûỰ�������
			System.out.println("���³ɹ�");
		}
		*/
	}
	
	
	@Override
	public void updateUser(T entity) {
		// TODO Auto-generated method stub
		userDao.updateUser(entity);
	}
	
	
}
