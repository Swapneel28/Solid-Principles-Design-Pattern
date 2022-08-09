package com.design.pattern.Learning.abstracts.factory.pattern;

public interface ResourceFactory {

	Instance createInstance(Instance.Capacity capacity);
	
	Storage createStorage(int capMib); 
}
