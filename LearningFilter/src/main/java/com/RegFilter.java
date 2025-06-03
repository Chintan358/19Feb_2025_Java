package com;

import java.io.IOException;

import jakarta.servlet.FilterChain;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebFilter("/reg")
public class RegFilter extends HttpFilter {
	
	@Override
	protected void doFilter(HttpServletRequest req, HttpServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		
		String uname = req.getParameter("uname");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		String cpass = req.getParameter("cpass");
		
		RequestDispatcher rd  =req.getRequestDispatcher("reg.jsp");
		
		if(uname.equals("") || uname.equals(null))
		{
			req.setAttribute("unameErr", "Username is required !!!");
			rd.forward(req, resp);
		}
		
		if(email.equals("") || email.equals(null))
		{
			req.setAttribute("emailErr", "Email is required !!!");
			rd.forward(req, resp);
		}
		else if(!Validation.checkEamil(email))
		{
			req.setAttribute("emailErr", "Invalid email format !!!");
			rd.forward(req, resp);
		}
		
		if(pass.equals("") || pass.equals(null))
		{
			req.setAttribute("passErr", "Password is required !!!");
			rd.forward(req, resp);
		}
		
		
		if(cpass.equals("") || cpass.equals(null))
		{
			req.setAttribute("cpassErr", "Confirm password Required !!!");
			rd.forward(req, resp);
		}
		else if(!cpass.equals(pass))
		{
			req.setAttribute("cpassErr", "Confirm password and passwrod must be same !!!");
			rd.forward(req, resp);
		}
		
		
		
		chain.doFilter(req, resp);
		
		
	}
}
