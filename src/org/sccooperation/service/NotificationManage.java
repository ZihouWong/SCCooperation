package org.sccooperation.service;

import java.util.List;

import org.sccooperation.domain.Notification;

public interface NotificationManage<T> {
	public void insertNotification(T entity);
	public List findnotificationbypage(int pageNo);
}
