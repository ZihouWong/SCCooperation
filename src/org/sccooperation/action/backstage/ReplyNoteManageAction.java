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
	private String pageNo;

	public NoteManage<ReplyNote> getReplyNoteManage() {
		return replyNoteManage;
	}

	public void setReplyNoteManage(NoteManage<ReplyNote> replyNoteManage) {
		this.replyNoteManage = replyNoteManage;
	}

	public String getPageNo() {
		return pageNo;
	}

	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}

	@SuppressWarnings("unchecked")
	public String index() {
		
		List<ReplyNote> result = replyNoteManage.backstageFindAllReplyNote(Integer.parseInt(pageNo));
		
		System.out.println(pageNo+".............................");
		((Map<String, List<ReplyNote>>)ActionContext.getContext().get("request")).put("replyNoteList", result);
		
		return "success";

	}
}
