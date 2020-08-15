package com.springboot.database.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.database.jpa.PersonJpaRepository;

@Service
public class RemoveService implements DBServices {
	
	@Autowired
	PersonJpaRepository personJpaRepository;
	
	public String provideService() {
		 personJpaRepository.deleteById(10001);
		 return "done boy"; 
	}
}
