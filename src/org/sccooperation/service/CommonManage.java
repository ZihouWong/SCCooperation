package org.sccooperation.service;

import java.util.List;

public interface CommonManage<T> {

	public boolean isEnable(String table,int id,String state) throws Exception;
	
	public List<T> search(String table,String keyword,int pageNo);
}
