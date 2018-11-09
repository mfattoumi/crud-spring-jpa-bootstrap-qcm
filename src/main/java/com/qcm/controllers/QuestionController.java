package com.qcm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QuestionController {

//	@Autowired
//	private IBanqueService banqueService;
	
	@RequestMapping("/niveaux")
	public String index() {
		return "niveaux";
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
