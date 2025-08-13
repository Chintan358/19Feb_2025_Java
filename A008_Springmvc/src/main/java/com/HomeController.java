package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@Autowired
	UserService service;
	
	@RequestMapping("/")
	public String index(Model model)
	{
		User u = new User();
		model.addAttribute("user", u);
		return "index";
	}
	
	@RequestMapping("/home")
	public String home()
	{
		return "home";
	}
	
	@RequestMapping("/adduser")
	public String adduser(@ModelAttribute("user") User u)
	{
		service.adduser(u);
		return "index";
	}
}
