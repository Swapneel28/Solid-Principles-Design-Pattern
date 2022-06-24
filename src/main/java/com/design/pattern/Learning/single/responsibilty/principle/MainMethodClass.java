package com.design.pattern.Learning.single.responsibilty.principle;

import java.io.IOException;

public class MainMethodClass {

	public static void main(String[] args) throws IOException {
		
		String VALID_USER = "{ \"name\" : \"Swapnil\", \"email\" : \"swapnil.redekar@gmail.com\" }";
		
		String INVALID_USER = "{ \"name\" : \"Swapnil\", \"email\" : \"swapnil.redekar#gmail.com\" }";
		
		//WrongUserController controller = new WrongUserController();
		CorrectUserController controller = new CorrectUserController();
		System.out.println("Save User " + controller.createUser(VALID_USER));
		System.out.println("Save User " + controller.createUser(INVALID_USER));

	}

}
