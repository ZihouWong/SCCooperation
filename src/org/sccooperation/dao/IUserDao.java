package org.sccooperation.dao;
/**
 * Project:SCCooperation Comments:�������û������ӿ�
 *  JDK version used:JDK1.8 
 *  Author��WLNSSS Create Date��2017-9-27 Modified By�� <�޸�����������ƴ����д>
 * Modified Date: <�޸����ڣ���ʽ:YYYY-MM-DD> Why & What is modified <�޸�ԭ������>
 * Version:1.0
 */
public interface IUserDao{

	
	
	/**
	 * ������ҳ���������˺����룬��֤���ݿ��Ƿ��д�����¼���е�¼
	 * 
	 * @param account  ��ҳ�������˺�
	 * @param password ��ҳ����������
	 * @return ����'success'��'error'�ַ���
	 * @exception ��ʱû��
	 */
	public String loginCheck(String account,String password);
	

}
