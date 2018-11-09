package com.qcm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qcm.model.Examen;
import com.qcm.repository.ExamenRepository;
import com.qcm.service.IExamenService;

@Service
@Transactional
public class ExamenServiceImpl implements IExamenService{

	@Autowired
	private ExamenRepository examenRepository;
	
	@Override
	public void saveExamen(Examen examen) {
		examenRepository.save(examen);	
	}

}
