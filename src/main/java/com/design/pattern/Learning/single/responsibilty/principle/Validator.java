package com.design.pattern.Learning.single.responsibilty.principle;

public class Validator {
	
    public boolean isValidUser(User user) {
		
		if(user.getName() == null || user.getName().isEmpty() )
			return false;
		
		if(!user.getEmail().contains("@"))
		   return false;
		
		return true;
	}

}
