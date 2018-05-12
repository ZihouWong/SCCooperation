package org.sccooperation.service.impl;

import java.util.List;

import org.sccooperation.dao.IPostDao;
import org.sccooperation.domain.Post;
import org.sccooperation.service.PostManage;
/**
 * Project:SCCooperation Comments:´ËÀàÊÇ±êÇ©·þÎñ²ã½Ó¿ÚÊµÏÖÀà
 *  JDK version used:JDK1.8 
 *  Author£ºblank700 Create Date£º2017-9-27 Modified By£º <ÐÞ¸ÄÈËÖÐÎÄÃû»òÆ´ÒôËõÐ´>
 * Modified Date:2017-12-9 <ÐÞ¸ÄÈÕÆÚ£¬¸ñÊ½:YYYY-MM-DD> Why & What is modified <ÐÞ¸ÄÔ­ÒòÃèÊö>
 * Version:1.0
 */
public class PostManageImpl<T> implements PostManage<T> {
	/** ¸Ã±äÁ¿ÓÉspring×°Åä£¬ */
	private IPostDao postDao;
	
	public IPostDao getPostDao() {
		return postDao;
	}

	public void setPostDao(IPostDao postDao) {
		this.postDao = postDao;
	}

	// 创兴谷：
	@Override
	public List findJobByButton(int pageNo, String button) {
		// 主页-显示标签对应的工作
		return postDao.findJobByButton(pageNo, button);
	}
	
	@Override
	public List findJobByPageNo(int pageNo) {
		//主页-显示所有工作
		return postDao.findJobByPageNo(pageNo);
	}
	
	@Override
	public List showJobInfo(int jobId) {
		// 显示工作详细页面-主体信息框
		return postDao.showJobInfo(jobId);
	}
	
	@Override
	public List showOtherJob(int button) {
		// 显示工作详细页面-其他工作
		return postDao.getOtherJob(button);
	}
	
	@Override
	public long getPostNum(Class entityClazz) {
		// 搜索页面-获得工作总数
		return postDao.getPostNum(entityClazz);
	}
	
	@Override
	public List showMainJob(int pageNo, int button) {
		// 搜索页面-主体工作信息列表	
		return postDao.showMainJob(pageNo, button);
	}

	@Override
	public List showHotJob(int pageNo, int button) {
		// 搜索页面-热点工作列表
		return postDao.showHotJob(pageNo, button);
	}
	
	@Override
	public List SearchCourse(String content, int pageNo) {
		// TODO Auto-generated method stub
		return postDao.SearchCourse(content, pageNo);
	}
	
	@Override
	public int getEnterpriseId(int jobId) {
		// TODO Auto-generated method stub
		return postDao.getEnterpriseId(jobId);
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
