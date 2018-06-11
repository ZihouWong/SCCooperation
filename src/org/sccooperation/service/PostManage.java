package org.sccooperation.service;

import java.util.List;

import org.sccooperation.domain.Post;

public interface PostManage<T> {

	public List findJobByButton(int pageNo, String button);

	public List findJobByPageNo(int pageNo);
	
	public List showMainJob(int pageNo, int button);
	
	public List showHotJob(int pageNo, int button);

	public List showJobInfo(int jobId);

	public long getPostNum(Class entityClazz);

	public List showOtherJob(int button);
	
	public List SearchJob(String content, int pageNo);
	
	public int getEnterpriseId(int jobNo);
	
		/*
	 *ÕâÀïÔÝÊ±ºÍdao²ã²î²»¶à£¬ÀàËÆÓÚ´úÀíÀà£¬µ÷ÓÃdao²ãµÄ·½·¨ÊµÏÖ
	 */
	public List findpost(int tagno1,int tagno2,int tagno3);
	public List pidtofindpost(int post_id);
	public List eidtofindpostbypage(int enterprise_id,int pageNo);
	public List esuidtofindpostbypage(int enterprisesubuser_id,int pageNo);
	public void insertPost(T entity);
	public void updatePost(T entity);

}
