package com.learning.atomicintegerdemo;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerDemo implements Runnable {

	int num=7;
	AtomicInteger atomicInteger=new AtomicInteger(7);
	
	void disp()	//common resource accessed by threads
	{
		//threads accessing the variable will work shared copy of variable
		num++;	//write	
		//value will be read from shared copy
		System.out.println(Thread.currentThread().getName()+"-"+num);	//read
	}
	
	void showVal() {
		//we are performing atomic operation
		//Operation that is performed as a single unit
		System.out.println(Thread.currentThread().getName()+"-"+atomicInteger.incrementAndGet());
	}

	@Override
	public void run() {	
		disp();
		//showVal();
		
	}
	
	public static void main(String[] args) {

		AtomicIntegerDemo demo = new AtomicIntegerDemo();
		Thread thread=new Thread(demo);
		Thread thread2=new Thread(demo);
		
		//Threads will perform write operations first and then
		//read operations together
		thread.start();	//will increase num to 8
						//and value will be stored as shared copy of normal variable
						//but will maintain their own copy in case of
						//AtomicInteger object
		thread2.start();//will increase num to 9
						//and value will be stored as shared copy of normal variable
						//but will maintain their own copy in case of
						//AtomicInteger object
	}

	

}
