package org.sccooperation.service;

import java.util.List;

public interface PostManage {
	
	public List findJobByButtom(String buttom);

	public List findAllJob();

	public List findJobByPageNo(int pageNo);
}
