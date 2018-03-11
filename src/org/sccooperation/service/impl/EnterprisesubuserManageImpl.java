package org.sccooperation.service.impl;

import java.util.List;

import org.sccooperation.dao.IEnterprisesubuserDao;
import org.sccooperation.domain.Enterprisesubuser;
import org.sccooperation.service.EnterprisesubuserManage;
/**
 * Project:SCCooperation Comments:��������ҵ���û������ӿ�ʵ����
 *  JDK version used:JDK1.8 
 *  Author��blank700 Create Date��2018-01-18 Modified By�� <�޸�����������ƴ����д>
 * Modified Date: <�޸����ڣ���ʽ:YYYY-MM-DD> Why & What is modified <�޸�ԭ������>
 * Version:1.0
 */
public class EnterprisesubuserManageImpl<T> implements EnterprisesubuserManage<T> {
	/** �ñ�����springװ�䣬 */
	private IEnterprisesubuserDao enterprisesubuserDao;

	public IEnterprisesubuserDao getEnterprisesubuserDao() {
		return enterprisesubuserDao;
	}

	public void setEnterprisesubuserDao(IEnterprisesubuserDao enterprisesubuserDao) {
		this.enterprisesubuserDao = enterprisesubuserDao;
	}

	@Override
	public List loginCheck(String account, String password) {
		System.out.println("start logincheck");
		return enterprisesubuserDao.loginCheck(account, password);
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
}
