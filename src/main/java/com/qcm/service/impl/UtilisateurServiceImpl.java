package com.qcm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qcm.model.Utilisateur;
import com.qcm.repository.UtilisateurRepository;
import com.qcm.service.IUtilisateurService;

@Service
@Transactional
public class UtilisateurServiceImpl implements IUtilisateurService{
	
	@Autowired
	private UtilisateurRepository utilisateurRepository;
	
	@Override
	public void saveUtilisateur(Utilisateur utilisateur) {
		utilisateurRepository.save(utilisateur);	
	}

}
