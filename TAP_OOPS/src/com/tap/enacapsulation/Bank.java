package com.tap.enacapsulation;

public class Bank {

	public static void main(String[] args) {
		Account ac = new Account();
	
		ac.setAccount_num(9874561236l);
		ac.setName("Gayatri");
		ac.setEmail("gayatri@gmail.com");
		ac.setAmount(55000);
		
		System.out.println(ac.getAccount_num()+" "+ac.getName()+" "+
		ac.getEmail()+" "+ac.getAmount());
		
		
	

	}

	
}
