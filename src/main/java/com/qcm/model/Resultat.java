package com.qcm.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Resultat implements Serializable{

	private static final long serialVersionUID = 5746322808742785579L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long idResultat;
    private String libelleResultat;
	
    public Long getIdResultat() {
		return idResultat;
	}
	public void setIdResultat(Long idResultat) {
		this.idResultat = idResultat;
	}
	public String getLibelleResultat() {
		return libelleResultat;
	}
	public void setLibelleResultat(String libelleResultat) {
		this.libelleResultat = libelleResultat;
	}
    
   
    
}
