package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstConnection {
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
			ResultSet rs =  st.executeQuery("select * from student");
			
			//Processthe Result
			while(rs.next())
			{
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				
				System.out.println(id+" "+name+" "+email);
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}	
