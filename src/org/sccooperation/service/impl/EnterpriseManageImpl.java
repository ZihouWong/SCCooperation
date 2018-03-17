package org.sccooperation.service.impl;

import java.util.List;

import org.sccooperation.dao.IEnterpriseDao;
import org.sccooperation.dao.INoteDao;
import org.sccooperation.service.EnterpriseManage;

public class EnterpriseManageImpl<T> implements EnterpriseManage<T>{
	private IEnterpriseDao enterpriseDao;

	@Override
	public List<T> findByPageNo(int pageNo) {
		// TODO Auto-generated method stub
		return enterpriseDao.findByPageNo(pageNo);
	}

	public IEnterpriseDao getEnterpriseDao() {
		return enterpriseDao;
	}

	public void setEnterpriseDao(IEnterpriseDao enterpriseDao) {
		this.enterpriseDao = enterpriseDao;
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


}
