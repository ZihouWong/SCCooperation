package org.sccooperation.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**                     
* Project:SCCooperation                                            
* Comments:������hibernate�����ݿ��ӳ���ࡣ                                          
* JDK version used:JDK1.8                                                          
* Author��WLNSSS                 
* Create Date��2017-9-27 
* Modified By��   <�޸�����������ƴ����д>                                         
* Modified Date: <�޸����ڣ���ʽ:YYYY-MM-DD>                                    
* Why & What is modified  <�޸�ԭ������>    
* Version:1.0                       
*/ 

@Entity
@Table(name="people")

/** 
*hiberateӳ�����ݿ�people��ӳ����
* @author WLNSSS 
* @Time 2017-9-27 
*/  
public class People {
	@Id
	@Column(name = "id", unique = false, nullable = false)
/*
 * ӳ�����ݿ������ֶ�
 * */
	
	private int id;
/* ӳ�����ݿ�name����,Ϊ�û����� */
	private String name;
/* ���֤��*/
	private String idnumber;
/* �ֻ��� */
	private String pnumber;
/* �Ա� */	
	private String sex;
/* ���� */	
	private String birthday;
/* ���� */	
	private int age;
/* ���˼��*/
	private String summary;
/* ͼƬ���λ�� */
	private String picture;
/* ������� */
	private int cv;
/* �˺�*/	
	private String account;
/* ���� */	
	private String password;
/* ״̬�� */
	private String state;
/* �û���*/	
    private String username;
/* ΢�ź� */    
    private String wechar;
/* qq�� */    
    private String qq;
    
/*
 * ����Ϊ�����ֶε�set��get����
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