package org.sccooperation.service;

import java.util.List;

/**
 * Project:SCCooperation Comments:�����Ǽ��������ӿ�
 *  JDK version used:JDK1.8 
 *  Author��WLNSSS Create Date��2017-11-23 Modified By��blank700 <�޸�����������ƴ����д>
 * Modified Date:2017-11-23 <�޸����ڣ���ʽ:YYYY-MM-DD> Why & What is modified <�޸�ԭ������>
 * Version:1.0
 */
public interface CvManage<T> {
	/*
	 *������ʱ��dao���࣬�����ڴ����࣬����dao��ķ���ʵ�� 
	 */
	public List findCvInformation(int cvid);
	public void updateCv(T entity);
}
