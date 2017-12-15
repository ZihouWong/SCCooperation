package org.sccooperation.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Project:SCCooperation Comments:���������Ӳ����ӿ�
 *  JDK version used:JDK1.8 
 *  Author��WLNSSS Create Date��2017-9-27 Modified By�� <�޸�����������ƴ����д>
 * Modified Date: <�޸����ڣ���ʽ:YYYY-MM-DD> Why & What is modified <�޸�ԭ������>
 * Version:1.0
 */
public interface INoteDao<T> {
	/**
	 * ���浽���ݿ�
	 * 
	 * @param entity Ҫ��ӵ�����
	 * @return void
	 * @exception ��ʱû��
	 */
	public void addNote(T entity);
	/**
	 * ����ҳ���������ݿ⣬ÿ��23����¼
	 * 
	 * @param pageNo ҳ��
	 * @return ���ز�ѯ�Ľ����
	 * @exception ��ʱû��
	 */
	public List<T> findAllNote(int pageNo);
	/**
	 * �������ݿ���������
	 * 
	 * @return ���ؼ�¼��
	 * @exception ��ʱû��
	 */
	public long findNoteCount(Class<T> entityClazz);
	/**
	 * ����id��ѯ���ݿ�ĳ���ֶ�
	 * 
	 * @return ���ؼ�¼��
	 * @exception ��ʱû��
	 */
	public T findById(Class<T> entityClazz, Serializable id);
	/**
	 * ����ظ������ݿ�
	 * 
	 * @param entity Ҫ��ӵ�����
	 * @return void
	 * @exception ��ʱû��
	 */
	public void addReplyNote(T entity);
	/**
	 * ����id������ص����ӻظ�
	 * 
	 * @param id Ҫ���һظ�������
	 * @return List
	 * @exception ��ʱû��
	 */
	public List findReplyNoteByPage(int pageNo,int id);
	/**
	 * �����޸ĵ�����
	 * 
	 * @param T Ҫ������޸�����
	 * @return void
	 * @exception ��ʱû��
	 */
	public void saveAlter(T entity);
	/**
	 * �ҳ���������4����
	 * 
	 * @param
	 * @return ���ط�����������˵���Ϣ
	 * @exception ��ʱû��
	 */
	public List seeManyNotePeople();



}
