package com.design.pattern.Learning.single.responsibilty.principle;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

/*This class voilates Single Responsibilty pricinple. 
 * Since this class is performing JSON parsing, validation and save operation.*/
public class WrongUserController {

	private Store store = new Store();
	
	public String createUser(String userJson) throws IOException{
		ObjectMapper mapper = new ObjectMapper();
		User user = mapper.readValue(userJson, User.class);
		
		if(!isValidUser(user)) {
			return "ERROR";
		}
		
		store.saveUser(user);
		
		return "SUCCESS";
	}

	private boolean isValidUser(User user) {
		
		if(user.getName() == null || user.getName().isEmpty() )
			return false;
		
		if(!user.getEmail().contains("@"))
		   return false;
		
		return true;
	}
}
