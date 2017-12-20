package org.sccooperation.daoimpl;

import java.util.List;

import org.sccooperation.dao.IPostDao;

public class PostDaoImpl extends BaseDaoImpl implements IPostDao {

	@Override
	public List findJobByButtom(int pageNo, String button) {

		return findByPage("from Post where tagNo= ?0", pageNo, 18, 18, button); 

		//		return findBypage("from Post a where ", 0, 9, 9);
	}
	
	public List findJobByPageNo(int pageNo) {

		return findBypage("from Post", pageNo, 24, 24);

	}
}
  