package com.quizz.entretien.dev.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "question")
public class Question {

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
