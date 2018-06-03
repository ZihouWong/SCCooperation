package org.sccooperation.service.impl;

import java.util.List;

import org.sccooperation.dao.INotificationDao;
import org.sccooperation.domain.Notification;
import org.sccooperation.service.NotificationManage;

public class NotificationManageImpl<T> implements NotificationManage<T> {
	private INotificationDao notificationDao;

	public INotificationDao getNotificationDao() {
		return notificationDao;
	}

	public void setNotificationDao(INotificationDao notificationDao) {
		this.notificationDao = notificationDao;
	}
	
	@Override
	public void insertNotification(T entity) {
		notificationDao.insertNotification(entity);
	}
	
	@Override
	public List findnotificationbypage(int pageNo) {
		System.out.println("findnotificationbypage");
		return notificationDao.findnotificationbypage(pageNo);
	}
}
