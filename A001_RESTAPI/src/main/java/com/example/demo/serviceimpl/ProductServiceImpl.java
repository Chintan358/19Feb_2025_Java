package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repo.ProductRepo;
import com.example.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepo productRepo;
	
	@Override
	public List<Product> allProdocducts() {
		// TODO Auto-generated method stub
		return productRepo.findAll();
	}

	@Override
	public Product addProduct(Product p) {
		
		return productRepo.save(p);
	}

	@Override
	public Product updateProduct(Product p, int pid) {
		
		Product existed = productRepo.findById(pid).orElseThrow();
		existed.setName(p.getName());
		existed.setPrice(p.getPrice());
		existed.setQty(p.getQty());
		existed.setCategory(p.getCategory());
		
		return productRepo.save(existed);
		
	}

}
