package org.sccooperation.action.enterprisecenter;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

import org.sccooperation.domain.Enterprise;
import org.sccooperation.service.EnterpriseManage;
import org.sccooperation.service.TagManage;

import com.opensymphony.xwork2.ActionContext;

import sun.misc.BASE64Encoder;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

public class EnterpriseAction {
	//ʵ�ֵ�¼
	/** ʵ����һ��service��ı����������䷽�� */
	private EnterpriseManage enterpriseManage;
	/** ��ҳ�������˺� */
	private String account;
	/** ��ҳ���������� */
	private String password;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public EnterpriseManage getEnterpriseManage() {
		return enterpriseManage;
	}

	public void setEnterpriseManage(EnterpriseManage enterpriseManage) {
		this.enterpriseManage = enterpriseManage;
	}
	
	
	//ʵ����ʾ��ҵ��Ϣ����
	/** ʵ����һ��service��ı����������䷽�� */
	private TagManage tagManage;

	public TagManage getTagManage() {
		return tagManage;
	}

	public void setTagManage(TagManage tagManage) {
		this.tagManage = tagManage;
	}

	// �޸���ҵ��Ϣ
	/** ��ҳ�����Ĺ�˾���� */
	private String ename;
	/** ��ҳ�����ļ�� */
	private String summary;
	/** ��ҳ��������ϸ�ص� */
	private String place;
	/** ��ҳ�����Ĵ���ʱ�� */
	private String btime;
	/** ��ҳ�����Ĺ�˾���� */
	private String property;
	/** ��ҳ�����Ĺ�˾���� */
	private String website;
	/** ��ҳ�����Ĺ�˾CEO */
	private String ceo;
	/** ��ҳ�����Ĺ�˾���ڳ��� */
	private String vocation;
	/** ��ҳ�����Ĺ�˾ͼ�� */
	private String pictureurl;

	private File upload;// �������ϴ������Ա�����file����,uploadΪ����nameֵ

	private String uploadFileName; // �ϴ����ļ�����,�̶�д��:name+FileName;

	private String uploadContentType;

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

	public String getBtime() {
		return btime;
	}

