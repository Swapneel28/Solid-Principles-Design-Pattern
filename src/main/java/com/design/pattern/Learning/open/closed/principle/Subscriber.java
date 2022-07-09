package com.design.pattern.Learning.open.closed.principle;

//base class - closed for modification
public abstract class Subscriber {
	
	protected Long subscriberId;
	protected String address;
	protected Long phoneNumber;
	protected Integer baseRate;
	
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

	public abstract Double calculateBill();
}
