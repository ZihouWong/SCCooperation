package org.sccooperation.service;

import java.util.List;

/*
 * ��˾���˻���������
 * @author WLNSSS
 * @time 2018.1.20
 * */
public interface EnterprisesubuserManage<T> {
	/*
	 * ����ҳ����ȡ����
	 * @param int pageNo ҳ��
	 * @return List ���ز�ѯ���Ľ����
	 * */
	public List<T> findByPageNo(int pageNo);
	
	public List<T> searchByPageNo(String keyword, int pageNo);

}
