package org.sccooperation.service;

import java.util.List;

/**
 * Project:SCCooperation Comments:此类是简历服务层接口
 *  JDK version used:JDK1.8 
 *  Author：WLNSSS Create Date：2017-11-23 Modified By：blank700 <修改人中文名或拼音缩写>
 * Modified Date:2017-11-23 <修改日期，格式:YYYY-MM-DD> Why & What is modified <修改原因描述>
 * Version:1.0
 */
public interface CvManage<T> {
	/*
	 *这里暂时和dao层差不多，类似于代理类，调用dao层的方法实现 
	 */
	public List findCvInformation(int cvid);
	public void updateCv(T entity);
}
