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
 * Comments:此类action，先由spring装配一个实例，然后将该实例交给struts管理,主要功能是用户进入个人信息中心时返回其相应的信息
 * JDK version used:JDK1.8 Author：blank700 Create Date：2017-12-8 Modified By：
 * blank700<修改人中文名或拼音缩写> Modified Date:2017-12-8 <修改日期，格式:YYYY-MM-DD> Why & What
 * is modified <修改原因描述> Version:1.0
 */
public class DisplaypersonalcenterAction {
	/** 实例化一个service层的变量，调用其方法 */
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
	 * 从Session中获取用户people表的tagno，调用service从数据库查找出该用户的简历信息
	 * 
	 * @return 返回'success'或'error'字符串
	 * @throws NoSuchAlgorithmException
	 * @throws UnsupportedEncodingException
	 * @exception 暂时没做
	 */

	public String execute() {
		List p = (List) ActionContext.getContext().getSession().get("user");
		People people = (People) p.get(0);
		//分离出tagno
		String[] tagno = people.getTagno().split(";");
		//查询对应tagno对应的内容
		List t1 = tagManage.findtag(Integer.parseInt(tagno[0]));
		List t2 = tagManage.findtag(Integer.parseInt(tagno[1]));
		List t3 = tagManage.findtag(Integer.parseInt(tagno[2]));

		
		List<List> utag = new ArrayList<List>();
		utag.add(t1);
		utag.add(t2);
		utag.add(t3);
		/*System.out.println("get出来:" + tag.get(0).get(0));
		System.out.println("get出来:" + tag.get(1).get(0));
		System.out.println("get出来:" + tag.get(2).get(0));*/
		
		//将查找到的tagno对应的内容放入tag中
		ActionContext.getContext().getSession().put("utag",utag);
		
		
		/*System.out.println("转换后:" + Integer.parseInt(tagno[0]));
		System.out.println("转换后:" + Integer.parseInt(tagno[1]));
		System.out.println("转换后:" + Integer.parseInt(tagno[2]));*/
		List post = postManage.findpost(Integer.parseInt(tagno[0]), Integer.parseInt(tagno[1]), Integer.parseInt(tagno[2]));
		
		
		/*System.out.println("get出post里的元素");
		System.out.println("项目1的名字"+((Post)post.get(0)).getEname());
		System.out.println("项目2的名字"+((Post)post.get(1)).getEname());
		System.out.println("项目3的名字"+((Post)post.get(2)).getEname());
		System.out.println("项目4的名字"+((Post)post.get(3)).getEname());
		System.out.println("项目5的名字"+((Post)post.get(4)).getEname());
		System.out.println("项目6的名字"+((Post)post.get(5)).getEname());*/
		
		//随机向网页传输不同的post对象
		//产生随机数
		HashSet hs=new HashSet();
		int cnt=0;
		for(int i=0;i<5;i++) {
			int tem=new Random().nextInt(post.size()-1);
			System.out.println("tem:"+tem);
			System.out.println("i:"+i);
			hs.add(tem);
			System.out.println("hs长度:"+hs.size());
			if(hs.size()>cnt) {
				cnt=hs.size();
			}else {
				i--;
			}
		}
		//完成产生随机数
		
		//随机将post对象装入temp中
		List rand = new ArrayList<Post>();
		Iterator it = hs.iterator();
		for(int i=0;i<5;i++) {
			rand.add(post.get((int)it.next()));
		}
		
		/*System.out.println("随机产生的项目：");
		System.out.println("项目1的名字"+((Post)temp.get(0)).getEname());
		System.out.println("项目2的名字"+((Post)temp.get(1)).getEname());
		System.out.println("项目3的名字"+((Post)post.get(0)).getEname());*/
		
		//将temp放入request中
		Map pp = (Map)ActionContext.getContext().get("request");
		pp.put("post", rand);

		return "success";
	}
}
