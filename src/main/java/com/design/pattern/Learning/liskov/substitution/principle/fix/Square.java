package com.design.pattern.Learning.liskov.substitution.principle.fix;

public class Square implements Shape {

	private int side;
		
	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public Square(int side) {
		super();
		this.side = side;
	}

	@Override
	public int computeArea() {
		return this.side*this.side;
	}

}
