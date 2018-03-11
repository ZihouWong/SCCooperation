package org.sccooperation.service.impl;

import java.util.List;

import org.sccooperation.dao.IPostDao;
import org.sccooperation.domain.Post;
import org.sccooperation.service.PostManage;
/**
 * Project:SCCooperation Comments:�����Ǳ�ǩ�����ӿ�ʵ����
 *  JDK version used:JDK1.8 
 *  Author��blank700 Create Date��2017-9-27 Modified By�� <�޸�����������ƴ����д>
 * Modified Date:2017-12-9 <�޸����ڣ���ʽ:YYYY-MM-DD> Why & What is modified <�޸�ԭ������>
 * Version:1.0
 */
public class PostManageImpl<T> implements PostManage<T> {
	/** �ñ�����springװ�䣬 */
	private IPostDao postDao;

	public IPostDao getPostDao() {
		return postDao;
	}

	public void setPostDao(IPostDao postDao) {
		this.postDao = postDao;
	}

	public List findpost(int tagno1,int tagno2,int tagno3) {
		System.out.println("findtag");
		return postDao.findpost(tagno1,tagno2,tagno3);
	}
	
	public List pidtofindpost(int post_id) {
		System.out.println("pidtofindpost");
		return postDao.pidtofindpost(post_id);
	}
	
	public List eidtofindpostbypage(int enterprise_id,int pageNo) {
		System.out.println("eidtofindpostbypage");
		return postDao.eidtofindpostbypage(enterprise_id,pageNo);
	}
	
	public List esuidtofindpostbypage(int enterprisesubuser_id,int pageNo) {
		System.out.println("esuidtofindpostbypage");
		return postDao.esuidtofindpostbypage(enterprisesubuser_id,pageNo);
	}
	
	public void insertPost(T entity) {
		postDao.insertPost(entity);
	}
	
	public void updatePost(T entity) {
		postDao.updatePost(entity);
	}
}
