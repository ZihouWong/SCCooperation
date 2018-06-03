package org.sccooperation.dao;

import java.util.List;

/**
 * Project:SCCooperation Comments:��������ҵ�����ӿ�
 *  JDK version used:JDK1.8 
 *  Author��bllank700 Create Date��2018-2-3 Modified By�� <�޸�����������ƴ����д>
 * Modified Date: <�޸����ڣ���ʽ:YYYY-MM-DD> Why & What is modified <�޸�ԭ������>
 * Version:1.0
 */

public interface INotificationDao<T> {
	/**
	 * ������ҳ��������������Ϣ����������ݿ�
	 * 
	 * @param entity �����࣬����Ҫע����û����߹�˾����Ϣ
	 * @return void
	 * @exception ��ʱû��
	 */
	public void insertNotification(T entity);
	
	/**
	 *��ѯ���ݿ�Notification���е�֪ͨ
	 * 
	 * @param pageNo��ҳ������ҳ��
	 * @return ���ظ��û���Ϣ
	 * @exception ��ʱû��
	 */
	public List findnotificationbypage(int pageNo);
}
