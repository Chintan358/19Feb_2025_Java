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
public class RegController extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String uname = req.getParameter("uname");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		
		User user = new User();
		user.setUsername(uname);
		user.setEmail(email);
		user.setPassword(pass);
		
		UserDao dao = new UserDao();
		
		if(dao.isEmailExist(email))
		{
			req.setAttribute("err", "Email Already exist !!!");
			req.getRequestDispatcher("index.jsp").forward(req, resp);

		}
		else
		{
			int i =  dao.addUser(user);
			if(i>0)
			{
				req.setAttribute("msg", "Registration successfully !!!");
				req.getRequestDispatcher("index.jsp").forward(req, resp);
			}
		}
		
		
		
		
	}
}
