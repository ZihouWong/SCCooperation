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
@Table(name="note")

/** 
*hiberate映射数据库note的映射类
* @author WLNSSS 
* @Time 2017-10-14 
*/ 
public class Note {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
/*
 * 映射数据库主键字段
 * */
	
	private int id;
	//标题
	private String title;
	//内容
	private String content;
	//浏览数量
	private int seenum;
	//时间
	private String time;
	//状态吗
	private String state;
	
	//是否是回复

		private Integer note_id;
	//用户关联id
	@ManyToOne(targetEntity=People.class)
	@JoinColumn(name="people_id",referencedColumnName="id")
	private People people_id;
	//企业关联id
	//用户关联id
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
