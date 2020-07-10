package com.learning.cruddemo;

public interface ICrudOps {

	public void getData();
	public void addData(StudentModel model);
	public void updateData(int id);
	public void deleteData(int id);
	public void getDataById(int id);
	
	
}
