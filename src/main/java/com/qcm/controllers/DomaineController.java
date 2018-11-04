package com.qcm.controllers;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.qcm.model.Domaine;
import com.qcm.repository.DomaineRepository;
import com.qcm.service.IDomaineService;


@Controller
public class DomaineController {

    private final static Logger LOGGER = Logger.getLogger(DomaineController.class.getName());

    @Autowired
	private IDomaineService domaineService;
	
	@RequestMapping("/domaines")
	public String index() {
		return "domaines";
	}
	
//    @RequestMapping(value = "/init", method = RequestMethod.GET)
//    public String listDomaines(ModelMap model) {
//        model.addAttribute("domaines", domaineRepository.findAll());
//        return "domaines"; 
//    }
//    
//    @RequestMapping(value = "/add", method = RequestMethod.POST)
//    public String addDomaine(@ModelAttribute("domaine") Domaine domaine, BindingResult result) {
//        domaineRepository.save(domaine);
//        return "redirect:/";
//    }
//
//    @RequestMapping("/delete/{memberId}")
//    public String deleteDomaine(@PathVariable("domaineId") Long memberId) {
//        domaineRepository.delete(domaineRepository.getOne(memberId));
//        return "redirect:/";
//    }

     /* to enable the CORS */
    private void setHeaderResponse(HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3628800");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with");
    }
}
