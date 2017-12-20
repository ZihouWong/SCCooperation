package org.sccooperation.service;

import java.util.List;

public interface PostManage {

	public List findJobByButtom(int pageNo, String buttom);

	public List findJobByPageNo(int pageNo);
}
