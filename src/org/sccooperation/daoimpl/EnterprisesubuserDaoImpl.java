package org.sccooperation.daoimpl;

import java.util.List;

import org.sccooperation.dao.IBackstageEnterprisesubuserDao;
import org.sccooperation.dao.IEnterprisesubuserDao;
import org.sccooperation.domain.Enterprisesubuser;
/**
 * Project:SCCooperation Comments:�0�7�0�9�0�8���0�8�0�5�0�4���0�6�0�8�0�5�0�2���0�5�0�7�0�7�0�3�0�8�0�8�0�3�0�0�0�8��
 *  JDK version used:JDK1.8 
 *  Author�0�5�0�2blank700 Create Date�0�5�0�22017-12-23 Modified By�0�5�0�2 <�0�4�0�7�0�0�0�2�0�6�0�9�0�0�0�4�0�2�0�2�0�1�0�4�0�3���0�4�0�7�0�6�0�0�0�9�0�1�0�4�0�7>
 * Modified Date: <�0�4�0�7�0�0�0�2�0�6�0�9�0�4�0�3�0�5�0�1�0�0�0�9�0�8�0�5:YYYY-MM-DD> Why & What is modified <�0�4�0�7�0�0�0�2�0�8�0�2�0�6���0�1���0�8�0�2>
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
