package org.sccooperation.service.impl;

import java.util.List;

import org.sccooperation.dao.IBackstagePostDao;
import org.sccooperation.dao.ICommonDao;
import org.sccooperation.service.CommonManage;

public class CommonManageImpl<T> implements CommonManage<T> {

	private ICommonDao<T> commonDao;
	
	
	@Override
	public boolean isEnable(String table, int id, String state) throws Exception {
		// TODO Auto-generated method stub
		return commonDao.isEnable(table, id, state);
	}
	
	
	
	//setter and getter
	public ICommonDao<T> getCommonDao() {
		return commonDao;
	}
	public void setCommonDao(ICommonDao<T> commonDao) {
		this.commonDao = commonDao;
	}



	@Override
	public List<T> search(String table,String keyword, int pageNo) {
		// TODO Auto-generated method stub
		return commonDao.searchByPageNo(table,keyword, pageNo);
	}

}
