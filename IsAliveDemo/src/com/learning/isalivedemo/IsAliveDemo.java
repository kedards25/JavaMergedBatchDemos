package com.learning.isalivedemo;

public class IsAliveDemo implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("child-"+i);
			} catch (InterruptedException e) {
				System.out.println("Interrupted:"+Thread.currentThread().isInterrupted());
			}
		}
		//System.out.println("from child thread: " + Thread.currentThread().isAlive());

	}

	public static void main(String[] args) {

		IsAliveDemo demo = new IsAliveDemo();
		Thread thread = new Thread(demo);

		thread.start();
		try {
			for (int i = 0; i < 5; i++) 
			{
				System.out.println("Main - " + i);

				Thread.sleep(5000);
				
				System.out.println("is child alive in loop? "+thread.isAlive());

			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		System.out.println("is child alive after loop? "+thread.isAlive());
		
		System.out.println("is main alive? "+Thread.currentThread().isAlive());
	}

}
