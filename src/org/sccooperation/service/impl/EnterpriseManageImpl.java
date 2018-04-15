package org.sccooperation.service.impl;

import java.util.List;

import org.sccooperation.dao.IEnterpriseDao;
import org.sccooperation.dao.INoteDao;
import org.sccooperation.service.EnterpriseManage;
import org.sccooperation.domain.Enterprise;

public class EnterpriseManageImpl<T> implements EnterpriseManage<T>{
	private IEnterpriseDao enterpriseDao;

	public IEnterpriseDao getEnterpriseDao() {
		return enterpriseDao;
	}

	public void setEnterpriseDao(IEnterpriseDao enterpriseDao) {
		this.enterpriseDao = enterpriseDao;
	}
	
		@Override
	public List<T> findByPageNo(int pageNo) {
		// TODO Auto-generated method stub
		return enterpriseDao.findByPageNo(pageNo);
	}

	public List<T> searchByPageNo(String keyword, int pageNo) {
		// TODO Auto-generated method stub
		return enterpriseDao.searchByPageNo(keyword, pageNo);
	}
	
	/* ���Ǻ� */
	
		
	// ���˹ȣ�
	@Override
	public List findEnterpriseByPageNo(int pageNo) {
		// ��ҳ-��ʾ���й�˾
		return enterpriseDao.findEnterpriseByPageNo(pageNo);
	}
	
	@Override
	public List showETagName(int enterpriseNo) {
		// ������ϸҳ��-�����ı�ǩ����
		return enterpriseDao.findEnterpriseTName(enterpriseNo);
	}

	// ���п��ã�
	
	@Override
	public List findPartner(int pageNo) {
		// ��ҳ-�������
		return enterpriseDao.findPartner(pageNo);
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
