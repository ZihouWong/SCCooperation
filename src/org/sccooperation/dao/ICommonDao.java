package org.sccooperation.dao;

import java.util.List;

/**
 * ������ӿ�
 * @author wlnsss
 * */
public interface ICommonDao<T> {

	/**
	 * �Ƿ���ã����ò����ö�ȡ��
	 * @param table String Ҫ�����ı���
	 * @param id int Ҫ��������id
	 * @param state int ��ǰ�е�״̬
	 * @return boolean ���ز����Ľ��
	 * @throws ClassNotFoundException 
	 * @throws Exception 
	 * */
	public boolean isEnable(String table,int id,String state) throws Exception;

	/**
	 * search,����keyword�������ݿ⣬�����ؽ����
	 * @param table String Ҫ���ҵı���
	 * @param keyword String �����Ĺؼ���
	 * @param pageNo int �����ڼ�ҳ
	 * @return List ���ؽ����
	 * */
	List<T> searchByPageNo(String table,String keyword, int pageNo);
}
