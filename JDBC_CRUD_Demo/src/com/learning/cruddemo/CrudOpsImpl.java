package com.learning.cruddemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CrudOpsImpl implements ICrudOps {

	String user="sa";
	String pwd="sasa";
	String url="jdbc:sqlserver://localhost:1433;databaseName=testDb";
	Connection conn=null;
	Statement st=null;
	ResultSet rs=null;
	PreparedStatement pSt=null;
	int id;
	String name,mail;
	int rowsAffected=0;
	
	public boolean getConnected()
	{
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn=DriverManager.getConnection(url, user, pwd);
			if(conn!=null)
			{
				return true;
			}
		} catch (ClassNotFoundException e) {
			
			System.out.println(e);
		} catch (SQLException e) {
			
			System.out.println(e);
		}
		return false;
	}
	
	@Override
	public void getData() {
	
		if(getConnected())
		{
			
			try {
				String q="select * from student1";
				st=conn.createStatement();
				rs=st.executeQuery(q);
				while(rs.next())
				{
					 id=rs.getInt("stdId");
					 name=rs.getString("std_name");
					 mail=rs.getString("emailid");
					
					System.out.println(id+"  "+name+"  "+mail);
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		}
	}

	@Override
	public void addData(StudentModel stModel) {
		if(getConnected())
		{
			
			try {
				String q="insert into student1 values (?,?,?)";
				pSt=conn.prepareStatement(q);
				pSt.setInt(1, stModel.getStdId());
				pSt.setString(2,stModel.getStdNm());
				pSt.setString(3,stModel.getStdMail());
				rowsAffected=pSt.executeUpdate();
				if(rowsAffected>0)
				{
					System.out.println("data added successfully");
				}
				else
				{
					System.out.println("addition failed");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		}

	}

	@Override
	public void updateData(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteData(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getDataById(int id) {
		if(getConnected())
		{
			
			try {
				String q="select * from student1 where stdId =?";
				pSt=conn.prepareStatement(q);
				pSt.setInt(1, id);
				rs=pSt.executeQuery();
				while(rs.next())
				{
					 id=rs.getInt("stdId");
					 name=rs.getString("std_name");
					 mail=rs.getString("emailid");
					
					System.out.println(id+"  "+name+"  "+mail);
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		}

	}



}
