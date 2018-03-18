package org.sccooperation.action.enterprisesubusercenter;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

import org.sccooperation.domain.Enterprise;
import org.sccooperation.domain.Enterprisesubuser;
import org.sccooperation.service.EnterpriseManage;
import org.sccooperation.service.EnterprisesubuserManage;
import org.sccooperation.service.TagManage;

import com.opensymphony.xwork2.ActionContext;

import sun.misc.BASE64Encoder;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

/**
 * Project:SCCooperation Comments:����action������springװ��һ��ʵ����Ȼ�󽫸�ʵ������struts���� JDK
 * version used:JDK1.8 Author��blank700 Create Date��2018-01-18 Modified By��
 * <�޸�����������ƴ����д> Modified Date: <�޸����ڣ���ʽ:YYYY-MM-DD> Why & What is modified
 * <�޸�ԭ������> Version:1.0
 */

public class EnterprisesubuserAction {
	//ʵ�ֵ�¼
	/** ʵ����һ��service��ı����������䷽�� */
	private EnterprisesubuserManage enterprisesubuserManage;
	/** ��ҳ�������˺� */
	private String account;
	/** ��ҳ���������� */
	private String password;
	
	public EnterprisesubuserManage getEnterprisesubuserManage() {
		return enterprisesubuserManage;
	}
	public void setEnterprisesubuserManage(EnterprisesubuserManage enterprisesubuserManage) {
		this.enterprisesubuserManage = enterprisesubuserManage;
	}
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
	
	
	//ʵ����ʾ��ҵ���û���Ϣ����
	/** ʵ����һ��service��ı����������䷽�� */
	private TagManage tagManage;

	private EnterpriseManage enterpriseManage;

	public TagManage getTagManage() {
		return tagManage;
	}
	
	public void setTagManage(TagManage tagManage) {
		this.tagManage = tagManage;
	}
	
	public EnterpriseManage getEnterpriseManage() {
		return enterpriseManage;
	}
	
	public void setEnterpriseManage(EnterpriseManage enterpriseManage) {
		this.enterpriseManage = enterpriseManage;
	}
	
	
	//�޸���ҵ��Ϣ
	/** ��ҳ���������û��ǳ� */
	private String nickname;
	/** ��ҳ���������û���ʵ���� */
	private String realname;
	/** ��ҳ�������ֻ��� */
	private String tel;
	/** ��ҳ������qq */
	private String qq;
	/** ��ҳ���������� */
	private String mail;
	/** ��ҳ�����ļ��� */
	private String briefly;
	/** ��ҳ������ͷ�� */
	private String pictureurl;

	private File upload;// �������ϴ������Ա�����file����,uploadΪ����nameֵ

	private String uploadFileName; // �ϴ����ļ�����,�̶�д��:name+FileName;

