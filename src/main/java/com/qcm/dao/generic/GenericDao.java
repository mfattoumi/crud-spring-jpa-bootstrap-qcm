package com.quizz.entretien.dev.dao.generic;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EmbeddedId;

public interface GenericDao<T> {
	T get(String id);
	T get(Character id);
	T get(Number id);
	T get(Class<T> clazz, Serializable id);
	T get(EmbeddedId id);
	T get(Serializable id);
	List<T> getAll();
	void delete(T entity);
	int delete(Serializable id);
	int delete(Serializable id, String colName);
	Object save(T object);
	void update (T object);
	T merge (T object);
	void saveOrUpdate (T object);
	void flush();
}