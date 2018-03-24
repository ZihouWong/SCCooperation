
package org.sccooperation.dao;

import java.util.List;

public interface ICourseDao {
	public List findUlike(int pageNo);
	
	public List findCourseByButton(int tagNo, int pageNo);

	public List findAllCourse(int pageNo);

	public List getCourseInfo(int courseNo);

	public List getCourseList();

	public List getCourseAd();
}
	