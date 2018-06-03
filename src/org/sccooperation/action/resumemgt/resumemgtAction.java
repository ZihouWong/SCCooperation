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
	/** 实例化一个service层的变量，调用其方法 */
	private PostManage postManage;
	/** 实例化一个service层的变量，调用其方法 */
	private UserManage userManage;
	/** 网页传来的项目id */
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
		List temp=postManage.pidtofindpost(post_id);//获取出post_id对应的post信息
		Map postrq = (Map)ActionContext.getContext().get("request");//实例化Request容器
		postrq.put("post", temp);
		
		return "success";
	}
	
	public String submitresume() {
		List user=(List)ActionContext.getContext().getSession().get("user");//取出people的信息
		People objectpeople=(People)user.get(0);
		objectpeople.getId();
		
		List post=postManage.pidtofindpost(post_id);//获取出post_id对应的post信息
		Post objectpost=(Post)post.get(0);
		
		String[] peopleid = objectpost.getPeople_id().split(";");
		boolean flag=true;
		if(!peopleid[0].equals("")) {//当项目已经存在成员的情况下
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
		List post=postManage.pidtofindpost(post_id);//获取出post_id对应的post信息
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
