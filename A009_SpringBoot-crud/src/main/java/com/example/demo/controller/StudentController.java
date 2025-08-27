package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.A009SpringBootCrudApplication;
import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepo;
import com.example.demo.service.StudentService;

import jakarta.validation.Valid;

@Controller
public class StudentController {

    private final StudentRepo studentRepo;

    private final A009SpringBootCrudApplication a009SpringBootCrudApplication;
	
	@Autowired
	StudentService service;

    StudentController(A009SpringBootCrudApplication a009SpringBootCrudApplication, StudentRepo studentRepo) {
        this.a009SpringBootCrudApplication = a009SpringBootCrudApplication;
        this.studentRepo = studentRepo;
    }

	@GetMapping("/")
	public String index(Model model)
	{
		model.addAttribute("student", new Student());
		model.addAttribute("students",service.allStudents());
		return "index";
	}
	
	
	@PostMapping("/addStudent")
	public String addStudent(@Valid @ModelAttribute("student") 
	Student st,BindingResult result,Model model)
	{

		if(result.hasErrors()) {
			
			model.addAttribute("students",service.allStudents());
			return "index";
		}
		else
		{
			service.addorUpdateStudent(st);
			return "redirect:/";
		}
	
		
	}
	
	@GetMapping("/delete")
	public String deleteStudent(@RequestParam("did") int id)
	{
		service.deleteStudent(id);
		return "redirect:/";
	}
	
	@GetMapping("/update")
	public String updatedStduent(@RequestParam("uid") int id,Model model)
	{
		model.addAttribute("student", service.studentById(id));
		model.addAttribute("students",service.allStudents());
		return "index";
	}
	
	
}
