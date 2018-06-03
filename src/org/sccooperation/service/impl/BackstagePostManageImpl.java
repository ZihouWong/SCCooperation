package org.sccooperation.service.impl;

import java.util.List;

import org.sccooperation.dao.IBackstagePostDao;
import org.sccooperation.dao.IEnterpriseDao;
import org.sccooperation.service.BackstagePostManage;
import org.sccooperation.service.EnterpriseManage;
import org.sccooperation.service.EnterprisesubuserManage;

/*
 * 
 * */
public class BackstagePostManageImpl<T> implements BackstagePostManage<T> {
	private IBackstagePostDao backstagePostDao;
	
	@Override
	public List<T> findByPageNo(int pageNo) {
		// TODO Auto-generated method stub
		return backstagePostDao.findByPageNo(pageNo);
	}

	public IBackstagePostDao getBackstagePostDao() {
		return backstagePostDao;
	}

	public void setBackstagePostDao(IBackstagePostDao backstagePostDao) {
		this.backstagePostDao = backstagePostDao;
	}
	
	public List<T> searchByPageNo(String keyword, int pageNo) {
		// TODO Auto-generated method stub
		return backstagePostDao.searchByPageNo(keyword, pageNo);
	}

}
