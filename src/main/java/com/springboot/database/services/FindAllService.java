package com.springboot.database.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.springboot.database.entity.Person;
import com.springboot.database.jpa.PersonJpaRepository;

@Service("fss")
public class FindAllService implements DBServices {

	@Autowired
	PersonJpaRepository personJpaRepository;
	
	public List<Person> provideService() {
		return personJpaRepository.findAll();
	}
	
	
}



