package org.sccooperation.dao;

import java.util.List;

/**
 * Project:SCCooperation Comments:此类是企业子用户操作接口
 *  JDK version used:JDK1.8 
 *  Author：bllank700 Create Date：2018-01-18 Modified By： <修改人中文名或拼音缩写>
 * Modified Date: <修改日期，格式:YYYY-MM-DD> Why & What is modified <修改原因描述>
 * Version:1.0
 */

public interface IEnterprisesubuserDao<T> {
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
	public void insertEnterprisesubuser(T entity);
	
	/**
	 * 根据网页传过来的数据信息更新相关数据库
	 * 
	 * @param entity 泛型类，包含要注册的用户或者公司的信息
	 * @return void
	 * @exception 暂时没做
	 */
	public void updateEnterprisesubuser(T entity);
	
	/**
	 * 查找出所有的企业子用户信息
	 * 
	 * @return void
	 * @exception 暂时没做
	 */
	public List findallenterprisesubuser();
	
	/**
	 * 根据网页传来的企业子用户的id查找出相应的企业子用户的信息
	 * 
	 * @param esu_id网页传来的esu_id?
	 * @return void
	 * @exception 暂时没做
	 */
	public List esuidtofindenterprisesubuser(int esu_id);
}
