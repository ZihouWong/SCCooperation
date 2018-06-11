package org.sccooperation.service.impl;

import java.util.List;

import org.sccooperation.dao.ICourseDao;
import org.sccooperation.service.CourseManage;

public class CourseManageImpl implements CourseManage{
	private ICourseDao courseDao;
	
	public ICourseDao getCourseDao() {
		return courseDao;
	}

	public void setCourseDao(ICourseDao courseDao) {
		this.courseDao = courseDao;
	}
	
	// 躬行课堂:
	@Override
	public List guessUlike(int pageNo) {
		// 主页-猜你喜欢的课程
		return courseDao.findUlike(pageNo);
	}

	@Override
	public List findCourseByButton(int tagNo, int pageNo) {
		// 主页-查找标签对应的课程
		return courseDao.findCourseByButton(tagNo, pageNo);
	}

	@Override
	public List findAllCourse(int pageNo) {
		// 主页-查找所有课程
		return courseDao.findAllCourse(pageNo);
	}

	@Override
	public List getCourseInfo(int courseId) {
		// 详细页面-查找课程信息
		return courseDao.getCourseInfo(courseId);
	}

	@Override
	public List getCourseList() {
		// 详细页面-（视频显示）课程列表
		return courseDao.getCourseList();
	}

	@Override
	public List findCourseAd() {
		// 详细页面-课程广告
		return courseDao.getCourseAd();
	}
	
	@Override
	public String getTeacherid(int courseId) {
		// 详细页面-获取教师Id-用于获取教师信息
		return courseDao.getTeacherid(courseId);
	}

	@Override
	public List showMainCourse(int pageNo, int button) {
		// 搜索页面-主要课程内容
		return courseDao.showMainCourse(pageNo, button);
	}

	@Override
	public List showHotCourse(int pageNo, int button) {
		// 搜索页面-热点课程列表
		return courseDao.showHotCourse(pageNo, button);
	}

	@Override
	public List searchCourse(String content, int pageNo) {
		// 搜索页面-获取搜索内容
		return courseDao.searchCourseByContent(content, pageNo);
	}

	@Override
	public long getCourseNum(Class entityClazz) {
		// 搜索页面-获取课程数量
		return courseDao.getCourseNum(entityClazz);
	}
	
}
