package org.sccooperation.action;

import java.util.List;
import java.util.Map;

import org.sccooperation.domain.Note;
import org.sccooperation.domain.People;
import org.sccooperation.service.NoteManage;

import com.opensymphony.xwork2.ActionContext;

/**
 * Project:SCCooperation Comments:此类action，先由spring装配一个实例，然后将该实例交给struts管理,主要功能是用户访问帖子具体页面
 *  JDK version used:JDK1.8 
 *  Author：WLNSSS Create Date：2017-9-27 Modified By： <修改人中文名或拼音缩写>
 * Modified Date: <修改日期，格式:YYYY-MM-DD> Why & What is modified <修改原因描述>
 * Version:1.0
 */
public class MinuteNoteAction {
	private NoteManage noteManage;
	private String id;
	private String pageNo;
	private Map request;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPageNo() {
		return pageNo;
	}

	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}

	public NoteManage getNoteManage() {
		return noteManage;
	}

	public void setNoteManage(NoteManage noteManage) {
		this.noteManage = noteManage;
	}
	public String execute()
	{
		//根据id查询帖子
		Note note = (Note)noteManage.findById(Note.class, Integer.parseInt(id));
		
		//根据id查询回复的帖子
		List list = noteManage.findReplyNoteByPage(Integer.parseInt(pageNo),Integer.parseInt(id));
		
		
		System.out.println("\n\n\n\n"+list.size()+"      "+id);
		
		//获取request对象
		request = (Map) ActionContext.getContext().get("request");
		
		//浏览帖子数加1
		note.setSeenum(note.getSeenum()+1);
	    noteManage.saveAlter(note);
	    
	    //把帖子主题存入
		request.put("firstNote", note);
		
		//把发帖人存入request
		request.put("host",note.getPeople_id());
		
		//把回复的信息存入request
		request.put("replyNote", list);
		
		return "success";
	}
	
}
