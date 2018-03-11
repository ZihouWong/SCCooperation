package org.sccooperation.action;

import java.util.List;
import java.util.Map;

import org.sccooperation.domain.Note;
import org.sccooperation.domain.People;
import org.sccooperation.service.NoteManage;

import com.opensymphony.xwork2.ActionContext;

/**
 * Project:SCCooperation Comments:����action������springװ��һ��ʵ����Ȼ�󽫸�ʵ������struts����,��Ҫ�������û����ʴ��йȣ��������ݵײ��ҵ���Ӧ����������
 *  JDK version used:JDK1.8 
 *  Author��WLNSSS Create Date��2017-9-27 Modified By�� <�޸�����������ƴ����д>
 * Modified Date: <�޸����ڣ���ʽ:YYYY-MM-DD> Why & What is modified <�޸�ԭ������>
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
		//��ȡrequest����
		request = (Map)ActionContext.getContext().get("request"); 
		
		//����ҳ����ѯ�����б�
		request.put("list", noteManage.findAllNote(Integer.parseInt(pageNo)));
		
		//��ѯ��������
		request.put("noteSum", noteManage.findNoteCount(Note.class));
		
		//��ѯ���������ĸ���
		request.put("manyNotePeople", noteManage.seeManyNotePeople());
		
		
		return "success";
		
	}


}
