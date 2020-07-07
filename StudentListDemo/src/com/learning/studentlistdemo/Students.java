package com.learning.studentlistdemo;

public class Students {

	int id;
	String name;
	double marks;
	
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Students(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	
}
