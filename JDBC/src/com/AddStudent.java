package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AddStudent {
	public static void main(String[] args) {
		
		
		try {
			
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded...");
			
			//defina connection url
			String url = "jdbc:mysql://localhost:3306/19feb_java";
			String user = "root";
			String pass = "root";
			
//			//Establish the Connection
			Connection connection =  DriverManager.getConnection(url,user,pass);
			System.out.println("connection established...");
			
			//create a statement
			Statement st = connection.createStatement();
			
			//execute query
			int i =  st.executeUpdate("insert into student values(0,'Ronak','ronak@gmail.com')");
			
			if(i>0)
			{
				System.out.println("Data inserted...");
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}	
