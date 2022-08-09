package com.design.pattern.Learning.factory.method.pattern;

public abstract class MessageCreater {

	public Message getMessage() {
		Message msg = createMessage();
		msg.addDefaultHeaders();
		msg.encrypt();
		return msg;
	}
	
	public abstract Message createMessage();
}