	public void setBtime(String btime) {
		this.btime = btime;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public String getVocation() {
		return vocation;
	}

	public void setVocation(String vocation) {
		this.vocation = vocation;
	}

	public String getPictureurl() {
		return pictureurl;
	}

	public void setPictureurl(String pictureurl) {
		this.pictureurl = pictureurl;
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

	
	//ʵ���޸�����
	/**��ҳ�����ľ�����*/
	private String password_old;
	/**��ҳ������������*/
	private String password_new;
	
	public String getPassword_old() {
		return password_old;
	}

	public void setPassword_old(String password_old) {
		this.password_old = password_old;
	}

	public String getPassword_new() {
		return password_new;
	}

	public void setPassword_new(String password_new) {
		this.password_new = password_new;
	}
	
	

	//��ҵ��¼
	public String login() throws NoSuchAlgorithmException, UnsupportedEncodingException {
		// ˫�ؽ��ܻ�ȡ���룬�ж����ݿ��Ƿ�������ֶ��жϵ�¼
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		BASE64Encoder base64en = new BASE64Encoder();
		password = base64en.encode(md5.digest(password.getBytes("utf-8")));
		System.out.println(account + "    " + password);
		System.out.println("��ʼ�����û��ĺϷ���");
		List list = enterpriseManage.loginCheck(account, password);

		System.out.println("..................................");
		System.out.println(password);
		// if(session.get("user")==null)
		ActionContext.getContext().getSession().put("enterprise", list);
		System.out.println("�ɹ�����ҵ��Ϣ����session��");
		Enterprise enterprise=(Enterprise)list.get(0);
		System.out.println(enterprise.getEname());

		if (list.isEmpty()) {
			return "error";
		}
		return "success";
	}
	
	//��ҵ�˳�
	public String quit() {
		ActionContext.getContext().getSession().put("enterprise",null);
		if(ActionContext.getContext().getSession().get("enterprise")==null) {
			System.out.println("�˳��ɹ�");
			return "success";
		}
		else {
			System.out.println("�˳�ʧ��");
			return "error";
		}
	}
	
	//��ʾ��ҵ��Ϣ����
	public String displayenterprisecenter() {
		System.out.println("star read session");
		List e = (List) ActionContext.getContext().getSession().get("enterprise");
		System.out.println("end read session");
		Enterprise enterprise = (Enterprise) e.get(0);
		//�����tagno
		String[] tagno = enterprise.getTagno().split(";");
		//��ѯ��Ӧtagno��Ӧ������
		List t1 = tagManage.findtag(Integer.parseInt(tagno[0]));
		List t2 = tagManage.findtag(Integer.parseInt(tagno[1]));
		List t3 = tagManage.findtag(Integer.parseInt(tagno[2]));

		
		List<List> etag = new ArrayList<List>();
		etag.add(t1);
		etag.add(t2);
		etag.add(t3);
		
		//�����ҵ���tagno��Ӧ�����ݷ���tag��
		ActionContext.getContext().getSession().put("etag",etag);

		return "success";
	}
	
	//�޸���ҵ��Ϣ
	public String modifyenterpriseinfo() throws IOException {
		
		Date date=new Date();  
		SimpleDateFormat formatter=new SimpleDateFormat("yyyyMMddHHmmss");  
		String time=formatter.format(date);
		int number = new Random().nextInt(100000) + 1000;
		String picurl = time+String.valueOf(number)+".jpg";
		String realPath = ServletActionContext.getServletContext().getRealPath("/upload/avatar_enterprise/");//���ܴ��ͷ���Ŀ¼
		System.out.println(realPath+"			"+picurl+"				"+uploadFileName+"			"+ename);
		
		File dir = new File(realPath);
		if (!dir.exists()) {
			dir.mkdirs();
			System.out.println("����Ŀ¼�ɹ�.");
		}
		if(upload!=null) {
			FileUtils.moveFile(upload,new File(dir,picurl));//�����ļ�,�Ƽ�ʹ��,�ޱ����ļ�
		}
		
		
		
		
		List e=(List)ActionContext.getContext().getSession().get("enterprise");
		Enterprise enterprise=(Enterprise)e.get(0);
		enterprise.setEname(ename);
		enterprise.setSummary(summary);
		enterprise.setPlace(place);
		enterprise.setBtime(btime);
		enterprise.setProperty(property);
		enterprise.setWebsite(website);
		enterprise.setCeo(ceo);	
		enterprise.setVocation(vocation);
		if(upload!=null) {
			enterprise.setPictureurl("./upload/avatar_enterprise/"+picurl);
		}

		System.out.println("�ɹ�װ����enterprise������");
		enterpriseManage.updateEnterprise(enterprise);
		System.out.println("�ɹ�������enterprise��");
		
		return "success";
	}
	
	//�޸�����
	public String modifypassword() throws IOException, NoSuchAlgorithmException {
		//˫�ؽ��ܻ�ȡ���룬�ж����ݿ��Ƿ�������ֶ��жϵ�¼
		MessageDigest md5=MessageDigest.getInstance("MD5"); 
		BASE64Encoder base64en = new BASE64Encoder(); 
		password_old=base64en.encode(md5.digest(password_old.getBytes("utf-8")));
		password_new=base64en.encode(md5.digest(password_new.getBytes("utf-8")));
		System.out.println("������Ϊ��"+password_old);
		System.out.println("������Ϊ��"+password_new);
		
		System.out.println("��ʼ��ȡsession");
		List e = (List) ActionContext.getContext().getSession().get("enterprise");
		System.out.println("��ȡsession���");
		Enterprise enterprise=(Enterprise)e.get(0);
		System.out.println("ȡ��enterprise���");
		
		if(enterpriseManage.passwordCheck(password_old)) {//�жϾ������Ƿ���ȷ
			System.out.println("��ʼ����");
			enterprise.setPassword(password_new);
			System.out.println("��ֵ�ɹ���������Ϊ��"+enterprise.getPassword());
			enterpriseManage.updateEnterprise(enterprise);//������userManage.modifypassword��������ݿ⣬�ᷢ������a different object with the same identifier value was already associated with the session������ͬ��ʶ��ֵ�Ĳ�ͬ�����Ѿ���ûỰ�������
			System.out.println("���³ɹ�");
		}		
		return "success";
	}
}
