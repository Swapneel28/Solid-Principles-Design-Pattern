package com.design.pattern.Learning.open.closed.principle;

//If new subscriber of type VoIP is added. Then we will create new class and extend the Subscriber class
public class VoIPSubscriber extends Subscriber {

	private double freeTalkTime;
	@Override
	public Double calculateBill() {
		Double duration = UsageHistory.getUsage();
		Double chargeableDuration = duration-freeTalkTime;
		if(chargeableDuration <= 0) {
			return 0d;
		}
		return chargeableDuration*this.baseRate/100;
	}

}
