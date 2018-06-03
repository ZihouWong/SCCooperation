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
 * Project:SCCooperation Comments:������hibernate�����ݿ��ӳ���ࡣ JDK version used:JDK1.8
 * Author��blank700 Create Date��2017-12-21 Modified By�� <�޸�����������ƴ����д> Modified
 * Date: <�޸����ڣ���ʽ:YYYY-MM-DD> Why & What is modified <�޸�ԭ������> Version:1.0
 */

@Entity
@Table(name = "enterprisesubuser")

/**
 * hiberateӳ�����ݿ�enterprisesubuser��ӳ����
 * 
 * @author Blank700
 * @Time 2018-1-18
 */
public class Enterprisesubuser {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/*
	 * ӳ�����ݿ������ֶ�
	 */
	/* ��ҵ�û�id */
	private int id;

	/* �ǳ� */
	private String nickname;

	/* ��ʵ���� */
	private String realname;

	/* �ֻ��� */
	private String tel;

	/* qq */
	private String qq;

	/* ���� */
	private String mail;

	/* ���� */
	private String briefly;

	/* ��ҵid */
	private Integer eid;

	/* ��ҵ���� */
	private String ename;

	/* ״̬ */
	private String state;

	/* �˺� */
	private String account;

	/* ���� */
	private String password;
	
	/* ͼƬԴ��ַ */
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
