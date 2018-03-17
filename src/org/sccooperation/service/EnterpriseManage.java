package org.sccooperation.service;

import java.util.List;

/*
 * ��ҵ��������
 * @author WLNSSS
 * @time 2018.1.17
 * */
public interface EnterpriseManage<T> {
	/*
	 * ����ҳ����ȡ����
	 * @param int pageNo ҳ��
	 * @return List ���ز�ѯ���Ľ����
	 * */
	public List<T> findByPageNo(int pageNo);
	
	public List<T> searchByPageNo(String keyword, int pageNo);

	public List findEnterpriseByPageNo(int pageNo);

	public List showETagName(int JobNo);

	public List findPartner(int pageNo);
}
