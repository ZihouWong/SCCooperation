package org.sccooperation.action.notification;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

import org.sccooperation.domain.Notification;
import org.sccooperation.service.NotificationManage;

import com.opensymphony.xwork2.ActionContext;

import sun.misc.BASE64Encoder;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

/**
 * Project:SCCooperation Comments:此类action，先由spring装配一个实例，然后将该实例交给struts管理 JDK
 * version used:JDK1.8 Author：blank700 Create Date：2018-2-3 Modified By：
 * <修改人中文名或拼音缩写> Modified Date: <修改日期，格式:YYYY-MM-DD> Why & What is modified
 * <修改原因描述> Version:1.0
 */

public class NotificationManagementAction {
	/** 实例化一个service层的变量，调用其方法 */
	private NotificationManage notificationManage;
	/** 网页传来的标题 */
	private String title;
	/** 网页传来的内容*/
	private String contect;
	
	public NotificationManage getNotificationManage() {
		return notificationManage;
	}
	public void setNotificationManage(NotificationManage notificationManage) {
		this.notificationManage = notificationManage;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContect() {
		return contect;
	}
	public void setContect(String contect) {
		this.contect = contect;
	}
	
	/** 网页传来的页数 */
	private int pageNo;
	
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	
	
	//新建通知
	public String addnotification() {
		Notification notification = new Notification();
		
		notification.setTitle(title);
		notification.setContect(contect);
		
		notificationManage.insertNotification(notification);
		
		return "success";
	}
	
	//显示通知界面
	public String displaynotification() {
		System.out.println("开始查出所有的通知");
		List pnotification=notificationManage.findnotificationbypage(pageNo);
		System.out.println("通知查找完成");
		ActionContext.getContext().getSession().put("pnotification",pnotification);
		
		return "success";
	}
	
}
