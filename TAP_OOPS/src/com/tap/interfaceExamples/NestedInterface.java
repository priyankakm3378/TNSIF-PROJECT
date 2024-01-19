package com.tap.interfaceExamples;

interface Home{
	void work();
	
	interface Room{
		void clean();
	}
}

public class NestedInterface implements Home,Home.Room{

	public void clean() {
		System.out.println("Room is clean");
	}
	
	public void work(){
		System.out.println("House chores are completed.");
	}
	
	public static void main(String[] args) {
	Home.Room hr;
	hr = new NestedInterface();
	hr.clean();
	Home h;
	h = new NestedInterface();
	h.work();
	
	}

}
