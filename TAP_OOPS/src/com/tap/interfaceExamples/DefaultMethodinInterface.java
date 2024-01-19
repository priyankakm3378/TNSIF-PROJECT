package com.tap.interfaceExamples;

interface School{
	void teaching();
	
	default void learn() {
		System.out.println("Students are going to learn new concept today");
	}
}

class teacher implements School{
	public void teaching() {
		System.out.println("Teachers mould the future of students");
	}
}
public class DefaultMethodinInterface {

	public static void main(String[] args) {
		School s;
		s = new teacher();
		s.teaching();
		
		s.learn();

	}

}
