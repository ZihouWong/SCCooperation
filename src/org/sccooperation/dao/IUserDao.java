package org.sccooperation.dao;

import java.util.List;

import org.sccooperation.domain.People;

/**
 * Project:SCCooperation Comments:�������û������ӿ�
 *  JDK version used:JDK1.8 
 *  Author��WLNSSS Create Date��2017-9-27 Modified By�� <�޸�����������ƴ����д>
 * Modified Date: <�޸����ڣ���ʽ:YYYY-MM-DD> Why & What is modified <�޸�ԭ������>
 * Version:1.0
 */
public interface IUserDao<T>{

	
	
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
	public void insertUser(T entity);
	
	/**
	 * ��ҳ�����û���Ϣ,һҳ12��
	 * 
	 * @param 
	 * @return list�б�
	 * @exception ��ʱû��
	 */
	
	
	
	/******************************************************WLNSSS**********************************/
	public List<T> selectAllUser(int pageNo);
	
	/**
  	 * ������������
  	 * 
  	 * @param �ؼ���
  	 * @return �������
  	 * @exception ��ʱû��
  	 */
     public List<T> searchByPageNo(String keyword,int pageNo);
     
     /**
      *  ��̨�û���¼
      *  
      *  @param account String �˺�
      *  @param password String ����
      *  @return ��¼���
      * */
     public List<T> backstageLoginCheck(String account,String password);
	 
	 	/**
	 * ������ҳ��������������Ϣ����������ݿ�
	 * 
	 * @param entity �����࣬����Ҫע����û����߹�˾����Ϣ
	 * @return void
	 * @exception ��ʱû��
	 */
	public void updateUser(T entity);

}
