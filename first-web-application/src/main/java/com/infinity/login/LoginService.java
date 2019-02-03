package com.infinity.login;

public class LoginService {
	
	public boolean isUserValid (String user, String password) {
		if (user.equals("Martins") && password.equals("1234")) 
			return true;
		
		return false;
	}

}
