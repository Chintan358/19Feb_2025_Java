package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	
	String path = null;
	@Override
	public void init(ServletConfig config) throws ServletException {
		
		path =  config.getInitParameter("path");
		System.out.println("servlet initializing...");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		
		
		PrintWriter pw = resp.getWriter();
		pw.write("Servlet 1");
		
		ServletContext cx = req.getServletContext();
		String url =  cx.getInitParameter("url");
		pw.append("<h2>"+url+"</h2>");
		
		
		//ServletConfig cf = getServletConfig();
		//String path = cf.getInitParameter("path");
		pw.append("<h2>"+path+"</h2>");
		
		System.gc();
	}
	
	@Override
	public void destroy() {
		System.out.println("finished..");
	}
}
