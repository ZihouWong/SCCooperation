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
