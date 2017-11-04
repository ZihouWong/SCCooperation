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
@Table(name="rreplynote")

/** 
*hiberate映射数据库rreplynote的映射类
* @author WLNSSS 
* @Time 2017-9-27 
*/  
public class RReplyNote {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
/*
 * 映射数据库主键字段
 * */
	
	private int id;
	@ManyToOne(targetEntity=People.class)
	@JoinColumn(name="rrpeople",referencedColumnName="id")
	//回复用户
	private People rrpeople;
	@ManyToOne(targetEntity=Enterprise.class)
	@JoinColumn(name="rrenterprise",referencedColumnName="id")
	//回复公司
	private Enterprise rrenterprise;
	@ManyToOne(targetEntity=Note.class)
	@JoinColumn(name="rrobject",referencedColumnName="id")
	//回复对象
	private Note rrobject;
	@ManyToOne(targetEntity=ReplyNote.class)
	@JoinColumn(name="rreplynote",referencedColumnName="id")
	//回复对象
	private Note rreplynote;
	//回复内容
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
	//回复时间
	private String time;
	//状态吗
	private String state;
}
