package org.sccooperation.dao;

import java.util.List;

public interface IPostDao {
/********************************* 黄智豪 ******************************/
	public List findJobByButton(int pageNo, String buttom);

	public List findJobByPageNo(int pageNo);

	public List showMainJob(int pageNo, int button);

	public List showHotJob(int pageNo, int button);

	public List showJobInfo(int jobId);

	public long getPostNum(Class entityClazz);

	public List getOtherJob(int button);

	public List SearchCourse(String content, int pageNo);

	public int getEnterpriseId(int jobId);		
		
}	
