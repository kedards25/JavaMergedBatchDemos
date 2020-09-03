package com.learning.jbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Demo {
	
	public static void main(String[] args) {		
		try {
			String url="jdbc:sqlserver://localhost:1433;databaseName=AdventureWorks";
			String user="sa";
			String pwd="sasa";
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection con=DriverManager.getConnection(url, user, pwd);
			Statement st=con.createStatement();
			String query="select * from humanresources.employee";
			ResultSet rs= st.executeQuery(query);
			while(rs.next())
			{
				System.out.println("Name: "+rs.getString(2));
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
	}

}
