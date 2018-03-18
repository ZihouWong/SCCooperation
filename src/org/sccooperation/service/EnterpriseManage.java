package org.sccooperation.service;

import java.util.List;

import org.sccooperation.domain.Enterprise;

/**
 * Project:SCCooperation Comments:��������ҵ�����ӿ�
 *  JDK version used:JDK1.8 
 *  Author��blank700 Create Date��2017-12-23 Modified By�� <�޸�����������ƴ����д>
 * Modified Date: <�޸����ڣ���ʽ:YYYY-MM-DD> Why & What is modified <�޸�ԭ������>
 * Version:1.0
 */
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
	
		public List loginCheck(String account,String password);
	public boolean passwordCheck(String password_old);
	public void insertEnterprise(T entity);
	public void updateEnterprise(T entity);
	public List findEnterprise(int id);
}
