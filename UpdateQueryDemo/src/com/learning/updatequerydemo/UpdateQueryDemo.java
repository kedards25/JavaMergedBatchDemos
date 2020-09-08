package com.learning.updatequerydemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateQueryDemo {

	String user = "sa";
	String password = "sasa";
	String url = "jdbc:sqlserver://localhost:1433;databaseName=TestDB";
	Connection conn = null;
	PreparedStatement pSt = null;
	ResultSet rs = null;
	int rowsAffected = 0;
	int id;

	boolean getConnected() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(url, user, password);
			if (conn != null) {
				return true;
			}
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFound: " + e);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("SQLException in connection: " + e);
		}
		return false;
	}
	
	void updateRecord(int id) {
		this.id = id;
		String email = "sankalp@gmail.com";

		if (getConnected()) {
			try {
				String q = "update students "
						+ "set emailid=? "
						+ "where stdId=?";
				pSt = conn.prepareStatement(q);
				pSt.setInt(2, id);
				pSt.setString(1, email);


				rowsAffected = pSt.executeUpdate();
				if (rowsAffected > 0) {
					System.out.println("Data updation successful");
				} else {

					System.out.println("Data updation failed");
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("SQLException in insertion: " + e);
			}
		} else {
			System.out.println("Connection failed");
		}
	}
	
	public static void main(String[] args) {
		
		UpdateQueryDemo demo=new UpdateQueryDemo();
		demo.updateRecord(10);

	}

}
