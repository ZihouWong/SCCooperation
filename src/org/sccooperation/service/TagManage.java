package org.sccooperation.service;

import java.util.List;

import org.sccooperation.domain.Tag;

/**
 * Project:SCCooperation Comments:此类是标签服务层接口
 *  JDK version used:JDK1.8 
 *  Author：blank700 Create Date：2017-9-27 Modified By： <修改人中文名或拼音缩写>
 * Modified Date:2017-12-9 <修改日期，格式:YYYY-MM-DD> Why & What is modified <修改原因描述>
 * Version:1.0
 */
public interface TagManage<T> {
	/*
	 *这里暂时和dao层差不多，类似于代理类，调用dao层的方法实现
	 */
	public List findtag(int tagno);
	
	public List findalltag();
}
