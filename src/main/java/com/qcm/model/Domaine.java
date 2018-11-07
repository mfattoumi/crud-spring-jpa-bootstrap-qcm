package com.qcm.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Domaine implements Serializable{

	private static final long serialVersionUID = 7354827852326939162L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long idDomaine;
	
    private String libelleDomaine;
	
    public Long getIdDomaine() {
		return idDomaine;
	}
	public void setIdDomaine(Long idDomaine) {
		this.idDomaine = idDomaine;
	}
	public String getLibelleDomaine() {
		return libelleDomaine;
	}
	public void setLibelleDomaine(String libelleDomaine) {
		this.libelleDomaine = libelleDomaine;
	}
    
}
