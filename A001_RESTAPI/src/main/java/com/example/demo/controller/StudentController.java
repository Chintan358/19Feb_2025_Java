package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService service;
	
	@GetMapping("/students")
	public ResponseEntity<List<Student>> getAllStudents()
	{
		List<Student> allStudents = service.allStudents();	
		return new ResponseEntity<>(allStudents,HttpStatus.OK);		
	} 
	
	@PostMapping("/students")
	public ResponseEntity<Student> addStudent(@RequestBody Student st)
	{
		Student s =  service.addStudent(st);
		return new ResponseEntity<>(s,HttpStatus.CREATED);
	}
	
	
}
