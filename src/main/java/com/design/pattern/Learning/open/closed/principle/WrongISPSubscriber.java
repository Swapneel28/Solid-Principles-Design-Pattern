package com.design.pattern.Learning.open.closed.principle;


/**
 * @author Swapnil Redekar
 * Properties of these subscriber classes are 
 */
public class WrongISPSubscriber {
	
	private Long subscriberId;
	private String address;
	private Long phoneNumber;
	private Integer baseRate;
	private Long freeUsage;
	
	public Double calculateBill() {
		Double totalData = UsageHistory.getUsage();
		Double chargeableData = totalData-this.freeUsage;
		if(chargeableData <= 0) {
			return 0d;
		}
		return chargeableData*this.baseRate/100;
	}
	
	public Long getSubscriberId() {
		return subscriberId;
	}
	public void setSubscriberId(Long subscriberId) {
		this.subscriberId = subscriberId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Integer getBaseRate() {
		return baseRate;
	}
	public void setBaseRate(Integer baseRate) {
		this.baseRate = baseRate;
	}
	public Long getFreeUsage() {
		return freeUsage;
	}
	public void setFreeUsage(Long freeUsage) {
		this.freeUsage = freeUsage;
	}
	
	
	
	

}
