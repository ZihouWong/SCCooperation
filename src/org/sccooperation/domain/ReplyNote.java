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
@Table(name="replynote")

/** 
*hiberateӳ�����ݿ�replynote��ӳ����
* @author WLNSSS 
* @Time 2017-9-27 
*/  
public class ReplyNote {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
/*
 * ӳ�����ݿ������ֶ�
 * */
	
	private int id;
	@ManyToOne(targetEntity=People.class)
	@JoinColumn(name="rpeople",referencedColumnName="id")
	//�ظ��û�
	private People rpeople;
	@ManyToOne(targetEntity=Enterprise.class)
	@JoinColumn(name="renterprise",referencedColumnName="id")
	//�ظ���˾
	private Enterprise renterprise;
	@ManyToOne(targetEntity=Note.class)
	@JoinColumn(name="robject",referencedColumnName="id")
	//�ظ�����
	private Note robject;
	//�ظ�����
	private String content;

	//�ظ�ʱ��
	private String time;
	//״̬��
	private String state;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public People getRpeople() {
		return rpeople;
	}
	public Enterprise getRenterprise() {
		return renterprise;
	}
	public void setRenterprise(Enterprise renterprise) {
		this.renterprise = renterprise;
	}
	public Note getRobject() {
		return robject;
	}
	public void setRobject(Note robject) {
		this.robject = robject;
	}
	public void setRpeople(People rpeople) {
		this.rpeople = rpeople;
	}

	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
