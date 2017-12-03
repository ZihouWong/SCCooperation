package org.sccooperation.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tag")
/** 
*hiberateӳ�����ݿ�tag��ӳ����
* @author WLNSSS 
* @Time 2017-9-27 
*/  
public class Tag {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Integer id;
	
	private String tagname;
	
	private Integer bigTagName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTagname() {
		return tagname;
	}

	public void setTagname(String tagname) {
		this.tagname = tagname;
	}

	public Integer getBigTagName() {
		return bigTagName;
	}

	public void setBigTagName(Integer bigTagName) {
		this.bigTagName = bigTagName;
	}
	
	

}
