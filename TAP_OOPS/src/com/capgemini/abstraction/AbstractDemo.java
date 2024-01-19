package com.capgemini.abstraction;

public class AbstractDemo {

	public static void main(String[] args) {
		Square sq = new Square();
		Rectangle rl = new Rectangle();
		
		sq.calcArea();
		sq.show();
		
		rl.calcArea();
		rl.show();
		
		
		System.out.println("=====================");
		
		//Runtime polymorphism / dynamic binding / late binding
		
		//Ex: Method overriding
		
		Shape shape;
		shape = new Square(87.6f);
		
		shape = new Rectangle(65,75);
		
		shape.calcArea();
		shape.show();
		
		
		
		
	}

}
