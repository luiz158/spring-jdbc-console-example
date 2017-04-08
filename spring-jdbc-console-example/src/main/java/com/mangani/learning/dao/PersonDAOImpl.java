package com.mangani.learning.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mangani.learning.dao.rowmapper.PersonRowMapper;

import br.com.mangani.PersonBean;

@Repository
public class PersonDAOImpl implements PersonDAO{
	
	@Autowired
	@Qualifier("jdbcTemplate")
	private JdbcTemplate jdbcTemplate;
	
	public List<PersonBean> list() {
		
		String query = "SELECT * FROM PERSON";
		
		List<PersonBean> persons = this.jdbcTemplate.query(query, new PersonRowMapper());
		
		return persons;
	}
}