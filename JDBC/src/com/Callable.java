package com;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Callable {
	public static void main(String[] args) {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn =
					DriverManager.getConnection("jdbc:mysql://localhost:3306/19feb_java","root","root");
			
			
			CallableStatement st = cn.prepareCall("call addbook(?,?)");
			st.setString(1, "node");
			st.setInt(2, 2);
			
			st.execute();
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
