package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentService {
		
		public void addorUpdateStudent(Student st);
		public List<Student> allStudents();
		public Student studentById(int id);
		public void deleteStudent(int id);
}
