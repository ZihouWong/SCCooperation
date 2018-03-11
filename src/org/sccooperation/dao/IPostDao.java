package org.sccooperation.dao;

import java.util.List;

/**
 * Project:SCCooperation Comments:此类是标签操作接口
 *  JDK version used:JDK1.8 
 *  Author：blank700 Create Date：2017-12-13 Modified By： <修改人中文名或拼音缩写>
 * Modified Date:2017-12-13 <修改日期，格式:YYYY-MM-DD> Why & What is modified <修改原因描述>
 * Version:1.0
 */
public interface IPostDao<T>{

	
	
	/**
	 * 根据网页传过来的tagno，查询数据库Post表中tagno对应的方向
	 * 
	 * @param tagno?网页传来的tagno?
	 * @return 返回该用户信息
	 * @exception 暂时没做
	 */
	public List findpost(int tagno1,int tagno2,int tagno3);
	
	/**
	 * 根据网页传过来post的id，查询数据库Post表中其对应的项目
	 * 
	 * @param p_id网页传来的p_id
	 * @return 返回该用户信息
	 * @exception 暂时没做
	 */
	public List pidtofindpost(int post_id);
	
	/**
	 * 根据网页传过来的enterprise的id，查询数据库Post表中其对应的项目
	 * 
	 * @param enterprise_id网页传来的enterprise_id
	 * @return 返回该用户信息
	 * @exception 暂时没做
	 */
	public List eidtofindpostbypage(int enterprise_id,int pageNo);
	
	/**
	 * 根据网页传过来的enterprisesubuser的id，查询数据库Post表中其对应的项目
	 * 
	 * @param enterprisesubuser_id网页传来的enterprisesubuser_id
	 * @return 返回该用户信息
	 * @exception 暂时没做
	 */
	public List esuidtofindpostbypage(int enterprisesubuser_id,int pageNo);
	
	/**
	 * 根据网页传过来的数据信息插入到相关数据库
	 * 
	 * @param entity 泛型类，包含要注册的用户或者公司的信息
	 * @return void
	 * @exception 暂时没做
	 */
	public void insertPost(T entity);
	
	/**
	 * 根据网页传过来的数据信息更新相关数据库
	 * 
	 * @param entity 泛型类，包含要注册的用户或者公司的信息
	 * @return void
	 * @exception 暂时没做
	 */
	public void updatePost(T entity);

}
