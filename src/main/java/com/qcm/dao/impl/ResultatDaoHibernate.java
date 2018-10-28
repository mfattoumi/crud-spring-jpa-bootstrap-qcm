package com.quizz.entretien.dev.dao.impl;

import org.springframework.stereotype.Repository;

import com.quizz.entretien.dev.dao.ResultatDao;
import com.quizz.entretien.dev.dao.generic.GenericDaoHibernate;
import com.quizz.entretien.dev.model.Resultat;

@Repository
public class ResultatDaoHibernate extends GenericDaoHibernate<Resultat> implements ResultatDao {

}
