package org.sccooperation.action.enterprisecenter;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

import org.sccooperation.domain.Post;
import org.sccooperation.domain.Tag;
import org.sccooperation.domain.People;
import org.sccooperation.domain.Enterprise;
import org.sccooperation.domain.Enterprisesubuser;
import org.sccooperation.service.UserManage;
import org.sccooperation.service.PostManage;
import org.sccooperation.service.TagManage;
import org.sccooperation.service.EnterprisesubuserManage;

import com.opensymphony.xwork2.ActionContext;

import sun.misc.BASE64Encoder;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

public class ProjectManagementAction<T> {
	// 显示项目管理的界面
	/** 实例化一个service层的变量，调用其方法 */
	private PostManage postManage;
	/** 实例化一个service层的变量，调用其方法 */
	private EnterprisesubuserManage enterprisesubuserManage;
	/** 实例化一个service层的变量，调用其方法 */
	private TagManage tagManage;
	/** 实例化一个service层的变量，调用其方法 */
	private UserManage userManage;
	/** 网页传来的页数 */
	private int pageNo;

	public PostManage getPostManage() {
		return postManage;
	}

	public void setPostManage(PostManage postManage) {
		this.postManage = postManage;
	}

	public EnterprisesubuserManage getEnterprisesubuserManage() {
		return enterprisesubuserManage;
	}

	public void setEnterprisesubuserManage(EnterprisesubuserManage enterprisesubuserManage) {
		this.enterprisesubuserManage = enterprisesubuserManage;
	}

	public TagManage getTagManage() {
		return tagManage;
	}

	public void setTagManage(TagManage tagManage) {
		this.tagManage = tagManage;
	}

	public UserManage getUserManage() {
		return userManage;
	}

