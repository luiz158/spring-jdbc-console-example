package com.mangani.learning.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.mangani.PersonBean;

public class PersonRowMapper implements RowMapper<PersonBean> {

	public PersonBean mapRow(ResultSet rs, int i) throws SQLException {
		
		PersonBean person = new PersonBean();
		person.setIdPerson(rs.getInt("ID_PERSON"));
		person.setName(rs.getString("NAME"));
		return person;
	}
}