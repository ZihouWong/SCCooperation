package org.sccooperation.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="course")
	// 课程表
public class Course{
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	// 课程id
	private int id;
	// 查看人数
	private Integer seenum;
	// 课程对应的标签号
	private Integer tagno;
	// 课程价格
	private Integer price;
	// 课程简介
	private String summary;
	// 课程标题
	private String title;
	// 课程的URL
	private String pictureurl;
	// 教师ID
	private String people_id;
	// 学习时长
	private String timeconsuming;
	// 视频的URL
	private String videourl;
	// 课程目录
	private String catalogue;
	
	public String getVideourl() {
		return videourl;
	}

	public String getPeople_id() {
		return people_id;
	}

	public void setPeople_id(String people_id) {
		this.people_id = people_id;
	}

	public void setVideourl(String videourl) {
		this.videourl = videourl;
	}

	public String getTimeconsuming() {
		return timeconsuming;
	}

	public void setTimeconsuming(String timeconsuming) {
		this.timeconsuming = timeconsuming;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPictureurl() {
		return pictureurl;
	}

	public void setPictureurl(String pictureurl) {
		this.pictureurl = pictureurl;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getSeenum() {
		return seenum;
	}

	public void setSeenum(Integer seenum) {
		this.seenum = seenum;
	}

	public Integer getTagno() {
		return tagno;
	}

	public void setTagno(Integer tagno) {
		this.tagno = tagno;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getCatalogue() {
		return catalogue;
	}

	public void setCatalogue(String catalogue) {
		this.catalogue = catalogue;
	}
	
	
}
