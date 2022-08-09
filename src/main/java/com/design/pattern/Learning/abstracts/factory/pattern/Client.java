package com.design.pattern.Learning.abstracts.factory.pattern;

import com.design.pattern.Learning.abstracts.factory.pattern.Instance.Capacity;
import com.design.pattern.Learning.abstracts.factory.pattern.aws.AwsResourceFactory;
import com.design.pattern.Learning.abstracts.factory.pattern.gcp.GoogleResourceFactory;

public class Client {

	private ResourceFactory factory;
	
	public Client(ResourceFactory factory) {
		this.factory = factory;
	}
	
	public Instance createServer(Instance.Capacity cap, int storageMib) {
		Instance instance = factory.createInstance(cap);
		Storage storage = factory.createStorage(storageMib);
		instance.attachStorage(storage);
		return instance;
	}

	public static void main(String[] args) {
    	Client aws = new Client(new AwsResourceFactory());
    	Instance i1 = aws.createServer(Capacity.micro, 20480);
    	i1.start();
    	i1.stop();
    	
    	System.out.println("***************************************");
    	Client gcp = new Client(new GoogleResourceFactory());
    	i1 = gcp.createServer(Capacity.micro, 20480);
    	i1.start();
    	i1.stop();
	}

}
