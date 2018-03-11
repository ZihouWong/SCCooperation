package org.sccooperation.dao;

import java.util.List;

/**
 * Project:SCCooperation Comments:�����Ǳ�ǩ�����ӿ�
 *  JDK version used:JDK1.8 
 *  Author��blank700 Create Date��2017-12-13 Modified By�� <�޸�����������ƴ����д>
 * Modified Date:2017-12-13 <�޸����ڣ���ʽ:YYYY-MM-DD> Why & What is modified <�޸�ԭ������>
 * Version:1.0
 */
public interface IPostDao<T>{

	
	
	/**
	 * ������ҳ��������tagno����ѯ���ݿ�Post����tagno��Ӧ�ķ���
	 * 
	 * @param tagno?��ҳ������tagno?
	 * @return ���ظ��û���Ϣ
	 * @exception ��ʱû��
	 */
	public List findpost(int tagno1,int tagno2,int tagno3);
	
	/**
	 * ������ҳ������post��id����ѯ���ݿ�Post�������Ӧ����Ŀ
	 * 
	 * @param p_id��ҳ������p_id
	 * @return ���ظ��û���Ϣ
	 * @exception ��ʱû��
	 */
	public List pidtofindpost(int post_id);
	
	/**
	 * ������ҳ��������enterprise��id����ѯ���ݿ�Post�������Ӧ����Ŀ
	 * 
	 * @param enterprise_id��ҳ������enterprise_id
	 * @return ���ظ��û���Ϣ
	 * @exception ��ʱû��
	 */
	public List eidtofindpostbypage(int enterprise_id,int pageNo);
	
	/**
	 * ������ҳ��������enterprisesubuser��id����ѯ���ݿ�Post�������Ӧ����Ŀ
	 * 
	 * @param enterprisesubuser_id��ҳ������enterprisesubuser_id
	 * @return ���ظ��û���Ϣ
	 * @exception ��ʱû��
	 */
	public List esuidtofindpostbypage(int enterprisesubuser_id,int pageNo);
	
	/**
	 * ������ҳ��������������Ϣ���뵽������ݿ�
	 * 
	 * @param entity �����࣬����Ҫע����û����߹�˾����Ϣ
	 * @return void
	 * @exception ��ʱû��
	 */
	public void insertPost(T entity);
	
	/**
	 * ������ҳ��������������Ϣ����������ݿ�
	 * 
	 * @param entity �����࣬����Ҫע����û����߹�˾����Ϣ
	 * @return void
	 * @exception ��ʱû��
	 */
	public void updatePost(T entity);

}
