package org.sccooperation.service;

import java.util.List;

import org.sccooperation.domain.Tag;

/**
 * Project:SCCooperation Comments:�����Ǳ�ǩ�����ӿ�
 *  JDK version used:JDK1.8 
 *  Author��blank700 Create Date��2017-9-27 Modified By�� <�޸�����������ƴ����д>
 * Modified Date:2017-12-9 <�޸����ڣ���ʽ:YYYY-MM-DD> Why & What is modified <�޸�ԭ������>
 * Version:1.0
 */
public interface TagManage<T> {
	/*
	 *������ʱ��dao���࣬�����ڴ����࣬����dao��ķ���ʵ��
	 */
	public List findtag(int tagno);
	
	public List findalltag();
}
