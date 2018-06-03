package org.sccooperation.service.impl;

import java.util.List;

import org.sccooperation.dao.IUserDao;
import org.sccooperation.domain.People;
import org.sccooperation.service.UserManage;
/**
 * Project:SCCooperation Comments:此类是用户服务层接口实现类
 *  JDK version used:JDK1.8 
 *  Author：WLNSSS Create Date：2017-9-27 Modified By：blank700 <修改人中文名或拼音缩写>
 * Modified Date:2017-11-30 <修改日期，格式:YYYY-MM-DD> Why & What is modified <修改原因描述>
 * Version:1.0
 */
public class UserManageImpl<T> implements UserManage<T> {
	/** 该变量由spring装配， */
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
			System.out.println("开始更新");
			((People)entity).setPassword(password_new);
			
			System.out.println("赋值成功，新密码为："+((People)entity).getPassword());
			
			userDao.updateUser((People)entity);//不能在这里更新数据库，会发生错误（a different object with the same identifier value was already associated with the session具有相同标识符值的不同对象已经与该会话相关联）
			System.out.println("更新成功");
		}
		*/
	}
	
	
	@Override
	public void updateUser(T entity) {
		// TODO Auto-generated method stub
		userDao.updateUser(entity);
	}
	
	
}
