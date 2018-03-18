package org.sccooperation.service.impl;

import java.util.List;

import org.sccooperation.dao.IBackstageEnterprisesubuserDao;
import org.sccooperation.dao.IEnterpriseDao;
import org.sccooperation.service.EnterprisesubuserManage;

public class EnterprisesubuserManageImpl<T> implements EnterprisesubuserManage<T>{

	private IBackstageEnterprisesubuserDao<T> backstageEnterprisesubuserDao;
	
	@Override
	public List<T> findByPageNo(int pageNo) {
		// TODO Auto-generated method stub
		return backstageEnterprisesubuserDao.findByPageNo(pageNo);
	}
	
	public List<T> searchByPageNo(String keyword, int pageNo) {
		// TODO Auto-generated method stub
		return backstageEnterprisesubuserDao.searchByPageNo(keyword, pageNo);
	}

	public IBackstageEnterprisesubuserDao<T> getBackstageEnterprisesubuserDao() {
		return backstageEnterprisesubuserDao;
	}

	public void setBackstageEnterprisesubuserDao(IBackstageEnterprisesubuserDao<T> backstageEnterprisesubuserDao) {
		this.backstageEnterprisesubuserDao = backstageEnterprisesubuserDao;
	}

}
