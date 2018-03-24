package org.sccooperation.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**                     
* Project:SCCooperation                                            
* Comments:此类是hibernate对数据库的映射类。                                          
* JDK version used:JDK1.8                                                          
* Author：WLNSSS                 
* Create Date：2017-9-27 
* Modified By：   <修改人中文名或拼音缩写>                                         
* Modified Date: <修改日期，格式:YYYY-MM-DD>                                    
* Why & What is modified  <修改原因描述>    
* Version:1.0                       
*/ 

@Entity
@Table(name="p")

/** 
*hiberate映射数据库p的映射类
* @author WLNSSS 
* @Time 2017-10-14 
*/ 
public class P {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
/*
 * 映射数据库主键字段
 * */
	
	private int id;
	
	private int account;
	
	private int password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}
}
