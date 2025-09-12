package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Product;

public interface ProductService {
	
	
		public void addorUpdateProduct(Product product);
		public List<Product> viewAllProducts();
		public Product productById(int id);
		public void deleteProduct(int id);
		public List<Product> productsByCategory(int catid);
	
}
