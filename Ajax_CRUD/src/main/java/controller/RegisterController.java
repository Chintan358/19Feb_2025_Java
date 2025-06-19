package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.google.gson.Gson;

import dao.StudentDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Student;

@WebServlet("/register")
public class RegisterController extends HttpServlet {
		
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			
			String uname = req.getParameter("uname");
			String email = req.getParameter("email");
			String phone= req.getParameter("phone");
			
			Student st = new Student();
			st.setName(uname);
			st.setEmail(email);
			st.setPhone(phone);
			
			
			StudentDao dao = new StudentDao();
			int i = dao.addStudet(st);
			
			PrintWriter pw  =resp.getWriter();
			if(i>0)
			{
				pw.append("Registration successfully !!!");
			}
			
			
			
			
			
			
			
		}
	
}
