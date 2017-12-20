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
	
	/*黄智豪*/
	public List findJobByButtom(int pageNo, String button) {
		// TODO Auto-generated method stub
		return postDao.findJobByButtom(pageNo, button);
	}

	@Override
	public List findJobByPageNo(int pageNo) {
		// TODO Auto-generated method stub
		return postDao.findJobByPageNo(pageNo);
	}
	
}
