package com.tap.enacapsulation;

public class Account {

	private long account_num;
	private String name,email;
	private float amount;

	public long getAccount_num() {
		return account_num;
	}

	public void setAccount_num(long account_num) {
		this.account_num = account_num;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}


	
	

}
