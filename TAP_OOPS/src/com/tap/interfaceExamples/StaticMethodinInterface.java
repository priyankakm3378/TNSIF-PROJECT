package com.tap.interfaceExamples;

interface College{
	void study();
	static int cube(int x) {
		return x*x*x;
	}
}

class management implements College{
	public void study() {
		System.out.println("She is doing well in her studies"+"\n"+"Good keep it up");
	}
}

public class StaticMethodinInterface {

	public static void main(String[] args) {
	
		College c;
		c = new management();
		
		c.study();
		System.out.println(College.cube(3));
	}

}
