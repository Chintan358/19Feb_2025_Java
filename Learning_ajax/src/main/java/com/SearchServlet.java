package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/search")
public class SearchServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//System.out.println("Hello servlet calling");
		
		String value = req.getParameter("value");
		
		String products[] = {"Pen","Fan","Table","Chair","CPU","TV","Mouse","Remote","AC"};
		
		PrintWriter pw  =resp.getWriter();
		
		String str = "<ul>";
		for(String s : products)
		{
			if(s.startsWith(value) || s.toLowerCase().startsWith(value))
			{
				str+="<li>"+s+"</li>";
			}
		}
		str+="</ul>";
		
		
		
		pw.append(str);
		
		
		
	}


}
