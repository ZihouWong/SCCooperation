package org.sccooperation.service;

import java.io.Serializable;
import java.util.List;

/**
 * Project:SCCooperation Comments:���������ӷ����ӿ�
 *  JDK version used:JDK1.8 
 *  Author��WLNSSS Create Date��2017-9-27 Modified By�� <�޸�����������ƴ����д>
 * Modified Date: <�޸����ڣ���ʽ:YYYY-MM-DD> Why & What is modified <�޸�ԭ������>
 * Version:1.0
 */
public interface NoteManage<T> {
	/*
	 *������ʱ��dao���࣬�����ڴ����࣬����dao��ķ���ʵ�� 
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
