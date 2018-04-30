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
	// ��ʾ��Ŀ����Ľ���
	/** ʵ����һ��service��ı����������䷽�� */
	private PostManage postManage;
	/** ʵ����һ��service��ı����������䷽�� */
	private EnterprisesubuserManage enterprisesubuserManage;
	/** ʵ����һ��service��ı����������䷽�� */
	private TagManage tagManage;
	/** ʵ����һ��service��ı����������䷽�� */
	private UserManage userManage;
	/** ��ҳ������ҳ�� */
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

	// ������Ŀ
	/** ��ҳ��������Ŀ���� */
	private String projectname;
	/** ��ҳ�����ļ�� */
	private String summary;
	/** ��ҳ�����Ĺ����ص� */
	private String place;
	/** ��ҳ�����Ĺ���ʱ�� */
	private String ptime;
	/** ��ҳ������Ҫ�� */
	private String demand;
	/** ��ҳ������н�ʴ��� */
	private String remuneration;
	/** ��ҳ�����ı�����ֹʱ�� */
	private String stime;
	/** ��ҳ������ְλ�ջ� */
	private String allure;
	/** ��ҳ��������ϵ��ʽ */
	private String contact;
	/** ��ҳ��������Ŀ���� */
	private int tagno;
	/** ��ҳ��������Ŀ������id */
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

	// �޸���Ŀ����Ϣ
	private int post_id;

	public int getPost_id() {
		return post_id;
	}

	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}

	// ��ʾ��Ŀ����Ľ���
	public String displayprojectmanagement() {
		System.out.println("start display projectmanagement");
		List e = (List) ActionContext.getContext().getSession().get("enterprise");
		Enterprise enterprise = (Enterprise) e.get(0);

		// ��ѯ������ҵ����������Ŀ
		System.out.println("��ʼ����enterprise��id��ѯPost");
		List epost = postManage.eidtofindpostbypage(enterprise.getId(), pageNo);
		System.out.println("���Post�Ĳ�ѯ");
		ActionContext.getContext().getSession().put("epost", epost);

		// ��ѯ��������Ŀ�ĸ�����
		System.out.println("��ѯ��������Ŀ�ĸ�����");
		List listesu = new ArrayList();
		for (int i = 0; i < epost.size(); i++) {
			Post post = (Post) epost.get(i);
			listesu.add(post.getManager_id());
		}
		Map postinfo = (Map) ActionContext.getContext().get("request");// ʵ����Request����
		postinfo.put("post_esu", listesu);

		// ��ѯ��������Ŀ��tag���
		System.out.println("��ѯ��������Ŀ��tag���");
		List listtag = new ArrayList();
		for (int i = 0; i < epost.size(); i++) {
			Post post = (Post) epost.get(i);
			System.out.println("tagno:" + post.getTagno());
			List listtemp = tagManage.findtag(post.getTagno());
			listtag.add(listtemp.get(0));// error????������ʽ����???
		}
		postinfo.put("post_tag", listtag);

		// ��ѯ��������Ŀ�Ĳ�����Ա
		System.out.println("��ѯ��������Ŀ�Ĳ�����Ա");
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
		//People pp=(People)((People[])listpeople.get(0))[0];//list.����[]
		postinfo.put("post_people", listpeople);

		// ��ѯ�����еĸ�����
		System.out.println("��ѯ�����еĸ�����");
		System.out.println("��ʼ��ѯ����Enterprisesubuser�ļ�¼");
		List esu = enterprisesubuserManage.findallenterprisesubuser();
		System.out.println("���Enterprisesubuser�Ĳ�ѯ");
		ActionContext.getContext().getSession().put("esu", esu);

		// ��ѯ�����е�tag��Ϣ
		System.out.println("��ѯ�����е�tag��Ϣ");
		System.out.println("��ʼ��ѯ����Tag�ļ�¼");
		List protag = tagManage.findalltag();
		System.out.println("���Tag�Ĳ�ѯ");
		ActionContext.getContext().getSession().put("protag", protag);

		return "success";
	}

	// ������Ŀ
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

	// �޸���Ŀ��Ϣ
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
