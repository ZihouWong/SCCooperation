package org.sccooperation.service.impl;

import java.util.List;

import org.sccooperation.dao.IBackstageEnterprisesubuserDao;
import org.sccooperation.dao.IEnterpriseDao;
import org.sccooperation.service.EnterprisesubuserManage;
import org.sccooperation.dao.IEnterprisesubuserDao;
import org.sccooperation.domain.Enterprisesubuser;

public class EnterprisesubuserManageImpl<T> implements EnterprisesubuserManage<T>{
	
	private IEnterprisesubuserDao<T> enterprisesubuserDao;
	
	public IEnterprisesubuserDao<T> getEnterprisesubuserDao() {
		return enterprisesubuserDao;
	}

	public void setEnterprisesubuserDao(IEnterprisesubuserDao<T> enterprisesubuserDao) {
		this.enterprisesubuserDao = enterprisesubuserDao;
	}

	@Override
	public List<T> findByPageNo(int pageNo) {
		// TODO Auto-generated method stub
		return enterprisesubuserDao.findByPageNo(pageNo);
	}
	
	public List<T> searchByPageNo(String keyword, int pageNo) {
		// TODO Auto-generated method stub
		return enterprisesubuserDao.searchByPageNo(keyword, pageNo);
	}
	
		@Override
	public boolean passwordCheck(String password_old) {
		return enterprisesubuserDao.passwordCheck(password_old);
	}
	
	@Override
	public void insertEnterprisesubuser(T entity) {
		// TODO Auto-generated method stub
		enterprisesubuserDao.insertEnterprisesubuser(entity);
	}
	
	@Override
	public void updateEnterprisesubuser(T entity) {
		// TODO Auto-generated method stub
		enterprisesubuserDao.updateEnterprisesubuser(entity);
	}
	
	@Override
	public List findallenterprisesubuser() {
		System.out.println("start findallenterprisesubuser");
		return enterprisesubuserDao.findallenterprisesubuser();
	}
	
	@Override
	public List esuidtofindenterprisesubuser(int esu_id) {
		System.out.println("start esuidtofindenterprisesubuser");
		return enterprisesubuserDao.esuidtofindenterprisesubuser(esu_id);
	}

	@Override
	public List loginCheck(String account, String password) {
		// TODO Auto-generated method stub
		return enterprisesubuserDao.loginCheck(account, password);
	}


}
