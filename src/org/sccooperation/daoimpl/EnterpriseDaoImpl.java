package org.sccooperation.daoimpl;

import java.util.List;

import org.sccooperation.dao.IEnterpriseDao;

public class EnterpriseDaoImpl extends BaseDaoImpl implements IEnterpriseDao {
	public List findEnterpriseByPageNo(int pageNo) {

		return findBypage("from Enterprise", pageNo, 16, 16);
	}


}
