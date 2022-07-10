package com.design.pattern.Learning.dependency.inversion.principle.issue;

public class TextFormatter implements Formatter {

	@Override
	public String format(Message message){
		return message.getTimeStamp()+":"+message.getMsg();
	}

}
