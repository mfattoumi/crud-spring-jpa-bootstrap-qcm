package com.qcm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qcm.model.Domaine;
import com.qcm.repository.DomaineRepository;
import com.qcm.service.IDomaineService;

@Service
@Transactional
public class DomaineServiceImpl implements IDomaineService{

	@Autowired
	private DomaineRepository domaineRepository;
	
	@Override
	public void saveDomaine(Domaine domaine) {
		domaineRepository.save(domaine);		
	}

}
