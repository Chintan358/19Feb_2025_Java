package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateStudent {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id : ");
		int id = sc.nextInt();
		System.out.println("Enter name : ");
		String name = sc.next();
		System.out.println("enter email : ");
		String email = sc.next();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection cn  =DriverManager.getConnection("jdbc:mysql://localhost:3306/19feb_java","root","root");
			
			String qry = "update student set name=?,email=? where id=?";
			PreparedStatement ps = cn.prepareStatement(qry);
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setInt(3, id);
			
			int i = ps.executeUpdate();
			if(i>0)
			{
				System.out.println("Student updated");
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