	private String uploadContentType;
	
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getBriefly() {
		return briefly;
	}
	public void setBriefly(String briefly) {
		this.briefly = briefly;
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
	
	
	// ʵ���޸�����
	/** ��ҳ�����ľ����� */
	private String password_old;
	/** ��ҳ������������ */
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
	
	
	
	//��ҵ���û���¼
	public String login() throws NoSuchAlgorithmException, UnsupportedEncodingException {
		// ˫�ؽ��ܻ�ȡ���룬�ж����ݿ��Ƿ�������ֶ��жϵ�¼
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		BASE64Encoder base64en = new BASE64Encoder();
		password = base64en.encode(md5.digest(password.getBytes("utf-8")));
		System.out.println(account + "    " + password);
		System.out.println("��ʼ�����û��ĺϷ���");
		List list = enterprisesubuserManage.loginCheck(account, password);

		System.out.println("..................................");
		System.out.println(password);
		// if(session.get("user")==null)
		ActionContext.getContext().getSession().put("enterprisesubuser", list);
		System.out.println("�ɹ�����ҵ���û���Ϣ����session��");
		Enterprisesubuser enterprisesubuser=(Enterprisesubuser)list.get(0);
		System.out.println(enterprisesubuser.getNickname());

		if (list.isEmpty()) {
			return "error";
		}
		return "success";
	}
	
	public String quit() {
		ActionContext.getContext().getSession().put("enterprisesubuser",null);
		if(ActionContext.getContext().getSession().get("enterprisesubuser")==null) {
			System.out.println("�˳��ɹ�");
			return "success";
		}
		else {
			System.out.println("�˳�ʧ��");
			return "error";
		}
	}
	
	public String displayenterprisesubusercenter() {
		System.out.println("star read session");
		List esu = (List) ActionContext.getContext().getSession().get("enterprisesubuser");
		System.out.println("end read session");
		Enterprisesubuser enterprisesubuser = (Enterprisesubuser) esu.get(0);

		List e = enterpriseManage.findEnterprise(enterprisesubuser.getEid());
		Enterprise enterprise = (Enterprise) e.get(0);
		
		//�����tagno
		String[] tagno = enterprise.getTagno().split(";");
		//��ѯ��Ӧtagno��Ӧ������
		List t1 = tagManage.findtag(Integer.parseInt(tagno[0]));
		List t2 = tagManage.findtag(Integer.parseInt(tagno[1]));
		List t3 = tagManage.findtag(Integer.parseInt(tagno[2]));
		
		List<List> tag = new ArrayList<List>();
		tag.add(t1);
		tag.add(t2);
		tag.add(t3);
		
		//�����ҵ���tagno��Ӧ�����ݷ���tag��
		ActionContext.getContext().getSession().put("tag",tag);

		return "success";
	}

	//�޸���ҵ��Ϣ
	public String modifyenterprisesubuserinfo() throws IOException {

		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
		String time = formatter.format(date);
		int number = new Random().nextInt(100000) + 1000;
		String picurl = time + String.valueOf(number) + ".jpg";
		String realPath = ServletActionContext.getServletContext().getRealPath("/upload/avatar_enterprisesubuser/");// ���ܴ��ͷ���Ŀ¼
		System.out.println(realPath + "			" + picurl + "				" + uploadFileName + "			" + nickname);

		File dir = new File(realPath);
		if (!dir.exists()) {
			dir.mkdirs();
			System.out.println("����Ŀ¼�ɹ�.");
		}
		if (upload != null) {
			FileUtils.moveFile(upload, new File(dir, picurl));// �����ļ�,�Ƽ�ʹ��,�ޱ����ļ�
		}

		List esu = (List) ActionContext.getContext().getSession().get("enterprisesubuser");
		Enterprisesubuser enterprisesubuser = (Enterprisesubuser) esu.get(0);
		enterprisesubuser.setNickname(nickname);
		enterprisesubuser.setRealname(realname);
		enterprisesubuser.setTel(tel);
		enterprisesubuser.setQq(qq);
		enterprisesubuser.setMail(mail);
		enterprisesubuser.setBriefly(briefly);
		if (upload != null) {
			enterprisesubuser.setPictureurl("./upload/avatar_enterprisesubuser/" + picurl);
		}

		System.out.println("�ɹ�װ����enterprisesubuser������");
		enterprisesubuserManage.updateEnterprisesubuser(enterprisesubuser);
		System.out.println("�ɹ�������enterprisesubuser��");

		return "success";
	}
	
	//�޸�����
	public String modifypassword() throws IOException, NoSuchAlgorithmException {
		// ˫�ؽ��ܻ�ȡ���룬�ж����ݿ��Ƿ�������ֶ��жϵ�¼
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		BASE64Encoder base64en = new BASE64Encoder();
		password_old = base64en.encode(md5.digest(password_old.getBytes("utf-8")));
		password_new = base64en.encode(md5.digest(password_new.getBytes("utf-8")));
		System.out.println("������Ϊ��" + password_old);
		System.out.println("������Ϊ��" + password_new);

		System.out.println("��ʼ��ȡsession");
		List esu = (List) ActionContext.getContext().getSession().get("enterprisesubuser");
		System.out.println("��ȡsession���");
		Enterprisesubuser enterprisesubuser = (Enterprisesubuser) esu.get(0);
		System.out.println("ȡ��enterprisesubuser���");

		if (enterprisesubuserManage.passwordCheck(password_old)) {// �жϾ������Ƿ���ȷ
			System.out.println("��ʼ����");
			enterprisesubuser.setPassword(password_new);
			System.out.println("��ֵ�ɹ���������Ϊ��" + enterprisesubuser.getPassword());
			System.out.println("id:"+enterprisesubuser.getId());
			enterprisesubuserManage.updateEnterprisesubuser(enterprisesubuser);// ������userManage.modifypassword��������ݿ⣬�ᷢ������a different objectwith the same identifier value was already associatedwith the session������ͬ��ʶ��ֵ�Ĳ�ͬ�����Ѿ���ûỰ�������
			System.out.println("���³ɹ�");
		}else {
			System.out.println("error");
		}
		return "success";
	}
}
