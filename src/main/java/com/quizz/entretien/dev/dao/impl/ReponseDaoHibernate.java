package com.quizz.entretien.dev.dao.impl;

import org.springframework.stereotype.Repository;

import com.quizz.entretien.dev.dao.ReponseDao;
import com.quizz.entretien.dev.dao.generic.GenericDaoHibernate;
import com.quizz.entretien.dev.model.Reponse;

@Repository
public class ReponseDaoHibernate extends GenericDaoHibernate<Reponse> implements ReponseDao {

}

