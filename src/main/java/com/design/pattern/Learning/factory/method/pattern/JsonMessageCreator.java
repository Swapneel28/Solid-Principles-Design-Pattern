package com.design.pattern.Learning.factory.method.pattern;

public class JsonMessageCreator extends MessageCreater {

	@Override
	public Message createMessage() {
		return new JSONMessage();
	}

}
