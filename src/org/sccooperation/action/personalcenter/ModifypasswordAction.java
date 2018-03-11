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
 * Project:SCCooperation Comments:����action������springװ��һ��ʵ����Ȼ�󽫸�ʵ������struts����,��Ҫ�������û������޸ĸ�����Ϣʱ�������û����ص���Ϣ�޸��û����е�����
 *  JDK version used:JDK1.8 
 *  Author��blank700 Create Date��2017-12-3 Modified By�� blank700<�޸�����������ƴ����д>
 * Modified Date:2017-12-3 <�޸����ڣ���ʽ:YYYY-MM-DD> Why & What is modified <�޸�ԭ������>
 * Version:1.0
 */
public class ModifypasswordAction {
	/**ʵ����һ��service��ı����������䷽��*/
	private UserManage userManage;
	/**��ҳ�����ľ�����*/
	private String password_old;
	/**��ҳ������������*/
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
	 * ������ҳ���������������ݣ��ж���Ϸ��ԣ�����Ϸ��ٵ���service����������ݿ���
	 * 
	 * @return ����'success'��'error'�ַ���
	 * @throws IOException 
	 * @throws NoSuchAlgorithmException 
	 * @throws UnsupportedEncodingException 
	 * @exception ��ʱû��
	 */

	public String execute() throws IOException, NoSuchAlgorithmException {
		//˫�ؽ��ܻ�ȡ���룬�ж����ݿ��Ƿ�������ֶ��жϵ�¼
		MessageDigest md5=MessageDigest.getInstance("MD5"); 
		BASE64Encoder base64en = new BASE64Encoder(); 
		password_old=base64en.encode(md5.digest(password_old.getBytes("utf-8")));
		password_new=base64en.encode(md5.digest(password_new.getBytes("utf-8")));
		System.out.println("������Ϊ��"+password_old);
		System.out.println("������Ϊ��"+password_new);
		
		List p=(List)ActionContext.getContext().getSession().get("user");
		People people=(People)p.get(0);
		
		if(userManage.passwordCheck(password_old)) {//�жϾ������Ƿ���ȷ
			System.out.println("��ʼ����");
			people.setPassword(password_new);
			System.out.println("��ֵ�ɹ���������Ϊ��"+people.getPassword());
			userManage.updateUser(people);//������userManage.modifypassword��������ݿ⣬�ᷢ������a different object with the same identifier value was already associated with the session������ͬ��ʶ��ֵ�Ĳ�ͬ�����Ѿ���ûỰ�������
			System.out.println("���³ɹ�");
		}		
		return "success";
	}
}
