package com.design.pattern.Learning.single.responsibilty.principle;

import java.io.IOException;

/*This is the correct class which follows Single Responsibility principle. 
 * Since User validation, JSON parsing and persisting operation has been divided into individual classes*/
public class CorrectUserController {
	
    private PersistenceService service = new PersistenceService();
    
    private Validator validator = new Validator();
	
	public String createUser(String userJson) throws IOException{
		User user = JsonParseUtil.parseJsonString(userJson);
		
		if(!validator.isValidUser(user)) {
			return "ERROR";
		}
		
		service.persist(user);
		
		return "SUCCESS";
	}

}
