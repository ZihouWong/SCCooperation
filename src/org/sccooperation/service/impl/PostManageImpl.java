package org.sccooperation.service.impl;

import java.util.List;

import org.sccooperation.dao.IPostDao;
import org.sccooperation.service.PostManage;

public class PostManageImpl implements PostManage{
	private IPostDao postDao;
	
	public List findJobByButtom(String buttom) {
		// TODO Auto-generated method stub
		return postDao.findJobByButtom(buttom);
	}

	
}
