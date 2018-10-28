package com.quizz.entretien.dev.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "utilisateur")
public class Utilisateur {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long idUtilisateur;
    private String libelleUtilisateur;
	
    public Long getIdUtilisateur() {
		return idUtilisateur;
	}
	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	public String getLibelleUtilisateur() {
		return libelleUtilisateur;
	}
	public void setLibelleUtilisateur(String libelleUtilisateur) {
		this.libelleUtilisateur = libelleUtilisateur;
	}
    
   
    
}
