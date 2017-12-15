package org.sccooperation.service.impl;

import java.util.List;

import org.sccooperation.dao.IEnterpriseDao;
import org.sccooperation.service.EnterpriseManage;

public class EnterpriseManageImpl implements EnterpriseManage{
	private IEnterpriseDao enterpriseDao;


	@Override
	public List findEnterpriseByPageNo(int pageNo) {
		// TODO Auto-generated method stub
		return enterpriseDao.findEnterpriseByPageNo(pageNo);
	}


	public IEnterpriseDao getEnterpriseDao() {
		return enterpriseDao;
	}


	public void setEnterpriseDao(IEnterpriseDao enterpriseDao) {
		this.enterpriseDao = enterpriseDao;
	}

}
