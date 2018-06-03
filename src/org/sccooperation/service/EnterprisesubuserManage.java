package org.sccooperation.service;

import java.util.List;

/*
 * ��˾���˻���������
 * @author WLNSSS
 * @time 2018.1.20
 * */
public interface EnterprisesubuserManage<T> {
	/*
	 * ����ҳ����ȡ����
	 * @param int pageNo ҳ��
	 * @return List ���ز�ѯ���Ľ����
	 * */
	public List<T> findByPageNo(int pageNo);
	
	public List<T> searchByPageNo(String keyword, int pageNo);
	
		public List loginCheck(String account,String password);
	public boolean passwordCheck(String password_old);
	public void insertEnterprisesubuser(T entity);
	public void updateEnterprisesubuser(T entity);
	public List findallenterprisesubuser();
	public List esuidtofindenterprisesubuser(int esu_id);

}
