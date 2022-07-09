package com.design.pattern.Learning.open.closed.principle;

public class WrongPhoneSubscriber {
	
	private Long subscriberId;
	private String address;
	private Long phoneNumber;
	private Integer baseRate;
	
	public Double calculateBill() {
		Double duration = UsageHistory.getUsage();
		return duration*this.baseRate/100;
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
	
	

}
