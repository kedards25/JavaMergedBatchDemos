package com.learning.cruddemo;

import java.util.Scanner;

public class JDBC_CRUD_Demo {

	public static void main(String[] args) {
		int id;
		String nm;
		String mail;
		
		ICrudOps ops=new CrudOpsImpl();
		//ops.getData();
		//ops.getDataById(1);
		//StudentModel stMd=new StudentModel(8, "Devangi", "devangi@gmail.com");
		System.out.println("Enter id,name,email of student");
		Scanner sc=new Scanner(System.in);
		id=sc.nextInt();
		nm=sc.next();
		mail=sc.next();
		
		StudentModel stMd=new StudentModel(id,nm,mail);
		
		ops.addData(stMd);

	}

}
