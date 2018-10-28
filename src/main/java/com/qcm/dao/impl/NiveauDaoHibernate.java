package com.quizz.entretien.dev.dao.impl;

import org.springframework.stereotype.Repository;

import com.quizz.entretien.dev.dao.NiveauDao;
import com.quizz.entretien.dev.dao.generic.GenericDaoHibernate;
import com.quizz.entretien.dev.model.Niveau;

@Repository
public class NiveauDaoHibernate extends GenericDaoHibernate<Niveau> implements NiveauDao {

}