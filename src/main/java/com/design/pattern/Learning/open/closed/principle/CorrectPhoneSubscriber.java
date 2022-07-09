package com.design.pattern.Learning.open.closed.principle;

// Open for modification
public class CorrectPhoneSubscriber extends Subscriber {
	
	@Override
	public Double calculateBill() {
		Double duration = UsageHistory.getUsage();
		return duration*this.baseRate/100;
	}

}
