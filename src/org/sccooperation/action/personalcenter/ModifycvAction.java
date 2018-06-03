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

import org.sccooperation.domain.Cv;
import org.sccooperation.domain.People;
import org.sccooperation.service.CvManage;

import com.opensymphony.xwork2.ActionContext;

/**
 * Project:SCCooperation Comments:����action������springװ��һ��ʵ����Ȼ�󽫸�ʵ������struts����,��Ҫ�������û������޸ļ���ʱ�������û����ص���Ϣ�޸ļ������е�����
 *  JDK version used:JDK1.8 
 *  Author��blank700 Create Date��2017-11-24 Modified By�� blank700<�޸�����������ƴ����д>
 * Modified Date: <�޸����ڣ���ʽ:2017-11-25> Why & What is modified <�޸�ԭ������>
 * Version:1.0
 */
public class ModifycvAction {
	/**ʵ����һ��service��ı����������䷽��*/
	private CvManage cvManage;
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
	/**��ҳ�����Ĺ�������*/
	private String experience;
	/**��ҳ�����Ļ񽱾���*/
	private String prize;
	/**��ҳ������ѧУ*/
	private String school;
	/**��ҳ�����ĸ�����Ƭ*/
	private String prictureurl;
	
	private File upload;//�������ϴ������Ա�����file����,uploadΪ����nameֵ  

	private String uploadFileName; //�ϴ����ļ�����,�̶�д��:name+FileName;  

	private String uploadContentType;
	
	
	
	public CvManage getCvManage() {
		return cvManage;
	}

	public void setCvManage(CvManage cvManage) {
		this.cvManage = cvManage;
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

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getPrize() {
		return prize;
	}

	public void setPrize(String prize) {
		this.prize = prize;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getPrictureurl() {
		return prictureurl;
	}

	public void setPrictureurl(String prictureurl) {
		this.prictureurl = prictureurl;
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
	 * ������ҳ�������ļ�������Ϣ������service����������ݿ���
	 * 
	 * @return ����'success'��'error'�ַ���
	 * @throws IOException 
	 * @throws NoSuchAlgorithmException 
	 * @throws UnsupportedEncodingException 
	 * @exception ��ʱû��
	 */

	public String execute() throws IOException {
		System.out.println("��ʼ�޸�cv��");
		Date date=new Date();  
		SimpleDateFormat formatter=new SimpleDateFormat("yyyyMMddHHmmss");  
		String time=formatter.format(date);
		int number = new Random().nextInt(100000) + 1000;
		String picurl = time+String.valueOf(number)+".jpg";
		String realPath = ServletActionContext.getServletContext().getRealPath("/upload/avatar_cv/");//���ܴ��ͷ���Ŀ¼
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
		Cv cv=people.getCv();
		cv.setName(name);
		cv.setIdnumber(idnumber);
		cv.setPnumber(pnumber);
		cv.setSex(sex);
		cv.setBirthday(birthday);
		cv.setAge(age);
		cv.setSummary(summary);
		cv.setExperience(experience);
		cv.setPrize(prize);
		cv.setSchool(school);
		if(upload!=null) {
			cv.setPrictureurl("./upload/avatar_cv/"+picurl);
		}
		System.out.println("�ɹ�װ����cv������");
		cvManage.updateCv(cv);
		System.out.println("�ɹ�������cv��");
		
		return "success";
	}
}
