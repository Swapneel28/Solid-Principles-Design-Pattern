package com.design.pattern.Learning.abstracts.factory.pattern.gcp;

import com.design.pattern.Learning.abstracts.factory.pattern.Instance;
import com.design.pattern.Learning.abstracts.factory.pattern.Instance.Capacity;
import com.design.pattern.Learning.abstracts.factory.pattern.ResourceFactory;
import com.design.pattern.Learning.abstracts.factory.pattern.Storage;

public class GoogleResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new GoogleComputeEngineInstance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new GoogleCloudStorage(capMib);
	}

}
