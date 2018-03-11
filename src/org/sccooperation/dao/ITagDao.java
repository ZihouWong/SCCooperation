package org.sccooperation.dao;

import java.util.List;

/**
 * Project:SCCooperation Comments:此类是标签操作接口
 *  JDK version used:JDK1.8 
 *  Author：blank700 Create Date：2017-12-8 Modified By： <修改人中文名或拼音缩写>
 * Modified Date:2017-12-8 <修改日期，格式:YYYY-MM-DD> Why & What is modified <修改原因描述>
 * Version:1.0
 */
public interface ITagDao<T>{
	/**
	 * 根据网页传过来的tagno，查询数据库中tagno对应的方向
	 * 
	 * @param tagno网页传来的tagno
	 * @return 返回该用户信息
	 * @exception 暂时没做
	 */
	public List findtag(int tagno);

	/**
	 * 查找出所有的标签信息信息
	 * 
	 * @return 返回标签信息
	 * @exception 暂时没做
	 */
	public List findalltag();
}
