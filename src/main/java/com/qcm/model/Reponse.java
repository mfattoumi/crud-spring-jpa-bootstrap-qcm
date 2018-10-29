package com.qcm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reponse")
public class Reponse {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long idReponse;
    private String libelleReponse;
	
    public Long getIdReponse() {
		return idReponse;
	}
	public void setIdReponse(Long idReponse) {
		this.idReponse = idReponse;
	}
	public String getLibelleReponse() {
		return libelleReponse;
	}
	public void setLibelleReponse(String libelleReponse) {
		this.libelleReponse = libelleReponse;
	}
    
   
    
}
