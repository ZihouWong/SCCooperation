package org.sccooperation.action;

import java.util.List;
import java.util.Map;

import org.sccooperation.domain.Note;
import org.sccooperation.domain.People;
import org.sccooperation.service.NoteManage;

import com.opensymphony.xwork2.ActionContext;

/**
 * Project:SCCooperation Comments:此类action，先由spring装配一个实例，然后将该实例交给struts管理,主要功能是用户访问创行谷，调用数据底层找到相应的帖子列子
 *  JDK version used:JDK1.8 
 *  Author：WLNSSS Create Date：2017-9-27 Modified By： <修改人中文名或拼音缩写>
 * Modified Date: <修改日期，格式:YYYY-MM-DD> Why & What is modified <修改原因描述>
 * Version:1.0
 */
public class LuntanAction {

	private NoteManage noteManage;
	private String pageNo;
	private Map request; 

	public NoteManage getNoteManage() {
		return noteManage;
	}

	public void setNoteManage(NoteManage noteManage) {
		this.noteManage = noteManage;
	}

	public String getPageNo() {
		return pageNo;
	}

	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}

	public String execute()
	{
		//获取request对象
		request = (Map)ActionContext.getContext().get("request"); 
		
		
		//根据页数查询帖子列表
		request.put("list", noteManage.findAllNote(Integer.parseInt(pageNo)));
		
		//查询帖子总数
		request.put("noteSum",noteManage.findNoteCount(Note.class));
		
		//查询发帖最多的四个人
		request.put("manyNotePeople",noteManage.seeManyNotePeople());
		
		
		return "success";
		
	}


}
