package com.tap.interfaceExamples;

interface Printable{
	
	void doprint();
}

interface Showable{
	void dodraw();
}

class Multipleinheritance implements Printable, Showable{

	public static void main(String[] args) {
		
		Printable p =new Multipleinheritance();
		Showable s=new Multipleinheritance();
		
		s.dodraw();
		p.doprint();
	}

	@Override
	public void dodraw() {
		System.out.println("it 's showing interface");
		
	}

	@Override
	public void doprint() {
		
		System.out.println("it 's printable interface");
	}

}
