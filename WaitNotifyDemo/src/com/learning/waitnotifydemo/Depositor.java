package com.learning.waitnotifydemo;

public class Depositor implements Runnable{

Account accHolder;
	
	//constructor is receiving 
	//object of Account class as parameter
	public Depositor(Account account) {
		accHolder=account;
	}
	@Override
	public void run() {
		
		//accessing deposit method from Account class
		//through object we have received in constructor

			accHolder.deposit(7000);		
		
	}
}
