package org.sccooperation.service.impl;

import java.util.List;

import org.sccooperation.dao.ITagDao;
import org.sccooperation.domain.Tag;
import org.sccooperation.service.TagManage;
/**
 * Project:SCCooperation Comments:´ËÀàÊÇ±êÇ©·þÎñ²ã½Ó¿ÚÊµÏÖÀà
 *  JDK version used:JDK1.8 
 *  Author£ºblank700 Create Date£º2017-9-27 Modified By£º <ÐÞ¸ÄÈËÖÐÎÄÃû»òÆ´ÒôËõÐ´>
 * Modified Date:2017-12-9 <ÐÞ¸ÄÈÕÆÚ£¬¸ñÊ½:YYYY-MM-DD> Why & What is modified <ÐÞ¸ÄÔ­ÒòÃèÊö>
 * Version:1.0
 */
public class TagManageImpl<T> implements TagManage<T> {
	/**¸Ã±äÁ¿ÓÉspring×°Åä£¬*/
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
	
		public List findtag(int tagno) {
		System.out.println("findtag");
		return tagDao.findtag(tagno);
	}
	
	public List findalltag() {
		System.out.println("findalltag");
		return tagDao.findalltag();
	}

}
