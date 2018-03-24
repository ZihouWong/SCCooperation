package org.sccooperation.daoimpl;

import java.io.Serializable;
import java.util.List;

import org.sccooperation.dao.INoteDao;
import org.sccooperation.domain.Note;
/**
 * Project:SCCooperation Comments:此类是帖子操作接口实现类
 *  JDK version used:JDK1.8 
 *  Author：WLNSSS Create Date：2017-9-27 Modified By： <修改人中文名或拼音缩写>
 * Modified Date: <修改日期，格式:YYYY-MM-DD> Why & What is modified <修改原因描述>
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


	@Override
	public List<T> searchByPageNo(String keyword,int pageNo) {
		// TODO Auto-generated method stub
		System.out.println(keyword);
		return findByPage("from Note as n where n.title like ?0 or n.content like ?1 or n.people_id.name like ?2 order by time desc", pageNo, 10,10, "%"+keyword+"%","%"+keyword+"%","%"+keyword+"%");
	}


	@Override
	public List<T> backstageFindAllReplyNote(int pageNo) {
		// TODO Auto-generated method stub
		return findBypage("from ReplyNote  order by id desc", pageNo, 12, 12);
	}
	
	


}
