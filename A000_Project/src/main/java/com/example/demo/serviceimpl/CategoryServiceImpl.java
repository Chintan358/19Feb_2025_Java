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
	public void addorUpdateCategory(Category c) {
		// TODO Auto-generated method stub
		categoryRepo.save(c);
	}

	@Override
	public List<Category> allCategories() {
		// TODO Auto-generated method stub
		return categoryRepo.findAll();
	}

	@Override
	public Category categoryById(int id) {
		// TODO Auto-generated method stub
		return categoryRepo.findById(id).orElseThrow();
	}

	@Override
	public void deleteCategory(int id) {
		// TODO Auto-generated method stub
		categoryRepo.deleteById(id);
	}

}
