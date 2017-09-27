package org.sccooperation.dao;
/**
 * Project:SCCooperation Comments:此类是用户操作接口
 *  JDK version used:JDK1.8 
 *  Author：WLNSSS Create Date：2017-9-27 Modified By： <修改人中文名或拼音缩写>
 * Modified Date: <修改日期，格式:YYYY-MM-DD> Why & What is modified <修改原因描述>
 * Version:1.0
 */
public interface IUserDao{

	
	
	/**
	 * 根据网页传过来的账号密码，验证数据库是否有此条记录进行登录
	 * 
	 * @param account  网页传来的账号
	 * @param password 网页传来的密码
	 * @return 返回'success'或'error'字符串
	 * @exception 暂时没做
	 */
	public String loginCheck(String account,String password);
	

}
