package controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.google.gson.Gson;

import dao.StudentDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Student;

@WebServlet("/update")
public class UpdateController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter pw  =resp.getWriter();
		String action = req.getParameter("action");
		int sid = Integer.parseInt(req.getParameter("sid"));
		
		StudentDao dao = new StudentDao();
		if(action.equals("delete"))
		{
			int i = dao.deleteStudent(sid);
			if(i>0)
			{
				pw.append("Student deleted successfully !!!");
			}
			
		}
		else if(action.equals("update"))
		{
			Student st = dao.getStudentById(sid);
			Gson json = new Gson();
			pw.append(json.toJson(st));
		}
		
		
	}
}
