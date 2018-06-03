package org.sccooperation.service.impl;

import java.util.List;

import org.sccooperation.dao.ICvDao;
import org.sccooperation.dao.IUserDao;
import org.sccooperation.service.CvManage;
/**
 * Project:SCCooperation Comments:�������û������ӿ�ʵ����
 *  JDK version used:JDK1.8 
 *  Author��WLNSSS Create Date��2017-11-23 Modified By�� blank700<�޸�����������ƴ����д>
 * Modified Date: <�޸����ڣ���ʽ:2017-11-23> Why & What is modified <�޸�ԭ������>
 * Version:1.0
 */
public class CvManageImpl<T> implements CvManage<T> {
	/**�ñ�����springװ��*/
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
