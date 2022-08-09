package com.design.pattern.Learning.factory.method.pattern;

public class Main {

	public static void main(String[] args) {
		
	     printMessage(new TextMessageCreator());
	     
	     printMessage(new JsonMessageCreator());

	}

	private static void printMessage(MessageCreater messageCreator) {

		     Message msg= messageCreator.getMessage();
		     System.out.println(msg);
	}

}
