package org.sccooperation.service;

import java.util.List;

import org.sccooperation.domain.Course;

public interface CourseManage {
	public List guessUlike(int pageNo);
	
	public List findCourseByButton(int tagNo, int pageNo);

	public List findAllCourse(int pageNo);

	public List getCourseInfo(int courseId);

	public List getCourseList();

	public List findCourseAd();
	
	public String getTeacherid(int courseId);

	public List showMainCourse(int pageNo, int button);

	public List showHotCourse(int pageNo, int button);

	public List searchCourse(String content, int pageNo);

	public long getCourseNum(Class entityClazz);

}
