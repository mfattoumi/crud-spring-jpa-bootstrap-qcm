package com.qcm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qcm.model.Niveau;
import com.qcm.repository.NiveauRepository;
import com.qcm.service.INiveauService;

@Service
@Transactional
public class NiveauServiceImpl implements INiveauService{
	
	@Autowired
	private NiveauRepository niveauRepository;
	
	@Override
	public void saveNiveau(Niveau niveau) {
		niveauRepository.save(niveau);	
	}

}
