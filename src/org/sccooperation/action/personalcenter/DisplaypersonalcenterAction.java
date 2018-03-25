package org.sccooperation.action.personalcenter;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.*;

import org.sccooperation.domain.Post;
import org.sccooperation.domain.People;
import org.sccooperation.service.TagManage;
import org.sccooperation.service.PostManage;

import com.opensymphony.xwork2.ActionContext;

/**
 * Project:SCCooperation
 * Comments:����action������springװ��һ��ʵ����Ȼ�󽫸�ʵ������struts����,��Ҫ�������û����������Ϣ����ʱ��������Ӧ����Ϣ
 * JDK version used:JDK1.8 Author��blank700 Create Date��2017-12-8 Modified By��
 * blank700<�޸�����������ƴ����д> Modified Date:2017-12-8 <�޸����ڣ���ʽ:YYYY-MM-DD> Why & What
 * is modified <�޸�ԭ������> Version:1.0
 */
public class DisplaypersonalcenterAction {
	/** ʵ����һ��service��ı����������䷽�� */
	private TagManage tagManage;
	
	private PostManage postManage;

	public TagManage getTagManage() {
		return tagManage;
	}

	public void setTagManage(TagManage tagManage) {
		this.tagManage = tagManage;
	}
	
	public PostManage getPostManage() {
		return postManage;
	}

	public void setPostManage(PostManage postManage) {
		this.postManage = postManage;
	}

	/**
	 * ��Session�л�ȡ�û�people���tagno������service�����ݿ���ҳ����û��ļ�����Ϣ
	 * 
	 * @return ����'success'��'error'�ַ���
	 * @throws NoSuchAlgorithmException
	 * @throws UnsupportedEncodingException
	 * @exception ��ʱû��
	 */

	public String execute() {
		List p = (List) ActionContext.getContext().getSession().get("user");
		People people = (People) p.get(0);
		//�����tagno
		String[] tagno = people.getTagno().split(";");
		//��ѯ��Ӧtagno��Ӧ������
		List t1 = tagManage.findtag(Integer.parseInt(tagno[0]));
		List t2 = tagManage.findtag(Integer.parseInt(tagno[1]));
		List t3 = tagManage.findtag(Integer.parseInt(tagno[2]));

		
		List<List> utag = new ArrayList<List>();
		utag.add(t1);
		utag.add(t2);
		utag.add(t3);
		/*System.out.println("get����:" + tag.get(0).get(0));
		System.out.println("get����:" + tag.get(1).get(0));
		System.out.println("get����:" + tag.get(2).get(0));*/
		
		//�����ҵ���tagno��Ӧ�����ݷ���tag��
		ActionContext.getContext().getSession().put("utag",utag);
		
		
		/*System.out.println("ת����:" + Integer.parseInt(tagno[0]));
		System.out.println("ת����:" + Integer.parseInt(tagno[1]));
		System.out.println("ת����:" + Integer.parseInt(tagno[2]));*/
		List post = postManage.findpost(Integer.parseInt(tagno[0]), Integer.parseInt(tagno[1]), Integer.parseInt(tagno[2]));
		
		
		/*System.out.println("get��post���Ԫ��");
		System.out.println("��Ŀ1������"+((Post)post.get(0)).getEname());
		System.out.println("��Ŀ2������"+((Post)post.get(1)).getEname());
		System.out.println("��Ŀ3������"+((Post)post.get(2)).getEname());
		System.out.println("��Ŀ4������"+((Post)post.get(3)).getEname());
		System.out.println("��Ŀ5������"+((Post)post.get(4)).getEname());
		System.out.println("��Ŀ6������"+((Post)post.get(5)).getEname());*/
		
		//�������ҳ���䲻ͬ��post����
		//���������
		HashSet hs=new HashSet();
		int cnt=0;
		for(int i=0;i<5;i++) {
			int tem=new Random().nextInt(post.size()-1);
			System.out.println("tem:"+tem);
			System.out.println("i:"+i);
			hs.add(tem);
			System.out.println("hs����:"+hs.size());
			if(hs.size()>cnt) {
				cnt=hs.size();
			}else {
				i--;
			}
		}
		//��ɲ��������
		
		//�����post����װ��temp��
		List rand = new ArrayList<Post>();
		Iterator it = hs.iterator();
		for(int i=0;i<5;i++) {
			rand.add(post.get((int)it.next()));
		}
		
		/*System.out.println("�����������Ŀ��");
		System.out.println("��Ŀ1������"+((Post)temp.get(0)).getEname());
		System.out.println("��Ŀ2������"+((Post)temp.get(1)).getEname());
		System.out.println("��Ŀ3������"+((Post)post.get(0)).getEname());*/
		
		//��temp����request��
		Map pp = (Map)ActionContext.getContext().get("request");
		pp.put("post", rand);

		return "success";
	}
}
