package com.design.pattern.Learning.single.responsibilty.principle;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonParseUtil {
	
	public static User parseJsonString(String userJson) throws JsonMappingException, JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.readValue(userJson, User.class);
	}

}
