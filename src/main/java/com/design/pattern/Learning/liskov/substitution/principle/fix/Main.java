package com.design.pattern.Learning.liskov.substitution.principle.fix;

import com.design.pattern.Learning.liskov.substitution.principle.issue.Rectangle;
import com.design.pattern.Learning.liskov.substitution.principle.issue.Square;

public class Main {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(10,20);
		System.out.println(rectangle.computeArea());
		
		Square square = new Square(10);
		System.out.println(square.computeArea());
		
		useRectangle(rectangle);
	
	}

	private static void useRectangle(Rectangle rectangle) {
		rectangle.setWidth(30);
		rectangle.setHeight(20);
		if(rectangle.getHeight() == 20)
			System.out.println("Height equal to 20");
		else 
			System.out.println("Height Not equal to 20");
		
		if(rectangle.getWidth() == 30)
			System.out.println("Width equal to 30");
		else 
			System.out.println("Width Not equal to 30");
		
	}

}
