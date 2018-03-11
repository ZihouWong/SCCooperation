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
	//实现登录
	/** 实例化一个service层的变量，调用其方法 */
	private EnterpriseManage enterpriseManage;
	/** 网页传来的账号 */
	private String account;
	/** 网页传来的密码 */
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
	
	
	//实现显示企业信息中心
	/** 实例化一个service层的变量，调用其方法 */
	private TagManage tagManage;

	public TagManage getTagManage() {
		return tagManage;
	}

	public void setTagManage(TagManage tagManage) {
		this.tagManage = tagManage;
	}

	// 修改企业信息
	/** 网页传来的公司名称 */
	private String ename;
	/** 网页传来的简介 */
	private String summary;
	/** 网页传来的详细地点 */
	private String place;
	/** 网页传来的创建时间 */
	private String btime;
	/** 网页传来的公司性质 */
	private String property;
	/** 网页传来的公司官网 */
	private String website;
	/** 网页传来的公司CEO */
	private String ceo;
	/** 网页传来的公司所在城市 */
	private String vocation;
	/** 网页传来的公司图标 */
	private String pictureurl;

	private File upload;// 动作类上传的属性必须是file类型,upload为表单的name值

	private String uploadFileName; // 上传的文件名称,固定写法:name+FileName;

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

	
	//实现修改密码
	/**网页传来的旧密码*/
	private String password_old;
	/**网页传来的新密码*/
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
	
	

	//企业登录
	public String login() throws NoSuchAlgorithmException, UnsupportedEncodingException {
		// 双重解密获取密码，判断数据库是否有相关字段判断登录
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		BASE64Encoder base64en = new BASE64Encoder();
		password = base64en.encode(md5.digest(password.getBytes("utf-8")));
		System.out.println(account + "    " + password);
		System.out.println("开始检验用户的合法性");
		List list = enterpriseManage.loginCheck(account, password);

		System.out.println("..................................");
		System.out.println(password);
		// if(session.get("user")==null)
		ActionContext.getContext().getSession().put("enterprise", list);
		System.out.println("成功将企业信息放入session中");
		Enterprise enterprise=(Enterprise)list.get(0);
		System.out.println(enterprise.getEname());

		if (list.isEmpty()) {
			return "error";
		}
		return "success";
	}
	
	//企业退出
	public String quit() {
		ActionContext.getContext().getSession().put("enterprise",null);
		if(ActionContext.getContext().getSession().get("enterprise")==null) {
			System.out.println("退出成功");
			return "success";
		}
		else {
			System.out.println("退出失败");
			return "error";
		}
	}
	
	//显示企业信息中心
	public String displayenterprisecenter() {
		System.out.println("star read session");
		List e = (List) ActionContext.getContext().getSession().get("enterprise");
		System.out.println("end read session");
		Enterprise enterprise = (Enterprise) e.get(0);
		//分离出tagno
		String[] tagno = enterprise.getTagno().split(";");
		//查询对应tagno对应的内容
		List t1 = tagManage.findtag(Integer.parseInt(tagno[0]));
		List t2 = tagManage.findtag(Integer.parseInt(tagno[1]));
		List t3 = tagManage.findtag(Integer.parseInt(tagno[2]));

		
		List<List> etag = new ArrayList<List>();
		etag.add(t1);
		etag.add(t2);
		etag.add(t3);
		
		//将查找到的tagno对应的内容放入tag中
		ActionContext.getContext().getSession().put("etag",etag);

		return "success";
	}
	
	//修改企业信息
	public String modifyenterpriseinfo() throws IOException {
		
		Date date=new Date();  
		SimpleDateFormat formatter=new SimpleDateFormat("yyyyMMddHHmmss");  
		String time=formatter.format(date);
		int number = new Random().nextInt(100000) + 1000;
		String picurl = time+String.valueOf(number)+".jpg";
		String realPath = ServletActionContext.getServletContext().getRealPath("/upload/avatar_enterprise/");//构架存放头像的目录
		System.out.println(realPath+"			"+picurl+"				"+uploadFileName+"			"+ename);
		
		File dir = new File(realPath);
		if (!dir.exists()) {
			dir.mkdirs();
			System.out.println("创建目录成功.");
		}
		if(upload!=null) {
			FileUtils.moveFile(upload,new File(dir,picurl));//剪切文件,推荐使用,无备份文件
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

		System.out.println("成功装入了enterprise对象中");
		enterpriseManage.updateEnterprise(enterprise);
		System.out.println("成功更新了enterprise表");
		
		return "success";
	}
	
	//修改密码
	public String modifypassword() throws IOException, NoSuchAlgorithmException {
		//双重解密获取密码，判断数据库是否有相关字段判断登录
		MessageDigest md5=MessageDigest.getInstance("MD5"); 
		BASE64Encoder base64en = new BASE64Encoder(); 
		password_old=base64en.encode(md5.digest(password_old.getBytes("utf-8")));
		password_new=base64en.encode(md5.digest(password_new.getBytes("utf-8")));
		System.out.println("旧密码为："+password_old);
		System.out.println("新密码为："+password_new);
		
		System.out.println("开始获取session");
		List e = (List) ActionContext.getContext().getSession().get("enterprise");
		System.out.println("获取session完成");
		Enterprise enterprise=(Enterprise)e.get(0);
		System.out.println("取出enterprise完成");
		
		if(enterpriseManage.passwordCheck(password_old)) {//判断旧密码是否正确
			System.out.println("开始更新");
			enterprise.setPassword(password_new);
			System.out.println("赋值成功，新密码为："+enterprise.getPassword());
			enterpriseManage.updateEnterprise(enterprise);//不能在userManage.modifypassword里更新数据库，会发生错误（a different object with the same identifier value was already associated with the session具有相同标识符值的不同对象已经与该会话相关联）
			System.out.println("更新成功");
		}		
		return "success";
	}
}
