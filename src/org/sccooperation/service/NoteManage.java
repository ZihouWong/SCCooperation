package org.sccooperation.service;

import java.io.Serializable;
import java.util.List;

/**
 * Project:SCCooperation Comments:此类是帖子服务层接口
 *  JDK version used:JDK1.8 
 *  Author：WLNSSS Create Date：2017-9-27 Modified By： <修改人中文名或拼音缩写>
 * Modified Date: <修改日期，格式:YYYY-MM-DD> Why & What is modified <修改原因描述>
 * Version:1.0
 */
public interface NoteManage<T> {
	/*
	 *这里暂时和dao层差不多，类似于代理类，调用dao层的方法实现 
	 */
	public void addNote(T entity);
	
	public List<T> findAllNote(int pageNo);
	
	public long findNoteCount(Class<T> entityClazz);
	
	public T findById(Class<T> entityClazz, Serializable id);
	
	public void addReplyNote(T entity);
	
	public List findReplyNoteByPage(int pageNo,int id);
	
	public void saveAlter(T entity);
	
	public List seeManyNotePeople();
	
	public List<T> searchByPageNo(String keyword,int pageNo);
	
	public List<T> backstageFindAllReplyNote(int pageNo);
	


}
