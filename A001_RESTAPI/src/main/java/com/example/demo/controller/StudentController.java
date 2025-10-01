package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	StudentService service;
	
	@GetMapping("/")
	public ResponseEntity<List<Student>> getAllStudents()
	{
		List<Student> allStudents = service.allStudents();	
		return new ResponseEntity<>(allStudents,HttpStatus.OK);		
	} 
	
	@PostMapping("/")
	public ResponseEntity<Student> addStudent(@RequestBody Student st)
	{
		Student s =  service.addStudent(st);
		return new ResponseEntity<>(s,HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Student> StudentById(@PathVariable("id")int id)
	{
		Student st = service.studentById(id);
		return new ResponseEntity<>(st,HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable("id")int id)
	{
		service.deleteStudent(id);
		return "Student deleted";  
	}
	
	@PatchMapping("/{id}")
	public ResponseEntity<Student> updateStudent(@PathVariable("id") int id,@RequestBody Student st)
	{
		Student std  =service.updateStudent(st, id);
		return new ResponseEntity<>(std,HttpStatus.CREATED);
	}
	
}
