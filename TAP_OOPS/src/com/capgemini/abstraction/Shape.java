package com.capgemini.abstraction;

public abstract class Shape {

		protected float area;
	
		abstract void calcArea();
		void show() {
			System.out.println("Area of the shape is :"+area);
		}
		
}
