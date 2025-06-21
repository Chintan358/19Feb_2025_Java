package controller;

import java.io.IOException;
import java.io.PrintWriter;

import dao.StudentDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Student;

@WebServlet("/saveupdate")
public class SaveUpdate  extends HttpServlet
{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		int id = Integer.parseInt(req.getParameter("id"));
		String uname = req.getParameter("uname");
		String email = req.getParameter("email");
		String phone= req.getParameter("phone");
		
		Student st = new Student();
		st.setId(id);
		st.setName(uname);
		st.setEmail(email);
		st.setPhone(phone);
		
		
		StudentDao dao = new StudentDao();
		int i = dao.updateStudent(st);
		
		PrintWriter pw  =resp.getWriter();
		if(i>0)
		{
			pw.append("Update successfully !!!");
		}
		
		
	}

}
