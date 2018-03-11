package org.sccooperation.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="post")


/** 
*hiberateӳ�����ݿ�post��ӳ����
* @author WLNSSS 
* @Time 2017-9-27 
*/  
public class Post {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int id;
	
	private String ename;
	
	private String summary;
	
	private String place;
	
	private String ptime;
	
	private String demand;
	
	private String remuneration;
	
	private String stime;
	
	private String allure;
	
	private String pictureurl;

	private String state;
	
	private String contact;
	
	private Integer tagno;
	
	private Integer seenum;
	
	@ManyToOne(targetEntity=Enterprisesubuser.class)
	@JoinColumn(name="manager_id",referencedColumnName="id")
	private Enterprisesubuser manager_id;
	
	@ManyToOne(targetEntity=Enterprise.class)
	@JoinColumn(name="enterprise_id",referencedColumnName="id")
	private Enterprise enterprise_id;
	
	
	private String people_id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getPtime() {
		return ptime;
	}

	public void setPtime(String ptime) {
		this.ptime = ptime;
	}

	public String getDemand() {
		return demand;
	}

	public void setDemand(String demand) {
		this.demand = demand;
	}

	public String getRemuneration() {
		return remuneration;
	}

	public void setRemuneration(String remuneration) {
		this.remuneration = remuneration;
	}

	public String getStime() {
		return stime;
	}

	public void setStime(String stime) {
		this.stime = stime;
	}

	public String getAllure() {
		return allure;
	}

	public void setAllure(String allure) {
		this.allure = allure;
	}

	public String getPictureurl() {
		return pictureurl;
	}

	public void setPictureurl(String pictureurl) {
		this.pictureurl = pictureurl;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Integer getTagno() {
		return tagno;
	}

	public void setTagno(Integer tagno) {
		this.tagno = tagno;
	}

	public Integer getSeenum() {
		return seenum;
	}

	public void setSeenum(Integer seenum) {
		this.seenum = seenum;
	}

	public Enterprise getEnterprise_id() {
		return enterprise_id;
	}

	public void setEnterprise_id(Enterprise enterprise_id) {
		this.enterprise_id = enterprise_id;
	}

	public String getPeople_id() {
		return people_id;
	}

	public void setPeople_id(String people_id) {
		this.people_id = people_id;
	}
	
	public Enterprisesubuser getManager_id() {
		return manager_id;
	}

	public void setManager_id(Enterprisesubuser manager_id) {
		this.manager_id = manager_id;
	}

	
	
	

}
