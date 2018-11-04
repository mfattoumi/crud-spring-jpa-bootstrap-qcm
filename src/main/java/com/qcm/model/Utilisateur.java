package com.qcm.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Utilisateur implements Serializable{
	
	private static final long serialVersionUID = 5504618363874520792L;

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
