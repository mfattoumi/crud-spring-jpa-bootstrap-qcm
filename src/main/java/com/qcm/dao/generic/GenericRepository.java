package com.qcm.dao.generic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

@SuppressWarnings("unchecked")
public abstract class GenericRepository{
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
	
}