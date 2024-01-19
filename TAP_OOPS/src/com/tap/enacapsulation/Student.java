package com.tap.enacapsulation;

class School{
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
public class Student {

	public static void main(String[] args) {
	School obj = new School();
	obj.setName("Priyanka");
	String stu = obj.getName();
	System.out.println(stu);
		
	}

}
