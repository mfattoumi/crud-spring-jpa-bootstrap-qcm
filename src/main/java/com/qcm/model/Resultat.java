package com.qcm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "resultat")
public class Resultat {

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
