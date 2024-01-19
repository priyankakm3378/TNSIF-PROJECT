package com.capgemini.marker;

public class MarkerDemo {

	public static void main(String[] args) {
	Student st = new Student(101,"neha",12000,"java");
	
	if(st instanceof Registrable) {
		System.out.println("Student registered for the course");
	}
	else {
		System.out.println("Not registered");
	}
	
	st.register();
		
	}

}
