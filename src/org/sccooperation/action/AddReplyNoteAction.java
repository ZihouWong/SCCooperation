package org.sccooperation.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.sccooperation.domain.Note;
import org.sccooperation.domain.People;
import org.sccooperation.domain.ReplyNote;
import org.sccooperation.service.NoteManage;

import com.opensymphony.xwork2.ActionContext;
/**
 * Project:SCCooperation Comments:此类action，先由spring装配一个实例，然后将该实例交给struts管理,主要功能是添加帖子的回复内容
 *  JDK version used:JDK1.8 
 *  Author：WLNSSS Create Date：2017-9-27 Modified By： <修改人中文名或拼音缩写>
 * Modified Date: <修改日期，格式:YYYY-MM-DD> Why & What is modified <修改原因描述>
 * Version:1.0
 */
public class AddReplyNoteAction {
	private NoteManage noteManage;
	private String id;
	private String pageNo;
	//标题
    private String title;
    //内容
    private String content;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public NoteManage getNoteManage() {
		return noteManage;
	}
	public void setNoteManage(NoteManage noteManage) {
		this.noteManage = noteManage;
	}
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
	public String execute()
	{
		//获取当前的时间转为字符串存入数据库，此可以用数据库时间戳替代
		Date date=new Date();  
		 SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
		 String time=formatter.format(date);
		 System.out.println("hahahaha"+content);
		 
		//获取当前登录用户的信息
		 List list = (List) ActionContext.getContext().getSession().get("user");
		 People people = (People) list.get(0);
		 
		//发帖成功后用户发帖数加1
		 people.setNotesum(people.getNotesum()+1);
		 noteManage.saveAlter(people);
		 
		 //根据id获取帖子
		 Note note = (Note)noteManage.findById(Note.class, Integer.parseInt(id));
		 
		 
		 //保存回复帖子进入数据库
		 ReplyNote replyNote = new ReplyNote();
		 replyNote.setContent(content);
		 replyNote.setRpeople(people);
		 replyNote.setTime(time);
		 replyNote.setState("0");
		 replyNote.setRobject(note);
		 noteManage.addReplyNote(replyNote);
		 
		 
		 return "success";
		
	}
	
}
