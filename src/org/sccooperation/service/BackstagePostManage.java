package org.sccooperation.service;

import java.util.List;

/*
 * ��̨��Ŀ�������
 * */
public interface BackstagePostManage<T> {
	/*
	 * ����ҳ����ȡ����
	 * @param int pageNo ҳ��
	 * @return List ���ز�ѯ���Ľ����
	 * */
	public List<T> findByPageNo(int pageNo);
	
	public List<T> searchByPageNo(String keyword, int pageNo);

}