	public void setUserManage(UserManage userManage) {
		this.userManage = userManage;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	// 新增项目
	/** 网页传来的项目名称 */
	private String projectname;
	/** 网页传来的简介 */
	private String summary;
	/** 网页传来的工作地点 */
	private String place;
	/** 网页传来的工作时间 */
	private String ptime;
	/** 网页传来的要求 */
	private String demand;
	/** 网页传来的薪资待遇 */
	private String remuneration;
	/** 网页传来的报名截止时间 */
	private String stime;
	/** 网页传来的职位诱惑 */
	private String allure;
	/** 网页传来的联系方式 */
	private String contact;
	/** 网页传来的项目类型 */
	private int tagno;
	/** 网页传来的项目负责人id */
	private int enterprisesubuser_id;

	public String getProjectname() {
		return projectname;
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname;
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

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public int getTagno() {
		return tagno;
	}

	public void setTagno(int tagno) {
		this.tagno = tagno;
	}

	public int getEnterprisesubuser_id() {
		return enterprisesubuser_id;
	}

	public void setEnterprisesubuser_id(int enterprisesubuser_id) {
		this.enterprisesubuser_id = enterprisesubuser_id;
	}

	// 修改项目的信息
	private int post_id;

	public int getPost_id() {
		return post_id;
	}

	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}

	// 显示项目管理的界面
	public String displayprojectmanagement() {
		System.out.println("start display projectmanagement");
		List e = (List) ActionContext.getContext().getSession().get("enterprise");
		Enterprise enterprise = (Enterprise) e.get(0);

		// 查询出该企业所创建的项目
		System.out.println("开始根据enterprise的id查询Post");
		List epost = postManage.eidtofindpostbypage(enterprise.getId(), pageNo);
		System.out.println("完成Post的查询");
		ActionContext.getContext().getSession().put("epost", epost);

		// 查询出各个项目的负责人
		System.out.println("查询出各个项目的负责人");
		List listesu = new ArrayList();
		for (int i = 0; i < epost.size(); i++) {
			Post post = (Post) epost.get(i);
			listesu.add(post.getManager_id());
		}
		Map postinfo = (Map) ActionContext.getContext().get("request");// 实例化Request容器
		postinfo.put("post_esu", listesu);

		// 查询出各个项目的tag类别
		System.out.println("查询出各个项目的tag类别");
		List listtag = new ArrayList();
		for (int i = 0; i < epost.size(); i++) {
			Post post = (Post) epost.get(i);
			System.out.println("tagno:" + post.getTagno());
			List listtemp = tagManage.findtag(post.getTagno());
			listtag.add(listtemp.get(0));// error????遍历方式导致???
		}
		postinfo.put("post_tag", listtag);

		// 查询出各个项目的参与人员
		System.out.println("查询出各个项目的参与人员");
		List listpeople = new ArrayList();
		for (int i = 0; i < epost.size(); i++) {
			Post post = (Post) epost.get(i);
			String[] peopleid = post.getPeople_id().split(";");
			
			List peopleidarray=new ArrayList();
			if(!peopleid[0].equals("")) {
				for(int j=0;j<peopleid.length;++j) {
					int a=Integer.parseInt(peopleid[j]);
					People p=(People)userManage.idtouser(a).get(0);
					peopleidarray.add(p);
				}
			}
			System.out.println("people_id:" + post.getPeople_id());
			listpeople.add(peopleidarray);
		}
		//People pp=(People)((People[])listpeople.get(0))[0];//list.数组[]
		postinfo.put("post_people", listpeople);

		// 查询出所有的负责人
		System.out.println("查询出所有的负责人");
		System.out.println("开始查询所有Enterprisesubuser的记录");
		List esu = enterprisesubuserManage.findallenterprisesubuser();
		System.out.println("完成Enterprisesubuser的查询");
		ActionContext.getContext().getSession().put("esu", esu);

		// 查询出所有的tag信息
		System.out.println("查询出所有的tag信息");
		System.out.println("开始查询所有Tag的记录");
		List protag = tagManage.findalltag();
		System.out.println("完成Tag的查询");
		ActionContext.getContext().getSession().put("protag", protag);

		return "success";
	}

	// 新增项目
	public String addproject() {
		System.out.println("start insert post");
		List e = (List) ActionContext.getContext().getSession().get("enterprise");
		Enterprise enterprise = (Enterprise) e.get(0);

		Post post = new Post();
		post.setProjectname(projectname);
		post.setSummary(summary);
		post.setPlace(place);
		post.setPtime(ptime);
		post.setDemand(demand);
		post.setRemuneration(remuneration);
		post.setStime(stime);
		post.setAllure(allure);
		post.setContact(contact);
		post.setTagno(tagno);

		post.setEnterprise_id(enterprise);
		post.setEname(enterprise.getEname());
		post.setPictureurl(enterprise.getPictureurl());

		List esu = enterprisesubuserManage.esuidtofindenterprisesubuser(enterprisesubuser_id);
		Enterprisesubuser enterprisesubuser = (Enterprisesubuser) esu.get(0);
		post.setManager_id(enterprisesubuser);

		postManage.insertPost(post);

		return "success";
	}

	// 修改项目信息
	public String updateproject() {
		System.out.println("start update post");

		System.out.println("start find post");
		List listp = postManage.pidtofindpost(post_id);
		System.out.println("finish find post");
		Post post = (Post) listp.get(0);

		post.setProjectname(projectname);
		post.setSummary(summary);
		post.setPlace(place);
		post.setPtime(ptime);
		post.setDemand(demand);
		post.setRemuneration(remuneration);
		post.setStime(stime);
		post.setAllure(allure);
		post.setContact(contact);
		post.setTagno(tagno);

		List esu = enterprisesubuserManage.esuidtofindenterprisesubuser(enterprisesubuser_id);
		Enterprisesubuser enterprisesubuser = (Enterprisesubuser) esu.get(0);
		post.setManager_id(enterprisesubuser);

		postManage.updatePost(post);

		return "success";
	}
}
