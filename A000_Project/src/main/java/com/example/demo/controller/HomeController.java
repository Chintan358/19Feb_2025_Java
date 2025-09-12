package com.example.demo.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Product;
import com.example.demo.service.CategoryService;
import com.example.demo.service.ProductService;
import com.example.demo.serviceimpl.OrderDetailsServiceImpl;
import com.google.gson.Gson;

import jakarta.servlet.http.HttpServletResponse;

@Controller
public class HomeController {

    private final OrderDetailsServiceImpl orderDetailsServiceImpl;
	
	@Autowired
	CategoryService categoryService;
	
	@Autowired
	ProductService productService;

    HomeController(OrderDetailsServiceImpl orderDetailsServiceImpl) {
        this.orderDetailsServiceImpl = orderDetailsServiceImpl;
    }
	
//	@GetMapping("/getproducts")
//	public void loadProducts(HttpServletResponse resp) throws IOException
//	{
//		PrintWriter pw = resp.getWriter();
//		List<Product> allproducts = productService.viewAllProducts();
//		Gson json = new Gson();
//		System.out.println(allproducts);
//		pw.append(json.toJson(allproducts));
//	}

	@GetMapping("/")
	public String index(Model model,
			@RequestParam(value = "catid", required = false, defaultValue = "0") int cid) 
	{
		
		if(cid==0)
		{
			model.addAttribute("products",productService.viewAllProducts());
		}
		else
		{
			model.addAttribute("products",productService.productsByCategory(cid));
		}
		model.addAttribute("categories",categoryService.allCategories());
		
		return "index";
	}
	
	@GetMapping("/accounts")
	public String accounts()
	{
		return "accounts";
	}
	
	@GetMapping("cart")
	public String cart()
	{
		return "cart";
	}
	
	@GetMapping("checkout")
	public String checkout()
	{
		return "checkout";
	}
	
	@GetMapping("/compare")
	public String compare()
	{
		return "compare";
	}
	
	@GetMapping("details")
	public String details()
	{
		return "details";
	}
	
	@GetMapping("loginregister")
	public String loginregister()
	{
		return "login-register";
	}
	
	@GetMapping("shop")
	public String shop()
	{
		return "shop";
	}
	
	@GetMapping("wishlist")
	public String wishlist()
	{
		return "wishlist";
	}
	
	

}
