package com.tnsif;

public class EmpDemo {

	public static void main(String[] args) {
		Employee e = new Employee(123,"SIRI",50000.0f);
		
		Employee f = new Employee(124,"ANU",45000.0f);
		Employee g = new Employee(125,"AYRA",35000.0f);
		
		
		System.out.println(Employee.getTotalEmployee());
		e.displayEmployee();
		f.displayEmployee();
		g.displayEmployee();
	}

}
