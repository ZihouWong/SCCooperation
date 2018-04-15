package org.sccooperation.daoimpl;

import java.util.List;
import org.sccooperation.dao.ICourseDao;

public class CourseDaoImpl extends BaseDaoImpl implements ICourseDao{
	
	public List findUlike(int pageNo) {
		// 躬行课堂-主页-显示猜你喜欢的课程
		return find("from Course order by seenum desc");
	}
	
	@Override
	public List findCourseByButton(int tagNo, int pageNo) {
		// 躬行课堂-主页-显示标签对应的课程
		return findByPage("from Course where tagno=?0", pageNo, 8, 8, tagNo);
	}

	@Override
	public List findAllCourse(int pageNo) {
		// 躬行课堂-主页-显示所有的课程	
		return findBypage("from Course", pageNo, 8, 8);
	}

	@Override
	public List getCourseInfo(int courseNo) {
		// 躬行课堂-详细页面-显示某课程信息
		return find("from Course where id=?0", courseNo);
	}

	@Override
	public List getCourseList() {
		// 躬行课堂-详细页面-（视频显示）课程列表
		return findBypage("from Course order by seenum desc", 1, 15, 15);
	}

	@Override
	public List getCourseAd() {
		// 详细页面-课程广告
		return find("from Course order by seenum desc");
	}
	
}
