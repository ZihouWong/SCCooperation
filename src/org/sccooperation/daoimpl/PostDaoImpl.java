package org.sccooperation.daoimpl;

import java.util.List;

import org.sccooperation.dao.IPostDao;
import org.sccooperation.domain.Post;
/**
 * Project:SCCooperation Comments:�����Ǳ�ǩ�����ӿ�ʵ����
 *  JDK version used:JDK1.8 
 *  Author��blank700 Create Date��2017-12-13 Modified By�� <�޸�����������ƴ����д>
 * Modified Date:2017-12-13 <�޸����ڣ���ʽ:YYYY-MM-DD> Why & What is modified <�޸�ԭ������>
 * Version:1.0
 */


public class PostDaoImpl<T> extends BaseDaoImpl<T> implements IPostDao<T> {
	/*
	 * ���ӿ���˵���˴���׸��
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
