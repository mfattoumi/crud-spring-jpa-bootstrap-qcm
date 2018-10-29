package com.qcm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "niveau")
public class Niveau {

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
