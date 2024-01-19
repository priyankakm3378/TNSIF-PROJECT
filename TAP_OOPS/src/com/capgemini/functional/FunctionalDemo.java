package com.capgemini.functional;

public class FunctionalDemo {

	public static void main(String[] args) {
	GreetClass class1 = new GreetClass();
		
	System.out.println(class1.greet());	
	
	
	//Using Lambda Expression
	GreetInterface g1 = () -> {
		return "Good Morning";
	};
	
	
	System.out.println(g1.greet());
	
	
	}

}
