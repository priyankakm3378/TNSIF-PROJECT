package com.tap.enacapsulation;

public class ReadOnly {

	private String college = "SKSVMACET";
	
	public String getCollege() {
		return college;
	}
	
	public static void main(String[] args) {
		ReadOnly rd = new ReadOnly();
		System.out.println(rd.getCollege());
		
	}
}


// rd.setCollege("GOVT"); WILL GIVE YOU ERROR
