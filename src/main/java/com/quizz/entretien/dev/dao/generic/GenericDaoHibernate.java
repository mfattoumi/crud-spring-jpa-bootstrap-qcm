package com.quizz.entretien.dev.dao.generic;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EmbeddedId;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.GenericTypeResolver;

@SuppressWarnings("unchecked")
public abstract class GenericDaoHibernate<T> implements GenericDao<T>{
	public static final String DT_ROW_ID = "DT_RowId";
	public static final String NO_PK_VALUE = "no-pk-value";
	
	public static final String SELECT = " SELECT ";
	public static final String SELECT_NEW = " SELECT NEW ";
	public static final String SELECT_DISTINCT = " SELECT DISTINCT ";
	public static final String SELECT_DISTINCT_NEW = " SELECT DISTINCT NEW ";
	public static final String COUNT_QUERY = " COUNT QUERY ";
	public static final String DELETE = " DELETE ";
	public static final String FROM = " FROM ";
	public static final String AND = " AND ";
	public static final String OR = " OR ";
	public static final String BETWEEN = " BETWEEN ";
	public static final String THEN = " THEN ";
	public static final String UPDATE = " UPDATE ";
	public static final String SET = " SET ";
	public static final String WHERE = " WHERE ";
	public static final String ORDER_BY = " ORDER BY ";
	public static final String GROUP_BY = " GROUP BY ";
	public static final String LIKE_BEGIN = " LIKE '%";
	public static final String LIKE_END = "%'";
	public static final String COMPARE_DATE_BEGIN = " = '";
	public static final String COMPARE_DATE_END = "'";
	public static final String LEFT_JOIN = " LEFT JOIN";
	public static final String LEFT_JOIN_FETCH = " LEFT JOIN FETCH ";
	public static final String EQUALS = " = ";
	public static final String INSERT = " INSERT ";
	
	protected Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	protected SessionFactory sessionFactory;
	
	protected final Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	protected Class<T> getEntityClass(){
		return (Class<T>)GenericTypeResolver.resolveTypeArgument(getClass(),GenericDaoHibernate.class);
	}
	
	@Override
	public T get(Class<T> clazz, Serializable id) {
		return (T) getSession().get(clazz, id);
	}
	
	@Override
	public T get(String id) {
		return get(getEntityClass(),id);		
	}
	
	@Override
	public T get(Character id) {
		return get(getEntityClass(),id);		
	}
	
	@Override
	public T get(Number id) {
		return get(getEntityClass(),id);		
	}
	
	@Override
	public T get(EmbeddedId id) {
		return get(getEntityClass(),(Serializable) id);		
	}
	
	@Override
	public T get(Serializable id) {
		return get(getEntityClass(),id);		
	}

	@Override
	public List<T> getAll(){
		Query query = getSession().createQuery(FROM + getEntityClass().getName());
		return query.list();		
	}

	@Override
	public Object save(T object){
		return getSession().save(object);		
	}
	
	@Override
	public void delete(T object){
		getSession().delete(object);		
	}
	
	@Override
	public int delete(Serializable id, String colName){
		Query query = getSession().createQuery(DELETE + FROM + getEntityClass().getName() + " c " + WHERE + colName + EQUALS + " :id ");
		query.setParameter("id", id);
		return query.executeUpdate();
	}
	
	@Override
	public int delete(Serializable id){
		return delete(id,"id");
	}
	
	@Override
	public void update(T object){
		getSession().update(object);
	}
	
	@Override
	public T merge(T object){
		return (T) getSession().merge(object);
	}
	
	@Override
	public void flush(){
		getSession().flush();
		getSession().clear();
	}
	
	@Override
	public void saveOrUpdate(T object){
		getSession().saveOrUpdate(object);
	}
	
}