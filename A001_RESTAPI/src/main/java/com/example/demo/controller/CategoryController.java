package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.CategoryDto;
import com.example.demo.model.Category;
import com.example.demo.service.CategoryService;

@RestController
public class CategoryController {

	@Autowired
	CategoryService categoryService;
	
	@GetMapping("/categories")
	public ResponseEntity<List<CategoryDto>> viewCategories()
	{
		List<Category> categories = categoryService.allCategory();
		
		List<CategoryDto> dtos = new ArrayList<>();
		
		for(Category c : categories)
		{
			CategoryDto dto = new CategoryDto();
			dto.setId(c.getId());
			dto.setName(c.getName());
			
			dtos.add(dto);
		}
		
		
		return new ResponseEntity<>(dtos,HttpStatus.OK);
	}
}
