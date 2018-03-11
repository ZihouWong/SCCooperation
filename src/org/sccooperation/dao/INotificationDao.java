package org.sccooperation.dao;

import java.util.List;

/**
 * Project:SCCooperation Comments:此类是企业操作接口
 *  JDK version used:JDK1.8 
 *  Author：bllank700 Create Date：2018-2-3 Modified By： <修改人中文名或拼音缩写>
 * Modified Date: <修改日期，格式:YYYY-MM-DD> Why & What is modified <修改原因描述>
 * Version:1.0
 */

public interface INotificationDao<T> {
	/**
	 * 根据网页传过来的数据信息更新相关数据库
	 * 
	 * @param entity 泛型类，包含要注册的用户或者公司的信息
	 * @return void
	 * @exception 暂时没做
	 */
	public void insertNotification(T entity);
	
	/**
	 *查询数据库Notification表中的通知
	 * 
	 * @param pageNo网页传来的页号
	 * @return 返回该用户信息
	 * @exception 暂时没做
	 */
	public List findnotificationbypage(int pageNo);
}
