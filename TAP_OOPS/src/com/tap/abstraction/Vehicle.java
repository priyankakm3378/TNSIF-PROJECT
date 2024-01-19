package com.tap.abstraction;

abstract class Bike{
	abstract void run();
}

public class Vehicle extends Bike {

	void run(){
		System.out.println("I am riding Bike");
	}
	
	public static void main(String[] args) {
		
		Bike b = new Vehicle();
		b.run();

	}

}

