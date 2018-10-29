package com.qcm.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import com.qcm.repository.DomaineRepository;

public class Application {
	@Autowired
	DomaineRepository domaineDao;
	
	public static void main(String[] args) {
		
	}
}
