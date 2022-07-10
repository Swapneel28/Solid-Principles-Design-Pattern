package com.design.pattern.Learning.liskov.substitution.principle.fix;

public class Rectangle implements Shape {

	private int width;
	
	private int height;
	
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	@Override
	public int computeArea() {
		return this.height*this.width;
	}

}
