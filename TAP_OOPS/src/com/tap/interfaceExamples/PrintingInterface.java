package com.tap.interfaceExamples;

interface print{
	void printing();
}

class Use implements print{
	public void printing() {
		System.out.println("Hey..! It's printing");
	}
}

public class PrintingInterface {

	public static void main(String[] args) {
		Use u = new Use();
		u.printing();

	}

}
