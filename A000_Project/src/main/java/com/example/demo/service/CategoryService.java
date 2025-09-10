package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Category;

public interface CategoryService {

	public void addorUpdateCategory(Category c);
	public List<Category> allCategories();
	public Category categoryById(int id);
	public void deleteCategory(int id);
}
