package org.sccooperation.service;

import java.util.List;

import org.sccooperation.domain.Enterprisesubuser;

/**
 * Project:SCCooperation Comments:��������ҵ���û������ӿ�
 *  JDK version used:JDK1.8 
 *  Author��blank700 Create Date��2018-01-18 Modified By�� <�޸�����������ƴ����д>
 * Modified Date: <�޸����ڣ���ʽ:YYYY-MM-DD> Why & What is modified <�޸�ԭ������>
 * Version:1.0
 */
public interface EnterprisesubuserManage<T> {
	/*
	 *������ʱ��dao���࣬�����ڴ����࣬����dao��ķ���ʵ�� 
	 */
	public List loginCheck(String account,String password);
	public boolean passwordCheck(String password_old);
	public void insertEnterprisesubuser(T entity);
	public void updateEnterprisesubuser(T entity);
	public List findallenterprisesubuser();
	public List esuidtofindenterprisesubuser(int esu_id);
}
