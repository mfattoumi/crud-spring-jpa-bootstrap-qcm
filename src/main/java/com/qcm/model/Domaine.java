package com.qcm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "domaine")
public class Domaine{

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
