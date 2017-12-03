package org.sccooperation.chuangxinggu.action;

import java.util.List;
import java.util.Map;

import org.sccooperation.service.PostMange;


public class JobClassificationAction {
	
	private String buttom;
	private Map request;
	private PostMange postManage;


	public String getButtom() {
		return buttom;
	}
	
	public void setButtom(String buttom) {
		this.buttom = buttom;
	}
	
	public String execute() {
		
		request.put("list",	postManage.findJobByButtom(buttom));
		
		return "success";
	}
	

}
