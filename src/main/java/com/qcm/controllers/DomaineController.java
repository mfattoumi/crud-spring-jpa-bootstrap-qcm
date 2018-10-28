package com.quizz.entretien.dev.controllers;


import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.quizz.entretien.dev.dao.DomaineDao;
import com.quizz.entretien.dev.model.Domaine;

import org.springframework.http.MediaType;

@Controller
public class DomaineController {

    private final static Logger LOGGER = Logger.getLogger(DomaineController.class.getName());

    @Autowired
    private DomaineDao domaineDao;
    
     @RequestMapping(value = "/", method = RequestMethod.GET)
    public String listDomaines(ModelMap model) {
        model.addAttribute("domaine", new Domaine());
        model.addAttribute("domaines", domaineDao.getAll());
        return "domaines"; 
    }
    
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addDomaine(@ModelAttribute("domaine") Domaine domaine, BindingResult result) {
        domaineDao.save(domaine);
        return "redirect:/";
    }

    @RequestMapping("/delete/{memberId}")
    public String deleteDomaine(@PathVariable("domaineId") Long memberId) {
        domaineDao.delete(domaineDao.get(memberId));
        return "redirect:/";
    }

    /**
     * * ******************* JSON Call ****************
     */
    @RequestMapping(value = "api/members", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String addMemberJson(@RequestBody String json,HttpServletResponse response) throws JSONException {
        setHeaderResponse(response);
        JSONObject obj = new JSONPObject(json);
        Domaine domaine = getObject(json, Domaine.class);
        if (domaine != null) {
            domaineDao.save(domaine);
            System.out.println(domaine.toString());
            return json;
        } else {
            return "{\"Result\": \"Ko\"}";
        }
    }

    @RequestMapping(value = "api/members/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String updateMemberJson(@RequestBody String json, HttpServletResponse response) throws JSONException {
        setHeaderResponse(response);
        JSONObject obj = new JSONObject(json);
        Member member = getObject(json, Member.class);
        if ((member != null) && (domaineDao.exists(member.getId()))) {
            domaineDao.save(member);
            System.out.println(member.toString());
            return json;
        } else {
            return "{\"Result\": \"Ko\"}";
        }
    }

    @RequestMapping(value = "/api/members/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String viewMemberJson(@PathVariable("id") long id, HttpServletResponse response) throws JSONException {
        setHeaderResponse(response);
        Member member = domaineDao.findOne(id);
        if (member != null) {
            JSONObject memberJSON = new JSONObject();
            memberJSON.put("id", member.getId());
            memberJSON.put("firstName", member.getFirstName());
            memberJSON.put("lastName", member.getLastName());
            memberJSON.put("email", member.getEmail());
            return memberJSON.toString();
        } else {
            return "{\"Result\": \"Ko\"}";
        }
    }

    @RequestMapping(value = "/api/members", method = RequestMethod.GET)
    @ResponseBody
    public String listMembersJson(ModelMap model,HttpServletResponse response) throws JSONException {
        setHeaderResponse(response);
        JSONArray memberArray = new JSONArray();
        for (Member member : domaineDao.findAll()) {
            JSONObject memberJSON = new JSONObject();
            memberJSON.put("id", member.getId());
            memberJSON.put("firstName", member.getFirstName());
            memberJSON.put("lastName", member.getLastName());
            memberJSON.put("email", member.getEmail());
            memberArray.put(memberJSON);
        }
        return memberArray.toString();
    }

    @RequestMapping(value = "api/members/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String deleteMemberJson(@PathVariable("id") long id, HttpServletResponse response) throws JSONException {
        setHeaderResponse(response);
        Member member = domaineDao.findOne(id);
        JSONObject memberJSON = null;
        if (member != null) {
            memberJSON = new JSONObject();
            memberJSON.put("id", member.getId());
            memberJSON.put("firstName", member.getFirstName());
            memberJSON.put("lastName", member.getLastName());
            memberJSON.put("email", member.getEmail());
            domaineDao.delete(id);
            return memberJSON.toString();
        } else {
            return "{\"Result\": \"Ko\"}";
        }
    }

    /**
     * Convert a String json in to java Object. 
    **/
    public static <T> T getObject(final String jsonString, final Class<T> objectClass) {
        Gson gson = new Gson();
        T t = null;
        try {
            t = gson.fromJson(jsonString, objectClass);
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "ERRORE " + e.toString());
        }
        return t;
    }

    /* to enable the CORS */
    private void setHeaderResponse(HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3628800");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with");
    }
}
