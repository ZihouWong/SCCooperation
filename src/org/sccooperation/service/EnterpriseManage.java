package org.sccooperation.service;

import java.util.List;

import org.sccooperation.domain.Enterprise;

/**
 * Project:SCCooperation Comments:此类是企业服务层接口
 *  JDK version used:JDK1.8 
 *  Author：blank700 Create Date：2017-12-23 Modified By： <修改人中文名或拼音缩写>
 * Modified Date: <修改日期，格式:YYYY-MM-DD> Why & What is modified <修改原因描述>
 * Version:1.0
 */
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
	
		public List loginCheck(String account,String password);
	public boolean passwordCheck(String password_old);
	public void insertEnterprise(T entity);
	public void updateEnterprise(T entity);
	public List findEnterprise(int id);
}
