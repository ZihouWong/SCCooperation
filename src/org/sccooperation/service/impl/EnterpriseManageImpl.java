package org.sccooperation.service.impl;

import java.util.List;

import org.sccooperation.dao.IEnterpriseDao;
import org.sccooperation.domain.Enterprise;
import org.sccooperation.service.EnterpriseManage;
/**
 * Project:SCCooperation Comments:��������ҵ�����ӿ�ʵ����
 *  JDK version used:JDK1.8 
 *  Author��blank700 Create Date��2017-12-23 Modified By�� <�޸�����������ƴ����д>
 * Modified Date: <�޸����ڣ���ʽ:YYYY-MM-DD> Why & What is modified <�޸�ԭ������>
 * Version:1.0
 */
public class EnterpriseManageImpl<T> implements EnterpriseManage<T> {
	/** �ñ�����springװ�䣬 */
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
