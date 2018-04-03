package org.sccooperation.service;

import java.util.List;

public interface CourseManage {
	public List guessUlike(int pageNo);
	
	public List findCourseByButton(int tagNo, int pageNo);

	public List findAllCourse(int pageNo);

	public List getCourseInfo(int courseId);

	public List getCourseList();

	public List findCourseAd();

	public String getTeacherid(int courseId);
	

}
