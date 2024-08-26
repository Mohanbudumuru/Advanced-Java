package com.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.LoginDao;
import com.model.Login;

@Service
public class LoginService {
	
	@Autowired
	LoginDao loginDao;
	
	public List<Map<String,Object>> retrieveAllProductsAsListOfMap() {
		return loginDao.retrieveAllProductsAsListOfMap();
	}
	
	public void storeUser(Login login) {
		loginDao.storeUser(login);
	}

}