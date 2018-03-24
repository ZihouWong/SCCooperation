package org.sccooperation.service;

import java.util.List;

import org.sccooperation.dao.IUDao;

public interface UManage {
	public List loginCheck(String account,String password);
}
