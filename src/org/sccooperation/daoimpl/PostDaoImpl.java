package org.sccooperation.daoimpl;

import java.util.List;

import org.sccooperation.dao.IPostDao;
import org.sccooperation.domain.Post;
/**
 * Project:SCCooperation Comments:´ËÀàÊÇ±êÇ©²Ù×÷½Ó¿ÚÊµÏÖÀà
 *  JDK version used:JDK1.8 
 *  Author£ºblank700 Create Date£º2017-12-13 Modified By£º <ÐÞ¸ÄÈËÖÐÎÄÃû»òÆ´ÒôËõÐ´>
 * Modified Date:2017-12-13 <ÐÞ¸ÄÈÕÆÚ£¬¸ñÊ½:YYYY-MM-DD> Why & What is modified <ÐÞ¸ÄÔ­ÒòÃèÊö>
 * Version:1.0
 */


public class PostDaoImpl<T> extends BaseDaoImpl<T> implements IPostDao<T> {
	/*
	 * ¸¸½Ó¿ÚÓÐËµÃ÷´Ë´¦²»×¸Êö
	 */
	@Override
	public List findJobByButton(int pageNo, String button) {
		// 主页-显示标签对应的工作
		return findByPage("from Post where tagNo=?0", pageNo, 18, 18, button); 
	}
	
	public List findJobByPageNo(int pageNo) {
		//主页-显示所有工作
		return findBypage("from Post", pageNo, 24, 24);
	}

	@Override
	public List showMainJob(int pageNo, int button) {
		// 搜索页面-主体工作信息列表	
		return findByPage("from Post where tagno=?0", pageNo, 10, 10, button);
	}

	@Override
	public List showHotJob(int pageNo, int button) {
		// 搜索页面-热点工作列表
		return find("from Post order by seenum desc");
	}
	
	@Override
	public long getPostNum(Class entityClazz) {
		// 搜索页面-获得工作总数
		return findCount(entityClazz);
	}

	@Override
	public List getOtherJob(int tagNo) {
		// 显示工作详细页面-其他工作
		return find("from Post where tagno=?0", tagNo);
	}
	
	@Override
	public List showJobInfo(int jobId) {
		// 显示工作详细页面-主体信息框
		return find("from Post where id=?0", jobId);
	}
	
	@Override
	public List SearchCourse(String content, int pageNo) {
		// 搜索页面-获得工作总数
		return findByPage("from Post as p where p.ename like ?0 or p.summary like ?1 or p.place like ?2 or p.ptime like ?3 or p.demand like ?4 or p.remuneration like ?5 or p.stime like ?6 or p.allure like ?7 order by seenum desc", pageNo, 10, 10, "%"+content+"%", "%"+content+"%", "%"+content+"%", "%"+content+"%", "%"+content+"%", "%"+content+"%", "%"+content+"%", "%"+content+"%");
	}
	
	@Override
	public int getEnterpriseId(int jobId) {
		// TODO Auto-generated method stub
		return (int)find("select enterprise_id.id from Post where id=?0", jobId).get(0); 
	}
	
		/*
	 * ¸¸½Ó¿ÚÓÐËµÃ÷´Ë´¦²»×¸Êö
	 */
	@Override
	public List findpost(int tagno1, int tagno2, int tagno3) {
		List<T> post = find("from Post where tagno =?0 or tagno =?1 or tagno =?2", tagno1, tagno2, tagno3);

		if (!post.isEmpty()) {
			return post;
		}
		return post;
	}
	
	@Override
	public List pidtofindpost(int post_id) {
		return find("from Post where id =?0", post_id);
	}
	
	@Override
	public List eidtofindpostbypage(int enterprise_id,int pageNo) {
		List<T> post = findByPage("from Post as p where p.enterprise_id.id =?0", pageNo, 5, 5, enterprise_id);
		return post;
	}
	
	@Override
	public List esuidtofindpostbypage(int enterprisesubuser_id,int pageNo) {
		List<T> post = findByPage("from Post as p where p.manager_id.id =?0", pageNo, 5, 5, enterprisesubuser_id);
		return post;
	}
	
	@Override
	public void insertPost(T entity) {
		save(entity);
	}
	
	@Override
	public void updatePost(T entity) {
		update(entity);
	}
}
  
