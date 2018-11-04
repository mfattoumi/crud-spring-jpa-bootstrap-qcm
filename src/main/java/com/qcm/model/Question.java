package com.qcm.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Question implements Serializable{
	
	private static final long serialVersionUID = -7407612905100526843L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long idQuestion;
    private String libelleQuestion;
	
    public Long getIdQuestion() {
		return idQuestion;
	}
	public void setIdQuestion(Long idQuestion) {
		this.idQuestion = idQuestion;
	}
	public String getLibelleQuestion() {
		return libelleQuestion;
	}
	public void setLibelleQuestion(String libelleQuestion) {
		this.libelleQuestion = libelleQuestion;
	}
    
   
    
}
