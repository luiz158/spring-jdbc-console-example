package com.mangani.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mangani.learning.services.PersonService;

@Component
public class Processor {
	
	@Autowired
	private PersonService personService;
	
	public void process(){
		personService.list();
	}

}
