package org.sccooperation.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name="note")

/** 
*hiberateӳ�����ݿ�note��ӳ����
* @author WLNSSS 
* @Time 2017-10-14 
*/ 
public class Note {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
/*
 * ӳ�����ݿ������ֶ�
 * */
	
	private int id;
	//����
	private String title;
	//����
	private String content;
	//�������
	private int seenum;
	//ʱ��
	private String time;
	//״̬��
	private String state;
	
	//�Ƿ��ǻظ�

		private Integer note_id;
	//�û�����id
	@ManyToOne(targetEntity=People.class)
	@JoinColumn(name="people_id",referencedColumnName="id")
	private People people_id;
	//��ҵ����id
	//�û�����id
	@ManyToOne(targetEntity=Enterprise.class)
	@JoinColumn(name="enterprise_id",referencedColumnName="id")
	private Enterprise enterprise_id;
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getSeenum() {
		return seenum;
	}
	public void setSeenum(int seenum) {
		this.seenum = seenum;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}

	public People getPeople_id() {
		return people_id;
	}
	public void setPeople_id(People people_id) {
		this.people_id = people_id;
	}
	public Enterprise getEnterprise_id() {
		return enterprise_id;
	}
	public void setEnterprise_id(Enterprise enterprise_id) {
		this.enterprise_id = enterprise_id;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getNote_id() {
		return note_id;
	}
	public void setNote_id(Integer note_id) {
		this.note_id = note_id;
	}
	
	
	
	
}
