package org.sccooperation.service.impl;

import java.util.List;

import org.sccooperation.dao.IPostDao;
import org.sccooperation.service.PostManage;

public class PostManageImpl implements PostManage{
	private IPostDao postDao;
	
	public IPostDao getPostDao() {
		return postDao;
	}

	public void setPostDao(IPostDao postDao) {
		this.postDao = postDao;
	}
	
	public List findJobByButtom(String buttom) {
		// TODO Auto-generated method stub
		return postDao.findJobByButtom(buttom);
	}

	@Override
	public List findAllJob() {
		// TODO Auto-generated method stub
		return postDao.findAllJob();
	}

	@Override
	public List findJobByPageNo(int pageNo) {
		// TODO Auto-generated method stub
		return postDao.findJobByPageNo(pageNo);
	}

	
}
