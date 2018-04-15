package org.sccooperation.action.resumemgt;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

import org.sccooperation.domain.Post;
import org.sccooperation.domain.People;
import org.sccooperation.domain.Enterprise;
import org.sccooperation.service.TagManage;
import org.sccooperation.service.UserManage;
import org.sccooperation.service.PostManage;
import org.sccooperation.service.EnterpriseManage;

import com.opensymphony.xwork2.ActionContext;

import sun.misc.BASE64Encoder;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

public class resumemgtAction {
	/** ʵ����һ��service��ı����������䷽�� */
	private PostManage postManage;
	/** ʵ����һ��service��ı����������䷽�� */
	private UserManage userManage;
	/** ��ҳ��������Ŀid */
	private int post_id;
	
	private int people_id;
	
	public PostManage getPostManage() {
		return postManage;
	}

	public void setPostManage(PostManage postManage) {
		this.postManage = postManage;
	}

	public UserManage getUserManage() {
		return userManage;
	}

	public void setUserManage(UserManage userManage) {
		this.userManage = userManage;
	}

	public int getPost_id() {
		return post_id;
	}

	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}
	
	public int getPeople_id() {
		return people_id;
	}

	public void setPeople_id(int people_id) {
		this.people_id = people_id;
	}

	public String displaypostinfo() {
		List temp=postManage.pidtofindpost(post_id);//��ȡ��post_id��Ӧ��post��Ϣ
		Map postrq = (Map)ActionContext.getContext().get("request");//ʵ����Request����
		postrq.put("post", temp);
		
		return "success";
	}
	
	public String submitresume() {
		List user=(List)ActionContext.getContext().getSession().get("user");//ȡ��people����Ϣ
		People objectpeople=(People)user.get(0);
		objectpeople.getId();
		
		List post=postManage.pidtofindpost(post_id);//��ȡ��post_id��Ӧ��post��Ϣ
		Post objectpost=(Post)post.get(0);
		
		String[] peopleid = objectpost.getPeople_id().split(";");
		boolean flag=true;
		if(!peopleid[0].equals("")) {//����Ŀ�Ѿ����ڳ�Ա�������
			for(int i=0;i<peopleid.length;++i) {
				if(Integer.parseInt(peopleid[i])==objectpeople.getId()) {
					flag=false;
					break;
				}
			}
		}
		String objectpeopleid=new String();
		if(flag) {
			for(int i=0;i<peopleid.length;++i) {
				objectpeopleid=objectpeopleid+objectpeople.getId()+";";
			}
			objectpost.setPeople_id(objectpeopleid);
			postManage.updatePost(objectpost);
		}
		return "success";
	}
	
	public String deleteresume() {
		List post=postManage.pidtofindpost(post_id);//��ȡ��post_id��Ӧ��post��Ϣ
		Post objectpost=(Post)post.get(0);
		
		String[] peopleid = objectpost.getPeople_id().split(";");
		String objectpeopleid=new String();
		for(int i=0;i<peopleid.length;++i) {
			if(Integer.parseInt(peopleid[i])!=people_id) {
				objectpeopleid=objectpeopleid+peopleid[i]+";";
			}
		}
		objectpost.setPeople_id(objectpeopleid);
		postManage.updatePost(objectpost);
		return "success";
	}
}
