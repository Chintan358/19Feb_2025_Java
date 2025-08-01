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

@WebServlet("/search")
public class SearchController extends HttpServlet {
		
		
	
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			String uname = req.getParameter("uname");
			
			StudentDao dao = new StudentDao();
			
			ArrayList<Student> al = dao.searchStudent(uname);
			
			
			PrintWriter pw  =resp.getWriter();
			Gson json = new Gson();
			
			pw.append(json.toJson(al));
			
			
		}
	
}
