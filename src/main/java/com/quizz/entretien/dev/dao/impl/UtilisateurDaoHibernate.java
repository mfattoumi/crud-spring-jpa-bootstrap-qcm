package com.quizz.entretien.dev.dao.impl;

import org.springframework.stereotype.Repository;

import com.quizz.entretien.dev.dao.UtilisateurDao;
import com.quizz.entretien.dev.dao.generic.GenericDaoHibernate;
import com.quizz.entretien.dev.model.Utilisateur;

@Repository
public class UtilisateurDaoHibernate extends GenericDaoHibernate<Utilisateur> implements UtilisateurDao {

}

