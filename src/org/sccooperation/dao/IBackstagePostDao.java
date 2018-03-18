package org.sccooperation.dao;

import java.util.List;

/*
 * 后台项目管理基础操作
 * @author WLNSSS
 * @time 2018.1.21
 * */
public interface IBackstagePostDao<T> {

	//根据页号查找项目
		public List<T> findByPageNo(int pageNo);
		
		public List<T> searchByPageNo(String keyword, int pageNo);
}
