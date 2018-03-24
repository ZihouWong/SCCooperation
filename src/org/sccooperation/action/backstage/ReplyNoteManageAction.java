package org.sccooperation.action.backstage;

import java.util.List;
import java.util.Map;

import org.sccooperation.domain.People;
import org.sccooperation.domain.ReplyNote;
import org.sccooperation.service.NoteManage;

import com.opensymphony.xwork2.ActionContext;

/*
 * @author WLNSSS
 * @time 2018.1.13
 * ���ӹ������
 * */
public class ReplyNoteManageAction {

	// ���Ӵ�����
	private NoteManage<ReplyNote> replyNoteManage;

	// ҳ��
	private int pageNo;

	public NoteManage<ReplyNote> getReplyNoteManage() {
		return replyNoteManage;
	}

	public void setReplyNoteManage(NoteManage<ReplyNote> replyNoteManage) {
		this.replyNoteManage = replyNoteManage;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	@SuppressWarnings("unchecked")
	public String index() {
		
		List<ReplyNote> result = replyNoteManage.backstageFindAllReplyNote(pageNo);
		
		((Map<String, List<ReplyNote>>)ActionContext.getContext().get("request")).put("replyNoteList", result);
		
		return "success";

	}
}
