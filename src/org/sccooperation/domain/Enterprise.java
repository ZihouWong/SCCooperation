package org.sccooperation.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name="enterprise")

/** 
*hiberateӳ�����ݿ�enterprise��ӳ����
* @author WLNSSS 
* @Time 2017-9-27 
*/  
public class Enterprise {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
/*
 * ӳ�����ݿ������ֶ�
 * */
	
	private int id;
	
	/*��ҵ����*/
	private String ename;
	
	/*���*/
	private String summary;
	
	/*�ص�*/
	private String place;
	
	/*����ʱ��*/
	private String btime;
	
	/*��˾����*/
	private String property;
	
	/*������ַ*/
	private String website;
	
	/*ceo*/
	private String ceo;
	
	/*������ҵ*/
	private String vocation;
	
	/*ͼƬԴ��ַ*/
	private String pictureurl;
	
	/*�˺�*/
	private String account;
	
	/*����*/
	private String password;
	
	/*״̬��*/
	private String state;
	
	/*��ϵ��ʽ*/
	private String contact;
	
	//���Ի���ǩ
	private String tagno;
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getBtime() {
		return btime;
	}

	public void setBtime(String btime) {
		this.btime = btime;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public String getVocation() {
		return vocation;
	}

	public void setVocation(String vocation) {
		this.vocation = vocation;
	}

	public String getPictureurl() {
		return pictureurl;
	}

	public void setPictureurl(String pictureurl) {
		this.pictureurl = pictureurl;
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

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getTagno() {
		return tagno;
	}

	public void setTagno(String tagno) {
		this.tagno = tagno;
	}


	
}
