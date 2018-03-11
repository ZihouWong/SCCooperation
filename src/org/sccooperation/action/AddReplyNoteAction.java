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
 * Project:SCCooperation Comments:����action������springװ��һ��ʵ����Ȼ�󽫸�ʵ������struts����,��Ҫ������������ӵĻظ�����
 *  JDK version used:JDK1.8 
 *  Author��WLNSSS Create Date��2017-9-27 Modified By�� <�޸�����������ƴ����д>
 * Modified Date: <�޸����ڣ���ʽ:YYYY-MM-DD> Why & What is modified <�޸�ԭ������>
 * Version:1.0
 */
public class AddReplyNoteAction {
	private NoteManage noteManage;
	private String id;
	private String pageNo;
	//����
    private String title;
    //����
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
		//��ȡ��ǰ��ʱ��תΪ�ַ����������ݿ⣬�˿��������ݿ�ʱ������
		Date date=new Date();  
		 SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
		 String time=formatter.format(date);
		 System.out.println("hahahaha"+content);
		 
		//��ȡ��ǰ��¼�û�����Ϣ
		 List list = (List) ActionContext.getContext().getSession().get("user");
		 People people = (People) list.get(0);
		 
		//�����ɹ����û���������1
		 people.setNotesum(people.getNotesum()+1);
		 noteManage.saveAlter(people);
		 
		 //����id��ȡ����
		 Note note = (Note)noteManage.findById(Note.class, Integer.parseInt(id));
		 
		 
		 //����ظ����ӽ������ݿ�
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
