package org.sccooperation.service.impl;

import java.util.List;

import org.sccooperation.dao.IUDao;
import org.sccooperation.service.UManage;

public class UManageImpl implements UManage {
private IUDao iu;
	public List loginCheck(String account, String password) {
		// TODO Auto-generated method stub
		System.out.println("..............");
		return iu.loginCheck(account, password);
	}

}
