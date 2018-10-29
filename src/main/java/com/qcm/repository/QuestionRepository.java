package com.qcm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qcm.model.Question;

public interface QuestionRepository  extends JpaRepository<Question, Long>{

}
