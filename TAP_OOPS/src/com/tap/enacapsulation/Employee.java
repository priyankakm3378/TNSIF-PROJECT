package com.tap.enacapsulation;


class Emp{
    private String name;
    private int id;
    private float salary;
    
   public String getname(){
           return name;
    }
    
    public int getid(){
           return id;
    }
    
    public float getsalary(){
           return salary;
    }
    
    public void setname(String name){
           this.name = name;
    }
    
    public void setid(int id){
           this.id = id;
    }
    
    public void setsalary(float salary){
           this.salary = salary;
    }
    
    Emp(String name,int id,float salary){
           this.name = name;
           this.id = id;
           this.salary = salary;
    }
    
    Emp(){
    	System.out.println("You are practicing java encapsulation");
    }
}
public class Employee
{
	public static void main(String[] args) {
	Emp e = new Emp();
	Emp e1 = new Emp("Priyanka",1000,65000.0f);
	System.out.println(e.getname()+" "+
	e.getid()+" "+
	e.getsalary());
	}
}
