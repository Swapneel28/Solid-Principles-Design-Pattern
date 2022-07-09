package com.design.pattern.Learning.open.closed.principle;

import java.util.OptionalDouble;
import java.util.Random;

public class UsageHistory {
	
	public static Double getUsage() {
	    Random random = new Random();
		OptionalDouble usage = random.doubles().findAny();
		return usage.getAsDouble();
	}

}
