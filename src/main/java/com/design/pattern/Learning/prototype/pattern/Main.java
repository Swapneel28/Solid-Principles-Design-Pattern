package com.design.pattern.Learning.prototype.pattern;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Swordsman s1 = new Swordsman();
		s1.move(0, 10, 10);
		s1.attack();
		
		System.out.println("Original " + s1);
		Swordsman s2 = (Swordsman) s1.clone();
			
		System.out.println("Cloned " + s2);
	}

}
