package com.quizz.entretien.dev.dao.impl;

import org.springframework.stereotype.Repository;

import com.quizz.entretien.dev.dao.QuestionDao;
import com.quizz.entretien.dev.dao.generic.GenericDaoHibernate;
import com.quizz.entretien.dev.model.Question;

@Repository
public class QuestionDaoHibernate extends GenericDaoHibernate<Question> implements QuestionDao {

}
