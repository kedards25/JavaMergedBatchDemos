package com.learning.insertquerydemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertQueryDemo {

	String user = "sa";
	String password = "sasa";
	String url = "jdbc:sqlserver://localhost:1433;databaseName=TestDB";
	Connection conn = null;
	PreparedStatement pSt = null;
	ResultSet rs = null;
	int rowsAffected = 0;

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

	void insertRecord() {
		int id = 10;
		String name = "Sankalp";
		String email = "sankalp@pubg.com";
		String addr = "Jogeshwari";

		if (getConnected()) {
			try {
				String q = "insert into students values(?,?,?,?)";
				pSt = conn.prepareStatement(q);
				pSt.setInt(1, id);
				pSt.setString(2, name);
				pSt.setString(3, email);
				pSt.setString(4, addr);

				rowsAffected = pSt.executeUpdate();
				if (rowsAffected > 0) {
					System.out.println("Data insertion successful");
				} else {

					System.out.println("Data insertion failed");
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
		InsertQueryDemo demo = new InsertQueryDemo();
		demo.insertRecord();

	}

}
