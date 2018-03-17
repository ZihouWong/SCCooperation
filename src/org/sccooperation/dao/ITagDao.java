package org.sccooperation.dao;

import java.util.List;

public interface ITagDao {

	//创兴谷：
	//显示公司所属的标签名
	List showTagName(int jobNo);

	//躬行课堂：
	//显示按钮的名字
	List showTagNameByButton(int button);
	
}
