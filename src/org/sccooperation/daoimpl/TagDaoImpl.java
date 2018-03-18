package org.sccooperation.daoimpl;

import java.util.List;

import org.sccooperation.dao.ITagDao;
import org.sccooperation.domain.Tag;
/**
 * Project:SCCooperation Comments:´ËÀàÊÇ±êÇ©²Ù×÷½Ó¿ÚÊµÏÖÀà
 *  JDK version used:JDK1.8 
 *  Author£ºWLNSSS Create Date£º2017-9-27 Modified By£º <ÐÞ¸ÄÈËÖÐÎÄÃû»òÆ´ÒôËõÐ´>
 * Modified Date: <ÐÞ¸ÄÈÕÆÚ£¬¸ñÊ½:YYYY-MM-DD> Why & What is modified <ÐÞ¸ÄÔ­ÒòÃèÊö>
 * Version:1.0
 */


public class TagDaoImpl<T> extends BaseDaoImpl<T> implements ITagDao<T> {
  /*
   * ¸¸½Ó¿ÚÓÐËµÃ÷´Ë´¦²»×¸Êö
  */  
	@Override
	public List showTagName(int jobNo) {
		// 显示公司所属的标签名
		return find("from Tag where id=?0", jobNo);
	}


	// 躬行课堂：

	@Override
	public List showTagNameByButton(int button) {
		// 显示按钮的名字
		return find("from Tag where id=?0", button);
	}
	
	/*
   * ¸¸½Ó¿ÚÓÐËµÃ÷´Ë´¦²»×¸Êö
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
