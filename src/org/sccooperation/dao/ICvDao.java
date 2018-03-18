package org.sccooperation.dao;

import java.util.List;

/**
 * Project:SCCooperation Comments:此类是简历操作接口
 *  JDK version used:JDK1.8 
 *  Author：WLNSSS Create Date：2017-11-23 Modified By：blank700 <修改人中文名或拼音缩写>
 * Modified Date: <修改日期，格式:2017-11-23> Why & What is modified <修改原因描述>
 * Version:1.0
 */

public interface ICvDao<T> {
	/**
	 * 根据网页传过来用户所对应简历表的id，查询简历表的信息
	 * 
	 * @param cvid  网页传来的简历的id 
	 * @return 返回该用户信息
	 * @exception 暂时没做
	 */
	public List findCvInformation(int cvid);
	
	/**
	 * 根据网页传过来的数据信息更新相关数据库
	 * 
	 * @param entity 泛型类，包含要注册的用户或者公司的信息
	 * @return void
	 * @exception 暂时没做
	 */
	public void updateCv(T entity);
}
