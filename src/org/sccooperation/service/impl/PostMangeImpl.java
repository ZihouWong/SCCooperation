package org.sccooperation.service.impl;

import java.util.List;

import org.sccooperation.dao.IPostDao;
import org.sccooperation.service.PostMange;

public class PostMangeImpl implements PostMange{
	private IPostDao postDao;
	
	@Override
	public List findJobByButtom(String buttom) {
		// TODO Auto-generated method stub
		return postDao.findJobByButtom(buttom);
	}

	
}
