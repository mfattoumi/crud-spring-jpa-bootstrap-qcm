package com.quizz.entretien.dev.dao.impl;


import org.springframework.stereotype.Repository;

import com.quizz.entretien.dev.dao.DomaineDao;
import com.quizz.entretien.dev.dao.generic.GenericDaoHibernate;
import com.quizz.entretien.dev.model.Domaine;

@Repository
public class DomaineDaoHibernate extends GenericDaoHibernate<Domaine> implements DomaineDao {

	
}
