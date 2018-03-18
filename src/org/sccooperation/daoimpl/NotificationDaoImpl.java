package org.sccooperation.daoimpl;

import java.util.List;

import org.sccooperation.dao.INotificationDao;
import org.sccooperation.domain.Notification;

public class NotificationDaoImpl<T> extends BaseDaoImpl<T> implements INotificationDao<T> {
	@Override
	public void insertNotification(T entity) {
		System.out.println("start updateNotification");
		save(entity);
	}
	
	@Override
	public List findnotificationbypage(int pageNo) {
		List<T> notification = findByPage("from Notification", pageNo, 5, 5);
		return notification;
	}
}
