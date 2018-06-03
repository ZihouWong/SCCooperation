package org.sccooperation.daoimpl;

import java.util.List;

import org.sccooperation.dao.ICvDao;
import org.sccooperation.domain.Cv;
/**
 * Project:SCCooperation Comments:此类是简历操作接口实现类
 *  JDK version used:JDK1.8 
 *  Author：WLNSSS Create Date：2017-11-23 Modified By：blank700 <修改人中文名或拼音缩写>
 * Modified Date: <修改日期，格式:2017-11-23> Why & What is modified <修改原因描述>
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
