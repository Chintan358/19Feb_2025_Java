package com.example.demo.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.model.Category;
import com.example.demo.service.CategoryService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class AdminController {
	
	@Autowired
	CategoryService categoryService;
		
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
	
	/*******************Category start***************/
	
	@GetMapping("/category")
	public String category()
	{
		return "category";
	}
	
	@PostMapping("/addcategory")
	public String addCategory(@RequestParam("file") MultipartFile file,@RequestParam("catname") String catname,HttpServletRequest req)
	{
		String fileName = System.currentTimeMillis()+"_"+file.getOriginalFilename();
		
		String path = req.getServletContext().getRealPath("/");
		String mypath = path+File.separator+"category_img";
		File createfile = new File(mypath);
		if(!createfile.exists())
		{
			createfile.mkdir();
		}
		
		
		File savedFile = new File(createfile, fileName);
	    try {
			file.transferTo(savedFile);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    Category c = new Category();
	    c.setName(catname);
	    c.setImage(fileName);
		
	    categoryService.addorUpdateCategory(c);
		
		return "redirect:category";
	}
	
	
	/*******************Category end***************/
	@GetMapping("/products")
	public String products()
	{
		return "products";
	}
}
