package org.sccooperation.dao;

import java.util.List;

/**
 * Project:SCCooperation Comments:�����Ǳ�ǩ�����ӿ�
 *  JDK version used:JDK1.8 
 *  Author��blank700 Create Date��2017-12-8 Modified By�� <�޸�����������ƴ����д>
 * Modified Date:2017-12-8 <�޸����ڣ���ʽ:YYYY-MM-DD> Why & What is modified <�޸�ԭ������>
 * Version:1.0
 */
public interface ITagDao<T>{
	/**
	 * ������ҳ��������tagno����ѯ���ݿ���tagno��Ӧ�ķ���
	 * 
	 * @param tagno��ҳ������tagno
	 * @return ���ظ��û���Ϣ
	 * @exception ��ʱû��
	 */
	public List findtag(int tagno);

	/**
	 * ���ҳ����еı�ǩ��Ϣ��Ϣ
	 * 
	 * @return ���ر�ǩ��Ϣ
	 * @exception ��ʱû��
	 */
	public List findalltag();
}
