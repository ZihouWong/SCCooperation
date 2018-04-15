package org.sccooperation.dao;

import java.util.List;

/**
 * 共有类接口
 * @author wlnsss
 * */
public interface ICommonDao<T> {

	/**
	 * 是否可用，可用不可用都取反
	 * @param table String 要操作的表名
	 * @param id int 要做操作的id
	 * @param state int 当前行的状态
	 * @return boolean 返回操作的结果
	 * @throws ClassNotFoundException 
	 * @throws Exception 
	 * */
	public boolean isEnable(String table,int id,String state) throws Exception;

	/**
	 * search,根据keyword查找数据库，并返回结果集
	 * @param table String 要查找的表名
	 * @param keyword String 搜索的关键字
	 * @param pageNo int 搜索第几页
	 * @return List 返回结果集
	 * */
	List<T> searchByPageNo(String table,String keyword, int pageNo);
}
