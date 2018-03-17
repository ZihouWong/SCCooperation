package org.sccooperation.daoimpl;

import java.util.List;

import org.sccooperation.dao.IBackstageEnterprisesubuserDao;

public class EnterprisesubuserDaoImpl<T> extends BaseDaoImpl<T> implements IBackstageEnterprisesubuserDao<T> {

	@Override
	public List<T> findByPageNo(int pageNo) {
		// TODO Auto-generated method stub
		return findBypage("from Enterprisesubuser", pageNo, 10,10);
	}
	
	public List<T> searchByPageNo(String keyword, int pageNo) {
		// TODO Auto-generated method stub
		return findByPage("from Enterprisesubuser as e where e.ename like ?0 or e.nickname like ?1 or e.realname like ?2 or e.tel like ?3 or e.account like ?4 or e.mail like ?5 or e.qq like ?6 order by id desc", pageNo, 10,10, "%"+keyword+"%","%"+keyword+"%","%"+keyword+"%","%"+keyword+"%","%"+keyword+"%","%"+keyword+"%","%"+keyword+"%");
	}

}
