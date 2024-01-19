package com.tap.interfaceExamples;

interface Bank{
	float getRateOfInterest();
}

class Sbi implements Bank{
	public float getRateOfInterest() {
		return 7.8f; 
	}
}
class Canara implements Bank{
	public float getRateOfInterest() {
		return 9.9f;
	}
}
public class Banking {
	public static void main(String[] args) {
		Bank b;
		b = new Sbi();
		System.out.println(b.getRateOfInterest());
		
		b = new Canara();
		System.out.println(b.getRateOfInterest());
	}

}
