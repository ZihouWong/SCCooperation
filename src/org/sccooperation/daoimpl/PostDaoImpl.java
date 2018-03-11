package org.sccooperation.daoimpl;

import java.util.List;

import org.sccooperation.dao.IPostDao;

public class PostDaoImpl extends BaseDaoImpl implements IPostDao {

	// 创兴谷：
	@Override
	public List findJobByButton(int pageNo, String button) {
		// 主页-显示标签对应的工作
		return findByPage("from Post where tagNo=?0", pageNo, 18, 18, button); 
	}
	
	public List findJobByPageNo(int pageNo) {
		//主页-显示所有工作
		return findBypage("from Post", pageNo, 24, 24);
	}

	@Override
	public List showMainJob(int pageNo, int button) {
		// 搜索页面-主体工作信息列表	
		return findByPage("from Post where tagno=?0", pageNo, 50, 50, button);
	}

	@Override
	public List showHotJob(int pageNo, int button) {
		// 搜索页面-热点工作列表
		return find("from Post order by seenum desc");
	}
	
	@Override
	public long getPostNum(Class entityClazz) {
		// 搜索页面-获得工作总数
		return findCount(entityClazz);
	}

	@Override
	public List getOtherJob(int tagNo) {
		// 显示工作详细页面-其他工作
		return find("from Post where tagno=?0", tagNo);
	}
	
	@Override
	public List showJobInfo(int jobId) {
		// 显示工作详细页面-主体信息框
		return find("from Post where id=?0", jobId);
	}
}
  