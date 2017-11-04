package org.sccooperation.daoimpl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.sccooperation.dao.BaseDao;

/**
 *                 特别说明此类父接口的方法在父接口说明了，此处不再赘述，此处比父类多几个方法，都在在该文件的下方
 *                 
 * Project:SCCooperation Comments:此类是数据库操作的基础接口，目的是减少代码的冗余 JDK version
 * used:JDK1.8 Author：WLNSSS Create Date：2017-9-27 Modified By： <修改人中文名或拼音缩写>
 * Modified Date: <修改日期，格式:YYYY-MM-DD> Why & What is modified <修改原因描述>
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
	 * 根据hql获取数据
	 * 
	 * @param hql hql语句
	 * @return 返回hql查询得到的列表结果集
	 * @exception 暂时没做
	 */
    @SuppressWarnings("unchecked")
	protected List<T>find(String hql)
    {
    	return (List<T>)getSessionFactory().getCurrentSession().createQuery(hql).list();
    }
    /**
	 * 根据hql获取数据
	 * 
	 * @param hql hql语句
	 * @param params 表示hql语句里占位符所要填充的数据
	 * @return 返回hql查询得到的列表结果集
	 * @exception 暂时没做
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
	 * 根据hql分页获取数据
	 * 
	 * @param hql hql语句
	 * @param pageNo 表示从第几页开始查询
	 * @param pageSize 表示一页有几条内容
	 * @param max 表示要查询几页
	 * @return 返回hql查询得到的列表结果集
	 * @exception 暂时没做
	 */
    @SuppressWarnings("unchecked")
	protected List<T> findBypage(String hql ,int pageNo,int pageSize,int max)
    {
    	return getSessionFactory().getCurrentSession().createQuery(hql).setFirstResult((pageNo-1)*pageSize).setMaxResults(max).list();
    }
    /**
	 * 根据hql分页获取数据
	 * 
	 * @param hql hql语句
	 * @param pageNo 表示从第几页开始查询
	 * @param pageSize 表示一页有几条内容
	 * @param max 表示要查询几页
	 * @param 表示hql语句里占位符所要填充的数据
	 * @return 返回hql查询得到的列表结果集
	 * @exception 暂时没做
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
