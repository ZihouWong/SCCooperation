package org.sccooperation.daoimpl;

import java.util.List;

import org.sccooperation.dao.ICvDao;
import org.sccooperation.domain.Cv;
/**
 * Project:SCCooperation Comments:�����Ǽ��������ӿ�ʵ����
 *  JDK version used:JDK1.8 
 *  Author��WLNSSS Create Date��2017-11-23 Modified By��blank700 <�޸�����������ƴ����д>
 * Modified Date: <�޸����ڣ���ʽ:2017-11-23> Why & What is modified <�޸�ԭ������>
 * Version:1.0
 */

public class CvDaoImpl<T> extends BaseDaoImpl<T> implements ICvDao<T> {

	@Override
	public List findCvInformation(int cvid) {
		// TODO Auto-generated method stub
		List<T> cc=find("from Cv where id =?0", cvid);
		return cc;
	}
	
	@Override
	public void updateCv(T entity) {
		// TODO Auto-generated method stub
		update(entity);
	}
	
}
