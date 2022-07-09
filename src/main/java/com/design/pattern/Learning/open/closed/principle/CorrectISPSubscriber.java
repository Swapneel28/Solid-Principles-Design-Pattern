package com.design.pattern.Learning.open.closed.principle;

public class CorrectISPSubscriber extends Subscriber {
	
	private Long freeUsage;

	@Override
	public Double calculateBill() {
		Double totalData = UsageHistory.getUsage();
		Double chargeableData = totalData-this.freeUsage;
		if(chargeableData <= 0) {
			return 0d;
		}
		return chargeableData*this.baseRate/100;
	}

	public Long getFreeUsage() {
		return freeUsage;
	}

	public void setFreeUsage(Long freeUsage) {
		this.freeUsage = freeUsage;
	}

}
