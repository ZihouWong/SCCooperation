package org.sccooperation.daoimpl;

import java.util.List;

import org.sccooperation.dao.IBackstagePostDao;

public class BackstagePostDaoImpl<T> extends BaseDaoImpl<T> implements IBackstagePostDao<T> {

	@Override
	public List<T> findByPageNo(int pageNo) {
		// TODO Auto-generated method stub
		return findBypage("from Post", pageNo, 10,10);
	}
	
	public List<T> searchByPageNo(String keyword, int pageNo) {
		// TODO Auto-generated method stub
		return findByPage("from Post as e where e.ename like ?0 or e.place like ?1 or e.allure like ?2 or e.demand like ?3 or e.tagno like ?4 or e.contact like ?5 order by id desc", pageNo, 10,10, "%"+keyword+"%","%"+keyword+"%","%"+keyword+"%","%"+keyword+"%","%"+keyword+"%","%"+keyword+"%");
	}

}
