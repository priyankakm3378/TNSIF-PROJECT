package com.tap.enacapsulation;

public class WriteOnly {
	
private String college;

public void setCollege(String college) {
	
	System.out.println(this.college = college);
}
	
	public static void main(String[] args) {
	
		WriteOnly wr = new WriteOnly();
		wr.setCollege("SKSVMACET");
		
	}

}
