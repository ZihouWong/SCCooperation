package org.sccooperation.daoimpl;

import java.io.Serializable;
import java.util.List;

import org.sccooperation.dao.INoteDao;
import org.sccooperation.domain.Note;
/**
 * Project:SCCooperation Comments:���������Ӳ����ӿ�ʵ����
 *  JDK version used:JDK1.8 
 *  Author��WLNSSS Create Date��2017-9-27 Modified By�� <�޸�����������ƴ����д>
 * Modified Date: <�޸����ڣ���ʽ:YYYY-MM-DD> Why & What is modified <�޸�ԭ������>
 * Version:1.0
 */
public class NoteDaoImpl<T> extends BaseDaoImpl<T> implements INoteDao<T> {

	@Override
	public void addNote(T entity) {
		// TODO Auto-generated method stub
		save(entity);
	}


	public List<T> findAllNote(int pageNo) {
		// TODO Auto-generated method stub

		return findBypage("from Note", pageNo, 15,15);
	}


	@Override
	public long findNoteCount(Class<T> entityClazz) {
		// TODO Auto-generated method stub
		return findCount(entityClazz);
	}


	@Override
	public T findById(Class<T> entityClazz, Serializable id) {
		// TODO Auto-generated method stub
		return get(entityClazz, id);
	}


	@Override
	public void addReplyNote(T entity) {
		// TODO Auto-generated method stub
		save(entity);
	}


	@Override
	public List findReplyNoteByPage(int pageNo,int id) {
		// TODO Auto-generated method stub
		return findByPage("from ReplyNote as r where r.robject.id =?0", pageNo,6,6,id);
	}


	@Override
	public void saveAlter(T entity) {
		// TODO Auto-generated method stub
		update(entity);
	}


	@Override
	public List seeManyNotePeople() {
		// TODO Auto-generated method stub
		return findByPage("from People order by notesum desc", 0, 4,4);
	}



}
