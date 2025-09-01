package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
		
	@GetMapping("/admin")
	public String admin()
	{
		return "admin";
	}
	
	
	@GetMapping("/users")
	public String users()
	{
		return "users";
	}
	
	@GetMapping("/dashboard")
	public String dashboard()
	{
		return "dashboard";
	}
	
	@GetMapping("/orders")
	public String orders()
	{
		return "orders";
	}
	
	@GetMapping("/category")
	public String category()
	{
		return "category";
	}
	
	@GetMapping("/products")
	public String products()
	{
		return "products";
	}
}
