package com.design.pattern.Learning.factory.method.pattern;

public class TextMessageCreator extends MessageCreater{

	@Override
	public Message createMessage() {
		return new TextMessage();
	}

}
