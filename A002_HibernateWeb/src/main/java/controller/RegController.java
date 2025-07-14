package controller;

import java.io.IOException;

import dao.UserDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.User;

@WebServlet("/reg")
public class RegController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String uname = req.getParameter("uname");
		String eamil = req.getParameter("email");
		
		
		User user = new User();
		user.setName(uname);
		user.setEmail(eamil);
		
		UserDao dao = new UserDao();
		int i = dao.addUser(user);
		
		if(i>0)
		{
			req.setAttribute("msg", "Registration successful !!!");
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		}
				
		
		
		
		
	}
}	
