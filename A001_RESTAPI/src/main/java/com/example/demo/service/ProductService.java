package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Product;

public interface ProductService {
		
	public List<Product> allProdocducts(); 
	public Product addProduct(Product p);
	public Product updateProduct(Product p, int pid);
}
