package org.sccooperation.action.backstage;

import java.sql.SQLDataException;
import java.util.List;
import java.util.Map;

import org.sccooperation.domain.Enterprise;
import org.sccooperation.domain.Note;
import org.sccooperation.domain.People;
import org.sccooperation.service.CommonManage;
import org.sccooperation.service.NoteManage;
import org.sccooperation.service.UserManage;

import com.opensymphony.xwork2.ActionContext;

/*
 * @author WLNSSS
 * @time 2018.1.13
 * ���ӹ������
 * */
public class NoteManageAction {

	// ���Ӵ�����
	private NoteManage<Note> noteManage;
	
	//�����������
	private CommonManage<Note> commonManage;

	// ҳ��
	private String pageNo;
	
	// �����ؼ���
	private String keyword;
	
	// id
	private String id;
	
	//����
	private String table;
	
	//��B
	private String state;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTable() {
		return table;
	}

	public void setTable(String table) {
		this.table = table;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	//�鿴ҳ��
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public String see() throws Exception {
		// ����ҳ����ȡ�����б�
		List<Note> list = noteManage.findAllNote(Integer.parseInt(pageNo));
		
		//����request����
		 ((Map) ActionContext.getContext().get("request")).put("noteList", list);

		return "success";

	}
	
	//����ҳ��
	public String search() {
		
		//��ȡ�����Ľ����
		List<Note> list = noteManage.searchByPageNo(keyword, Integer.parseInt(pageNo));
		
		//����request����
		((Map) ActionContext.getContext().get("request")).put("noteList", list);
		
		return "success";
	}
	
	//��ͣ����
	public String stopNote() throws NumberFormatException, Exception {
		
		boolean result = commonManage.isEnable(table, Integer.parseInt(id), state);
		
		if(result == false) {
			return "error";
		}
		
		if(result == true) {
			return "success";
		}
		return "success";
	}

	public String getPageNo() {
		return pageNo;
	}

	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}

	public NoteManage<Note> getNoteManage() {
		return noteManage;
	}

	public void setNoteManage(NoteManage<Note> noteManage) {
		this.noteManage = noteManage;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public CommonManage<Note> getCommonManage() {
		return commonManage;
	}

	public void setCommonManage(CommonManage<Note> commonManage) {
		this.commonManage = commonManage;
	}


}
