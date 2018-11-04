package com.qcm.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Examen implements Serializable{

	private static final long serialVersionUID = 3451664545046876618L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long idExamen;
    private String libelleExamen;
	
    public Long getIdExamen() {
		return idExamen;
	}
	public void setIdExamen(Long idExamen) {
		this.idExamen = idExamen;
	}
	public String getLibelleExamen() {
		return libelleExamen;
	}
	public void setLibelleExamen(String libelleExamen) {
		this.libelleExamen = libelleExamen;
	}
    
   
    
}
