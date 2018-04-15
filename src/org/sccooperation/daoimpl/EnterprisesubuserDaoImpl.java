package org.sccooperation.daoimpl;

import java.util.List;

import org.sccooperation.dao.IBackstageEnterprisesubuserDao;
import org.sccooperation.dao.IEnterprisesubuserDao;
import org.sccooperation.domain.Enterprisesubuser;
/**
 * Project:SCCooperation Comments:´ËÀàÊÇÆóÒµ²Ù×÷½Ó¿ÚÊµÏÖÀà
 *  JDK version used:JDK1.8 
 *  Author£ºblank700 Create Date£º2017-12-23 Modified By£º <ÐÞ¸ÄÈËÖÐÎÄÃû»òÆ´ÒôËõÐ´>
 * Modified Date: <ÐÞ¸ÄÈÕÆÚ£¬¸ñÊ½:YYYY-MM-DD> Why & What is modified <ÐÞ¸ÄÔ­ÒòÃèÊö>
 * Version:1.0
 */

public class EnterprisesubuserDaoImpl<T> extends BaseDaoImpl<T> implements IBackstageEnterprisesubuserDao<T>,IEnterprisesubuserDao<T> {

	@Override
	public List<T> findByPageNo(int pageNo) {
		// TODO Auto-generated method stub
		return findBypage("from Enterprisesubuser", pageNo, 10,10);
	}
	
	public List<T> searchByPageNo(String keyword, int pageNo) {
		// TODO Auto-generated method stub
		return findByPage("from Enterprisesubuser as e where e.ename like ?0 or e.nickname like ?1 or e.realname like ?2 or e.tel like ?3 or e.account like ?4 or e.mail like ?5 or e.qq like ?6 order by id desc", pageNo, 10,10, "%"+keyword+"%","%"+keyword+"%","%"+keyword+"%","%"+keyword+"%","%"+keyword+"%","%"+keyword+"%","%"+keyword+"%");
	}
	
		@Override
	public List loginCheck(String account, String password) {
		List<T> ep=find("from Enterprisesubuser where account =?0 and password = ?1", account,password);
		if(!ep.isEmpty())
		{
			return ep;
		}
		return ep;
	}

	@Override
	public boolean passwordCheck(String password) {
		// TODO Auto-generated method stub
		List<T> rp = find("from Enterprisesubuser where password =?0", password);
		if (!rp.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public void insertEnterprisesubuser(T entity) {
		// TODO Auto-generated method stub
		save(entity);
	}

	@Override
	public void updateEnterprisesubuser(T entity) {
		// TODO Auto-generated method stub
		System.out.println("start update");
		update(entity);
	}
	
	@Override
	public List findallenterprisesubuser() {
		return find("from Enterprisesubuser");
	}
	
	@Override
	public List esuidtofindenterprisesubuser(int esu_id) {
		return find("from Enterprisesubuser where id =?0", esu_id);
	}

}
