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
@Table(name="rreplynote")

/** 
*hiberateӳ�����ݿ�rreplynote��ӳ����
* @author WLNSSS 
* @Time 2017-9-27 
*/  
public class RReplyNote {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
/*
 * ӳ�����ݿ������ֶ�
 * */
	
	private int id;
	@ManyToOne(targetEntity=People.class)
	@JoinColumn(name="rrpeople",referencedColumnName="id")
	//�ظ��û�
	private People rrpeople;
	@ManyToOne(targetEntity=Enterprise.class)
	@JoinColumn(name="rrenterprise",referencedColumnName="id")
	//�ظ���˾
	private Enterprise rrenterprise;
	@ManyToOne(targetEntity=Note.class)
	@JoinColumn(name="rrobject",referencedColumnName="id")
	//�ظ�����
	private Note rrobject;
	@ManyToOne(targetEntity=ReplyNote.class)
	@JoinColumn(name="rreplynote",referencedColumnName="id")
	//�ظ�����
	private Note rreplynote;
	//�ظ�����
	private String content;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public People getRrpeople() {
		return rrpeople;
	}
	public void setRrpeople(People rrpeople) {
		this.rrpeople = rrpeople;
	}
	public Enterprise getRrenterprise() {
		return rrenterprise;
	}
	public void setRrenterprise(Enterprise rrenterprise) {
		this.rrenterprise = rrenterprise;
	}
	public Note getRrobject() {
		return rrobject;
	}
	public void setRrobject(Note rrobject) {
		this.rrobject = rrobject;
	}
	public Note getRreplynote() {
		return rreplynote;
	}
	public void setRreplynote(Note rreplynote) {
		this.rreplynote = rreplynote;
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
	//�ظ�ʱ��
	private String time;
	//״̬��
	private String state;
}
