package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepo repo;

	@Override
	public void addorUpdateStudent(Student st) {
	
		repo.save(st);
		
	}

	@Override
	public List<Student> allStudents() {
		// TODO Auto-generated method stub
		return  repo.findAll();
	}

	@Override
	public Student studentById(int id) {
		// TODO Auto-generated method stub
		return repo.getById(id);
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}

}
