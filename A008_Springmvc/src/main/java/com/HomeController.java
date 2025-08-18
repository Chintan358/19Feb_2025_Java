package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@Autowired
	UserService service;
	
	@RequestMapping("/")
	public String index(Model model)
	{
		User u = new User();
		model.addAttribute("user", u);
		model.addAttribute("users", service.allUsers());
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
		return "redirect:/";
	}
	
	@RequestMapping("/delete")
	public String deleteUser(@RequestParam("did") int did)
	{
		service.deleteUser(did);
		return "redirect:/";
	}
	
	@RequestMapping("/update")
	public String getByid(@RequestParam("uid") int uid,Model model)
	{
		User u = service.userById(uid);
		model.addAttribute("user", u);
		model.addAttribute("users", service.allUsers());
		return "index";
		
	}
}
