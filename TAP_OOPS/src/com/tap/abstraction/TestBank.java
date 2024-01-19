package com.tap.abstraction;

abstract class Bank{
	abstract int getRateOfInterest();
}

 class SBI extends Bank{
	int getRateOfInterest(){
		return 7;
	}
}
 
 class Canara extends Bank{
	 int getRateOfInterest() {
		 return 8;
	 }
 }

public class TestBank {

	public static void main(String[] args) {
		
		Bank b = new SBI();
		System.out.println(b.getRateOfInterest()+"%");
		
		b = new Canara();
		System.out.println(b.getRateOfInterest()+"%");
		
	}

}
