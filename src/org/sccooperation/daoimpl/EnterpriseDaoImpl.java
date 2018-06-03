package org.sccooperation.daoimpl;

import java.util.List;

import org.sccooperation.dao.IEnterpriseDao;
import org.sccooperation.domain.Enterprise;
/**
 * Project:SCCooperation Comments:´ËÀàÊÇÆóÒµ²Ù×÷½Ó¿ÚÊµÏÖÀà
 *  JDK version used:JDK1.8 
 *  Author£ºblank700 Create Date£º2017-12-23 Modified By£º <ÐÞ¸ÄÈËÖÐÎÄÃû»òÆ´ÒôËõÐ´>
 * Modified Date: <ÐÞ¸ÄÈÕÆÚ£¬¸ñÊ½:YYYY-MM-DD> Why & What is modified <ÐÞ¸ÄÔ­ÒòÃèÊö>
 * Version:1.0
 */


public class EnterpriseDaoImpl<T> extends BaseDaoImpl<T> implements IEnterpriseDao<T> {
  /*
   * ¸¸½Ó¿ÚÓÐËµÃ÷´Ë´¦²»×¸Êö
  */  
	@Override
	public List<T> findByPageNo(int pageNo) {
		// TODO Auto-generated method stub
		return findBypage("from Enterprise", pageNo, 10,10);
	}

	@Override
	public List<T> searchByPageNo(String keyword, int pageNo) {
		// TODO Auto-generated method stub
		return findByPage("from Enterprise as e where e.ename like ?0 or e.place like ?1 or e.property like ?2 or e.vocation like ?3 or e.account like ?4 or e.contact like ?5 order by id desc", pageNo, 10,10, "%"+keyword+"%","%"+keyword+"%","%"+keyword+"%","%"+keyword+"%","%"+keyword+"%","%"+keyword+"%");
	}
	
		@Override
	public List findEnterpriseByPageNo(int pageNo) {
		// 主页-显示企业
		return findBypage("from Enterprise", pageNo, 16, 16);
	}

	@Override
	public List findEnterpriseTName(int enterpriseNo) {
		// TODO Auto-generated method stub
	
		return find("from Tag p where p.id in (select distinct tagno from Post where enterprise_id.id=?0)", enterpriseNo);
		//得到项目id
		//要找同一公司下的项目所有标签。
		//现有公司的id
		//在post表中 得到 同一公司的tagID find("from Post where enterprise_id.id=?0 and grand by tagid", enterpriseNo);
		//再从Tag表中 得到tagname find("select tagname from tag where tagid in (select tagid from Post where enterprise_id.id=?0 and grand by tagid)", enterpriseNo);
	}

	// 躬行课堂：
	@Override
	public List findPartner(int pageNo) {
		// 主页-合作伙伴
		return find("from Enterprise");
	}
	
	  /*
   * ¸¸½Ó¿ÚÓÐËµÃ÷´Ë´¦²»×¸Êö
  */  
	@Override
	public List loginCheck(String account, String password) {
		List<T> ep=find("from Enterprise where account =?0 and password = ?1", account,password);
		if(!ep.isEmpty())
		{
			return ep;
		}
		return ep;
	}

	@Override
	public boolean passwordCheck(String password) {
		// TODO Auto-generated method stub
		List<T> rp = find("from Enterprise where password =?0", password);
		if (!rp.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public void insertEnterprise(T entity) {
		// TODO Auto-generated method stub
		save(entity);
	}

	@Override
	public void updateEnterprise(T entity) {
		// TODO Auto-generated method stub
		update(entity);
	}
	
	@Override
	public List findEnterprise(int id) {
		List<T> ep=find("from Enterprise where id =?0", id);
		return ep;
	}

}
