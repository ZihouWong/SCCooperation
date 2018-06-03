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
 * Project:SCCooperation Comments:����action������springװ��һ��ʵ����Ȼ�󽫸�ʵ������struts����,��Ҫ�������û������޸ĸ�����Ϣʱ�������û����ص���Ϣ�޸��û����е�����
 *  JDK version used:JDK1.8 
 *  Author��blank700 Create Date��2017-11-24 Modified By�� blank700<�޸�����������ƴ����д>
 * Modified Date:2017-11-30 <�޸����ڣ���ʽ:YYYY-MM-DD> Why & What is modified <�޸�ԭ������>
 * Version:1.0
 */
public class ModifypeopleAction {
	/**ʵ����һ��service��ı����������䷽��*/
	private UserManage userManage;
	/**��ҳ����������*/
	private String name;
	/**��ҳ���������֤��*/
	private String idnumber;
	/**��ҳ�������ֻ���*/
	private String pnumber;
	/**��ҳ�������Ա�*/
	private String sex;
	/**��ҳ����������*/
	private String birthday;
	/**��ҳ����������*/
	private Integer age;
	/**��ҳ�����ĸ�������*/
	private String summary;
	/**��ҳ�����ĸ�����Ƭ*/
	private String picture;
	/**��ҳ�������ǳ�*/
	private String username;
	/**��ҳ����������*/
	private String mail;
	/**��ҳ������QQ*/
	private String qq;
	
	private File upload;//�������ϴ������Ա�����file����,uploadΪ����nameֵ  

	private String uploadFileName; //�ϴ����ļ�����,�̶�д��:name+FileName;  

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
	 * ������ҳ���������û�����Ϣ������service����������ݿ���
	 * 
	 * @return ����'success'��'error'�ַ���
	 * @throws IOException 
	 * @throws NoSuchAlgorithmException 
	 * @throws UnsupportedEncodingException 
	 * @exception ��ʱû��
	 */

	public String execute() throws IOException {
		
		Date date=new Date();  
		SimpleDateFormat formatter=new SimpleDateFormat("yyyyMMddHHmmss");  
		String time=formatter.format(date);
		int number = new Random().nextInt(100000) + 1000;
		String picurl = time+String.valueOf(number)+".jpg";
		String realPath = ServletActionContext.getServletContext().getRealPath("/upload/avatar_user/");//���ܴ��ͷ���Ŀ¼
		System.out.println(realPath+"			"+picurl+"				"+uploadFileName+"			"+name);
		
		File dir = new File(realPath);
		if (!dir.exists()) {
			dir.mkdirs();
			System.out.println("����Ŀ¼�ɹ�.");
		}
		if(upload!=null) {
			FileUtils.moveFile(upload,new File(dir,picurl));//�����ļ�,�Ƽ�ʹ��,�ޱ����ļ�
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

		System.out.println("�ɹ�װ����people������");
		userManage.updateUser(people);
		System.out.println("�ɹ�������people��");
		
		return "success";
	}
}
