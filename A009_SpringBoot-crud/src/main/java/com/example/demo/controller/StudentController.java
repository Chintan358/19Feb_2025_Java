package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	StudentService service;

	@GetMapping("/")
	public String index(Model model)
	{
		model.addAttribute("student", new Student());
		return "index";
	}
	
	
	@PostMapping("/addStudent")
	public String addStudent(@ModelAttribute("student") Student st)
	{
		service.addorUpdateStudent(st);
		return "redirect:/";
	}
}
