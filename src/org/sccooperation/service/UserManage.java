package org.sccooperation.service;
/**
 * Project:SCCooperation Comments:�������û������ӿ�
 *  JDK version used:JDK1.8 
 *  Author��WLNSSS Create Date��2017-9-27 Modified By�� <�޸�����������ƴ����д>
 * Modified Date: <�޸����ڣ���ʽ:YYYY-MM-DD> Why & What is modified <�޸�ԭ������>
 * Version:1.0
 */
public interface UserManage {
	/*
	 *������ʱ��dao���࣬�����ڴ����࣬����dao��ķ���ʵ�� 
	 */
	public String loginCheck(String account,String password);
}
