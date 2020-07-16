package com.learning.threaddemo2;

public class ThreadUsingRunnable implements Runnable {

	public void run()
	{
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main started");
		System.out.println("Main creating object of class");
		
		//ThreadUsingRunnable is implementing an interface called Runnable
		//so method from interface cannot be invoked directly
		//Thread class is the child class of Runnable,so through child class
		//we can invoke method of Runnable interface and hence reference of our class
		//has to be given to child class of Runnable
		ThreadUsingRunnable thread=new ThreadUsingRunnable();
		Thread thread2=new Thread(thread);
		System.out.println("Main invoking child function");
		thread2.start();
		System.out.println("Main finished");
	}

}
