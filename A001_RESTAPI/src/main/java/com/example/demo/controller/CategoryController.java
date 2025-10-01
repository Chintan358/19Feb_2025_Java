package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Category;
import com.example.demo.service.CategoryService;

@RestController
public class CategoryController {

	@Autowired
	CategoryService categoryService;
	
	@GetMapping("/categories")
	public ResponseEntity<List<Category>> viewCategories()
	{
		List<Category> categories = categoryService.allCategory();
		return new ResponseEntity<>(categories,HttpStatus.OK);
	}
}
