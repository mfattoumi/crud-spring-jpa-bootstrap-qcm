package com.qcm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qcm.model.Resultat;
import com.qcm.repository.ResultatRepository;
import com.qcm.service.IResultatService;

@Service
@Transactional
public class ResultatServiceImpl implements IResultatService{
	
	@Autowired
	private ResultatRepository resultatRepository;
	
	@Override
	public void saveResultat(Resultat resultat) {
		resultatRepository.save(resultat);	
	}

}
