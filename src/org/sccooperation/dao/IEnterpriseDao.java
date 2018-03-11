package org.sccooperation.dao;

import java.util.List;

/**
 * Project:SCCooperation Comments:此类是企业操作接口
 *  JDK version used:JDK1.8 
 *  Author：bllank700 Create Date：2017-12-21 Modified By： <修改人中文名或拼音缩写>
 * Modified Date: <修改日期，格式:YYYY-MM-DD> Why & What is modified <修改原因描述>
 * Version:1.0
 */

public interface IEnterpriseDao<T> {
	/**
	 * 根据网页传过来的账号密码，验证数据库是否有此条记录进行登录
	 * 
	 * @param account  网页传来的账号
	 * @param password 网页传来的密码
	 * @return 返回该用户信息
	 * @exception 暂时没做
	 */
	public List loginCheck(String account,String password);

	/**
	 * 根据网页传过来的密码检查是否与用户密码一致
	 * 
	 * @param password String，用户的密码
	 * @return boolean
	 * @exception 暂时没做
	 */
	public boolean passwordCheck(String password);
	
	/**
	 * 根据网页传过来的数据信息插入到相关数据库
	 * 
	 * @param entity 泛型类，包含要注册的用户或者公司的信息
	 * @return void
	 * @exception 暂时没做
	 */
	public void insertEnterprise(T entity);
	
	/**
	 * 根据网页传过来的数据信息更新相关数据库
	 * 
	 * @param entity 泛型类，包含要注册的用户或者公司的信息
	 * @return void
	 * @exception 暂时没做
	 */
	public void updateEnterprise(T entity);
	
	/**
	 * 根据网页传过来的企业id查询相关的数据库
	 * 
	 * @param id 网页传来的企业id
	 * @return void
	 * @exception 暂时没做
	 */
	public List findEnterprise(int id);
}
