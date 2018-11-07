package com.qcm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qcm.model.Domaine;
import com.qcm.service.IDomaineService;

@Controller
public class DomaineController {

	@Autowired
	private IDomaineService domaineService;
	
	@RequestMapping("/domaines")
	public String index() {
		return "domaines";
	}
	
	@RequestMapping("/saveDomaine")
	public String saveDomaine(Model model,String libelleDomaine) {
		Domaine domaine = new Domaine();
		domaine.setLibelleDomaine(libelleDomaine);
		domaineService.saveDomaine(domaine);
		
		return "domaines";	
	}
	
//	@RequestMapping("/consulterCompte")
//	public String consulter(Model model,String codeCompte) {
//		model.addAttribute("codeCompte", codeCompte);
//		try {
//			Compte compte = banqueService.consulterCompte(codeCompte);
//			Page<Operation> pageOperations = banqueService.listOperation(codeCompte, 0, 4);
//			model.addAttribute("listOperations", pageOperations.getContent());
//			model.addAttribute("compte", compte);
//		} catch (Exception e) {
//			model.addAttribute("exception",e);
//		}
//		return "comptes";
//	}
}
