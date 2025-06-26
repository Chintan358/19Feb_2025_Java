package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Student;

public class StudentDao {
	
	Connection cn  =null;
	public StudentDao() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn  =DriverManager.getConnection("jdbc:mysql://localhost:3306/19feb_java","root","root");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public ArrayList<Student> allStudents()
	{
		ArrayList<Student> al = new ArrayList();
		
		try {
			PreparedStatement ps = cn.prepareStatement("select * from student");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				Student st  =new Student();
				st.setId(rs.getInt(1));
				st.setName(rs.getString(2));
				st.setEmail(rs.getString(3));
				st.setPhone(rs.getString(4));
				
				al.add(st);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return al;
	}


	public int addStudet(Student st) {
		int i = 0;
		
		try {
			PreparedStatement ps = cn.prepareStatement("insert into student values(?,?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, st.getName());
			ps.setString(3, st.getEmail());
			ps.setString(4, st.getPhone());
			
			i = ps.executeUpdate();
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i;
	}


	public int deleteStudent(int sid) {
		int i=0;
		try {
			PreparedStatement ps =  cn.prepareStatement("delete from student where id = ?");
			ps.setInt(1, sid);
			
			i = ps.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}


	public Student getStudentById(int sid) {
		
		Student st = new Student();
		try {
			PreparedStatement ps = cn.prepareStatement("select * from student where id=?");
			ps.setInt(1, sid);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				st.setId(rs.getInt(1));
				st.setName(rs.getString(2));
				st.setEmail(rs.getString(3));
				st.setPhone(rs.getString(4));
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return st;
	}


	public int updateStudent(Student st) {
		int i = 0;
		
		try {
			PreparedStatement ps  =
					cn.prepareStatement("update student set name=?,email=?,phone=? where id=?");
					ps.setString(1, st.getName());
					ps.setString(2, st.getEmail());
					ps.setString(3, st.getPhone());
					ps.setInt(4, st.getId());
					
			i = ps.executeUpdate();
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i;
	}


	public boolean isUsernameExist(String uname) {
		
		boolean b = false;
		try {
			PreparedStatement ps = 
					cn.prepareStatement("select * from student where name=?");
			ps.setString(1, uname);
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


	public ArrayList<Student> searchStudent(String uname) {
		ArrayList<Student> al = new ArrayList();
		
		try {
			PreparedStatement ps = cn.prepareStatement("select * from student where name like ?");
			ps.setString(1, "%"+uname+"%");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				
				
				Student st  =new Student();
				st.setId(rs.getInt(1));
				st.setName(rs.getString(2));
				st.setEmail(rs.getString(3));
				st.setPhone(rs.getString(4));
				
				al.add(st);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return al;
	}

	
	
	
	
	
}
