package com.MultiThreading;

public class MultiThreadingATMQuestion {
	public static void main(String[] args) {
		ATM atm = new ATM();
		Customer customer1 = new Customer(atm,"Utkarsh",100);
		Customer customer2 = new Customer(atm,"Parul",500);
		customer1.start();
		customer2.start();
	}
}

class ATM
{	
	synchronized public void checkBalance(String name) 
	{
		System.out.print(name+" Checking");
		try {Thread.sleep(1000);} catch (Exception e) {	}
		System.out.println(" Balance");
	}
	
	synchronized public void withdraw(String name, int amount)  	
	{
		System.out.print(name+" Withdrawing ");
		try {Thread.sleep(1000);} catch (Exception e) {	}
		System.out.println(amount);
	}	
}

class Customer extends Thread
{
	ATM atm;
	String name;
	int amount;
	
	Customer(ATM atm, String name, int amount)
	{
		this.atm = atm;
		this.name = name;
		this.amount = amount;
	}
	
	public void useATM() 
	{
		atm.checkBalance(name);
		atm.withdraw(name, amount);
	}
	public void run()
	{
			useATM();
	}
}