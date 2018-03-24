package org.sccooperation.daoimpl;

import java.util.List;

import org.sccooperation.dao.IUDao;

public class IUDaoImpl extends BaseDaoImpl implements IUDao{

	@Override
	public List loginCheck(String account, String password) {
		// TODO Auto-generated method stub
		return find("from P where account = ?0 and password = ?1",account,password);
	}

}
