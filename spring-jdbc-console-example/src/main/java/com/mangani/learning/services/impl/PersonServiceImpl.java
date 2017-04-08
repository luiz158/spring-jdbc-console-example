package com.mangani.learning.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mangani.learning.dao.PersonDAO;
import com.mangani.learning.services.PersonService;

import br.com.mangani.PersonBean;

@Service
public class PersonServiceImpl implements PersonService{
	
	@Autowired
	private PersonDAO personDAO;

	public List<PersonBean> list() {
		
		List<PersonBean> persons = this.personDAO.list();
		
		for (PersonBean personBean : persons) {
			System.out.println(String.format("%d - %s", personBean.getIdPerson(), personBean.getName()));
		}
		
		return persons;
	}
}
