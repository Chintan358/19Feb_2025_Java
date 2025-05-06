package com;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Metadata {
	public static void main(String[] args) {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn =
					DriverManager.getConnection("jdbc:mysql://localhost:3306/19feb_java","root","root");
			
			DatabaseMetaData db = cn.getMetaData();
			System.out.println(db.getDatabaseMajorVersion());
			System.out.println(db.getUserName());
			System.out.println(db.getTableTypes());
			
			Statement st  =cn.createStatement();
			ResultSet rs  =st.executeQuery("select * from student");
			
			ResultSetMetaData rsm = rs.getMetaData();
			System.out.println(rsm.getColumnCount());
			System.out.println(rsm.getTableName(3));
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
