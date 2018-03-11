package org.sccooperation.service.impl;


import java.util.List;

import org.sccooperation.dao.ITagDao;
import org.sccooperation.service.TagManage;

public class TagManageImpl implements TagManage{
	
	private ITagDao tagDao;
	
	public ITagDao getTagDao() {
		return tagDao;
	}

	public void setTagDao(ITagDao tagDao) {
		this.tagDao = tagDao;
	}

	// 创兴谷：
	
	@Override
	public List showTagName(int jobNo) {
		// 显示工作详细页面-工作所属的标签名
		return tagDao.showTagName(jobNo);
	}
	
	// 躬行课堂：
	
	@Override
	public List getTitleName(int button) {
		// 精品课程后的标签名字
		return tagDao.showTagNameByButton(button);
	}

}
