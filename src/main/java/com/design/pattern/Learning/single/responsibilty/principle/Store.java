package com.design.pattern.Learning.single.responsibilty.principle;

import java.util.Map;
import java.util.HashMap;


public class Store {
	
	private static final Map<String,User> STORAGE = new HashMap<>();
	
	public void saveUser(User user) {
		STORAGE.put(user.getName(),user);
	}
	
	public User getUser(String name) {
		return STORAGE.get(name);
	}
	

}
