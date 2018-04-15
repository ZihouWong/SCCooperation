package org.sccooperation.service;

import java.util.List;

import org.sccooperation.domain.People;

/**
 * Project:SCCooperation Comments:姝ょ被鏄敤鎴锋湇鍔″眰鎺ュ彛
 *  JDK version used:JDK1.8 
 *  Author锛歐LNSSS Create Date锛�2017-9-27 Modified By锛� <淇敼浜轰腑鏂囧悕鎴栨嫾闊崇缉鍐�>
 * Modified Date: <淇敼鏃ユ湡锛屾牸寮�:YYYY-MM-DD> Why & What is modified <淇敼鍘熷洜鎻忚堪>
 * Version:1.0
 */
public interface UserManage<T> {
	/*
	 *杩欓噷鏆傛椂鍜宒ao灞傚樊涓嶅锛岀被浼间簬浠ｇ悊绫伙紝璋冪敤dao灞傜殑鏂规硶瀹炵幇 
	 */
	public List loginCheck(String account,String password);
	public boolean passwordCheck(String password_old);
	public void insertUser(T entity);
	public List<T> idtouser(int pid);
	
	public List<People> selectAllUser(int pageNo);
	
	public List<T> searchByPageNo(String keyword,int pageNo);
	
	public List<T> backstageLoginCheck(String account, String password);
	
		public void updateUser(T entity);
}
