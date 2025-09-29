package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepo;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepo repo;
	
	@Override
	public Student addStudent(Student st) {
		
		return repo.save(st);
	}

	@Override
	public List<Student> allStudents() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Student studentById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElseThrow();
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		 repo.deleteById(id);
	}

	@Override
	public Student updateStudent(Student st, int id) {
		
		st.setId(id);
		return repo.save(st);
	}

}
