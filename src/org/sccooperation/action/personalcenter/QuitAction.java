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
public class QuitAction {
	/**
	 * 用户退出登录
	 * 
	 */

	public String execute() {
		ActionContext.getContext().getSession().put("user",null);
		if(ActionContext.getContext().getSession().get("user")==null) {
			System.out.println("退出成功");
			return "success";
		}
		else {
			System.out.println("退出失败");
			return "error";
		}
	}
}
