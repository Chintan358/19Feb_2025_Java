package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.User;

public class UserDao {
		
	Connection cn = null;
	public UserDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/19feb_java","root","root");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	public int addUser(User user)
	{
		int i = 0;
		try {
			PreparedStatement ps =
					cn.prepareStatement("insert into user values(?,?,?,?)");
		
			ps.setInt(1, 0);
			ps.setString(2, user.getUsername());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getPassword());
			
			 i = ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i;
		
	}

	public List<User> getAllUser() {
		
		List<User> users = new ArrayList();
		
		try {
			PreparedStatement ps = 
					cn.prepareStatement("select * from user");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				User u = new User();
				u.setId(rs.getInt(1));
				u.setUsername(rs.getString(2));
				u.setEmail(rs.getString(3));
				u.setPassword(rs.getString(4));
				
				users.add(u);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return users;
	}

	public int deleteUser(int id) {
		int i = 0;
		
		try {
			PreparedStatement ps  =
					cn.prepareStatement("delete from user where id = ?");
			ps.setInt(1, id);
			
			i = ps.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i;
	}

	public User userById(int id) {
		
		User user = new User();
		
		try {
			PreparedStatement ps = 
					cn.prepareStatement("select * from user where id=?");
			
			ps.setInt(1, id);
			
			ResultSet rs  =ps.executeQuery();
			
			if(rs.next())
			{
				user.setId(rs.getInt(1));
				user.setUsername(rs.getString(2));
				user.setEmail(rs.getString(3));
				user.setPassword(rs.getString(4));
			}
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user;
	}

	public int updateUser(User user) {
	
		int i = 0;
		try {
			PreparedStatement ps =
					cn.prepareStatement("update user set name=?,email=?,pass=? where id = ?");
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getEmail());
			ps.setString(3, user.getPassword());
			ps.setInt(4 , user.getId());
			
			i = ps.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	
	
}
