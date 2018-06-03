package org.sccooperation.service;

import java.util.List;

/*
 * 后台项目管理入口
 * */
public interface BackstagePostManage<T> {
	/*
	 * 根据页数获取数据
	 * @param int pageNo 页数
	 * @return List 返回查询到的结果集
	 * */
	public List<T> findByPageNo(int pageNo);
	
	public List<T> searchByPageNo(String keyword, int pageNo);

}
