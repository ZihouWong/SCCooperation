package org.sccooperation.service.impl;

import java.util.List;

import org.sccooperation.dao.ITagDao;
import org.sccooperation.domain.Tag;
import org.sccooperation.service.TagManage;
/**
 * Project:SCCooperation Comments:此类是标签服务层接口实现类
 *  JDK version used:JDK1.8 
 *  Author：blank700 Create Date：2017-9-27 Modified By： <修改人中文名或拼音缩写>
 * Modified Date:2017-12-9 <修改日期，格式:YYYY-MM-DD> Why & What is modified <修改原因描述>
 * Version:1.0
 */
public class TagManageImpl<T> implements TagManage<T> {
	/**该变量由spring装配，*/
    private ITagDao tagDao;

	public ITagDao getTagDao() {
		return tagDao;
	}

	public void setTagDao(ITagDao tagDao) {
		this.tagDao = tagDao;
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
