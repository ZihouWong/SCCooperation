package org.sccooperation.service.impl;

import java.util.List;

import org.sccooperation.dao.IPostDao;
import org.sccooperation.service.PostManage;

public class PostManageImpl implements PostManage{
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
	public List showOtherJob(int tagNo) {
		// 显示工作详细页面-其他工作
		return postDao.getOtherJob(tagNo);
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
	
}
