package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		
		PrintWriter pw = resp.getWriter();
		pw.write("Servlet 2");
		
		ServletContext cx = req.getServletContext();
		String url =  cx.getInitParameter("url");
		pw.write("<h2>"+url+"</h2>");
		
		ServletConfig cf = getServletConfig();
		String path = cf.getInitParameter("path");
		pw.append("<h2>"+path+"</h2>");
		
	}
}
