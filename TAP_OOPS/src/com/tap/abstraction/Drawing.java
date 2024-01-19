package com.tap.abstraction;

abstract class Shape{
	abstract void draw();
}

class Rectangle extends Shape{
	void draw() {
		System.out.println("Drawing rectangles");
	}
}

class Circle extends Shape{
	void draw() {
		System.out.println("Drawing Circles");
	}
}

public class Drawing {

	public static void main(String[] args) {
		Shape s = new Rectangle();
		Shape s1 = new Circle();
		
		s.draw();
		s1.draw();

	}

}
