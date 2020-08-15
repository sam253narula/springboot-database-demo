package com.springboot.database.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OurFactory {
	
	@Autowired
	FindAllService fs;
	
	@Autowired
	RemoveService rs;
	
	public DBServices getFactory(String serviceName) {
		if (serviceName.equalsIgnoreCase("find")) {
			System.out.println("Object of find created");
			return fs;
		} else {
			return rs;
		}
	}
}
