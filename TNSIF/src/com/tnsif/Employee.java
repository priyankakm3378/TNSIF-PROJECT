package com.tnsif;

public class Employee {

	private int id;
	private String name;
	private float salary;
	private static int totalEmp;
	
	
	public static int getTotalEmployee() {
		
		return totalEmp;
	}
	
	public void displayEmployee() {
		System.out.println(id+" "+name+" "+salary);
	}
		
	public Employee(int id,String name,float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		totalEmp++;
	}
	
	
	

}
