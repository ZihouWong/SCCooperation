package org.sccooperation.daoimpl;

import java.util.List;

import org.sccooperation.dao.IEnterprisesubuserDao;
import org.sccooperation.domain.Enterprisesubuser;
/**
 * Project:SCCooperation Comments:此类是企业操作接口实现类
 *  JDK version used:JDK1.8 
 *  Author：blank700 Create Date：2017-12-23 Modified By： <修改人中文名或拼音缩写>
 * Modified Date: <修改日期，格式:YYYY-MM-DD> Why & What is modified <修改原因描述>
 * Version:1.0
 */


public class EnterprisesubuserDaoImpl<T> extends BaseDaoImpl<T> implements IEnterprisesubuserDao<T> {
  /*
   * 父接口有说明此处不赘述
  */  
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
