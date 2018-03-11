package org.sccooperation.service;

import java.util.List;

public interface EnterpriseManage {
	
	public List findEnterpriseByPageNo(int pageNo);

	public List showETagName(int JobNo);

	public List findPartner(int pageNo);
}
