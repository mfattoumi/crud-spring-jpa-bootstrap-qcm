package com.qcm.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reponse implements Serializable{

	private static final long serialVersionUID = 207467232605633128L;
	
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
