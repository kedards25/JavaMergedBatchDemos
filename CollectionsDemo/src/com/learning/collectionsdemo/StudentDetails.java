package com.learning.collectionsdemo;

import java.util.ArrayList;
import java.util.List;

public class StudentDetails {

	int id;
	String name;
	String addr;
	
	public StudentDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentDetails(int id, String name, String addr) {
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
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

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	//converts object to String in format mentioned in body
	@Override
	public String toString() {
		return "StudentDetails [id=" + id + ", name=" + name + ", addr=" + addr + "]";
	}
	
	
	
}