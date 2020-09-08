package com.learning.databasemetadatademo;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseMetadataDemo {

	String user = "sa";
	String password = "sasa";
	String url = "jdbc:sqlserver://localhost:1433;databaseName=TestDB";
	Connection conn = null;
	PreparedStatement pSt = null;
	Statement st=null;
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
	
	void dispDB_Metadata()
	{
		if(getConnected())
		{
			DatabaseMetaData metaData;
			try {
				metaData = conn.getMetaData();
				String[] tabTypes= {"Table"};
				//System.out.println("Table Names");
				rs=metaData.getTables(null, null, null,tabTypes);
				
//				while(rs.next())
//				{
//					System.out.println(rs.getString("Table_Name"));
//				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}

		}
	}
	
	void dispTableMetadata()
	{
		if(getConnected())
		{
			try {
				st=conn.createStatement();
				String q="select * from students";
				rs=st.executeQuery(q);
				ResultSetMetaData data=rs.getMetaData();
//				System.out.println(data.getColumnCount());
//				System.out.println(data.getColumnLabel(2));
//				System.out.println(data.isReadOnly(3));
				System.out.println(data.isWritable(4));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		DatabaseMetadataDemo demo=new DatabaseMetadataDemo();
		demo.dispDB_Metadata();
		demo.dispTableMetadata();
	}

}
