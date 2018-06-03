package org.sccooperation.action.personalcenter;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.*;

import org.sccooperation.domain.Cv;
import org.sccooperation.domain.People;
import org.sccooperation.service.CvManage;
import com.opensymphony.xwork2.ActionContext;

/**
 * Project:SCCooperation Comments:此类action，先由spring装配一个实例，然后将该实例交给struts管理,主要功能是用户申请修改简历时返回其相应的信息
 *  JDK version used:JDK1.8 
 *  Author：blank700 Create Date：2017-11-24 Modified By： blank700<修改人中文名或拼音缩写>
 * Modified Date: <修改日期，格式:2017-11-24> Why & What is modified <修改原因描述>
 * Version:1.0
 */
public class DisplaycvAction {
	/**实例化一个service层的变量，调用其方法*/
	private CvManage cvManage;
	
	public CvManage getCvManage() {
		return cvManage;
	}

	public void setCvManage(CvManage cvManage) {
		this.cvManage = cvManage;
	}
	/**
	 * 从Session中获取用户cv表的id，调用service从数据库查找出该用户的简历信息
	 * 
	 * @return 返回'success'或'error'字符串
	 * @throws NoSuchAlgorithmException 
	 * @throws UnsupportedEncodingException 
	 * @exception 暂时没做
	 */

	public String execute() {
		List p=(List)ActionContext.getContext().getSession().get("user");
		People people=(People)p.get(0);
		Cv cv=people.getCv();
		Map request = (Map)ActionContext.getContext().get("request");
		request.put("cv", cv);
		
		return "success";
	}
}
