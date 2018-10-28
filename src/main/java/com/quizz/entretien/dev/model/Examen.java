package com.quizz.entretien.dev.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "examen")
public class Examen {

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
