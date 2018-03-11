package org.sccooperation.service.impl;

import java.util.List;

import org.sccooperation.dao.IPeopleDao;
import org.sccooperation.service.PeopleManage;

public class PeopleManageImpl implements PeopleManage{
	private IPeopleDao peopleDao;

	public IPeopleDao getPeopleDao() {
		return peopleDao;
	}

	public void setPeopleDao(IPeopleDao peopleDao) {
		this.peopleDao = peopleDao;
	}

	@Override
	public List findTeacherInfo(int peopleid) {
		// 详细页面-讲师信息
		return peopleDao.findTeacherInfo(peopleid);
	}
	
}
