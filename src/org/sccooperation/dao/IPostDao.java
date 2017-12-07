package org.sccooperation.dao;

import java.util.List;

public interface IPostDao {
	
	public List findJobByButtom(String buttom);

	public List findAllJob();

	public List findJob(int pageNo);
	
	
}
