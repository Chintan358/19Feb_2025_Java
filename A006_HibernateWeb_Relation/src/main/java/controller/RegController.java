package controller;

import java.io.IOException;

import dao.ProductDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Product;

@WebServlet("/reg")
public class RegController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int category =Integer.parseInt(req.getParameter("category"));
		String name = req.getParameter("name");
		double price =Double.parseDouble(req.getParameter("price"));
		String gender = req.getParameter("gender");
		int qty =Integer.parseInt(req.getParameter("qty"));
		String size[] = req.getParameterValues("size");
		
		String sizes="";
		for(String s : size)
		{
			sizes+=s+",";
		}
		
		ProductDao dao= new ProductDao();
		
		
		Product p = new Product();
		p.setCategory(dao.catById(category));
		p.setName(name);
		p.setPrice(price);
		p.setGender(gender);
		p.setQty(qty);
		p.setSize(sizes);
		
		
		int i = dao.addProduct(p);
		
		if(i>0)
		{
			req.getRequestDispatcher("home").forward(req, resp);
		}
	}
}
