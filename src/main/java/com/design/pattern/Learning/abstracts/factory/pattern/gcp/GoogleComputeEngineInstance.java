package com.design.pattern.Learning.abstracts.factory.pattern.gcp;

import com.design.pattern.Learning.abstracts.factory.pattern.Instance;
import com.design.pattern.Learning.abstracts.factory.pattern.Storage;

public class GoogleComputeEngineInstance implements Instance {

	public GoogleComputeEngineInstance(Capacity capacity) {
        System.out.println("Created Google Compute Engine instance");
    }

    @Override
    public void start() {
        System.out.println("Compute engine instance started");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached "+storage+" to Compute engine instance");
    }

    @Override
    public void stop() {
        System.out.println("Compute engine instance stopped");
    }
}
