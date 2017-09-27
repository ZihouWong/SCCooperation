package org.sccooperation.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name="people")

/** 
*hiberate映射数据库people的映射类
* @author WLNSSS 
* @Time 2017-9-27 
*/  
public class People {
	@Id
	@Column(name = "id", unique = false, nullable = false)
/*
 * 映射数据库主键字段
 * */
	
	private int id;
/* 映射数据库name属性,为用户姓名 */
	private String name;
/* 身份证号*/
	private String idnumber;
/* 手机号 */
	private String pnumber;
/* 性别 */	
	private String sex;
/* 生日 */	
	private String birthday;
/* 年龄 */	
	private int age;
/* 个人简介*/
	private String summary;
/* 图片存放位置 */
	private String picture;
/* 简历外键 */
	private int cv;
/* 账号*/	
	private String account;
/* 密码 */	
	private String password;
/* 状态码 */
	private String state;
/* 用户名*/	
    private String username;
/* 微信号 */    
    private String wechar;
/* qq号 */    
    private String qq;
    
/*
 * 以下为所有字段的set，get方法
 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdnumber() {
		return idnumber;
	}

	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}

	public String getPnumber() {
		return pnumber;
	}

	public void setPnumber(String pnumber) {
		this.pnumber = pnumber;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public int getCv() {
		return cv;
	}

	public void setCv(int cv) {
		this.cv = cv;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getWechar() {
		return wechar;
	}

	public void setWechar(String wechar) {
		this.wechar = wechar;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

}