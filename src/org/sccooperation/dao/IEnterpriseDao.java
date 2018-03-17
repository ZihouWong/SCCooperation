package org.sccooperation.dao;

import java.util.List;

/*
 * ÆóÒµ²Ù×÷µ×²ã½Ó¿Ú
 * @author WLNSSS
 * @time 2018.1.17
 * */
public interface IEnterpriseDao<T> {
	
	//¸ù¾ÝÒ³ºÅ²éÕÒÆóÒµ
	public List<T> findByPageNo(int pageNo);
	
	 /**
  	 * Ìõ¼þËÑË÷Ìû×Ó
  	 * 
  	 * @param ¹Ø¼ü´Ê
  	 * @return ËÑË÷½á¹û
  	 * @exception ÔÝÊ±Ã»×ö
  	 */
     public List<T> searchByPageNo(String keyword,int pageNo);
	
	/*******************************黄智豪******************************/
	public List findEnterpriseByPageNo(int pageNo);

	public List findEnterpriseTName(int enterpriseNo);

	public List findPartner(int pageNo);

}
