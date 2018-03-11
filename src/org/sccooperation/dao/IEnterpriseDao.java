package org.sccooperation.dao;

import java.util.List;

public interface IEnterpriseDao {
/*******************************黄智豪******************************/
	public List findEnterpriseByPageNo(int pageNo);

	public List findEnterpriseTName(int enterpriseNo);

	public List findPartner(int pageNo);
	
}
