package com.learning.currentthreaddemo;

public class CurrentThreadDemo {

	public static void main(String[] args) {
		
		Thread currThread=Thread.currentThread();
		currThread.setName("Main Thread");
		System.out.println("Currently running thread is: "+currThread.getName());

	}

}
