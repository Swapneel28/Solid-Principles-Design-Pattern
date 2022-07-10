package com.design.pattern.Learning.dependency.inversion.principle.fix;

import java.time.LocalDateTime;

public class Message {
	
	private String msg;
	private LocalDateTime timeStamp;
	
	public Message(String msg) {
		this.msg = msg;
		this.timeStamp = LocalDateTime.now();
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	

}
