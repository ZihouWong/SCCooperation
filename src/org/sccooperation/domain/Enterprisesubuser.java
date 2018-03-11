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

/**
 * Project:SCCooperation Comments:此类是hibernate对数据库的映射类。 JDK version used:JDK1.8
 * Author：blank700 Create Date：2017-12-21 Modified By： <修改人中文名或拼音缩写> Modified
 * Date: <修改日期，格式:YYYY-MM-DD> Why & What is modified <修改原因描述> Version:1.0
 */

@Entity
@Table(name = "enterprisesubuser")

/**
 * hiberate映射数据库enterprisesubuser的映射类
 * 
 * @author Blank700
 * @Time 2018-1-18
 */
public class Enterprisesubuser {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/*
	 * 映射数据库主键字段
	 */
	/* 企业用户id */
	private int id;

	/* 昵称 */
	private String nickname;

	/* 真实姓名 */
	private String realname;

	/* 手机号 */
	private String tel;

	/* qq */
	private String qq;

	/* 邮箱 */
	private String mail;

	/* 简述 */
	private String briefly;

	/* 企业id */
	private Integer eid;

	/* 企业名称 */
	private String ename;

	/* 状态 */
	private String state;

	/* 账号 */
	private String account;

	/* 密码 */
	private String password;
	
	/* 图片源地址 */
	private String pictureurl;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getBriefly() {
		return briefly;
	}

	public void setBriefly(String briefly) {
		this.briefly = briefly;
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
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

	public String getPictureurl() {
		return pictureurl;
	}

	public void setPictureurl(String pictureurl) {
		this.pictureurl = pictureurl;
	}
}
