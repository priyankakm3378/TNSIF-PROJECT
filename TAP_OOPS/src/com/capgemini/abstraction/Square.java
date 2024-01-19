package com.capgemini.abstraction;

public class Square extends Shape{

	private float side;
	
	public Square() {
		
		side = 6.2f;
	}
	
	public Square(float side) {
		this.side = side;
	}
	
	@Override
	void calcArea() {
		area = side * side;
	}

}
