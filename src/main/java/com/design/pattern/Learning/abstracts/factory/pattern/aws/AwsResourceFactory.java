package com.design.pattern.Learning.abstracts.factory.pattern.aws;

import com.design.pattern.Learning.abstracts.factory.pattern.Instance;
import com.design.pattern.Learning.abstracts.factory.pattern.Instance.Capacity;
import com.design.pattern.Learning.abstracts.factory.pattern.ResourceFactory;
import com.design.pattern.Learning.abstracts.factory.pattern.Storage;

public class AwsResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new Ec2Instance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new S3Storage(capMib);
	}

}
