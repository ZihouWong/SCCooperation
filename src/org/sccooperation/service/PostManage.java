package org.sccooperation.service;

import java.util.List;

import org.sccooperation.domain.Post;

/**
 * Project:SCCooperation Comments:�����Ǳ�ǩ�����ӿ�
 *  JDK version used:JDK1.8 
 *  Author��blank700 Create Date��2017-12-13Modified By�� <�޸�����������ƴ����д>
 * Modified Date:2017-12-13 <�޸����ڣ���ʽ:YYYY-MM-DD> Why & What is modified <�޸�ԭ������>
 * Version:1.0
 */
public interface PostManage<T> {
	/*
	 *������ʱ��dao���࣬�����ڴ����࣬����dao��ķ���ʵ��
	 */
	public List findpost(int tagno1,int tagno2,int tagno3);
	public List pidtofindpost(int post_id);
	public List eidtofindpostbypage(int enterprise_id,int pageNo);
	public List esuidtofindpostbypage(int enterprisesubuser_id,int pageNo);
	public void insertPost(T entity);
	public void updatePost(T entity);
}
