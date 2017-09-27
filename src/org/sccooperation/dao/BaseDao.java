package org.sccooperation.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Project:SCCooperation Comments:此类是数据库操作的基础接口，目的是减少代码的冗余 JDK version
 * used:JDK1.8 Author：WLNSSS Create Date：2017-9-27 Modified By： <修改人中文名或拼音缩写>
 * Modified Date: <修改日期，格式:YYYY-MM-DD> Why & What is modified <修改原因描述>
 * Version:1.0
 */

public interface BaseDao<T> {
	/**
	 * 根据id获取数据
	 * 
	 * @param entityClazz  需要根据id获取数据的类类型
	 * @param id  需要查找的id
	 * @return 根据泛型返回类型
	 * @exception 暂时没做
	 */
	T get(Class<T> entityClazz, Serializable id);

	/**
	 * 保存数据到数据库
	 * 
	 * @param entity  需要保存的类
	 * @return serializable
	 * @exception 暂时没做
	 */
	Serializable save(T entity);
	/**
	 * 更新数据
	 * 
	 * @param entity  需要更新的持久化类
	 * @return void
	 * @exception 暂时没做
	 */
	void update(T entity);
	/**
	 * 删除数据库表
	 * 
	 * @param entity  需要删除的持久化类
	 * @return void
	 * @exception 暂时没做
	 */
	void delete(T entity);
	/**
	 * 根据id删除数据
	 * 
	 * @param entityClazz  需要根据id删除数据的类类型
	 * @param id  需要查找的id
	 * @return void
	 * @exception 暂时没做
	 */
	void delete(Class<T> entityClazz, Serializable id);
	/**
	 * 查询某个表的全部内容
	 * 
	 * @param class1 需要查询的表映射的持久化类类类型
	 * @return 返回列表类型结果集
	 * @exception 暂时没做
	 */
	List<T> findAll(Class<T> class1);
	/**
	 * 查询某个表的总数据量
	 * 
	 * @param entityClazz 需要查询的表映射的持久化类类类型
	 * @return 数据总量
	 * @exception 暂时没做
	 */
	long findCount(Class<T> entityClazz);
}
