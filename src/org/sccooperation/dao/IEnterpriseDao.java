package org.sccooperation.dao;

import java.util.List;

/**
 * Project:SCCooperation Comments:��������ҵ�����ӿ�
 *  JDK version used:JDK1.8 
 *  Author��bllank700 Create Date��2017-12-21 Modified By�� <�޸�����������ƴ����д>
 * Modified Date: <�޸����ڣ���ʽ:YYYY-MM-DD> Why & What is modified <�޸�ԭ������>
 * Version:1.0
 */

public interface IEnterpriseDao<T> {
	/**
	 * ������ҳ���������˺����룬��֤���ݿ��Ƿ��д�����¼���е�¼
	 * 
	 * @param account  ��ҳ�������˺�
	 * @param password ��ҳ����������
	 * @return ���ظ��û���Ϣ
	 * @exception ��ʱû��
	 */
	public List loginCheck(String account,String password);

	/**
	 * ������ҳ���������������Ƿ����û�����һ��
	 * 
	 * @param password String���û�������
	 * @return boolean
	 * @exception ��ʱû��
	 */
	public boolean passwordCheck(String password);
	
	/**
	 * ������ҳ��������������Ϣ���뵽������ݿ�
	 * 
	 * @param entity �����࣬����Ҫע����û����߹�˾����Ϣ
	 * @return void
	 * @exception ��ʱû��
	 */
	public void insertEnterprise(T entity);
	
	/**
	 * ������ҳ��������������Ϣ����������ݿ�
	 * 
	 * @param entity �����࣬����Ҫע����û����߹�˾����Ϣ
	 * @return void
	 * @exception ��ʱû��
	 */
	public void updateEnterprise(T entity);
	
	/**
	 * ������ҳ����������ҵid��ѯ��ص����ݿ�
	 * 
	 * @param id ��ҳ��������ҵid
	 * @return void
	 * @exception ��ʱû��
	 */
	public List findEnterprise(int id);
}
