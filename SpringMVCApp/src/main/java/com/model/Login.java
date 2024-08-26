package com.model;

import org.springframework.stereotype.Component;

@Component
public class Login {
	
	
	String emailId;
	String password;
	String typeOfUser;
	
	public Login() {
		super();
	}
	

	
	public Login(String emailId, String password, String typeOfUser) {
		super();
		this.emailId = emailId;
		this.password = password;
		this.typeOfUser = typeOfUser;
	}



	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getTypeOfUser() {
		return typeOfUser;
	}
	public void setTypeOfUser(String typeOfUser) {
		this.typeOfUser = typeOfUser;
	}



	@Override
	public String toString() {
		return "Login [emailId=" + emailId + ", password=" + password + ", typeOfUser=" + typeOfUser + "]";
	}
	
	
	
	
	
	
	
	
	

}