package org.sccooperation.action.personalcenter;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import org.sccooperation.domain.People;
import org.sccooperation.service.UserManage;

import com.opensymphony.xwork2.ActionContext;

/**
 * Project:SCCooperation Comments:此类action，先由spring装配一个实例，然后将该实例交给struts管理,主要功能是用户申请修改个人信息时，根据用户返回的信息修改用户表中的内容
 *  JDK version used:JDK1.8 
 *  Author：blank700 Create Date：2017-11-24 Modified By： blank700<修改人中文名或拼音缩写>
 * Modified Date:2017-11-30 <修改日期，格式:YYYY-MM-DD> Why & What is modified <修改原因描述>
 * Version:1.0
 */
public class ModifypeopleAction {
	/**实例化一个service层的变量，调用其方法*/
	private UserManage userManage;
	/**网页传来的姓名*/
	private String name;
	/**网页传来的身份证号*/
	private String idnumber;
	/**网页传来的手机号*/
	private String pnumber;
	/**网页传来的性别*/
	private String sex;
	/**网页传来的生日*/
	private String birthday;
	/**网页传来的年龄*/
	private Integer age;
	/**网页传来的个人描述*/
	private String summary;
	/**网页传来的个人照片*/
	private String picture;
	/**网页传来的昵称*/
	private String username;
	/**网页传来的邮箱*/
	private String mail;
	/**网页传来的QQ*/
	private String qq;
	
	private File upload;//动作类上传的属性必须是file类型,upload为表单的name值  

	private String uploadFileName; //上传的文件名称,固定写法:name+FileName;  

	private String uploadContentType;
	

	public UserManage getUserManage() {
		return userManage;
	}

	public void setUserManage(UserManage userManage) {
		this.userManage = userManage;
	}

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

	public File getUpload() {
		return upload;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public String getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public String getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}






	/**
	 * 根据网页传过来的用户表信息，调用service将其存入数据库中
	 * 
	 * @return 返回'success'或'error'字符串
	 * @throws IOException 
	 * @throws NoSuchAlgorithmException 
	 * @throws UnsupportedEncodingException 
	 * @exception 暂时没做
	 */

	public String execute() throws IOException {
		
		Date date=new Date();  
		SimpleDateFormat formatter=new SimpleDateFormat("yyyyMMddHHmmss");  
		String time=formatter.format(date);
		int number = new Random().nextInt(100000) + 1000;
		String picurl = time+String.valueOf(number)+".jpg";
		String realPath = ServletActionContext.getServletContext().getRealPath("/upload/avatar_user/");//构架存放头像的目录
		System.out.println(realPath+"			"+picurl+"				"+uploadFileName+"			"+name);
		
		File dir = new File(realPath);
		if (!dir.exists()) {
			dir.mkdirs();
			System.out.println("创建目录成功.");
		}
		if(upload!=null) {
			FileUtils.moveFile(upload,new File(dir,picurl));//剪切文件,推荐使用,无备份文件
		}
		
		
		
		
		List p=(List)ActionContext.getContext().getSession().get("user");
		People people=(People)p.get(0);
		people.setName(name);
		people.setIdnumber(idnumber);
		people.setPnumber(pnumber);
		people.setSex(sex);
		people.setBirthday(birthday);
		people.setAge(age);
		people.setSummary(summary);		
		people.setUsername(username);
		people.setMail(mail);
		people.setQq(qq);
		if(upload!=null) {
			people.setPicture("./upload/avatar_user/"+picurl);
		}

		System.out.println("成功装入了people对象中");
		userManage.updateUser(people);
		System.out.println("成功更新了people表");
		
		return "success";
	}
}
