package com.qcm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qcm.model.Domaine;
import com.qcm.model.Examen;
import com.qcm.service.IDomaineService;
import com.qcm.service.IExamenService;

@Controller
public class ExamenController {

	
	@Autowired
	private IExamenService examenService;
	
	@RequestMapping("/examens")
	public String index() {
		return "examens";
	}
	
	@RequestMapping("/saveExamen")
	public String saveExamen(Model model,String libelleExamen) {
		Examen examen = new Examen();
		examen.setLibelleExamen(libelleExamen);
		examenService.saveExamen(examen);
		
		return "examens";	
	}
}
