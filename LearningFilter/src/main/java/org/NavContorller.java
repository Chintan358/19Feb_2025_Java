package org;

import java.io.IOException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/nav")
public class NavContorller extends HttpServlet  {
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("initialize");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String action = req.getParameter("action");
		
		if(action.equals("home"))
		{
			req.getRequestDispatcher("home.jsp").forward(req, resp);
		}
		else if(action.equals("about"))
		{
			req.getRequestDispatcher("About.jsp").forward(req, resp);
		}
		
		
	}
	
	@Override
	public void destroy() {
		System.out.println("destroyed...");
	}
}
