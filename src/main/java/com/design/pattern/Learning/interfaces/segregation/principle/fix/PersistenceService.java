package com.design.pattern.Learning.interfaces.segregation.principle.fix;

public interface PersistenceService<T extends Entity> {
	
    public void save(T entity);
	
	public void delete(T entity);
	
	public T findById(Long id);
	
	//public List<T> findByName(String name);
    //We can simplify the interface by removing this irrelevant method. 
}
