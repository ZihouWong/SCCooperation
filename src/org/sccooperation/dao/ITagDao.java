package org.sccooperation.dao;

import java.util.List;

public interface ITagDao<T> {

	//创兴谷：
	//显示公司所属的标签名
	List showTagName(int jobNo);

	//躬行课堂：
	//显示按钮的名字
	List showTagNameByButton(int button);
	
		/**
	 * 根据网页传过来的tagno，查询数据库中tagno对应的方向
	 * 
	 * @param tagno网页传来的tagno
	 * @return 返回该用户信息
	 * @exception 暂时没做
	 */
	public List findtag(int tagno);

	/**
	 * 查找出所有的标签信息信息
	 * 
	 * @return 返回标签信息
	 * @exception 暂时没做
	 */
	public List findalltag();
	
	
}
