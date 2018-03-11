package org.sccooperation.service;

import java.util.List;

import org.sccooperation.domain.Enterprisesubuser;

/**
 * Project:SCCooperation Comments:此类是企业子用户服务层接口
 *  JDK version used:JDK1.8 
 *  Author：blank700 Create Date：2018-01-18 Modified By： <修改人中文名或拼音缩写>
 * Modified Date: <修改日期，格式:YYYY-MM-DD> Why & What is modified <修改原因描述>
 * Version:1.0
 */
public interface EnterprisesubuserManage<T> {
	/*
	 *这里暂时和dao层差不多，类似于代理类，调用dao层的方法实现 
	 */
	public List loginCheck(String account,String password);
	public boolean passwordCheck(String password_old);
	public void insertEnterprisesubuser(T entity);
	public void updateEnterprisesubuser(T entity);
	public List findallenterprisesubuser();
	public List esuidtofindenterprisesubuser(int esu_id);
}
