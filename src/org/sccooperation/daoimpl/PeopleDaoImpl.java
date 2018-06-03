package org.sccooperation.daoimpl;

import java.util.List;

import org.sccooperation.dao.IPeopleDao;

public class PeopleDaoImpl extends BaseDaoImpl implements IPeopleDao {

	@Override
	public List findTeacherInfo(int peopleid) {
		// 详细页面-讲师信息
		return find("from People where id=?0", peopleid);
	}
}
