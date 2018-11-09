package com.qcm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qcm.model.Reponse;
import com.qcm.repository.ReponseRepository;
import com.qcm.service.IReponseService;

@Service
@Transactional
public class ReponseServiceImpl implements IReponseService{
	
	@Autowired
	private ReponseRepository reponseRepository;
	
	@Override
	public void saveReponse(Reponse reponse) {
		reponseRepository.save(reponse);	
	}

}
