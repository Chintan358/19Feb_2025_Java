package controller;

import java.io.IOException;

import dao.ProductDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class HomeController extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		ProductDao dao = new ProductDao();
		
		req.setAttribute("categories", dao.allCategories());
		req.setAttribute("products", dao.allProducts());
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	
	}
}
