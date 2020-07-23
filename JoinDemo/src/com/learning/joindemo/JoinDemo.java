package com.learning.joindemo;

//join will make other thread to wait till one thread 
//finishes its process whereas sleep will put
//current thread to sleep
public class JoinDemo implements Runnable {

	@Override
	public void run() {
		System.out.println("is child alive :"+Thread.currentThread().isAlive());
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+"-"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("From main");
		//JoinDemo demo=new JoinDemo();
		//Thread thread=new Thread(demo);
		
		Thread childThread=new Thread(new JoinDemo());
		childThread.setName("Child Thread 1");
		Thread childThread2=new Thread(new JoinDemo());
		childThread2.setName("Child Thread 2");
		childThread.start();
		try {
			//it will make other thread wait 
			//until it finishes its work
			//we can pass time in miliseconds as param
			//in that case,thread will make other thread
			//wait for given interval of time
			childThread.join();
			//childThread.join(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		childThread2.start();

		System.out.println("is child alive :"+childThread.isAlive());
		System.out.println("Main finished");

	}

	

}
