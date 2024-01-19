package com.tap.interfaceExamples;

interface Writing{
	void prints();
}

interface showing extends Writing{
	void shows();
}

public class InterfaceInheritance implements showing {

	public void shows() {
		System.out.println("Hey...It's visible");
	}
	
	public void prints() {
		System.out.println("Surprising...it's working");
		
	}
	public static void main(String[] args) {
		
		showing s;
		s = new InterfaceInheritance();
		s.prints();
		s.shows();
		
	}

}
