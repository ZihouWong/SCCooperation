package org.sccooperation.action;

import java.util.List;
import java.util.Map;

import org.sccooperation.domain.Note;
import org.sccooperation.domain.People;
import org.sccooperation.service.NoteManage;

import com.opensymphony.xwork2.ActionContext;

/**
 * Project:SCCooperation Comments:����action������springװ��һ��ʵ����Ȼ�󽫸�ʵ������struts����,��Ҫ�������û��������Ӿ���ҳ��
 *  JDK version used:JDK1.8 
 *  Author��WLNSSS Create Date��2017-9-27 Modified By�� <�޸�����������ƴ����д>
 * Modified Date: <�޸����ڣ���ʽ:YYYY-MM-DD> Why & What is modified <�޸�ԭ������>
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
		//����id��ѯ����
		Note note = (Note)noteManage.findById(Note.class, Integer.parseInt(id));
		
		//����id��ѯ�ظ�������
		List list = noteManage.findReplyNoteByPage(Integer.parseInt(pageNo),Integer.parseInt(id));
		
		
		System.out.println("\n\n\n\n"+list.size()+"      "+id);
		
		//��ȡrequest����
		request = (Map) ActionContext.getContext().get("request");
		
		//�����������1
		note.setSeenum(note.getSeenum()+1);
	    noteManage.saveAlter(note);
	    
	    //�������������
		request.put("firstNote", note);
		
		//�ѷ����˴���request
		request.put("host",note.getPeople_id());
		
		//�ѻظ�����Ϣ����request
		request.put("replyNote", list);
		
		return "success";
	}
	
}
