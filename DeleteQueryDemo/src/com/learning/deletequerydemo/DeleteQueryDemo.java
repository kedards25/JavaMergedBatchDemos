package com.learning.deletequerydemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeleteQueryDemo {

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

	void deleteRecord(int id) {
		 this.id= id;

		if (getConnected()) {
			try {
				String q = "delete from students "
						+ "where stdid=?";
				pSt = conn.prepareStatement(q);
				pSt.setInt(1, id);
				rowsAffected = pSt.executeUpdate();
				if (rowsAffected > 0) {
					System.out.println("Data deletion successful");
				} else {

					System.out.println("Data deletion failed");
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
		DeleteQueryDemo demo=new DeleteQueryDemo();
		demo.deleteRecord(10);

	}

}
