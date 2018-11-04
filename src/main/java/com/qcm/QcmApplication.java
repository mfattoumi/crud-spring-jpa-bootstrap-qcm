package com.qcm;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.qcm.model.Domaine;
import com.qcm.model.Niveau;
import com.qcm.repository.DomaineRepository;
import com.qcm.repository.NiveauRepository;

@SpringBootApplication
public class QcmApplication implements CommandLineRunner{

//	@Autowired
//	DomaineRepository domaineRepository;
//	@Autowired
//	NiveauRepository niveauRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(QcmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Domaine d1 = new Domaine();
//		d1.setIdDomaine(1L);
//		d1.setLibelleDomaine("Domaine 1");
//		Domaine d2 = new Domaine();
//		d2.setIdDomaine(2L);
//		d2.setLibelleDomaine("Domaine 2");
//		Domaine d3 = new Domaine();
//		d3.setIdDomaine(3L);
//		d3.setLibelleDomaine("Domaine 3");
//		
//		Niveau n1 = new Niveau();
//		n1.setIdNiveau(1L);
//		n1.setLibelleNiveau("Niveau 1");
//		Niveau n2 = new Niveau();
//		n2.setIdNiveau(2L);
//		n2.setLibelleNiveau("Niveau 2");
//		Niveau n3 = new Niveau();
//		n3.setIdNiveau(3L);
//		n3.setLibelleNiveau("Niveau 3");
//		
//		domaineRepository.save(d1);
//		domaineRepository.save(d2);
//		domaineRepository.save(d3);
//		
//		niveauRepository.save(n1);
//		niveauRepository.save(n2);
//		niveauRepository.save(n3);
	}
}