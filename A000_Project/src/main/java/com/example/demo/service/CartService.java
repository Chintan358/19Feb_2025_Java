package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Cart;
import com.example.demo.model.Product;
import com.example.demo.model.User;

public interface CartService {
	
	public void addorUpdateCart(Cart c);
	public List<Cart> cartByUser(User user);
	public Cart cartById(int id);
	public void delteCart(int id);
	
	public Cart existByUserAndProduct(User user,Product product);
}
