package org.sccooperation.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Project:SCCooperation Comments:此类是帖子操作接口
 *  JDK version used:JDK1.8 
 *  Author：WLNSSS Create Date：2017-9-27 Modified By： <修改人中文名或拼音缩写>
 * Modified Date: <修改日期，格式:YYYY-MM-DD> Why & What is modified <修改原因描述>
 * Version:1.0
 */
public interface INoteDao<T> {
	/**
	 * 保存到数据库
	 * 
	 * @param entity 要添加的帖子
	 * @return void
	 * @exception 暂时没做
	 */
	public void addNote(T entity);
	/**
	 * 根据页数查找数据库，每次23条记录
	 * 
	 * @param pageNo 页数
	 * @return 返回查询的结果集
	 * @exception 暂时没做
	 */
	public List<T> findAllNote(int pageNo);
	/**
	 * 查找数据库帖子总数
	 * 
	 * @return 返回记录数
	 * @exception 暂时没做
	 */
	public long findNoteCount(Class<T> entityClazz);
	/**
	 * 根据id查询数据库某个字段
	 * 
	 * @return 返回记录数
	 * @exception 暂时没做
	 */
	public T findById(Class<T> entityClazz, Serializable id);
	/**
	 * 保存回复到数据库
	 * 
	 * @param entity 要添加的帖子
	 * @return void
	 * @exception 暂时没做
	 */
	public void addReplyNote(T entity);
	/**
	 * 根据id查找相关的帖子回复
	 * 
	 * @param id 要查找回复的帖子
	 * @return List
	 * @exception 暂时没做
	 */
	public List findReplyNoteByPage(int pageNo,int id);
	/**
	 * 保存修改的内容
	 * 
	 * @param T 要保存的修改内容
	 * @return void
	 * @exception 暂时没做
	 */
     public void saveAlter(T entity);
     /**
 	 * 找出发帖最多的4个人
 	 * 
 	 * @param
 	 * @return 返回发帖最多三个人的信息
 	 * @exception 暂时没做
 	 */
     public List seeManyNotePeople();

	

}
