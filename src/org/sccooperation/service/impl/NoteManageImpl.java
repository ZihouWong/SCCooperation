package org.sccooperation.service.impl;

import java.io.Serializable;
import java.util.List;

import org.sccooperation.dao.INoteDao;
import org.sccooperation.service.NoteManage;

public class NoteManageImpl<T> implements NoteManage<T> {
    private INoteDao noteDao;
	public INoteDao getNoteDao() {
		return noteDao;
	}

	@Override
	public List<T> findAllNote(int pageNo) {
		// TODO Auto-generated method stub
		return noteDao.findAllNote(pageNo);
	}
	public void setNoteDao(INoteDao noteDao) {
		this.noteDao = noteDao;
	}
	@Override
	public void addNote(T entity) {
		// TODO Auto-generated method stub
		noteDao.addNote(entity);
	}

	@Override
	public long findNoteCount(Class<T> entityClazz) {
		// TODO Auto-generated method stub
		return noteDao.findNoteCount(entityClazz);
	}

	@Override
	public T findById(Class<T> entityClazz, Serializable id) {
		// TODO Auto-generated method stub
		return (T) noteDao.findById(entityClazz, id);
	}

	@Override
	public void addReplyNote(T entity) {
		// TODO Auto-generated method stub
		noteDao.addReplyNote(entity);
	}

	@Override
	public List findReplyNoteByPage(int pageNo,int id) {
		// TODO Auto-generated method stub
		return noteDao.findReplyNoteByPage(pageNo,id);
	}

	public void saveAlter(T entity) {
		// TODO Auto-generated method stub
		 noteDao.saveAlter(entity);
	}

	@Override
	public List seeManyNotePeople() {
		// TODO Auto-generated method stub
		return noteDao.seeManyNotePeople();
	}
	
	

	



}
