package com.learning.encapsulationdemo;

public class EncapsulationDemo {

	private int number;
	
	private String val;
	
	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}

	public void setNumber(int num) {
		number=num;
	}
	
	public int getNumber() {
		return number;
	}
	
	
	public static void main(String[] args) {
		
		EncapsulationDemo demo=new EncapsulationDemo();
		demo.setNumber(5);
		System.out.println("value received "+demo.getNumber());
		demo.setVal("Amogh");
		System.out.println("String val: "+demo.getVal());

	}

}
