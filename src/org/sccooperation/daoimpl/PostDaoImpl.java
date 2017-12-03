package org.sccooperation.daoimpl;

import java.util.List;

import org.sccooperation.dao.IPostDao;

public class PostDaoImpl extends BaseDaoImpl implements IPostDao {

	@Override
	public List findJobByButtom(String buttom) {
		// TODO Auto-generated method stub
		return findBypage("from Post a", 0, 9, 9);
	}

}
