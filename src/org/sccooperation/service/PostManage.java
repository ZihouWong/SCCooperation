package org.sccooperation.service;

import java.util.List;

import org.sccooperation.domain.Post;

/**
 * Project:SCCooperation Comments:此类是标签服务层接口
 *  JDK version used:JDK1.8 
 *  Author：blank700 Create Date：2017-12-13Modified By： <修改人中文名或拼音缩写>
 * Modified Date:2017-12-13 <修改日期，格式:YYYY-MM-DD> Why & What is modified <修改原因描述>
 * Version:1.0
 */
public interface PostManage<T> {
	/*
	 *这里暂时和dao层差不多，类似于代理类，调用dao层的方法实现
	 */
	public List findpost(int tagno1,int tagno2,int tagno3);
	public List pidtofindpost(int post_id);
	public List eidtofindpostbypage(int enterprise_id,int pageNo);
	public List esuidtofindpostbypage(int enterprisesubuser_id,int pageNo);
	public void insertPost(T entity);
	public void updatePost(T entity);
}
