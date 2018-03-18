package org.sccooperation.service;

import java.util.List;

/*
 * 企业管理服务层
 * @author WLNSSS
 * @time 2018.1.17
 * */
public interface EnterpriseManage<T> {
	/*
	 * 根据页数获取数据
	 * @param int pageNo 页数
	 * @return List 返回查询到的结果集
	 * */
	public List<T> findByPageNo(int pageNo);
	
	public List<T> searchByPageNo(String keyword, int pageNo);

	public List findEnterpriseByPageNo(int pageNo);

	public List showETagName(int JobNo);

	public List findPartner(int pageNo);
}
