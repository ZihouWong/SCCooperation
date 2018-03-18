package org.sccooperation.dao;

import java.util.List;

import org.sccooperation.domain.People;

/**
 * Project:SCCooperation Comments:此类是用户操作接口
 *  JDK version used:JDK1.8 
 *  Author：WLNSSS Create Date：2017-9-27 Modified By： <修改人中文名或拼音缩写>
 * Modified Date: <修改日期，格式:YYYY-MM-DD> Why & What is modified <修改原因描述>
 * Version:1.0
 */
public interface IUserDao<T>{

	
	
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
	public void insertUser(T entity);
	
	/**
	 * 分页查找用户信息,一页12条
	 * 
	 * @param 
	 * @return list列表
	 * @exception 暂时没做
	 */
	
	
	
	/******************************************************WLNSSS**********************************/
	public List<T> selectAllUser(int pageNo);
	
	/**
  	 * 条件搜索帖子
  	 * 
  	 * @param 关键词
  	 * @return 搜索结果
  	 * @exception 暂时没做
  	 */
     public List<T> searchByPageNo(String keyword,int pageNo);
     
     /**
      *  后台用户登录
      *  
      *  @param account String 账号
      *  @param password String 密码
      *  @return 登录结果
      * */
     public List<T> backstageLoginCheck(String account,String password);
	 
	 	/**
	 * 根据网页传过来的数据信息更新相关数据库
	 * 
	 * @param entity 泛型类，包含要注册的用户或者公司的信息
	 * @return void
	 * @exception 暂时没做
	 */
	public void updateUser(T entity);

}
