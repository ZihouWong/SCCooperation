
package org.sccooperation.dao;

import java.util.List;

public interface ICourseDao {
	public List findUlike(int pageNo);
	
	public List findCourseByButton(int tagNo, int pageNo);

	public List findAllCourse(int pageNo);

	public List getCourseInfo(int courseNo);

	public List getCourseList();

	public List getCourseAd();

	public String getTeacherid(int courseId);

	public List showMainCourse(int pageNo, int button);

	public List showHotCourse(int pageNo, int button);

	public List searchCourseByContent(String content, int pageNo);
}
	