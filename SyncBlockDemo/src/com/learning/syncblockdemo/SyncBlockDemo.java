package com.learning.syncblockdemo;



public class SyncBlockDemo implements Runnable{

	void disp()
	{
		synchronized (this) {
			for (int i = 0; i < 5; i++) {
				System.out.println("From sync block "+Thread.currentThread().getName()+"-"+i);
			}
			System.out.println();
		}
		System.out.println("outside sync block "+Thread.currentThread().getName());
		
	}
	
	@Override
	public void run() {
		disp();
	}
	
	public static void main(String[] args) {

		SyncBlockDemo demo=new SyncBlockDemo();
		Thread thread1=new Thread(demo);
		Thread thread2=new Thread(demo);
		Thread thread3=new Thread(demo);
		
		thread1.setName("Thread 1");
		thread2.setName("Thread 2");
		thread3.setName("Thread 3");
		
		thread1.start();
		thread2.start();
		thread3.start();

	}

	

}
