package org.sccooperation.dao;

import java.util.List;

/*
 * ��̨��Ŀ�����������
 * @author WLNSSS
 * @time 2018.1.21
 * */
public interface IBackstagePostDao<T> {

	//����ҳ�Ų�����Ŀ
		public List<T> findByPageNo(int pageNo);
		
		public List<T> searchByPageNo(String keyword, int pageNo);
}
