package com.qcm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qcm.model.Question;
import com.qcm.repository.QuestionRepository;
import com.qcm.service.IQuestionService;

@Service
@Transactional
public class QuestionServiceImpl implements IQuestionService{
	
	@Autowired
	private QuestionRepository questionRepository;
	
	@Override
	public void saveQuestion(Question question) {
		questionRepository.save(question);	
	}

}
