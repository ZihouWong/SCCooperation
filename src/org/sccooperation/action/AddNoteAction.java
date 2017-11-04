package org.sccooperation.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.sccooperation.domain.Note;
import org.sccooperation.domain.People;
import org.sccooperation.service.NoteManage;

import com.opensymphony.xwork2.ActionContext;

/**
 * Project:SCCooperation Comments:����action������springװ��һ��ʵ����Ȼ�󽫸�ʵ������struts����,��Ҫ���������һ������
 *  JDK version used:JDK1.8 
 *  Author��WLNSSS Create Date��2017-9-27 Modified By�� <�޸�����������ƴ����д>
 * Modified Date: <�޸����ڣ���ʽ:YYYY-MM-DD> Why & What is modified <�޸�ԭ������>
 * Version:1.0
 */
public class AddNoteAction {
	private NoteManage noteManage;
	//����
    private String title;
    //����
    private String content;
	public NoteManage getNoteManage() {
		return noteManage;
	}
	public void setNoteManage(NoteManage noteManage) {
		this.noteManage = noteManage;
	}
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
		
		 //���µķ������ݴ������ݿ�
		 Note note = new Note();
		 note.setContent(content);
		 note.setTime(time);
		 note.setTitle(title);
		 note.setSeenum(0);
		 note.setPeople_id(people);
		 
		 noteManage.addNote(note);
		
		 return "success";
		 
		 
	}
}
