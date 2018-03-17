package org.sccooperation.daoimpl;

import java.util.List;

import org.sccooperation.dao.ITagDao;

public class TagDaoImpl extends BaseDaoImpl implements ITagDao {

	// 创兴谷：

	@Override
	public List showTagName(int jobNo) {
		// 显示公司所属的标签名
		return find("from Tag where id=?0", jobNo);
	}


	// 躬行课堂：

	@Override
	public List showTagNameByButton(int button) {
		// 显示按钮的名字
		return find("from Tag where id=?0", button);
	}

}
