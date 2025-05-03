package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteUSer {
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter id : ");
		int id = sc.nextInt();
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/19feb_java","root","root");
			
			PreparedStatement ps = cn.prepareStatement("delete from student where id=?");
			ps.setInt(1, id);
			
			int i = ps.executeUpdate();
			
			if(i>0)
			{
				System.out.println("Student deleted !!!");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
