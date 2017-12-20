package org.sccooperation.dao;

import java.util.List;

public interface IPostDao {
/********************************* 黄智豪 ******************************/
	public List findJobByButtom(int pageNo, String buttom);

	public List findJobByPageNo(int pageNo);
	
}
