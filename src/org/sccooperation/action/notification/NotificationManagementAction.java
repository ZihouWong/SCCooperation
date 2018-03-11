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
 * Project:SCCooperation Comments:����action������springװ��һ��ʵ����Ȼ�󽫸�ʵ������struts���� JDK
 * version used:JDK1.8 Author��blank700 Create Date��2018-2-3 Modified By��
 * <�޸�����������ƴ����д> Modified Date: <�޸����ڣ���ʽ:YYYY-MM-DD> Why & What is modified
 * <�޸�ԭ������> Version:1.0
 */

public class NotificationManagementAction {
	/** ʵ����һ��service��ı����������䷽�� */
	private NotificationManage notificationManage;
	/** ��ҳ�����ı��� */
	private String title;
	/** ��ҳ����������*/
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
	
	/** ��ҳ������ҳ�� */
	private int pageNo;
	
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	
	
	//�½�֪ͨ
	public String addnotification() {
		Notification notification = new Notification();
		
		notification.setTitle(title);
		notification.setContect(contect);
		
		notificationManage.insertNotification(notification);
		
		return "success";
	}
	
	//��ʾ֪ͨ����
	public String displaynotification() {
		System.out.println("��ʼ������е�֪ͨ");
		List pnotification=notificationManage.findnotificationbypage(pageNo);
		System.out.println("֪ͨ�������");
		ActionContext.getContext().getSession().put("pnotification",pnotification);
		
		return "success";
	}
	
}
