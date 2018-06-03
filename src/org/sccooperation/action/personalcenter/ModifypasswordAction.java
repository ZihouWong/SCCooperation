package org.sccooperation.action.personalcenter;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import org.sccooperation.domain.People;
import org.sccooperation.service.UserManage;

import com.opensymphony.xwork2.ActionContext;

import sun.misc.BASE64Encoder;

/**
 * Project:SCCooperation Comments:此类action，先由spring装配一个实例，然后将该实例交给struts管理,主要功能是用户申请修改个人信息时，根据用户返回的信息修改用户表中的内容
 *  JDK version used:JDK1.8 
 *  Author：blank700 Create Date：2017-12-3 Modified By： blank700<修改人中文名或拼音缩写>
 * Modified Date:2017-12-3 <修改日期，格式:YYYY-MM-DD> Why & What is modified <修改原因描述>
 * Version:1.0
 */
public class ModifypasswordAction {
	/**实例化一个service层的变量，调用其方法*/
	private UserManage userManage;
	/**网页传来的旧密码*/
	private String password_old;
	/**网页传来的新密码*/
	private String password_new;

	public UserManage getUserManage() {
		return userManage;
	}

	public void setUserManage(UserManage userManage) {
		this.userManage = userManage;
	}

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




	/**
	 * 根据网页传过来的密码数据，判断其合法性，如果合法再调用service将其存入数据库中
	 * 
	 * @return 返回'success'或'error'字符串
	 * @throws IOException 
	 * @throws NoSuchAlgorithmException 
	 * @throws UnsupportedEncodingException 
	 * @exception 暂时没做
	 */

	public String execute() throws IOException, NoSuchAlgorithmException {
		//双重解密获取密码，判断数据库是否有相关字段判断登录
		MessageDigest md5=MessageDigest.getInstance("MD5"); 
		BASE64Encoder base64en = new BASE64Encoder(); 
		password_old=base64en.encode(md5.digest(password_old.getBytes("utf-8")));
		password_new=base64en.encode(md5.digest(password_new.getBytes("utf-8")));
		System.out.println("旧密码为："+password_old);
		System.out.println("新密码为："+password_new);
		
		List p=(List)ActionContext.getContext().getSession().get("user");
		People people=(People)p.get(0);
		
		if(userManage.passwordCheck(password_old)) {//判断旧密码是否正确
			System.out.println("开始更新");
			people.setPassword(password_new);
			System.out.println("赋值成功，新密码为："+people.getPassword());
			userManage.updateUser(people);//不能在userManage.modifypassword里更新数据库，会发生错误（a different object with the same identifier value was already associated with the session具有相同标识符值的不同对象已经与该会话相关联）
			System.out.println("更新成功");
		}		
		return "success";
	}
}
