package org.sccooperation.daoimpl;

import java.util.List;

import org.sccooperation.dao.IEnterpriseDao;

public class EnterpriseDaoImpl extends BaseDaoImpl implements IEnterpriseDao {
	
	// 创兴谷：
	@Override
	public List findEnterpriseByPageNo(int pageNo) {
		// 主页-显示企业
		return findBypage("from Enterprise", pageNo, 16, 16);
	}

	@Override
	public List findEnterpriseTName(int enterpriseNo) {
		// TODO Auto-generated method stub
	
		return find("from Tag p where p.id in (select distinct tagno from Post where enterprise_id.id=?0)", enterpriseNo);
		//得到项目id
		//要找同一公司下的项目所有标签。
		//现有公司的id
		//在post表中 得到 同一公司的tagID find("from Post where enterprise_id.id=?0 and grand by tagid", enterpriseNo);
		//再从Tag表中 得到tagname find("select tagname from tag where tagid in (select tagid from Post where enterprise_id.id=?0 and grand by tagid)", enterpriseNo);
	}

	// 躬行课堂：
	@Override
	public List findPartner(int pageNo) {
		// 主页-合作伙伴
		return find("from Enterprise");
	}

}
