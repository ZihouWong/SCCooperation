package org.sccooperation.daoimpl;

import java.util.List;

import org.sccooperation.dao.IEnterpriseDao;
import org.sccooperation.domain.Enterprise;
/**
 * Project:SCCooperation Comments:此类是企业操作接口实现类
 *  JDK version used:JDK1.8 
 *  Author：blank700 Create Date：2017-12-23 Modified By： <修改人中文名或拼音缩写>
 * Modified Date: <修改日期，格式:YYYY-MM-DD> Why & What is modified <修改原因描述>
 * Version:1.0
 */


public class EnterpriseDaoImpl<T> extends BaseDaoImpl<T> implements IEnterpriseDao<T> {
  /*
   * 父接口有说明此处不赘述
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
