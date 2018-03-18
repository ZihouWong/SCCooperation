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
	
	/* 黄智豪 */
	
		
	// 创兴谷：
	@Override
	public List findEnterpriseByPageNo(int pageNo) {
		// 主页-显示所有公司
		return enterpriseDao.findEnterpriseByPageNo(pageNo);
	}
	
	@Override
	public List showETagName(int enterpriseNo) {
		// 工作详细页面-所属的标签名字
		return enterpriseDao.findEnterpriseTName(enterpriseNo);
	}

	// 躬行课堂：
	
	@Override
	public List findPartner(int pageNo) {
		// 主页-合作伙伴
		return enterpriseDao.findPartner(pageNo);
	}


}
