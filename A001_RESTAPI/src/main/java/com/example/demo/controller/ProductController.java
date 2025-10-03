package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.CategoryDto;
import com.example.demo.dto.ProductDto;
import com.example.demo.model.Category;
import com.example.demo.model.Product;
import com.example.demo.service.CategoryService;
import com.example.demo.service.ProductService;

@RestController
public class ProductController {

    private final StudentController studentController;
	
	@Autowired
	ProductService productService;
	
	@Autowired
	CategoryService categoryService;

    ProductController(StudentController studentController) {
        this.studentController = studentController;
    }
	
	@GetMapping("/products")
	public ResponseEntity<List<ProductDto>> allProducts()
	{
		List<Product> products = productService.allProdocducts();
		
		List<ProductDto> dtos = new ArrayList<>();
		
		for(Product p : products)
		{
			ProductDto dto = new ProductDto();
			dto.setId(p.getId());
			dto.setPrice(p.getPrice());
			dto.setName(p.getName());
			dto.setQty(p.getQty());
			
			CategoryDto cdto = new CategoryDto();
			cdto.setId(p.getCategory().getId());
			cdto.setName(p.getCategory().getName());
			
			dto.setCategoryDto(cdto);
			dtos.add(dto);
		}
		
		
		
		
		return new ResponseEntity<>(dtos,HttpStatus.OK);
	}
	
	@PostMapping("/products/category/{catid}")
	public ResponseEntity<ProductDto> addProduct(@RequestBody Product p,@PathVariable("catid") int cid)
	{
		Category c  =categoryService.catById(cid);
		p.setCategory(c);
		
		Product product = productService.addProduct(p);
		
		ProductDto dto = new ProductDto();
		dto.setId(product.getId());
		dto.setName(product.getName());
		dto.setPrice(product.getPrice());
		dto.setQty(product.getQty());
		
		CategoryDto cdto = new CategoryDto();
		cdto.setId(product.getCategory().getId());
		cdto.setName(product.getCategory().getName());
		
		
		dto.setCategoryDto(cdto);
		
		return new ResponseEntity<>(dto,HttpStatus.CREATED);
		
	}
}
