package org.sccooperation.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.sccooperation.domain.People;
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
@Table(name="cv")

/** 
*hiberate映射数据库cv的映射类
* @author WLNSSS 
* @Time 2017-9-27 
*/  
public class Cv {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	/**
	 * 映射数据库主键字段
	 * */
	
	private int id;
	
	/**名称*/
	private String name;
	
	/**身份证号*/
	private String idnumber;
	
	/**手机号*/
	private String pnumber;
	
	/**性别*/
	private String sex;
	
	/**生日*/
	private String birthday;
	
	/**年龄*/
	private Integer age;
	
	/**个人描述*/
	private String summary;
	
	/**工作经历*/
	private String experience;
	
	/**获奖经历*/
	private String prize;
	
	/*学校*/
	private String school;
	
	/*个人照片*/
	private String prictureurl;
	
	/*状态码*/
	private String state;
	@ManyToOne(targetEntity=People.class)
	@JoinColumn(name="user",referencedColumnName="id")
	/*user*/
	private People user;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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

	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getPrize() {
		return prize;
	}
	public void setPrize(String prize) {
		this.prize = prize;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getPrictureurl() {
		return prictureurl;
	}
	public void setPrictureurl(String prictureurl) {
		this.prictureurl = prictureurl;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public People getUser() {
		return user;
	}
	public void setUser(People user) {
		this.user = user;
	}

}
