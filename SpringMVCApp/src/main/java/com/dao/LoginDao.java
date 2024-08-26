package com.dao;
import java.util.List;
import java.util.Map;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.stereotype.Repository;

import com.model.Login;

@Repository
public class LoginDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public int storeUser(Login login) {
		try {
		return jdbcTemplate.update("insert into login values(?,?,?)", login.getEmailId(), login.getPassword(), login.getTypeOfUser());
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
		}
	
	public List<Map<String, Object>> retrieveAllProductsAsListOfMap() {
		try {
			return jdbcTemplate.queryForList("select * from login");
		} catch (Exception e) {
			System.err.println(e);
		}
		return null;
	}
	

}




