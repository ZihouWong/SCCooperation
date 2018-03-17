package org.sccooperation.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.sccooperation.domain.Cv;

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
@Table(name="people")

/** 
*hiberate映射数据库people的映射类
* @author WLNSSS 
* @Time 2017-9-27 
*/  
public class People {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
/*
 * 映射数据库主键字段
 * */
	
	private int id;
/* 映射数据库name属性,为用户姓名 */
	private String name;
/* 身份证号*/
	private String idnumber;
/* 手机号 */
	private String pnumber;
/* 性别 */	
	private String sex;
/* 生日 */	
	private String birthday;
/* 年龄 */	
	private Integer age;
/* 个人简介*/
	private String summary;
/* 图片存放位置 */
	private String picture;
/* 简历外键 */
	@ManyToOne(targetEntity=Cv.class)
	@JoinColumn(name="cv",referencedColumnName="id")
    
	private Cv cv;
/* 账号*/	
	private String account;
/* 密码 */	
	private String password;
/* 状态码 */
	private String state;
/* 用户名*/	
    private String username;
/* 邮箱 */    
    private String mail;
/* qq号 */    
    private String qq;
    /*发帖总数*/
    private int notesum;
    //个性标签
    private String tagno;
    
/*
 * 以下为所有字段的set，get方法
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

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public Cv getCv() {
		return cv;
	}

	public void setCv(Cv cv) {
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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
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

	public int getNotesum() {
		return notesum;
	}

	public void setNotesum(int notesum) {
		this.notesum = notesum;
	}

	public String getTagno() {
		return tagno;
	}

	public void setTagno(String tagno) {
		this.tagno = tagno;
	}

	

}