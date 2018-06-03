package org.sccooperation.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Project:SCCooperation Comments:���������ݿ�����Ļ����ӿڣ�Ŀ���Ǽ��ٴ�������� JDK version
 * used:JDK1.8 Author��WLNSSS Create Date��2017-9-27 Modified By�� <�޸�����������ƴ����д>
 * Modified Date: <�޸����ڣ���ʽ:YYYY-MM-DD> Why & What is modified <�޸�ԭ������>
 * Version:1.0
 */

public interface BaseDao<T> {
	/**
	 * ����id��ȡ����
	 * 
	 * @param entityClazz  ��Ҫ����id��ȡ���ݵ�������
	 * @param id  ��Ҫ���ҵ�id
	 * @return ���ݷ��ͷ�������
	 * @exception ��ʱû��
	 */
	T get(Class<T> entityClazz, Serializable id);

	/**
	 * �������ݵ����ݿ�
	 * 
	 * @param entity  ��Ҫ�������
	 * @return serializable
	 * @exception ��ʱû��
	 */
	Serializable save(T entity);
	/**
	 * ��������
	 * 
	 * @param entity  ��Ҫ���µĳ־û���
	 * @return void
	 * @exception ��ʱû��
	 */
	void update(T entity);
	/**
	 * ɾ�����ݿ��
	 * 
	 * @param entity  ��Ҫɾ���ĳ־û���
	 * @return void
	 * @exception ��ʱû��
	 */
	void delete(T entity);
	/**
	 * ����idɾ������
	 * 
	 * @param entityClazz  ��Ҫ����idɾ�����ݵ�������
	 * @param id  ��Ҫ���ҵ�id
	 * @return void
	 * @exception ��ʱû��
	 */
	void delete(Class<T> entityClazz, Serializable id);
	/**
	 * ��ѯĳ�����ȫ������
	 * 
	 * @param class1 ��Ҫ��ѯ�ı�ӳ��ĳ־û���������
	 * @return �����б����ͽ����
	 * @exception ��ʱû��
	 */
	List<T> findAll(Class<T> class1);
	/**
	 * ��ѯĳ�������������
	 * 
	 * @param entityClazz ��Ҫ��ѯ�ı�ӳ��ĳ־û���������
	 * @return ��������
	 * @exception ��ʱû��
	 */
	long findCount(Class<T> entityClazz);
}
