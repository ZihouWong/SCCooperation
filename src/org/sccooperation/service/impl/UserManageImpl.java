package org.sccooperation.service.impl;

import java.util.List;

import org.sccooperation.dao.IUserDao;
import org.sccooperation.service.UserManage;
/**
 * Project:SCCooperation Comments:此类是用户服务层接口实现类
 *  JDK version used:JDK1.8 
 *  Author：WLNSSS Create Date：2017-9-27 Modified By： <修改人中文名或拼音缩写>
 * Modified Date: <修改日期，格式:YYYY-MM-DD> Why & What is modified <修改原因描述>
 * Version:1.0
 */
public class UserManageImpl<T> implements UserManage<T> {
	/**该变量由spring装配，*/
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
