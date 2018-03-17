package org.sccooperation.dao;

import java.util.List;

/*
 * 后台公司子账户列表接口
 * 
 * */
public interface IBackstageEnterprisesubuserDao<T> {
	
	//根据页号查找公司子账户
	public List<T> findByPageNo(int pageNo);
	
	public List<T> searchByPageNo(String keyword, int pageNo);

}
