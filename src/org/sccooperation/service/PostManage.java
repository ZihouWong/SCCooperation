package org.sccooperation.service;

import java.util.List;

import org.sccooperation.domain.Post;

public interface PostManage {

	public List findJobByButton(int pageNo, String button);

	public List findJobByPageNo(int pageNo);
	
	public List showMainJob(int pageNo, int button);
	
	public List showHotJob(int pageNo, int button);

	public List showJobInfo(int jobId);

	public long getPostNum(Class entityClazz);

	public List showOtherJob(int button);

	public List SearchCourse(String content, int pageNo);

	public int getEnterpriseId(int jobNo);

}
