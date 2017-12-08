package org.sccooperation.daoimpl;

import java.util.List;

import org.sccooperation.dao.IPostDao;

public class PostDaoImpl extends BaseDaoImpl implements IPostDao {

	@Override
	public List findJobByButtom(String buttom) {
		
		List req = find("from Post a,Tag b where tagNo = ?0", buttom);
		
		return req; 
		
//		return findBypage("from Post a where ", 0, 9, 9);
	}

	@Override
	public List findAllJob() {
		// TODO Auto-generated method stub
		List req = find("from Post");
		
		return req;
	}

	
	public List findJobByPageNo(int pageNo) {
		
	
		return findBypage("from Post", pageNo, 18, 18);
		
	}
}
