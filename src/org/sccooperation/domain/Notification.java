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
* Create Date��2018-2-3 
* Modified By��   <�޸�����������ƴ����д>                                         
* Modified Date: <�޸����ڣ���ʽ:YYYY-MM-DD>                                    
* Why & What is modified  <�޸�ԭ������>    
* Version:1.0                       
*/ 

@Entity
@Table(name="notification")

/** 
*hiberateӳ�����ݿ�notification��ӳ����
* @author blank700 
* @Time 2012-2-3 
*/ 

public class Notification {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
/*
 * ӳ�����ݿ������ֶ�
 * */
	
	private int id;
	
	/*����*/
	private String title;
	
	/*����*/
	private String contect;
	
	/*ʱ���*/
	private int timestamp;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContect() {
		return contect;
	}

	public void setContect(String contect) {
		this.contect = contect;
	}

	public int getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(int timestamp) {
		this.timestamp = timestamp;
	}
}
