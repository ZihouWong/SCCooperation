package org.sccooperation.daoimpl;

import java.util.List;

import org.sccooperation.dao.ITagDao;
import org.sccooperation.domain.Tag;
/**
 * Project:SCCooperation Comments:�����Ǳ�ǩ�����ӿ�ʵ����
 *  JDK version used:JDK1.8 
 *  Author��WLNSSS Create Date��2017-9-27 Modified By�� <�޸�����������ƴ����д>
 * Modified Date: <�޸����ڣ���ʽ:YYYY-MM-DD> Why & What is modified <�޸�ԭ������>
 * Version:1.0
 */


public class TagDaoImpl<T> extends BaseDaoImpl<T> implements ITagDao<T> {
  /*
   * ���ӿ���˵���˴���׸��
  */  
	@Override
	public List findtag(int tagno) {
		List<T> tt=find("from Tag where id =?0", tagno);
        
		if(!tt.isEmpty())
		{
			return tt;
		}
		return tt;
	}

	@Override
	public List findalltag() {
		return find("from Tag");
	}
}
