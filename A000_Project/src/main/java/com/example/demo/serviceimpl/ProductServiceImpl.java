package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repo.CategoryRepo;
import com.example.demo.repo.ProductRepo;
import com.example.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepo productRepo;
	
	@Autowired
	CategoryRepo categoryRepo;
	
	@Override
	public void addorUpdateProduct(Product product) {
		// TODO Auto-generated method stub
		productRepo.save(product);
		
	}

	@Override
	public List<Product> viewAllProducts() {
		// TODO Auto-generated method stub
		return productRepo.findAll();
	}

	@Override
	public Product productById(int id) {
		// TODO Auto-generated method stub
		return productRepo.findById(id).orElseThrow();
	}

	@Override
	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		productRepo.deleteById(id);
	}

	@Override
	public List<Product> productsByCategory(int catid) {
		
		return productRepo.findByCategory(categoryRepo.findById(catid).orElseThrow());
		
	}

}
