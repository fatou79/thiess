package com.service;

public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("mbour") && password.equals("saly");
	}

}
