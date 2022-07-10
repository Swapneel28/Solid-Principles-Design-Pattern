package com.design.pattern.Learning.interfaces.segregation.principle.issue;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderPersistenceService implements PersistenceService<Order> {

	public static final Map<Long, Order> ORDERS = new HashMap<>();
	
	@Override
	public void save(Order entity) {
        synchronized (ORDERS) {
			ORDERS.put(entity.getId(), entity);
		}
	}

	@Override
	public void delete(Order entity) {
		synchronized (ORDERS) {
		   ORDERS.remove(entity.getId());	
		}
	}

	@Override
	public Order findById(Long id) {
		synchronized (ORDERS) {
		   return ORDERS.get(id);	
		}
	}

	@Override
	public List<Order> findByName(String name) {
		// TODO Auto-generated method stub
		// This method has no implementation. Since order has no attribute as 'Name'.
		// This is flawed implementation. 
		return null;
	}

}
