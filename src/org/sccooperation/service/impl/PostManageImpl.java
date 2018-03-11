package org.sccooperation.service.impl;

import java.util.List;

import org.sccooperation.dao.IPostDao;
import org.sccooperation.domain.Post;
import org.sccooperation.service.PostManage;
/**
 * Project:SCCooperation Comments:此类是标签服务层接口实现类
 *  JDK version used:JDK1.8 
 *  Author：blank700 Create Date：2017-9-27 Modified By： <修改人中文名或拼音缩写>
 * Modified Date:2017-12-9 <修改日期，格式:YYYY-MM-DD> Why & What is modified <修改原因描述>
 * Version:1.0
 */
public class PostManageImpl<T> implements PostManage<T> {
	/** 该变量由spring装配， */
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
