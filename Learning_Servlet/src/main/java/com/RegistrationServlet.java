package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class RegistrationServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String uname = req.getParameter("uname");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/19feb_java","root","root");
			
			PreparedStatement ps = cn.prepareStatement("insert into user values(?,?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, uname);
			ps.setString(3, email);
			ps.setString(4, pass);
			
			int i = ps.executeUpdate();
			if(i>0)
			{
//				System.out.println("User inserted...");
		PrintWriter pw = resp.getWriter();
		pw.write("<h1>Registrqation success</h1>");
		req.setAttribute("msg", "Registration successfully !!!");
		RequestDispatcher rd =  req.getRequestDispatcher("index.jsp");
//		rd.include(req, resp);
	rd.forward(req, resp);
		
//		resp.sendRedirect("index.jsp");
				
			}
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		
		
	}
}
