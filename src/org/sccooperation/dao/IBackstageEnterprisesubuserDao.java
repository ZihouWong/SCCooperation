package org.sccooperation.dao;

import java.util.List;

/*
 * ��̨��˾���˻��б�ӿ�
 * 
 * */
public interface IBackstageEnterprisesubuserDao<T> {
	
	//����ҳ�Ų��ҹ�˾���˻�
	public List<T> findByPageNo(int pageNo);
	
	public List<T> searchByPageNo(String keyword, int pageNo);

}
