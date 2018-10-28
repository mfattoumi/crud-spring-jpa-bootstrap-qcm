package com.quizz.entretien.dev.dao.impl;

import org.springframework.stereotype.Repository;

import com.quizz.entretien.dev.dao.ExamenDao;
import com.quizz.entretien.dev.dao.generic.GenericDaoHibernate;
import com.quizz.entretien.dev.model.Examen;

@Repository
public class ExamenDaoHibernate extends GenericDaoHibernate<Examen> implements ExamenDao {

}