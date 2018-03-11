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
 * Project:SCCooperation Comments:此类action，先由spring装配一个实例，然后将该实例交给struts管理 JDK
 * version used:JDK1.8 Author：blank700 Create Date：2018-01-18 Modified By：
 * <修改人中文名或拼音缩写> Modified Date: <修改日期，格式:YYYY-MM-DD> Why & What is modified
 * <修改原因描述> Version:1.0
 */

public class EnterprisesubuserAction {
	//实现登录
	/** 实例化一个service层的变量，调用其方法 */
	private EnterprisesubuserManage enterprisesubuserManage;
	/** 网页传来的账号 */
	private String account;
	/** 网页传来的密码 */
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
	
	
	//实现显示企业子用户信息中心
	/** 实例化一个service层的变量，调用其方法 */
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
	
	
	//修改企业信息
	/** 网页传来的子用户昵称 */
	private String nickname;
	/** 网页传来的子用户真实姓名 */
	private String realname;
	/** 网页传来的手机号 */
	private String tel;
	/** 网页传来的qq */
	private String qq;
	/** 网页传来的邮箱 */
	private String mail;
	/** 网页传来的简述 */
	private String briefly;
	/** 网页传来的头像 */
	private String pictureurl;

	private File upload;// 动作类上传的属性必须是file类型,upload为表单的name值

	private String uploadFileName; // 上传的文件名称,固定写法:name+FileName;

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
	
	
	// 实现修改密码
	/** 网页传来的旧密码 */
	private String password_old;
	/** 网页传来的新密码 */
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
	
	
	
	//企业子用户登录
	public String login() throws NoSuchAlgorithmException, UnsupportedEncodingException {
		// 双重解密获取密码，判断数据库是否有相关字段判断登录
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		BASE64Encoder base64en = new BASE64Encoder();
		password = base64en.encode(md5.digest(password.getBytes("utf-8")));
		System.out.println(account + "    " + password);
		System.out.println("开始检验用户的合法性");
		List list = enterprisesubuserManage.loginCheck(account, password);

		System.out.println("..................................");
		System.out.println(password);
		// if(session.get("user")==null)
		ActionContext.getContext().getSession().put("enterprisesubuser", list);
		System.out.println("成功将企业子用户信息放入session中");
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
			System.out.println("退出成功");
			return "success";
		}
		else {
			System.out.println("退出失败");
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
		
		//分离出tagno
		String[] tagno = enterprise.getTagno().split(";");
		//查询对应tagno对应的内容
		List t1 = tagManage.findtag(Integer.parseInt(tagno[0]));
		List t2 = tagManage.findtag(Integer.parseInt(tagno[1]));
		List t3 = tagManage.findtag(Integer.parseInt(tagno[2]));
		
		List<List> tag = new ArrayList<List>();
		tag.add(t1);
		tag.add(t2);
		tag.add(t3);
		
		//将查找到的tagno对应的内容放入tag中
		ActionContext.getContext().getSession().put("tag",tag);

		return "success";
	}

	//修改企业信息
	public String modifyenterprisesubuserinfo() throws IOException {

		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
		String time = formatter.format(date);
		int number = new Random().nextInt(100000) + 1000;
		String picurl = time + String.valueOf(number) + ".jpg";
		String realPath = ServletActionContext.getServletContext().getRealPath("/upload/avatar_enterprisesubuser/");// 构架存放头像的目录
		System.out.println(realPath + "			" + picurl + "				" + uploadFileName + "			" + nickname);

		File dir = new File(realPath);
		if (!dir.exists()) {
			dir.mkdirs();
			System.out.println("创建目录成功.");
		}
		if (upload != null) {
			FileUtils.moveFile(upload, new File(dir, picurl));// 剪切文件,推荐使用,无备份文件
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

		System.out.println("成功装入了enterprisesubuser对象中");
		enterprisesubuserManage.updateEnterprisesubuser(enterprisesubuser);
		System.out.println("成功更新了enterprisesubuser表");

		return "success";
	}
	
	//修改密码
	public String modifypassword() throws IOException, NoSuchAlgorithmException {
		// 双重解密获取密码，判断数据库是否有相关字段判断登录
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		BASE64Encoder base64en = new BASE64Encoder();
		password_old = base64en.encode(md5.digest(password_old.getBytes("utf-8")));
		password_new = base64en.encode(md5.digest(password_new.getBytes("utf-8")));
		System.out.println("旧密码为：" + password_old);
		System.out.println("新密码为：" + password_new);

		System.out.println("开始获取session");
		List esu = (List) ActionContext.getContext().getSession().get("enterprisesubuser");
		System.out.println("获取session完成");
		Enterprisesubuser enterprisesubuser = (Enterprisesubuser) esu.get(0);
		System.out.println("取出enterprisesubuser完成");

		if (enterprisesubuserManage.passwordCheck(password_old)) {// 判断旧密码是否正确
			System.out.println("开始更新");
			enterprisesubuser.setPassword(password_new);
			System.out.println("赋值成功，新密码为：" + enterprisesubuser.getPassword());
			System.out.println("id:"+enterprisesubuser.getId());
			enterprisesubuserManage.updateEnterprisesubuser(enterprisesubuser);// 不能在userManage.modifypassword里更新数据库，会发生错误（a different objectwith the same identifier value was already associatedwith the session具有相同标识符值的不同对象已经与该会话相关联）
			System.out.println("更新成功");
		}else {
			System.out.println("error");
		}
		return "success";
	}
}
