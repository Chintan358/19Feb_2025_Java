package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Category;
import com.example.demo.repo.CategoryRepo;
import com.example.demo.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryRepo categoryRepo;
	
	@Override
	public List<Category> allCategory() {
		
		return categoryRepo.findAll();
	}

}
