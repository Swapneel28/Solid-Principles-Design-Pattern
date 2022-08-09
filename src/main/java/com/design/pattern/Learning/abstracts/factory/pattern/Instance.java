package com.design.pattern.Learning.abstracts.factory.pattern;

public interface Instance {

	enum Capacity{micro,small,large}
	
	void start();
	
	void attachStorage(Storage storage);
	
	void stop();
	
}
