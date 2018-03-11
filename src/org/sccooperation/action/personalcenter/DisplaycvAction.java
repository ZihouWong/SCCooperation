package org.sccooperation.action.personalcenter;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.*;

import org.sccooperation.domain.Cv;
import org.sccooperation.domain.People;
import org.sccooperation.service.CvManage;
import com.opensymphony.xwork2.ActionContext;

/**
 * Project:SCCooperation Comments:����action������springװ��һ��ʵ����Ȼ�󽫸�ʵ������struts����,��Ҫ�������û������޸ļ���ʱ��������Ӧ����Ϣ
 *  JDK version used:JDK1.8 
 *  Author��blank700 Create Date��2017-11-24 Modified By�� blank700<�޸�����������ƴ����д>
 * Modified Date: <�޸����ڣ���ʽ:2017-11-24> Why & What is modified <�޸�ԭ������>
 * Version:1.0
 */
public class DisplaycvAction {
	/**ʵ����һ��service��ı����������䷽��*/
	private CvManage cvManage;
	
	public CvManage getCvManage() {
		return cvManage;
	}

	public void setCvManage(CvManage cvManage) {
		this.cvManage = cvManage;
	}
	/**
	 * ��Session�л�ȡ�û�cv���id������service�����ݿ���ҳ����û��ļ�����Ϣ
	 * 
	 * @return ����'success'��'error'�ַ���
	 * @throws NoSuchAlgorithmException 
	 * @throws UnsupportedEncodingException 
	 * @exception ��ʱû��
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
