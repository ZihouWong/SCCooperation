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
public class QuitAction {
	/**
	 * �û��˳���¼
	 * 
	 */

	public String execute() {
		ActionContext.getContext().getSession().put("user",null);
		if(ActionContext.getContext().getSession().get("user")==null) {
			System.out.println("�˳��ɹ�");
			return "success";
		}
		else {
			System.out.println("�˳�ʧ��");
			return "error";
		}
	}
}
