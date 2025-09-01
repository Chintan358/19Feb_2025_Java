package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String index()
	{
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
