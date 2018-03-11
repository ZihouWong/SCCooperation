package org.sccooperation.service.impl;

import java.util.List;

import org.sccooperation.dao.ITagDao;
import org.sccooperation.domain.Tag;
import org.sccooperation.service.TagManage;
/**
 * Project:SCCooperation Comments:�����Ǳ�ǩ�����ӿ�ʵ����
 *  JDK version used:JDK1.8 
 *  Author��blank700 Create Date��2017-9-27 Modified By�� <�޸�����������ƴ����д>
 * Modified Date:2017-12-9 <�޸����ڣ���ʽ:YYYY-MM-DD> Why & What is modified <�޸�ԭ������>
 * Version:1.0
 */
public class TagManageImpl<T> implements TagManage<T> {
	/**�ñ�����springװ�䣬*/
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
