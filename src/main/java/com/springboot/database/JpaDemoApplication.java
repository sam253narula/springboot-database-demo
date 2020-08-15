package com.springboot.database;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.database.entity.Person;
import com.springboot.database.jpa.PersonJpaRepository;
import com.springboot.database.services.DBServices;
import com.springboot.database.services.OurFactory;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJpaRepository repository;
	
	@Autowired
	DBServices fss;
		
	@Autowired
	DBServices removeService;
	
	@Autowired
	OurFactory of;

	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		  logger.info("User id 10001 -> {}", repository.findById(10001));
		  
		  logger.info("Inserting -> {}", repository.insert(new Person("Tara", "Berlin",
		  new Date())));
		  
		  logger.info("Update 10003 -> {}", repository.update(new Person(10003,
		  "Pieter", "Utrecht", new Date())));
		  
		  repository.deleteById(10002);
		  
		  logger.info("All users -> {}", repository.findAll());
		 
		logger.info("All users -> {}", fss.provideService());
		
		//  logger.info("All users -> {}", of.getFactory("find").provideService());
	}
}
