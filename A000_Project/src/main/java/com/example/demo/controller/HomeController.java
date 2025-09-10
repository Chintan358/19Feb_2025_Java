package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.CategoryService;

@Controller
public class HomeController {
	
	@Autowired
	CategoryService categoryService;

	@GetMapping("/")
	public String index(Model model)
	{
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
