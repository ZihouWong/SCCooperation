package org.sccooperation.service.impl;

import java.util.List;

import org.sccooperation.dao.IEnterpriseDao;
import org.sccooperation.domain.Enterprise;
import org.sccooperation.service.EnterpriseManage;
/**
 * Project:SCCooperation Comments:此类是企业服务层接口实现类
 *  JDK version used:JDK1.8 
 *  Author：blank700 Create Date：2017-12-23 Modified By： <修改人中文名或拼音缩写>
 * Modified Date: <修改日期，格式:YYYY-MM-DD> Why & What is modified <修改原因描述>
 * Version:1.0
 */
public class EnterpriseManageImpl<T> implements EnterpriseManage<T> {
	/** 该变量由spring装配， */
	private IEnterpriseDao enterpriseDao;

	public IEnterpriseDao getEnterpriseDao() {
		return enterpriseDao;
	}

	public void setEnterpriseDao(IEnterpriseDao enterpriseDao) {
		this.enterpriseDao = enterpriseDao;
	}

	@Override
	public List loginCheck(String account, String password) {
		System.out.println("start logincheck");
		return enterpriseDao.loginCheck(account, password);
	}
	
	@Override
	public boolean passwordCheck(String password_old) {
		return enterpriseDao.passwordCheck(password_old);
	}
	
	@Override
	public void insertEnterprise(T entity) {
		// TODO Auto-generated method stub
		enterpriseDao.insertEnterprise(entity);
	}
	
	@Override
	public void updateEnterprise(T entity) {
		// TODO Auto-generated method stub
		enterpriseDao.updateEnterprise(entity);
	}
	
	@Override
	public List findEnterprise(int id) {
		return enterpriseDao.findEnterprise(id);
	}
}
