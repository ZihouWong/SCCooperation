package org.sccooperation.daoimpl;

import java.util.List;

import org.sccooperation.dao.ITagDao;
import org.sccooperation.domain.Tag;
/**
 * Project:SCCooperation Comments:此类是标签操作接口实现类
 *  JDK version used:JDK1.8 
 *  Author：WLNSSS Create Date：2017-9-27 Modified By： <修改人中文名或拼音缩写>
 * Modified Date: <修改日期，格式:YYYY-MM-DD> Why & What is modified <修改原因描述>
 * Version:1.0
 */


public class TagDaoImpl<T> extends BaseDaoImpl<T> implements ITagDao<T> {
  /*
   * 父接口有说明此处不赘述
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
