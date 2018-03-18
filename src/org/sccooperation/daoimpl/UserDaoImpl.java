package org.sccooperation.daoimpl;

import java.util.List;

import org.sccooperation.dao.IUserDao;
import org.sccooperation.domain.People;
/**
 * Project:SCCooperation Comments:�������û������ӿ�ʵ����
 *  JDK version used:JDK1.8 
 *  Author��WLNSSS Create Date��2017-9-27 Modified By�� <�޸�����������ƴ����д>
 * Modified Date: <�޸����ڣ���ʽ:YYYY-MM-DD> Why & What is modified <�޸�ԭ������>
 * Version:1.0
 */


public class UserDaoImpl<T> extends BaseDaoImpl<T> implements IUserDao<T> {
  /*
   * ���ӿ���˵���˴���׸��
  */  
	@Override
	public List loginCheck(String account, String password) {
		// TODO Auto-generated method stub

		List<T> pp=find("from People where account =?0 and password = ?1", account,password);
		//List pl= sess.createQuery("from User where account =? and password = ?").setString(0, account).setString(1, password).list();
        
		if(!pp.isEmpty())
		{
			return pp;
		}
		return pp;
	}
	
	
	
	
	/*******************WLNSSS*******************************************************************/
	
	  /*
	   * ���ӿ���˵���˴���׸��
	  */  

	@Override
	public void insertUser(T entity) {
		// TODO Auto-generated method stub
		save(entity);
	}
	
	  /*
	   * ���ӿ���˵���˴���׸��
	  */  

	public List<T> selectAllUser(int pageNo) {
		// TODO Auto-generated method stub
		return   findBypage("from People", pageNo, 12,12);
	}
	
	public List<T> searchByPageNo(String keyword,int pageNo) {
		// TODO Auto-generated method stub
		System.out.println(keyword);
		return findByPage("from People as n where n.name like ?0 or n.idnumber like ?1 or n.pnumber like ?2 or n.sex like ?3 or n.age like ?4 or n.account like ?5 or n.username like 6 order by time desc", pageNo, 10,10, "%"+keyword+"%","%"+keyword+"%","%"+keyword+"%","%"+keyword+"%","%"+keyword+"%","%"+keyword+"%","%"+keyword+"%");
	}




	@Override
	public List<T> backstageLoginCheck(String account, String password) {
		// TODO Auto-generated method stub
		List<T> pp=find("from BackstageUser where account =?0 and password = ?1", account,password);
		
		return pp;
	}
	
		@Override
	public boolean passwordCheck(String password) {
		// TODO Auto-generated method stub
		List<T> rp = find("from People where password =?0", password);
		if (!rp.isEmpty()) {
			return true;
		} else {
			return false;
		}
		}
		
			@Override
	public void updateUser(T entity) {
		// TODO Auto-generated method stub
		update(entity);
	}

}
