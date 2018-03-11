package org.sccooperation.daoimpl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.sccooperation.dao.BaseDao;

/**
 *                 �ر�˵�����ุ�ӿڵķ����ڸ��ӿ�˵���ˣ��˴�����׸�����˴��ȸ���༸�������������ڸ��ļ����·�
 *                 
 * Project:SCCooperation Comments:���������ݿ�����Ļ����ӿڣ�Ŀ���Ǽ��ٴ�������� JDK version
 * used:JDK1.8 Author��WLNSSS Create Date��2017-9-27 Modified By�� <�޸�����������ƴ����д>
 * Modified Date: <�޸����ڣ���ʽ:YYYY-MM-DD> Why & What is modified <�޸�ԭ������>
 * Version:1.0
 */
public class BaseDaoImpl<T> implements BaseDao<T> {
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public T get(Class<T> entityClazz, Serializable id) {
		// TODO Auto-generated method stub
		return (T)getSessionFactory().getCurrentSession().get(entityClazz, id);
	}

	@Override
	public Serializable save(T entity) {
		// TODO Auto-generated method stub
		return getSessionFactory().getCurrentSession().save(entity);
	}

	@Override
	public void update(T entity) {
		// TODO Auto-generated method stub
		getSessionFactory().getCurrentSession().saveOrUpdate(entity);
	}

	@Override
	public void delete(T entity) {
		// TODO Auto-generated method stub
		getSessionFactory().getCurrentSession().delete(entity);
	}

	@Override
	public void delete(Class<T> entityClazz, Serializable id) {
		// TODO Auto-generated method stub
		getSessionFactory().getCurrentSession().createQuery("delete "+entityClazz.getSimpleName()+" en where en.id =?0")
		.setParameter("0", id)
		.executeUpdate();
	}
	@Override
	public List<T> findAll(Class<T> entityClazz) {
		// TODO Auto-generated method stub
		return find("select en from "+ entityClazz.getSimpleName()+" en");
	}

	@Override
	public long findCount(Class<T> entityClazz) {
		// TODO Auto-generated method stub
		List<?> l = find("select count(*) from "+entityClazz.getSimpleName());
		if(l!=null && l.size()==1)
		{
			return (Long)l.get(0);
		}
		return 0;
	}

	/**
	 * ����hql��ȡ����
	 * 
	 * @param hql hql���
	 * @return ����hql��ѯ�õ����б�����
	 * @exception ��ʱû��
	 */
    @SuppressWarnings("unchecked")
	protected List<T>find(String hql)
    {
    	return (List<T>)getSessionFactory().getCurrentSession().createQuery(hql).list();
    }
    /**
	 * ����hql��ȡ����
	 * 
	 * @param hql hql���
	 * @param params ��ʾhql�����ռλ����Ҫ��������
	 * @return ����hql��ѯ�õ����б�����
	 * @exception ��ʱû��
	 */
    @SuppressWarnings("unchecked")
	protected List<T> find(String hql , Object... params)
    {
    	Query query =getSessionFactory().getCurrentSession().createQuery(hql);
    	for(int i=0,len=params.length;i<len;i++)
    	{
    		query.setParameter(i+"", params[i]);
    	}
    	return (List<T>)query.list();
    }
    /**
	 * ����hql��ҳ��ȡ����
	 * 
	 * @param hql hql���
	 * @param pageNo ��ʾ�ӵڼ�ҳ��ʼ��ѯ
	 * @param pageSize ��ʾһҳ�м�������
	 * @param max ��ʾҪ��ѯ��ҳ
	 * @return ����hql��ѯ�õ����б�����
	 * @exception ��ʱû��
	 */
    @SuppressWarnings("unchecked")
	protected List<T> findBypage(String hql ,int pageNo,int pageSize,int max)
    {
    	return getSessionFactory().getCurrentSession().createQuery(hql).setFirstResult((pageNo-1)*pageSize).setMaxResults(max).list();
    }
    /**
	 * ����hql��ҳ��ȡ����
	 * 
	 * @param hql hql���
	 * @param pageNo ��ʾ�ӵڼ�ҳ��ʼ��ѯ
	 * @param pageSize ��ʾһҳ�м�������
	 * @param max ��ʾҪ��ѯ��ҳ
	 * @param ��ʾhql�����ռλ����Ҫ��������
	 * @return ����hql��ѯ�õ����б�����
	 * @exception ��ʱû��
	 */
    @SuppressWarnings("unchecked")
	protected List<T> findByPage(String hql ,int pageNo,int pageSize,int max,Object...params)
    {
    	Query query = getSessionFactory().getCurrentSession().createQuery(hql);
    	for(int i=0,len = params.length;i<len;i++)
    	{
    		query.setParameter(i+"", params[i]);
    	}
    	
    	return query.setFirstResult((pageNo-1)*pageSize).setMaxResults(max).list();
    }

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory; 
	}

}
