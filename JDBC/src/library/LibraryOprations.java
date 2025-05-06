package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class LibraryOprations {
	
	Connection cn=null;
	public LibraryOprations() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/19feb_java","root","root");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	Scanner sc  =new Scanner(System.in);
	public void addBook()
	{
		System.out.println("Enter Book Name : ");
		String name = sc.next();
		System.out.println("Enter qty : ");
		int qty = sc.nextInt();
		
		if(isExist(name))
		{
			System.out.println("Book alredy exist !!!");
		}
		else
		{
		String qry = "insert into book values(?,?,?)";
		try {
			PreparedStatement ps  =cn.prepareStatement(qry);
			ps.setInt(1, 0);
			ps.setString(2, name);
			ps.setInt(3, qty);
			
			int i = ps.executeUpdate();
			if(i>0) {
				System.out.println("Book inserted !!!!");
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
	public void viewBook()
	{
		try {
			PreparedStatement ps = cn.prepareStatement("select * from book");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteBook()
	{
		System.out.println("enter Book name : ");
		String name = sc.next();
		
		if(isExist(name)) {
		
			try {
				PreparedStatement ps = 
						cn.prepareStatement("delete from book where name=?");
		
				ps.setString(1, name);
				
				int i = ps.executeUpdate();
				if(i>0)
				{
					System.out.println("Book deleted");
				}
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else
		{
			System.out.println("book not avaliable !!!!");
		}
	}
	
	public void issueBook()
	{
		System.out.println("enter Book name : ");
		String name = sc.next();
		
		try {
			PreparedStatement ps = 
					cn.prepareStatement("select * from book where name=?");
		
			ps.setString(1, name);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
			{
				int qty = rs.getInt(3);
				if(qty>0)
				{
					qty--;
					PreparedStatement ps1 = cn.prepareStatement("update book set qty=? where name=?");
					ps1.setInt(1, qty);
					ps1.setString(2, name);
					
					int i = ps1.executeUpdate();
					if(i>0)
					{
						System.out.println("Book issued");
					}
				}
				else
				{
					System.out.println("Book not avalible at the moment");
				}
			}
			else
			{
				System.out.println("Book not avaliable");
			}
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public boolean isExist(String name)
	{
		boolean b = false;
		
		try {
			PreparedStatement ps = cn.prepareStatement("select * from book where name=?");
			ps.setString(1, name);
		
			
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				b = true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return b;
	}
}
