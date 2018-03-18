package org.sccooperation.service.impl;

import java.util.List;

import org.sccooperation.dao.ICvDao;
import org.sccooperation.dao.IUserDao;
import org.sccooperation.service.CvManage;
/**
 * Project:SCCooperation Comments:此类是用户服务层接口实现类
 *  JDK version used:JDK1.8 
 *  Author：WLNSSS Create Date：2017-11-23 Modified By： blank700<修改人中文名或拼音缩写>
 * Modified Date: <修改日期，格式:2017-11-23> Why & What is modified <修改原因描述>
 * Version:1.0
 */
public class CvManageImpl<T> implements CvManage<T> {
	/**该变量由spring装配*/
	private ICvDao cvDao;
	public ICvDao getCvDao() {
		return cvDao;
	}
	public void setCvDao(ICvDao cvDao) {
		this.cvDao = cvDao;
	}

	public List findCvInformation(int cvid) {
		System.out.println("blank700");
		return cvDao.findCvInformation(cvid);
	}
	
	public void updateCv(T entity) {
		cvDao.updateCv(entity);
	}
}
