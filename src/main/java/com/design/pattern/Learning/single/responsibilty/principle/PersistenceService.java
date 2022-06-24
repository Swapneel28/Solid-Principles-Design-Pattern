package com.design.pattern.Learning.single.responsibilty.principle;

public class PersistenceService {
	
	private Store store = new Store();
	
	public void persist(User user) {
		store.saveUser(user);
	}
	
	public User getUser(String name) {
		return store.getUser(name);
	}

}
