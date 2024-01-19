package com.tap.interfaceExamples;

interface Drawable{
	void draw();
}

class Rectangle implements Drawable{
	 public void draw() {
		 System.out.println("Rectangles can be drawn");
	 }
}

class Circle implements Drawable{
	public void draw() {
		System.out.println("Circles can be drawn");
	}
}
public class TestingInterface {

	public static void main(String[] args) {
		Drawable dw = new Rectangle();
		dw.draw();
		
		Drawable da = new Circle(); 
		da.draw();
	
	}

}
