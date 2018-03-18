package org.sccooperation.dao;

import java.util.List;

/**
 * Project:SCCooperation Comments:�����Ǽ��������ӿ�
 *  JDK version used:JDK1.8 
 *  Author��WLNSSS Create Date��2017-11-23 Modified By��blank700 <�޸�����������ƴ����д>
 * Modified Date: <�޸����ڣ���ʽ:2017-11-23> Why & What is modified <�޸�ԭ������>
 * Version:1.0
 */

public interface ICvDao<T> {
	/**
	 * ������ҳ�������û�����Ӧ�������id����ѯ���������Ϣ
	 * 
	 * @param cvid  ��ҳ�����ļ�����id 
	 * @return ���ظ��û���Ϣ
	 * @exception ��ʱû��
	 */
	public List findCvInformation(int cvid);
	
	/**
	 * ������ҳ��������������Ϣ����������ݿ�
	 * 
	 * @param entity �����࣬����Ҫע����û����߹�˾����Ϣ
	 * @return void
	 * @exception ��ʱû��
	 */
	public void updateCv(T entity);
}
