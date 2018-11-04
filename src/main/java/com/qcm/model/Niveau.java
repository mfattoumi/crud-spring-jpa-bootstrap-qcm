package com.qcm.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Niveau implements Serializable{

	private static final long serialVersionUID = -5045315143555994086L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long idNiveau;
    private String libelleNiveau;
	
    public Long getIdNiveau() {
		return idNiveau;
	}
	public void setIdNiveau(Long idNiveau) {
		this.idNiveau = idNiveau;
	}
	public String getLibelleNiveau() {
		return libelleNiveau;
	}
	public void setLibelleNiveau(String libelleNiveau) {
		this.libelleNiveau = libelleNiveau;
	}
    
   
    
}
