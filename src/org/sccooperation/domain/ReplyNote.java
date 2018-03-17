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
@Table(name="replynote")

/** 
*hiberate映射数据库replynote的映射类
* @author WLNSSS 
* @Time 2017-9-27 
*/  
public class ReplyNote {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
/*
 * 映射数据库主键字段
 * */
	
	private int id;
	@ManyToOne(targetEntity=People.class)
	@JoinColumn(name="rpeople",referencedColumnName="id")
	//回复用户
	private People rpeople;
	@ManyToOne(targetEntity=Enterprise.class)
	@JoinColumn(name="renterprise",referencedColumnName="id")
	//回复公司
	private Enterprise renterprise;
	@ManyToOne(targetEntity=Note.class)
	@JoinColumn(name="robject",referencedColumnName="id")
	//回复对象
	private Note robject;
	//回复内容
	private String content;

	//回复时间
	private String time;
	//状态吗
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
