package org.sccooperation.dao;

import java.util.List;

public interface IPostDao<T> {
/********************************* 黄智豪 ******************************/
	public List findJobByButton(int pageNo, String buttom);

	public List findJobByPageNo(int pageNo);

	public List showMainJob(int pageNo, int button);

	public List showHotJob(int pageNo, int button);

	public List showJobInfo(int jobId);

	public long getPostNum(Class entityClazz);

	public List getOtherJob(int tagNo);		
	
	
	
	
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
