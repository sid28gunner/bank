package com.sbi.bank;

public class Account {
	 private int amount;
	 private int balance;
	 private int account;
	 
	public Account() {
		this.balance=0;
		this.account=0;
		this.amount=0;
	}
	
	public void viewBalance()
	{
		System.out.println("You have "+ balance +" money in your account");
	}
	
	public void deposit(int money)
	{
		balance = balance + money;
		System.out.println("You have deposited "+ money +"  in your account");
	}
	
	public void withdraw(int money)
	{
		
		
		if(balance<(balance - money)){
		balance = balance - money ;
		System.out.println("You have withdrawed "+ money +"  in your account");
		}
		else
		{
		System.out.println("Low account balance");
		
		}
	}
	
	
	
	
	
	 
	 
	 

}
