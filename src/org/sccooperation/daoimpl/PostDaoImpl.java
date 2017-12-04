package org.sccooperation.daoimpl;

import java.util.List;

import org.sccooperation.dao.IPostDao;

public class PostDaoImpl extends BaseDaoImpl implements IPostDao {

	@Override
	public List findJobByButtom(String buttom) {
		
		List req = find("from Post a,Tag b where .tagNo = tagName = ?0 ", buttom);
		
		return req; 
		
//		return findBypage("from Post a where ", 0, 9, 9);
	}

}
